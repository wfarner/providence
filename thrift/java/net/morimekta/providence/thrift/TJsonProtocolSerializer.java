package net.morimekta.providence.thrift;

import org.apache.thrift.protocol.TJSONProtocol;

/**
 * @author Stein Eldar Johnsen
 * @since 24.10.15.
 */
public class TJsonProtocolSerializer
        extends TProtocolSerializer {
    public TJsonProtocolSerializer() {
        this(true);
    }

    public TJsonProtocolSerializer(boolean readStrict) {
        super(readStrict, new TJSONProtocol.Factory());
    }
}
