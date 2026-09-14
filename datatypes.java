class datatypes {

  public static void main(String a[]){
    System.out.println("Hello, World!");
int num=5;
float num1=5.6f;
double num2=5.6;
char ch='a';
boolean b=true;
byte b1=127;
short s =558;
long l=12345678l;

System.out.println(num);
System.out.println(num1);
System.out.println(ch);
System.out.println(b);
System.out.println(b1);
System.out.println(s);
System.out.println(l);




}
}
//When we work with java, the java is strictly typed language which means we need to specify the data types with the varaible to let 
//to let it know what kind of data is present inside that specific varaible 
//There are different types of datatypes in any programming language


// There are two types of Data Types
// 1-Primitive Datatypes
// 1.1-Integer,1.2-float,1.3-character,1.4-boolean mainly we have this four major primitive data types but when we divide it more we have more
//data types like float,long,double etc

// 1.1 inside integer we have multiple sub types like byte,short,int,long
// 1.2 float has several sub types like double,float 

//lets understand why do we need these sub types in integer and float

//lets say we want to store a normal number we will use int
// int-stores 4 bytes
// long -stores 8 bytes
// short stores 2 bytes we can use short when we want to save memory
// byte is only 1 byte and rember 1 byte is equal to 8 bits only


//lets understand how to calculate the range so we can use the proper sub types 
//minimum range
// FORMULA FOR SIGNED INTEGERS (where n = total number of bits):
// Minimum Value = -2^(n-1)
// Maximum Value = 2^(n-1) - 1


// DATA TYPES AND RANGES:

// byte
// Memory: 1 byte (8 bits)
// Min: -128
// Max: 127

// short
// Memory: 2 bytes (16 bits)
// Min: -32,768
// Max: 32,767

// int
// Memory: 4 bytes (32 bits)
// Min: -2,147,483,648
// Max: 2,147,483,647

// long
// Memory: 8 bytes (64 bits)
// Min: -9,223,372,036,854,775,808
// Max: 9,223,372,036,854,775,807
// }

// float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits 
// double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits and default is double 
//so if you want to store a fractional number we will use double num = 5.6; and it will store the number 
//but if you say something like this float num=5.6; it will give us an error because java by default consider this number as double 
//so if you want to work with float we need to specify it like this float num=5.6f; and it will work fine


//lets talk about character data type 
//char stores a single character and it is 2 bytes in size because java uses unicode to store the character and unicode is 2 bytes in size


//lets talk about boolean data type
// boolean data type is use to store only true or false values,boolean b = true; or bool b=false;