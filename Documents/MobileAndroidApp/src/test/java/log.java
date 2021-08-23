import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class log {

    private static final Logger logger = LogManager.getLogger(log.class);

            public static void main(String[] args)
            {
                System.out.println("\n Check logger info ");
                logger.info("Information");
                logger.warn("Warning");
                logger.error("Error");
                logger.fatal("Fatal error");

                System.out.println("\n Completed");
            }

}
