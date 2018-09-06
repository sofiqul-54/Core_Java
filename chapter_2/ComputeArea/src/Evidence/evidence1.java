package Evidence;

public class evidence1 {

    public static void main(String[] args) {
      /////////////Question - 01
      long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.println("Current Time is : " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");

        ///////////////////////////////////////Question - 03
        int x = 10;
        long y =  x;

        ////////////////////////////////////////
        int numberofYears = 34;
        double weight = 0.305;

        //////////////////////////////////////Question - 02
        
        //System.out.println(Math.pow(2, 31)-1);
    //    double range = Math.pow(2, 32)-1
                
                ////////////////////Augmented operator
    //            int x = 10;
                x+=2;
                
                boolean b = true;
              //  i = (int)b;
                
                int i = 1;
            //    boolean b = (boolean)1;
       
    }
}
