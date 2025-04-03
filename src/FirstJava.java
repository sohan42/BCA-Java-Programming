
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
    /*In main:
    Multiplication m = new Multiplication();
        System.out.println("Product of two integers: "+m.mul(10, 20));
        System.out.println("Product of three integers: "+m.mul(10, 20, 30));
        System.out.println("Product of integers and float: "+m.mul(10, 20.50));
        System.out.println("Product of two double values: "+m.mul(20.5, 35.5));
    */
}

/*Create a class Shape which has two functions to calculate area of circle and triangle. 
Create functions using the concept of function overloading*/  
class Shape{
    Shape(){ //Default constructor
        System.out.println("Default constructor!");
    }
    public void area(float rad){
        System.out.println("Area of circle: "+3.14*rad*rad);
    }
    public void area(float length, float breadth){
        System.out.println("Area of Triangle: "+0.5*length*breadth);
    }
    /*In main:
        Shape s = new Shape();
        s.area(30.5f);
        s.area(20.5f, 11.11f);
    */
}

//Program using default constructor to sum two numbers.
class Sum{
    private int x,y;
    Sum(){ //default constructor
        x=10;
        y=20;
    }
    public void add(){
        System.out.println("Sum: "+(x+y));
    }
    /*In main:
        Sum s = new Sum();
        s.add();
    */
}

/*Create a class Box which has parameterized constructor to intialize its data members. 
Also create a funtion volume to calculte volume of Box. */ 
class Box1{
    private float length,breadth,height;
    Box1(float l, float b, float h){ //parameterized constructor
        System.out.println("Constructing box...");
        length = l;
        breadth = b;
        height = h;
    }
    public void volume(){
        System.out.println("Volume of box: "+(length*breadth*height));
    }
    /*In main:
        Box1 b = new Box1(20.5f,8.5f,25f);
        b.volume();
    */
}

/*Create a class Student, having roll_no, name, faculty as its properties. Create a set() function to set these properties
  and getRoll(), getName(), getFaculty() functions to return roll_no, name and facilty respectively.
*/
class Student{
    private int roll_no;
    private String name, faculty;
    
    void set(int r, String n, String f){
        roll_no = r;
        name = n;
        faculty =f;
    }
    int getRoll(){
        return roll_no;
    } 
    String getName(){
        return name;
    }
    String getFaculty(){
        return faculty;
    }
    /*In main:
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        int roll;
        String name,fac;
        System.out.println("Enter your roll no: ");
        roll = sc.nextInt();
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your faculty: ");
        fac = sc.next();
        s.set(roll,name,fac);
        
        System.out.println("Name: "+s.getName());
        System.out.println("Roll no: "+s.getRoll());
        System.out.println("Faculty: "+s.getFaculty());
    */
}

//Constrctor overloading
class Person{
    private int id, age;
    private String name;
    Person(){ //Default constructor
        id = 0;
        age = 0;
        name = null;
    }
    Person(int id, String name){ //Parameterizd costructor having 2 parameters (int, String)
        this.id = id;
        this.name = name;
        this.age = 20;
    }
    Person(int id, String name, int age){ //Parameterizd costructor having 3 parameters (int, String, int)
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display(){ //To display all details
        System.out.println("Id: "+id+" Name: "+name+" Age: "+age);
    }
    /*In main:
        Person p1 = new Person();//default constructor
        p1.display();
        Person p2 = new Person(1, "Raj"); //Constructor with 2 parameters
        p2.display();
        Person p3 = new Person(1, "Aman", 25); //Constructor with 3 parameters
        p3.display();
    */
} 

//Copy constructor
class Book{
    private int id;
    private String name, author;
    Book(int id, String name, String author){ //Parameterized constructor
        this.id = id;
        this.name = name;
        this.author = author;
    }
    Book(Book b1){ //Copy constructor
        this.id = b1.id;
        this.name = b1.name;
        this.author = b1.author;
    }
        void display(){ //To display details
        System.out.println("Id: "+id+" Name: "+name+" Author: "+author);
    }
        /*In main:
            System.out.println("Using parameterizd constructor!");
            Book b1 = new Book(245,"Programming in Java", "Sohan Acharya");
            b1.display();
            System.out.println("Using copy constructor!");
            Book b2 = new Book(b1);
            b2.display();
        */
}
//this keyword
class Bike{
    private float version, price;
    private String name;
    Bike(float version, float price, String name){
        this.version = version; //Use 1: to invoke class instance variable
        this.price = price; 
        this.name = name; 
    }
    Bike(){
        this(3.0f,350000.0f,"Yamaha"); //Use 2: to invoke current class constructor
        System.out.println("Inside default constructor: ");
        this.display(); //Use 4: to invoke current class method
    }
    
    Bike get(){
        return this; //Use 3: to return current class instance
    }
    void display(){
        System.out.println("Version: "+version+" Price: "+price+" Name: "+name);
    }
    /*In main:
        System.out.println("Using Parameterized constructor: ");
        Bike b1 = new Bike(2.0f,320000.0f,"Duke"); 
        b1.display();
        Bike b2 =  new Bike();
        b2.get().display();
    */
}

//example: Static 
class Company{
    private int eid;
    private static String cName;//static variable
    Company(int eid){
        this.eid = eid;
    }
    void setName(String cName){
        this.cName = cName; 
    }
    void display(){
        System.out.println("Id: "+eid+" Company name: "+cName);
    }
    /*In main:
        System.out.println("Employee 1: ");
        Company c = new Company(1);
        c.setName("ABC");
        c.display();
        System.out.println("Employee 2: ");
        Company c2 = new Company(2);
        c2.display();
    */
}

public class FirstJava {
    public static void main(String args[]){
        
    }
}

