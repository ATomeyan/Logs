import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class Generator {

    private static final Logger LOGGER = LoggerFactory.getLogger(Generator.class);
    private final LocalDateTime dateTime;
    private final String gateway;
    private final String deviceToken;
    private final String infoMessages;
    private final String errorMessages;
    private final String warnMessages;
    private final double amount;
    private final String ip;
    private final String oid;

    public Generator() {

        dateTime = LocalDateTime.now();
        ip = "192.168.2.2";
        gateway = "03";
        deviceToken = "3a5d2535e15d4d6fa68c0df1786cb038";
        infoMessages = "Is completed";
        errorMessages = "The transaction doesn't completed";
        warnMessages = "The transaction is closed";
        amount = 5483;
        oid = "16sf4";
    }

    public void generateInfoLog() {

        LOGGER.info("{}, {}, {}, {}, {}, {}, {}", dateTime, gateway, deviceToken, infoMessages, amount, ip, oid);
    }

    public void generateErrorLog() {

        LOGGER.error("{}, {}, {}, {}, {}, {}, {}", dateTime, gateway, deviceToken, errorMessages, amount, ip, oid);
    }

    public void generateWarnLog() {

        LOGGER.warn("{}, {}, {}, {}, {}, {}, {}", dateTime, gateway, deviceToken, warnMessages, amount, ip, oid);
    }
}