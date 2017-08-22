//package design.lecture.lec11.before.proxy;
//
//import java.rmi.Naming;
//
//public class MyRemoteServer {
//	public static void main (String[] args){
//		try{
//			MyRemote service = new MyRemoteImpl();
//			Naming.rebind("rmi://127.0.0.2/RemoteHello",  service);
//			System.out.println("MyRemote Server is ready.");
//
//		} catch(Exception e){
//			e.printStackTrace();
//		}
//	}
//
//}
