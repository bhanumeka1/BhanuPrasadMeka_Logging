import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInt {
	private static final Logger LOGGER = LogManager.getLogger(SimpleInt.class);
	float simpleInterest(float p,int r,int t)
	{
		LOGGER.info("Entered into SimpleInterest Function");
		LOGGER.info("Calculating Simple Interest");
		return ((p*t*r)/100);
	}

}
