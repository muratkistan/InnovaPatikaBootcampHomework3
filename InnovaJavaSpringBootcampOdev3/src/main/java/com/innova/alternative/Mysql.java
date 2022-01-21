package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Mysql implements IDatabaseType {
	
	@Override
	public String databaseType(String data) {
		
		return "Mysql";
	}
	
}
