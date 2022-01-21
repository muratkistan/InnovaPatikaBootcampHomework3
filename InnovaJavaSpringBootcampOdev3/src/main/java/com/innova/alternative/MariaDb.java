package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MariaDb implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "mariaDB";
	}
	
}
