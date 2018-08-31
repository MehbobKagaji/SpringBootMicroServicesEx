package com.training;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class RouteFilter extends ZuulFilter{

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
				RequestContext cx = RequestContext.getCurrentContext();
				HttpServletRequest req = cx.getRequest();
				
				System.out.println("Request Method : " + req.getMethod() + "Request URL : " + req.getRequestURL());
				return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "Router";
	}

}
