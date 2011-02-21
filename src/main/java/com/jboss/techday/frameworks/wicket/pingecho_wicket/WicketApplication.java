package com.jboss.techday.frameworks.wicket.pingecho_wicket;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see com.jboss.techday.frameworks.wicket.pingecho_wicket.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{    
    /**
     * Constructor
     */
	public WicketApplication()
	{
	}
	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<Index> getHomePage()
	{
//		return HomePage.class;
		return Index.class;
	}

}
