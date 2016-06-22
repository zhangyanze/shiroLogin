package com.baf.shrio.realm;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;

import org.apache.shiro.authc.SimpleAuthenticationInfo;

import org.apache.shiro.authz.AuthorizationInfo;

import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


/**
 * 
 * @author ZYZ
 * @ClassName :UserRealm
 * @Version : 版本
 * @ModifiedBy : 无
 * @data : 2016年6月22日上午10:48:32
 * @Copyright : 厦门帝网
 */
public class UserRealm extends AuthorizingRealm {
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		 String userName = (String)token.getPrincipal();
	     String password = new String((char[])token.getCredentials());
	     
	     if(userName == null || password == null) return null;
    	 return new SimpleAuthenticationInfo(userName, password, getName());
	}
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
		return null;
	}
}
