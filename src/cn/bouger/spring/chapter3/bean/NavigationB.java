package cn.bouger.spring.chapter3.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class NavigationB {
	private NavigationC navigationC;  
    private List<NavigationC> list;  
    private Properties properties;  
    private NavigationC[] array = new NavigationC[1];  
    private Map<String, NavigationC> map;
	/**
	 * @return the navigationC
	 */
	public NavigationC getNavigationC() {
		return navigationC;
	}
	/**
	 * @return the list
	 */
	public List<NavigationC> getList() {
		return list;
	}
	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}
	/**
	 * @return the array
	 */
	public NavigationC[] getArray() {
		return array;
	}
	/**
	 * @return the map
	 */
	public Map<String, NavigationC> getMap() {
		return map;
	}
	/**
	 * @param navigationC the navigationC to set
	 */
	public void setNavigationC(NavigationC navigationC) {
		this.navigationC = navigationC;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<NavigationC> list) {
		this.list = list;
	}
	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	/**
	 * @param array the array to set
	 */
	public void setArray(NavigationC[] array) {
		this.array = array;
	}
	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, NavigationC> map) {
		this.map = map;
	}  
    
}
