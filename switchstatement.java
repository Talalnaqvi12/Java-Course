public class switchstatement{


    public static void main (String[] args){
// lets say we want to check we want to print the day based on value of day 
byte day=3;


// // first way is we can add different if else statements to check 
// if(day==1)
//     {
//     System.out.println("Monday");

// }
// else if(day==2){
//     System.out.println("Tuesday");
// }
// else if(day==3){
//     System.out.println("Wednesday");
// }


// else if(day==4){
//     System.out.println("Thursday");
// }


// else if(day==5){
//     System.out.println("Friday");
// }



// else if(day==6){
//     System.out.println("Saturday");
// }



// else {
//         System.out.println("Sunday");

// }











// we did it with the if else condition but we have to write tons of conditions 

//we can actually do this in a much a simpler way which is called switch statement

//

switch(day){

    case 1:
        System.out.println("Monday");
 break;
    case 2:    
       System.out.println("Tuesday");
     break;

       case 3:    
       System.out.println("Wednesday");
        break;


       case 4:    
       System.out.println("Thursday");
        break;


       case 5:    
       System.out.println("Friday");
        break;


       case 6:    
       System.out.println("Saturday");
        break;


       case 7: 
       System.out.println("Sunday");
        break;
default:

System.out.println("Enter the correct number please ");


}


// in this case we see two things 
// 1- It is so much cleaner to write 
//2- in the current scenerio the condidtion that got matched is in the middle of the cases and when the condtion is in the 
// middle of the condtions we noticed that it executed the matched condition and all the condtions below the matched condition 
// to stop from happening we will use break statement after every case




// and when we compile the code after adding the break statmeent it only prints the desire statement 



// one more thing apart from break statement is default in switch statement 

// the default statement will run if there is no match like there are only 7 days is a week but if we put 8 or greater than 8 it will 
// run default statment cuz no case matched
    }

}