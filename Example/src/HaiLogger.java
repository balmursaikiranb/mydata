import org.apache.log4j.Logger;

/**
 * 
 */

/**
 * @author learning
 *
 */
public class HaiLogger {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=Logger.getLogger(HaiLogger.class);
		log.debug("debug");
		log.trace("trace");
		log.error("error");
		log.info("info");
		log.warn("warning");
		log.fatal("fatal");
	}

}
