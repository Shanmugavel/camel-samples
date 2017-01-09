/**
 * 
 */
package xyz.shanmugavel.samples;

import org.apache.camel.spring.javaconfig.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xyz.shanmugavel.samples.config.SamplesConfiguration;

/**
 * @author Shanmugavel
 *
 */
public class App {

	public static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
		main.setConfigClass(SamplesConfiguration.class);
		try {
			main.run();
			LOGGER.info("CamleContext is running!!");
		} catch (Exception e) {
			LOGGER.error("Exception in running the camel context");
		}
	}

}
