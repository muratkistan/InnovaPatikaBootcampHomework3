package com.innova.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class DefaultDatabaseType implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "default database Mysql";
	}
	
}
