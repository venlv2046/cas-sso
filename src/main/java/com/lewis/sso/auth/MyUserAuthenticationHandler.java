package com.lewis.sso.auth;

import java.security.GeneralSecurityException;

import org.jasig.cas.authentication.HandlerResult;
import org.jasig.cas.authentication.PreventedException;
import org.jasig.cas.authentication.UsernamePasswordCredential;
import org.jasig.cas.authentication.handler.support.AbstractUsernamePasswordAuthenticationHandler;

public final class MyUserAuthenticationHandler extends AbstractUsernamePasswordAuthenticationHandler {

	@Override
	protected HandlerResult authenticateUsernamePasswordInternal(UsernamePasswordCredential arg0)
			throws GeneralSecurityException, PreventedException {
		// TODO Auto-generated method stub
		System.out.println("xxxxxxxxxxxxxxxxx");
		return null;
	}

}
