package com.innova.qualifier;

@QualifierCokluSecim
public class Mssql implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "Database : Mssql";
	}
	
}
