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
    }

    

}
