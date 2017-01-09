/**
 * 
 */
package xyz.shanmugavel.samples.config;

import javax.annotation.PostConstruct;

import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Shanmugavel
 *
 */
@Configuration
@ComponentScan({"xyz.shanmugavel.samples.routes"})
public class SamplesConfiguration extends CamelConfiguration{

	public static final Logger LOGGER = LoggerFactory.getLogger(SamplesConfiguration.class);
	
	@PostConstruct
	public void afterInit() {
		LOGGER.info("Spring Configuration Initialized.");
	}
}
