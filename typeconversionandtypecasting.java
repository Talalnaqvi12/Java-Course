public class typeconversionandtypecasting {
    public static void main(String[] args) {
        // int num=5;
        //In Java we cant change the type of variable once it is declared but we can convert the value of variable to another type for integer type we can convert it to byte if its less than or equal to 
        //127, we can also convert it to short if its less than or equal to short range, we can convert int into float or double as well 

        //  But can we convert the short into byte  which has the value of 32767 to byte? nO because byte only ranges to 127 and if we use this 
    // logic we can say we can convert smaller data type into bigger  data type directly like b1=a but we cant convert unless we mention explictly
        // for example see this below code snippet 

byte b1 = 127;
int a =256;
// b1=a;
// do you think this will work?no because  we are assigning a byte variable with an integer value which has greater range than byte

// System.out.println("value of a before" ,a);
// a=b1;
// but lets says we do the opposite we a have in int a and we want to assign it to byte this will work because a has greater range 
// System.out.println("value of b after", a);
// so when we assign a a variable to b1 we perform the widening conversion means fitting a smaller data type into a bigger data type and this concept is called implicit type conversion or type promotion this type of 
//conversion is safe and happens automatically 
//So we cover what a implict type conversion is now lets cover what explict type conversion is
//// b1=a;
//b1=a; this is the case of explicit type conversion or type casting because we are fitting a bigger data type into a smaller datatype
//means fitting integer into a byte and this explicit type conversion is not safe because we can lose data 
// in explicit type conversion we explicitly tell the coompiler that we want to convert the data type of variable to another type

b1=(byte)a;
System.out.println(b1);
// the code will compile and it convert the integer value to byte but it will result in data loss and the output will be zero and in this 
//scenerio we are doing explict type conversion and explict type connversion is also called type casting
//in short when you do it explicitly it is called casting and when you do it implictly it is called conversion






// let cover anoother scenerio which is converting a float value into an integer
float f =5.6f;
//before conversion
System.out.println(f);  
//after conversion
int x=(int)f;
// here are we are doing explicit conversion again which means we will loose some part of data and this scenerio we will 
//lose the decimal part of value after conversion.
System.out.println(x);













//There is another important concept called type promotion 
// look at this code below
byte res=10;
byte res1=30;

short finalresult=res*res1;
System.out.println(finalresult);
//here we are multiplying two byte values and result is greater than byte range so the result is stored in int and this is called type promotion because the excpected 
//output goes beyond the range of a byte so we need to store in that data type which can hold the value and in this case it is int or 
// we can use short too, short too?Noo but we might think that short can easily accomodate the 300 becauase its in the range of short but the compiler will  not allow it  
// for future reference there are some possible type promotions data types of result given below








// byte         | byte, short, char, int        | int         | byte, short, char
// short        | byte, short, char, int        | int         | byte, short, char
// char         | byte, short, char, int        | int         | byte, short, char
// int          | byte, short, char, int        | int         | byte, short, char
// Any integer  | long                          | long        | byte..int
// Any int/long | float                         | float       | byte..long
// Any type     | double                        | double      | byte..float
// --------------------------------------------------------------------------------

// PROMOTION RULES SUMMARY (TIER LIST):
// --------------------------------------------------------------------------------
// 1. double  -> Highest priority: Any operation with double evaluates to double.
// 2. float   -> Any operation with float (and no double) evaluates to float.
// 3. long    -> Any operation with long (and no float/double) evaluates to long.
// 4. int     -> Baseline minimum: byte, short, char always promote to int.
  }

}
