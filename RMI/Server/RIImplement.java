import java.rmi.*;
import java.rmi.server.*;
public class RIImplement extends UnicastRemoteObject implements RemoteInterface{
  static StringBuilder str;
  RIImplement() throws RemoteException{
    super();
    str = new StringBuilder("");
  }
  public StringBuilder add(String x, String usr){
    str.append("\n"+usr+": "+x);
    System.out.println(usr+": "+x);
    return str;
  }
}
