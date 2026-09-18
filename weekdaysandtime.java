public class weekdaysandtime{




    public static  void main (String args[]){


        String Result ="";
        for(int i =1;i<8;i++){


             Result =    switch(i){

                case 1 ->  "Monday";
                case 2 -> "Tuesday";
                case 3-> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7-> "Sunday";
                default ->   "Enter a valid number" ;

                

            };
            System.out.println("Today is day " + Result);
            
            for(int j=0; j<25; j++){

System.out.println("Today is " + Result  +" and time is " + j + "hour of " + Result );

            } 
        }
    }
}