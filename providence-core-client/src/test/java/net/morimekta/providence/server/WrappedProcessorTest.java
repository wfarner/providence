package net.morimekta.providence.server;

import net.morimekta.providence.PProcessor;
import net.morimekta.providence.PServiceCall;
import net.morimekta.providence.PServiceCallType;
import net.morimekta.providence.descriptor.PService;
import net.morimekta.providence.descriptor.PServiceMethod;
import net.morimekta.providence.serializer.ApplicationException;
import net.morimekta.providence.serializer.ApplicationExceptionType;
import net.morimekta.providence.serializer.SerializerException;

import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

/**
 * Testing for the wrapped processor.
 */
public class WrappedProcessorTest {
    @Test
    public void testWrapper() throws IOException, SerializerException {
        PProcessor processor = mock(PProcessor.class);

        WrappedProcessor wrap = new WrappedProcessor(processor, (call, p) -> {
            // before call
            PServiceCall reply = processor.handleCall(call, processor.getDescriptor());
            // after call
            return reply;
        });

        ApplicationException c = new ApplicationException("call", ApplicationExceptionType.INTERNAL_ERROR);
        ApplicationException r = new ApplicationException("call", ApplicationExceptionType.INTERNAL_ERROR);

        AtomicReference<PService> service = new AtomicReference<>();
        service.set(new PService("test", "Service", service::get, new PServiceMethod[]{}));

        PServiceCall call =
                new PServiceCall<>("test", PServiceCallType.CALL, 44, c);
        PServiceCall reply =
                new PServiceCall<>("reply", PServiceCallType.REPLY, 44, r);

        when(processor.getDescriptor()).thenReturn(service.get());
        when(processor.handleCall(call, service.get())).thenReturn(reply);

        assertThat(wrap.handleCall(call), sameInstance(reply));

        verify(processor, atLeastOnce()).getDescriptor();
        verify(processor).handleCall(call, service.get());
        verifyNoMoreInteractions(processor);
    }
}