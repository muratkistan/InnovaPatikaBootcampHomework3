package com.innova.intercepter;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@YolKesiciInterface
@Interceptor
public class YolKesiciMetot {
	
	// public YolKesiciMetot() {
	// // TODO Auto-generated constructor stub
	// }
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		System.out.println("Onceki durumum " + context.getMethod().getName() + " " + context.getClass());
		
		boolean isLogin = true;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("Oncelikle uye olunuz ! Yonlendiriliyor");
			return null;
		} else {
			
			try {
				isContinue = context.proceed();
				System.out.println("Login olduktan sonra : yonlendirme yapiliyor...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isContinue;
	}
	
}
