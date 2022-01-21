package com.innova.enumqualifier;

@EQualifier(EDatabaseType.Mssql)
public class Mssql implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "Opsiyonel Database Mssql";
	}
	
}
