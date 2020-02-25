import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CompoundInt {
	private static final Logger LOGGER = LogManager.getLogger(CompoundInt.class);
double compoundInterest(float p,double r,double t)
{
	LOGGER.info("Entered into Compound Interest Function");
	double res,y;
	LOGGER.info("Calculating Compound Interest");
	y=Math.pow(1+r/100,t);
	res=p*y;
	LOGGER.info("Returning Compound interest");
	return res;
}
}
