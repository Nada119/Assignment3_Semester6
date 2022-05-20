import java.text.*;
import java.util.*;
public class DigitalWatch extends ArrayList<String> implements Runnable{

    static ArrayList<String> output = new ArrayList<String>();

        Thread t = null;
        int hours=0, minutes=0, seconds=0;
        String timeString = "";

        DigitalWatch(){


            t = new Thread(this);
            t.start();

        }

        public void run() {
            try {
                for (int i= 0; i <10; i++) {

                    Calendar cal = Calendar.getInstance();
                    hours = cal.get( Calendar.HOUR_OF_DAY );
                    if ( hours > 12 ) hours -= 12;
                    minutes = cal.get( Calendar.MINUTE );
                    seconds = cal.get( Calendar.SECOND );

                    SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                    Date date = cal.getTime();
                    timeString = formatter.format( date );

                    printTime();

                    t.sleep( 1000 );  // interval given in milliseconds
                }
            }
            catch (Exception e) { }
        }

        public ArrayList<String> printTime(){
            {
                output.add(timeString);
                //System.out.println(output);
                return output;

            }

        }

}
