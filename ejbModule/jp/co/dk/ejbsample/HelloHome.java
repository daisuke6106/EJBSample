package jp.co.dk.ejbsample;

import javax.ejb.EJBHome;
import javax.ejb.CreateException;
import java.rmi.RemoteException;

public interface HelloHome extends EJBHome {
	
	public HelloRemote create() throws CreateException, RemoteException;
	
}