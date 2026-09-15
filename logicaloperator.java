public class logicaloperator {

    public static void main(String[]args){

        int a=5;
        int b=6;
        int c=7;
        int d=8;
        //logical operators are used to combine multiple conditions and the result of the comparision will be either true
        //false, 
        //logical operators are of three types AND,OR,NOT
        //AND operator return true if all of the condtions are true
        //OR operator returns true if any of the condition is true
        // Not operator returns true if condition is false and return false if condition is true



        //lets look into AND operator
        //all condtions needs to be true in a comparison
        boolean result =(a>b && c<d);
        System.out.println(result);

        //lets look into OR operator
        // any of the condition needs to be true in a comparison
    boolean result1=(a>b || c<d);
    System.out.println(result1);


    //lets look into NOT operator

    boolean result2=!(a>b);
    //will give true because a is not greater than  b
    System.out.println(result2);




    // here is the intresting concept i want to talk about which is short circuiting logical operators
    // When we use and operator and if first condition is false then it will not check the second condtion cuz the result will be flase anyway we are saving time
    //same goes for OR operator is the first condition is true it will not check the second condition because the result will be true anyway
    
    }

    
}
