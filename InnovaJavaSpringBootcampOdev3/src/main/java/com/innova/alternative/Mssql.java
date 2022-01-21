package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mssql implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "Mssql";
	}
	
}