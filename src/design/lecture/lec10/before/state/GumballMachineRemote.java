package design.lecture.lec10.before.state;

import java.rmi.Remote;
import java.rmi.RemoteException;

import design.lecture.lec10.after.state.State;

public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
