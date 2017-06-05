import java.rmi.*;
import java.util.*;

public class MainClient{
  public static void main(String args[]){
    try{
      RemoteInterface st = (RemoteInterface) Naming.lookup("rmi://localhost:1020/add");
      Scanner sc = new Scanner(System.in);
      String x = "%has joined%", usr = sc.nextLine();
      while(!x.equals("/leave")){
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println(st.add(x,usr));
        System.out.print(usr+": ");
        x = sc.nextLine();
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
