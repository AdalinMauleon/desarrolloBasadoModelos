public class App {
    public static void main(String[] args) throws Exception {
  ConnectToDB connectToDB1 = ConnectToDB.getInstance("Host_DB", "Principal", "root", "12345678");
  ConnectToDB connectToDB2 = ConnectToDB.getInstance("Host_DB", "Principal", "root", "12345678");
  connectToDB1.verifyConnection(); 
  connectToDB2.close(); 
  connectToDB1.verifyConnection(); 
    }
}
