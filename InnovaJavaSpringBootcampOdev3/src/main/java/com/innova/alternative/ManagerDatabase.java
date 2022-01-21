package com.innova.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class ManagerDatabase {
	
	@Inject
	private IDatabaseType databaseType;
	
	public String getDatabaseType() {
		return databaseType.databaseType("Database : ");
	}
	
}
