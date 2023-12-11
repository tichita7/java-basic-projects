package Wiley_java_core;

public class StringBuilderClass {
      public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("Wiley");
//		sb.append(" Edge");
    	  
    	  StringBuilder logMessage = new StringBuilder();
    	  long timestamp = System.currentTimeMillis();
    	  
    	  logMessage
    	  .append("[")
    	  .append(timestamp)
    	  .append("] ");
    	  
    	  int userId = 12345;
    	  
    	  logMessage 
    	  .append("User ")
    	  .append(userId)
    	  .append(": ");
    	  
    	  String message = "Login successfully";
    	  logMessage.append(message);
    	  
    	  System.out.println(logMessage);
	}
}
