/**
 * 
 */
package xyz.shanmugavel.samples.routes;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Shanmugavel
 *
 */
@Component
public class SamplesRouteBuilder extends RouteBuilder {

	public static final Logger LOGGER = LoggerFactory.getLogger(SamplesRouteBuilder.class);


	@Override
	public void configure() throws Exception {
		LOGGER.info("About to Configure Routes!");
		
		from("direct:foo").routeId(RouteNames.FOO_TO_BAR.toString()).log("From Foo to Bar").to("direct:bar");
		
		from("direct:bar").routeId(RouteNames.BAR_TO_OUT.toString()).to("stream:out");
		
		LOGGER.info("Configured Routes!");
	}

}
