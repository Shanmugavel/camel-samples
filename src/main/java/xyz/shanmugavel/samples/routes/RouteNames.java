/**
 * 
 */
package xyz.shanmugavel.samples.routes;

/**
 * @author Shanmugavel
 *
 */
public enum RouteNames {
	FOO_TO_BAR("foo~bar"), BAR_TO_OUT("bar~out");
	
	private final String name; 
	
	private RouteNames(String routeName) {
		this.name = routeName;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
