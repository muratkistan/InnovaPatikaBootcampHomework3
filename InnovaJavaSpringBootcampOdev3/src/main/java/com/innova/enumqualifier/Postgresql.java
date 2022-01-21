package com.innova.enumqualifier;

@EQualifier(EDatabaseType.PostgreSql)
public class Postgresql implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "Opsiyonel Database PostgreSql";
	}
	
}
