package com.innova.qualifier;

import javax.enterprise.inject.Default;

@Default
public class Mysql implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "Database : Default Mysql";
	}
	
}
