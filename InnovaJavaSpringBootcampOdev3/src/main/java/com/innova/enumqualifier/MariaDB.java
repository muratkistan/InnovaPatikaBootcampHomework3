package com.innova.enumqualifier;

@EQualifier(EDatabaseType.MariaDB)
public class MariaDB implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "Opsiyonel Database MariaDB";
	}
	
}
