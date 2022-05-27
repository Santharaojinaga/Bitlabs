/* JFM1T6_Assignment4:

   Write a program to display current date-time. Hint: java.util package contains Date class.
   
   Sample Output:
   Date in Indian Timezone (IST) : 18-02-21 10:20:195 IST

*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentDateTime {
   //main method
   public static void main(String[] args) {
      
      //capture today's date
      Date today = new Date();
      
      //create DateFormat and set TimeZone 
      DateFormat DFormat = DateFormat.getDateInstance();
      TimeZone time_zone = TimeZone.getTimeZone("IST");
      
      //formatting date and setting timezone
      SimpleDateFormat dtformat = new SimpleDateFormat("dd-MM-yy HH:mm:sss");
      dtformat.setTimeZone(TimeZone.getTimeZone("IST"));
      
      //Storing the formatted date in the date
      String date = dtformat.format(today);
      
      //display this date on IST time zone
      System.out.println("Date in Indian Timezone (IST) : "+date+" IST");

   }
}