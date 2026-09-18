public class loops {
    public static void main(String args[]){


        //different types of loops
        // 1-do while loop,while loop and for loops

        //loops perform repetative same tasks based on certain condition

// do while loop
        int i =1;
        while(i<5){
            System.out.println("Hello Java" + i);
            i++;
        }


        // the condition of loop is when i is less than 5 run the code and we print one i variable with bye outside the loop 
        //what will happen?
        // The code run till i<5 and when the variable is equal to 5 it will exit the loop and print the bye statement with value of i =5
        System.out.println("Bye" + i);
        












// lets understand the nested loop
    //suppose we want that in the loop every time when hello Java is get printed 6 times the statement hello inner loop gets printed too
    // so for every one hello java 6 times the hello inner loop gets printed how can we do that?
    //using inner loop we will initialize the value of j to keep track of hello inner loop








    // lets understand the code 

// i<1, the condtion will run and print Hello java 1
//then j=1 , it enters into the inner loop and it will keep running the hello java inner loop 1,2,3,4,5 upto hello java inner loop 6 
//because untill the j loop condition is not fullfilled it will not exit the inner loop and when it exit it will increment the value of i from 1 to 2 
// and the this cycle will happens untill i < 10 and for every i it will print hello java inner loop 6 times 

        
    while(i<10){
        System.out.println("Hello Java " + i);

        int j=1;
        while(j<=6){


            System.out.println("Hello Java Inner Loop"+ j);
            j++;
        }
        i++;
    }










    //lets now understand the concept of do while loop 
    //see in the while loop it will always check the condition is true or not if the condition is true only than it will execute the code 
    // but there are certain conditions in which you want to run the loop for atleast at once even if the condition is false 
    // in this situation do while loops step in

int atif = 5;

    do {

        // lets say you want to send a message to your friend even if the network is not avaiable to your friend device at once 
        // so eeven if there is no network atleast you sent the message to receive a message that network is not availaBLE  
        // so in the do statement it will run the loop even if the condition is  not true 


        System.out.println("Hello Atif");
        atif ++ ;
    }while(atif<=4);














 //lets understand for loop


// in for loop we intialize, add condition and increment or decremeent the value on same line with keyword for




    
for(int k=0;k<5;k++){

System.out.println("VALUE OF I IS " + k);

}




// I want to print the each day from monday to sunday and then on every day i want to print the 24 hours 





    }











   
    

}
