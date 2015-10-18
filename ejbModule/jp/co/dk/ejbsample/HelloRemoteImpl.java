package jp.co.dk.ejbsample;

import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class HelloRemoteImpl implements SessionBean {
	
	private static final long serialVersionUID = -5932985499374748823L;

	public void ejbCreate() {}
	
	public void setSessionContext(SessionContext ctx) {}
	
	public void ejbRemove() {}
	
	public void ejbActivate() {}
	
	public void ejbPassivate() {}
	
	public String getMsg() {
		return "Hello World!";
	}
}