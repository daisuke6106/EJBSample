package jp.co.dk.ejbsample;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface HelloRemote extends EJBObject {
	
	public String getMsg() throws RemoteException;
	
}