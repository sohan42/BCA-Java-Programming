
import java.util.Scanner;

/**
 *
 * @author Sohan
 */

class Literal{
    public 
       void display(){
           int x = 200, x1 = 0561, x2=0xfff, x3=0b111;
           System.out.println("Decimal: "+x+"\nOctal: "+x1+"\nHexa: "+x2+"\nBinary: "+x3);
           float f1=1.01f;
           System.out.println("Float: "+f1);
           char c ='a', c1=145, c2 = '\n',c3='\u0061';
           System.out.println("Single quote: "+c+"\nchar integer literal: "+c1+c2+"char unicode: "+c3);
    }    
}

class Conversion {
    private
        int i = 42;  
        float f = i;  
    public
        void wide(){
            System.out.println("Int value "+i); 
            System.out.println("Float value "+f); 
        }
        void cast(){
            double d =150.50;
            int x=(int) d;
            System.out.println("Double value "+d);
            System.out.println("Int value "+x);  
        }
}	


class Array{
    void arrayIO(){
    int[] arr = new int[5]; //creating array of size 5
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers: ");
        for(int i =0;i<5;i++){ //enter elements in an array using loop
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Displaying elements of an array");
        for(int i =0;i<arr.length;i++){ //Accessing array elements using loop
            System.out.println(arr[i]);
        }   
    }
}

class Operator{
    void unary(){
        int x=10;  
        int y=5;
        System.out.println("x after pre-increment: "+ ++x); //Pre-increment
        System.out.println("x after pre-decrement: "+ --x); //pre-decrement  
        System.out.println("y after post-increment: "+ y++); //Post-increment
        System.out.println("y after post-decrement: "+ y--); //Post-decrement 
    }
    void arithmetic(){
        int x=10;  
        int y=5;
        System.out.println("Addition: "+ (x+y));
        System.out.println("Subtraction: "+ (x-y));
        System.out.println("Division: "+ (x/y));
        System.out.println("Multiplication: "+ (x*y));
        System.out.println("Modulus: "+ (x%y));
    }
    void relational(){
        int x=10;
        int y=5;
        System.out.println("x<y: "+ (x<y));
        System.out.println("x>y: "+ (x>y));
        System.out.println("x<=y: "+ (x<=y));
        System.out.println("x>=y: "+ (x>=y));
        System.out.println("x==y: "+ (x==y));
        System.out.println("x!=y: "+ (x!=y));
    }
    void bitwise(){
        int x = 60;
        int y = 13;
        System.out.println("logical AND x&y: "+ (x&y));
        System.out.println("logical OR x|y: "+ (x|y));
        System.out.println("logical XOR x^y: "+ (x^y));
        System.out.println("logical NOT ~x: "+ (~x));
        System.out.println("logical left shift x<<2: "+ (x<<2));
        System.out.println("logical right shift x>>2: "+ (x>>2));
    }
    void logical(){
        boolean x = true;
        boolean y = false;
        System.out.println("x&&y: "+ (x&&y));
        System.out.println("x||y: "+ (x||y));
        System.out.println("!(x&&y): "+ !(x&&y)); 
    } 
    void assignment(){
        int x=10, y=5;
        System.out.println("x=y: "+ (x=y));
        System.out.println("x+=y: "+ (x+=y));
        System.out.println("x-=y: "+ (x-=y));
        System.out.println("x*=y: "+ (x*=y));
        System.out.println("x/=y: "+ (x/=y));
        System.out.println("x%=y: "+ (x%=y));
    }
    void ternary(){
        int a = 10, b;
        b = (a==10)?10:20;
        System.out.println("b: "+b);
        
        String s;
        s = (a==b)?"Yes":"No";
        System.out.println("(a==b): "+s); 
    }
    void instance(){
        String s = "Nepal";
        if(s instanceof String){
            System.out.println("Yes");
        }
        else{
            System.out.println("False");
        }
    }       
} 

class Control{
    void ifStatement(){
        int a = 30, b = 20;
        if(a>b){
            System.out.println("a is larger!");
        }
        System.out.println("After if statement");
    }
    void ifElse(){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a = sc.nextInt();
        System.out.println("Enter value of b: ");
        b = sc.nextInt();
        if(a>b){
            System.out.println("a is larger!");
        }
        else{
            System.out.println("b is larger!");
        }
    }
    void nestedIf(){ //program to check the number is even or odd,only if number is greater than 10.
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt(); //Read num
        
        if(num>10){ //condition1: true when num is greater than 10!
            if(num%2==0){ //condition2: true when num is even.
                System.out.println(num+" is even.");
            }
            else{
                System.out.println(num+" is odd.");
            }
        }
        else{
            System.out.println(num+" is not greater than 10.");
        }
    }
    void ifElseIf(){ //to chceck grade of a student.
        int marks = 80;
        if(marks>=90){
            System.out.println("Grade A+");
        }
        else if(marks>=80){
            System.out.println("Grade A");
        }
        else if(marks>=70){
            System.out.println("Grade B+");
        }
        else if(marks>=60){
            System.out.println("Grade B");
        }
        else if(marks>=50){
            System.out.println("Grade C");
        }
        else if(marks>=40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail!");
        }
    }
    
