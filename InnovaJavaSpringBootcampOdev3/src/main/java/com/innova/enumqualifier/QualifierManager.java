package com.innova.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class QualifierManager {
	
	// default
	// @Inject
	// IDatabaseType databaseType;
	
	// Opsiyonel
	@Inject
	@EQualifier(EDatabaseType.PostgreSql)
	IDatabaseType databaseType;
	
	public String getDatabaseType() {
		return databaseType.databaseType("Secilen Database: ");
	}
	
}
