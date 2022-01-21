package com.innova.intercepter;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("InterceptorAOP")
@ApplicationScoped
public class AopBean implements Serializable {
	
	private static final long serialVersionUID = 1822512376768777238L;
	
	@Inject
	private Login login;
	
	public String getLogin() {
		return login.isLogin("Admin Sayfasi");
	}
	
}
