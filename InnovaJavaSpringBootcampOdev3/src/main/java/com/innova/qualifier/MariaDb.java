package com.innova.qualifier;

@QualifierCokluSecim
public class MariaDb implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "Database : MariaDb";
	}
	
}