    void checkDay(){
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choos 1-7 to display day in a week!");
        day = sc.nextInt();
        
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;  
            case 3:
                System.out.println("Tuesday");
                break;    
            case 4:
                System.out.println("Wednesday");
                break;    
            case 5:
                System.out.println("Thursday");
                break;    
            case 6:
                System.out.println("Friday");
                break;    
            case 7:
                System.out.println("Saturday");
                break;    
            default:
                System.out.println("Invalid input!");
        }
    }
}

class Loop{
    void whileLoop1(){ //Dispaly 1 to 10 using while loop
        int num = 1;
        while(num<=10){
            System.out.println(num);
            num++;
        }
    }
    
    void whileLoop2(){ //Dispaly 10 to 1 using while loop
        int num = 10;
        while(num>=1){
            System.out.print(num+" ");
            num--;
        }
    }
    
    void doWhile1(){//Increment given number and print until the number reaches to 10. 
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
        
        do{
            num++;
            System.out.print(num+ " ");
        }while(num<=10);
    }

    void for1(){//dispaly 1-5
        int i;
        for(i=1;i<=5;i++){
            System.out.print(i+" ");
        }
    }
    void for2(){//dispaly 5-1
        int i;
        for(i=5;i>=1;i--){
            System.out.print(i+" ");
        }
    }
    void for3(){//Even numbers from 1 to 100
        int i;
        for(i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    void for4(){ //Program to create multiplication table
        Scanner sc = new Scanner(System.in);
        int num,i;
        System.out.print("Enter any number to display its multiplication table: ");
        num=sc.nextInt();
        
        for(i=1;i<=10;i++){  //5 x 1 = 5
            System.out.println(num +" X "+i +"= "+num*i);
        }
    }
    
    void forInfinitive(){//Infinity loop
        for(;;){
            System.out.println("INFINITY...");
        }
    }
    
    void forEach(){//display elements of an array
        int arr[] = {10,20,30,40,50};
        for(int data:arr){
            System.out.print(data+" ");
        }
    }
    
    void breakLoop(){//program to dispaly 1 to 10 numbers, also break loop when it gets 5
        int i;
        for(i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.print(i+" ");
        }
    }
    void continueLoop(){//program to dispaly 1 to 10 numbers, also skip loop when it gets 5
        int i;
        for(i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }
    }
    int returnNum(){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any number: ");
        num=sc.nextInt();
        return num;
    }
}

class Car{
    static void carName(){
        System.out.println("Ferrai");
    }
    
    public void maxSpeed(int ms){
        System.out.println("Maximum speed is: "+ms+" KM/HR");
    }
}

/*Create a class Box which has 3 properties lenght, breadth and height.Also create setBox function(setter) to set 
these 3 properties. Again create two functions area and volume, which returns area and volume respectively.
*/
class Box{
    private int length, breadth, height;
    
    public void setBox(int l, int b, int h){
                length = l;
                breadth = b;
                height = h;
            }
            
    public  int area(){
                return 2*(length*breadth+length*height+breadth*height);
            }
            
    public int volume(){
                return (length*breadth*height);
            }
}

//Implementation of different case of method overloading to find product of various data items.
class Multiplication{
    int mul(int x, int y){
        return (x*y);
    }
    int mul(int x, int y, int z){
        return(x*y*z);
    }
    float mul(int x, float y){
        return (x*y);
    }
    double mul(double x, double y){
        return (x*y);
    }
}

public class FirstJava {
    public static void main(String args[]){
        Multiplication m = new Multiplication();
        System.out.println("Product of two integers: "+m.mul(10, 20));
        System.out.println("Product of three integers: "+m.mul(10, 20, 30));
        System.out.println("Product of integers and float: "+m.mul(10, 20.50));
        System.out.println("Product of two double values: "+m.mul(20.5, 35.5));
}
}

