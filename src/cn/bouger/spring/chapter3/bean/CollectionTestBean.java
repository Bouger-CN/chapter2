package cn.bouger.spring.chapter3.bean;

import java.util.Collection;
import java.util.Set;

public class CollectionTestBean {
	private Collection<String> values;
	private Set<String> setVals;
	public Collection<String> getValues() {
		return values;
	}

	public void setValues(Collection<String> values) {
		this.values = values;
	}

	public Set<String> getSetVals() {
		return setVals;
	}

	public void setSetVals(Set<String> setVals) {
		this.setVals = setVals;
	}  
	
}
