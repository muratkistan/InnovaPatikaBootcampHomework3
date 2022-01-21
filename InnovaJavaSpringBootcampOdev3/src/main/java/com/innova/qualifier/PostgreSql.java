package com.innova.qualifier;

@QualifierCokluSecim
public class PostgreSql implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "Database : PostgreSql";
	}
	
}