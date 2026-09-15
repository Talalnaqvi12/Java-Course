public class postincrementandpreincrement 
    {


        public static void main(String[]args){
            int a =5;
            int result=a++;
            System.out.println( result);
            //the post increment operator and pre increment operator behaves differently  when we try to fetch the value of a variable after performing an operation

            // in this post increment the value of a will be fetched first and then the value of a gets incremented 
            // for example if a =5 first it will fetch the value of a which is 5 annd then it will increment or decrement according to the operation performed on it

            // the post increment result will be 5 when we print it

        // lets look into pre incremen operator


        int preincrement= 6;
        int result1=++preincrement;
        System.out.println(result1);
        // in this pre increment opeartor it will first increment the value of variable and then it will fetch the value
        //the result of pre increment will be 7 when we print it
    }
}
