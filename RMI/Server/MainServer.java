import java.rmi.*;

public class MainServer{
  public static void main(String args[]){
    try {
      RemoteInterface st = new RIImplement();
      Naming.rebind("rmi://localhost:1020/add",st);
      System.out.println("Server is ready");
    }
    catch(Exception e){
      System.out.println("Server is not ready");
    }
  }
}
