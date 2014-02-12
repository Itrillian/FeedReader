import itrillian.jetty.JettyLauncher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static final Logger LOGGER = LogManager.getLogger(Main.class.getSimpleName());

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		LOGGER.info("Starting Main Context");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MainContext.xml");
		JettyLauncher launcher = context.getBean("JettyLauncher", JettyLauncher.class);
		launcher.init();
	}
}
