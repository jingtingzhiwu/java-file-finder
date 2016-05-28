package com.cyl.xml;

import java.util.List;

public abstract class RegexMatcher<T>{
	protected abstract boolean match(LineModel model);
	
	public List<T> getMatchResult(){
		return null;
	}
}
