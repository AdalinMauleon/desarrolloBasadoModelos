



// Classes
class ConnectToDB {
 private volatile static ConnectToDB unique_link;
 private String host;
 private String db_name;
 private String user;
 private String password;
 static boolean connection;

 private ConnectToDB(String host, String db_name, String user, String password) { 
  this.host     = host;
  this.db_name  = db_name;
  this.user     = user;
  this.password = password; 
  connection    = false;
 }
 
 public static ConnectToDB getInstance(String host, String db_name, String user, String password) {
  if(unique_link == null) 
   synchronized(ConnectToDB.class) {
    if(unique_link == null)
     unique_link = new ConnectToDB(host, db_name, user, password);
     // Code to verify connection status
     connection = true;
    } 

  return unique_link;
 }

 public boolean bindParam(String aka, String value, String tipo) {
  boolean bind = false;
  // Code top bind a value to its "aka"
  bind = true;
  return bind;
 } 

 public boolean prepare(String query) {
  boolean status = false;
  // Code to run the query receive to th DB
  status = true;
  return status;
 }

 public void close() {
  connection = false;
 }

 public void verifyConnection() {
  if(connection)
   out.println("\nConnection to the Data Base " + host + " open.\n");
  else
   out.println("\nConnection to the Data Base " + host + " closed.\n");
 }
}