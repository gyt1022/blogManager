package com.guo.config;import com.guo.service.ISysService;import org.apache.shiro.authc.AuthenticationException;import org.apache.shiro.authc.AuthenticationInfo;import org.apache.shiro.authc.AuthenticationToken;import org.apache.shiro.authc.SimpleAuthenticationInfo;import org.apache.shiro.authz.AuthorizationInfo;import org.apache.shiro.realm.AuthorizingRealm;import org.apache.shiro.subject.PrincipalCollection;import org.springframework.beans.factory.annotation.Autowired;/** * 实现AuthorizingRealm接口 用户认证 * @author guoyutao * @date 2019/03/06 */public class MyShiroRealm extends AuthorizingRealm {    @Autowired    private ISysService sysService;    @Override    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {        return null;    }    @Override    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {        String username = (String)authenticationToken.getPrincipal();        String password = null;        if(username.equals("admin")){            password="admin";            SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(username,password,getName());            return simpleAuthenticationInfo;        }else{            return null;        }    }}