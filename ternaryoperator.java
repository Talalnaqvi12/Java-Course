public class ternaryoperator {
    public static void main (String[]args){


        int a = 10;
        int b=20;
     int result=0;
    //     if (a>b)
    //     System.out.println("a is greater");
    //     else
    //     System.out.println("b is greater");
    // }


    //we can use ternary operator to write this simple if else condition
//ternary operator syntax
// in ternary operator after the condition which is a>b is this case the statement after question mark represent true and : represent false statement
// so if condition is true we said make result=1 if condition is false set result to 0

    result= (a>b)? 1:0;
    System.out.println(result);
}

}
