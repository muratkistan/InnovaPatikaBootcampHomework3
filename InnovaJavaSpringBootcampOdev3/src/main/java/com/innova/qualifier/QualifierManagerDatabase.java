package com.innova.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualifierCDI")
@ApplicationScoped
public class QualifierManagerDatabase implements Serializable {
	
	private static final long serialVersionUID = 5283876693913429832L;
	
	// Default icin
	// @Inject
	// private IDatabaseType databaseType;
	
	@Inject
	@QualifierCokluSecim
	private IDatabaseType databaseType;
	
	public String getDatabaseType() {
		return databaseType.databaseType("Database Type: ");
	}
	
}
