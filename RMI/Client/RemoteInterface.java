import java.rmi.*;

public interface RemoteInterface extends Remote{
  public StringBuilder add(String x, String usr) throws RemoteException;
}
