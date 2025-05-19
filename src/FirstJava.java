
import java.io.*;
import java.util.*;

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

class Conversion{
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

/*Create a class Box which has 3 properties lenght, breadth and height. Also create setBox function(setter) to set 
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

/*Create a College class which have three attributes to store student name, student id and college name. 
Use static method to change college name and create seeter for other two attributes. 
Also create a method to display all details */

class College{
    private int sid;
    private String sName;
    private static String cName; //static variable
    
    public static void ChangeCollege(){ //static funtion
        cName = "Namuna";
    }
    College(int id, String name){
        sid=id;
        sName=name;
    }
    public void display(){
        System.out.println(sid+" "+sName+" "+cName);
    }
    /*In main:
        College.ChangeCollege(); //static function call
        College c1 = new College(1, "Ram");
        College c2 = new College(2, "Raj");
        College c3 = new College(3, "Rajan");
        
        c1.display();
        c2.display();
        c3.display();
    */
}

//Static block: WAP to perform sum of two static variables using the concept static block.
class StaticSum{
    private static int a=10,b=20; //static data members
    public static int total;
    
    static{ //static block
        System.out.println("Performing sum within static block...");
        total =a+b;
    }
    /*In main:
      System.out.println("Sum: "+StaticSum.total);
    */
}

//class to demonstrate concept of pass by value and pass by refrence;
class Pass{
    Pass(){}
    
    private int a;
    public int b=0;
    void incA(int x){ //increment method which take one value
        this.a = x;
        ++a;
    }

    void display(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    
    Pass(int y){
        b=y;
    }
    
    void incB(Pass p){ //increment method which take one value
        this.b = p.b;
        ++b;
    }
    /*In main:
        Pass p = new Pass(); 
        int a=20;
        System.out.println("Pass by value: ");
        System.out.println("Value before call: "+a);
        p.incA(a); //calling funtion using object
        System.out.println("Value after call: "+a);
        
        Pass p1 = new Pass(10); 
        System.out.println("Pass by reference: ");
        System.out.println("Value before call: "+p1.b);
        p1.incB(p1); //calling funtion using object
        System.out.println("Value after call: "+p1.b);
    */
}

//Example of member inner class
class Outer{ //Outer class
    int a = 10;
    void show(){
        Inner i = new Inner();
        i.display();
    }
    class Inner{//Inner class
        public void display(){
            System.out.println("This is inner class");
            System.out.println("a: "+a); //Inner class can directly access the member of outer class
        }
    }
    /*In main:
        Outer o = new Outer();
        o.show();
    */
}


//Example: Method local inner class
class Outer1{
    void outerMethod(){
        System.out.println("This is outer method.");
        
        class Inner{ //Inner class within a method (local to method)
            void innerMethod(){
                System.out.println("Within a local method");
            }
        }
        Inner i = new Inner();
        i.innerMethod();
    }
    
    void show(){
        //Inner i = new Inner();//Restiricted to local method: outerMethod
        //i.innerMethod();
    }
    /*In main:
        Outer1 o = new Outer1();
        o.outerMethod();
    */
}

//Example: Anonymous Inner class
abstract class Anonymous{
    abstract void fruit();
    /*In main:
        Anonymous a = new Anonymous() {
            @Override
            void fruit() {
                System.out.println("Apple");
            }
        };
        a.fruit();
    */
}

//Example: static inner class
class Outer2{
    static void outerMethod(){
        System.out.println("Within outer class!");
    }
    static class Inner{
        void innerMethod(){
            outerMethod();
            System.out.println("Within static inner class!");
        }
    }
    /*In main:
        Outer2.outerMethod(); // Static method call be invoke without creating an objct
        Outer2.Inner i = new Outer2.Inner(); //We don't need to create an objct of outer class for static inner class
        i.innerMethod();
    */
}

//Example: Create a program to calculate factorial of n using the concept of recursion.
class Factorial{
    private int result;
    int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            result = fact(n-1)*n;
            return result;
        }
    }
    /*In main:
        int num;
        Factorial f = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        System.out.println("Factorial of "+num+" is: "+f.fact(num));
    */
} 

//Example: Single inheritance
class Human{
    protected String name;
    void setName(String name){
        this.name = name;
    }
}

class Teacher extends Human{
    void display(){
        System.out.println("Name: "+name);
    }
    /*In main: 
        Teacher t = new Teacher();
        t.setName("Raj");
        t.display();
    */
}   

/*Create a class Number, which has two integer variables a and b, Also create setter and getter for those variables.
 Create a sub class Arithmetic, which has 4 different functions add(), subtract(), divide() and multiply() to perform
 addition, subtraction, division and multiplication on the two numbers of super class*/
class Number{
    private int a,b;
    void setAB(int a, int b){
        this.a = a;
        this.b = b;
    }
    int getA(){
       return a; 
    }
    int getB(){
       return b; 
    }
}

class Arithmetic extends Number{
    int result;
    void add(){
        result = getA()+getB();
        System.out.println("Sum: "+result);
    }
    void subtract(){
        result = getA()-getB();
        System.out.println("Difference: "+result);
    }
    void divide(){
        result = getA()/getB();
        System.out.println("Division: "+result);
    }
    void multiply(){
        result = getA()*getB();
        System.out.println("Product: "+result);
    }
    /*In main:
        Arithmetic art = new Arithmetic();
        art.setAB(100, 10);
        art.add();
        art.subtract();
        art.divide();
        art.multiply();
    */
}

//Example: Multi level inheritance
class Teacher1{
    void teach(){
        System.out.println("Teaching subject...");
    }
}
class Student1 extends Teacher1{
    void listen(){
        System.out.println("Listening...");
    }
}
class HomeTution extends Student1{
    void explain(){
        System.out.println("Does homework...");
    }
    /*In  main:
        HomeTution h = new HomeTution();
        h.teach();
        h.listen();
        h.explain();
    */
}

/*Create a class Vehicle which has a wheel data member, also create its setter and getter.
Derive a class Bike which has a speed data member, also crate its setter and getter. Derive a class Yamaha from bike 
class which has its data member version, also create its setter and getter. Create an instance of Yamaha class and invoke
all the methods in main function.*/
class Vehicle{
    private int wheel;
    public void setWheel(int w){
        wheel =w;
    }
    public int getWheel(){
        return wheel;
    }
}
class Bike1 extends Vehicle{
    private int speed;
    public void setSpeed(int s){
        speed =s;
    }
    public int getSpeed(){
        return speed;
    }
}

class Yamaha extends Bike1{
    private String version;
    public void setVersion(String v){
        version = v;
    }
    public String getVersion(){
        return version;
    }
    /*In main:
        Yamaha y = new Yamaha();
        y.setWheel(2);
        y.setSpeed(150);
        y.setVersion("V3");
        System.out.println("Bike version: "+y.getVersion());
        System.out.println("Bike Speed: "+y.getSpeed());
        System.out.println("Bike Wheels: "+y.getWheel());
    */
}

/*Create a class Animal which has a function eat(). Derive Bird from Animal class which has a function fly().
Again derive a class Fish from Animal class which has a function swim().
*/
class Animal{
    void eat(){
        System.out.println("Eating food...");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("I am flying...");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("I am swiming...");
    }
    /*In main: 
      Bird b =  new Bird();
      b.eat();
      b.fly();
      
      Fish f = new Fish();
      f.eat();
      f.swim();*/
}
//super keyword to access instance variable and method of parent class.
class Animal1{
    String color = "white";
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal1{
    String color ="black";
    void printColor(){
        System.out.println("Color: "+color); //color of Dog class
        System.out.println("Color: "+super.color); //color of Animal1 class
    }
    void bark(){
        System.out.println("barking...");
    }  
    void eat(){
        System.out.println("eating bread");
    }
    void work(){  
        super.eat();  
        bark();  
    }
    /*In main:
      Dog d = new Dog();
      d.printColor();
      d.work();
    */
}

//super class to invok constructor of parent class
class A{  
    A(){ //Default constructor
        System.out.println("A is created");
    }  
}  
class B extends A{  
    B(){  
        super();//this is optional because compiler automatically call the parent class default constructor  
        System.out.println("B is created");  
  }  
    /*In main:
        B obj = new B();
    */
}  

//super keword to invoke pareameterized constructor of parent class
class Person1{
    int id;
    String name;
    Person1(int id, String name){ //parameterizd constructor
        this.id = id;
        this.name = name;
    }
}
class Staff extends Person1{
    float salary;
    Staff(int id, String name, float salary){ //Invoking parent class constructor
        super(id, name);
        this.salary = salary;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("Salary: "+salary);
    }
    /*In main:
      Staff s = new Staff(1,"Raj",50000.00f);
      s.display();
    */
}

//Example: Method overriding
class Vechile1{
    void speed(){
        System.out.println("Any vechile Maximum speed is 45km/hr");
    }
}
class Truck extends Vechile1{
    @Override
    void speed(){
        System.out.println("Truck, Maximum speed is 35km/hr");
    }
    /*In main:
      Vechile1 v = new Truck(); //Using reference variable of parent class
      v.speed();
    */
}

//Example: Abstract class
abstract class Birds{
    abstract void fly();
}

class Eagle extends Birds{
    @Override
    void fly() {
        System.out.println("I can fly high!");
        /*In main:
            Eagle e = new Eagle();
            e.fly();
        */
    }
}
//Example Intrface    
interface Drawable{  
  void draw();  
}  
class Rectangle implements Drawable{  
  @Override
  public void draw(){
    System.out.println("drawing rectangle");
  }  
}  
class Circle implements Drawable{  
  @Override
  public void draw(){
    System.out.println("drawing circle");
  }
    /*In main:
          Drawable d= new Circle();
        d.draw();
        Drawable r= new Rectangle();
        r.draw();  
  */  
}  


//Multiple inhreitance
interface Printable{  
  void print();  
}  
interface Showable{  
  void show();  
}  
class Out implements Printable,Showable{  
  @Override
  public void print(){
    System.out.println("Hello");
  }  
  @Override
  public void show(){
    System.out.println("Welcome");
  }  
  /*In main:
     Out o = new Out();
     o.print();
     o.show();
  */
}

class ExceptionExample{
    //Example: Arithmetic Exception handling using try-catch blocks.
  void ArthException(){
        Scanner sc = new Scanner(System.in);
        int nu,de,result;
        System.out.println("Enter Numenator: ");
        nu = sc.nextInt();
        System.out.println("Enter denominter: ");
        de = sc.nextInt();
        try{ //Where proble occur
            result=nu/de;
            System.out.println("Divisoin is: "+result);
        }
        catch(ArithmeticException e){ //To handle problem
            System.out.println("Exception occured: "+ e.getMessage());
        }
        finally{
        System.out.println("Executed Successfully!");
        }
  }
  
  void multiCatch(){
    try {
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 3: "+numbers[3]);  // This will throw an ArrayIndexOutOfBoundsException
            int result = 10/0;  // This will throw an ArithmeticException
            System.out.println("Division is: "+result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured: " + e.getMessage());
        }
         finally{
           System.out.println("Continue execution!");		
         }

  }
  
  void Pilpeline(){
    try {
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 3: "+numbers[3]);  // This will throw an ArrayIndexOutOfBoundsException
            int result = 10/0;  // This will throw an ArithmeticException
            System.out.println("Division is: "+result);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
         finally{
           System.out.println("Continue execution!");		
         }

  }
  
  void throwException(){
      try {
            int age;
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or older.");
            }
            System.out.println("Age is valid.");
        }
         catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
  }
  
  void causeException() throws Exception{
      try {
            divide(2, 0);
        }
	catch (ArithmeticException e) {
            System.out.println("Cause of Exception: "+ e.getCause());
        }
    }
  
  void divide(int a, int b) throws Exception{
        try {
            int i = a / b;
        }
	catch (ArithmeticException e) {
        // initializing new Exception with cause
        ArithmeticException exe = new ArithmeticException();
        exe.initCause(e);
        throw(exe);
  }
}
}

/*class IFException extends Exception {
    public IFException() {
        super();
    }
    
    public IFException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws IFException {
        if (amount > balance) {
            throw new IFException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount(100.0);
        try {
            a.withdraw(150.0);
        } catch (IFException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}*/

class MyString{
    void check(){
        String str = "Hello";
        /*returns the character at the specified index
        char ch = str.charAt(1); 
        System.out.println(ch);*/
        
        //to check length of the string
        /*int l = str.length();
        System.out.println(l);*/
        
        //to create sib string
        /*String substr = str.substring(1);
        System.out.println(substr);*/
        
        /*String substr = str.substring(1,4);
        System.out.println(substr);*/
        
        //to check specified pattern in string
        /*boolean contains = str.contains("all");
        System.out.println(contains);*/
        
        //to check index of char in given string
        /*int index = str.indexOf('l'); 
        System.out.println(index);*/
        
        //to check index of string pattern in given string
        /*int index = str.indexOf("lo"); 
        System.out.println(index);*/
        
        //to compare two strings
        /*String str1 = "Hello";
        boolean isEqual = str1.equals(str); // true
        System.out.println(isEqual);*/
        
        //to compare two strings ignoring case
        /*String str2 = "hello";
        boolean isEqual = str.equalsIgnoreCase(str2); // true
        System.out.println(isEqual);*/
        
        //to lower case
        /*String s = str.toLowerCase();
        System.out.println(s);*/
        
        //to upper case
        /*String s = str.toUpperCase();
        System.out.println(s);*/
        
        //replace character
        /*String s = str.replace('l','p');
        System.out.println(s);*/
    }
    void concat1(){
        String firstName = "Raju";
        String lastName = "Bhai";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName); 

    }
    
    void concat2(){
        String str1 = "Raju";
        String str2 = " Bhai";
        String result = str1.concat(str2);
        System.out.println(result);
    }
    
    void conversion(){
        //string to integer
        String str = "123";
        int number = Integer.parseInt(str); 
        System.out.println(number); 
        
        //string to double
        String strdob = "3.14";
        double pi = Double.parseDouble(strdob); 
        System.out.println(pi);
        
        //string to boolean
        String strbool = "true";
        boolean flag = Boolean.parseBoolean(strbool); 
        System.out.println(flag);
        
        //integer to string
        int num = 42;
        String intstr = String.valueOf(num);
        System.out.println(intstr);
        
        //double to string
        Double dpi = 3.14;
        String dobstr = dpi.toString();
        System.out.println(dobstr);
    }
    
    //Program to retrieve a single character at a specified index.
    void retriveChar(){
      String str = "Nepal";
      char c = str.charAt(3);
      System.out.println(c);
    }
    
    //WAP to change cases of string.
    void changeCase(){
        String str = "Nepal";
        String S = str.toUpperCase();
        String s = str.toLowerCase();
        System.out.println("Lower case: "+s);
        System.out.println("Upper case: "+S);
    }
    
    //Program to compare two strings
    void compare(){
        String str1 = "Help";
        String str2 = "help";
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Strings are same!");
        }
        else{
            System.out.println("Strings are different!");
        }
    }
    
    //WAP to search substring from a given string.
    void search(){
        String str = "Hello, welcome to java class!";
        boolean flag = str.contains("java");
        System.out.println("Content found? "+flag);
    }
    
    //Program to change/replace substring form a given string.
    void change(){
        String str = "Hello, welcome to java class!";
        String changed = str.replace("java","python");
        System.out.println(changed);
    }
}

class MyStringBuffer{
    //to append
    void toAppend(){
        StringBuffer sb = new StringBuffer("Beautiful");
        sb.append( " Nepal");
        System.out.println("Append: " +sb); //BeautifulNepal
    }
    
    //Inserts the specified string representation into this sequence.
    void toInsert(){
        StringBuffer sb = new StringBuffer("Beautiful");
        sb.insert(0, "You're ");
        System.out.println(sb); 
    }
    
    void toReplace(){
        StringBuffer sb = new StringBuffer("Very good!");
        sb.replace(5, 10, "lucky");
        System.out.println(sb); 
    }
}

//Simple thread using Thread class
class MyThread1 extends Thread{
        @Override
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        }
        /*In main: 
        MyThread1 thread = new MyThread1();
        thread.start(); 
        */
}

//Program to run two threads by extending Thread class.
class MyThread2 extends Thread{
    private String tName;
    MyThread2(String name){
        tName = name;
        System.out.println("Creating "+tName);
    }
    
    @Override
    public void run(){    
        System.out.println("Running "+tName);
         try{
            for(int i=1;i<4;i++){
                System.out.println(tName+","+"Iteration: "+i);
                Thread.sleep(50);
            }
        }
         catch(InterruptedException e){
             System.out.println(tName+"interrupted");
        }
        System.out.println(tName+" exiting"); 
    }
    /*In main:
        MyThread2 t1 = new MyThread2("Thread-1");
        t1.start(); 
        MyThread2 t2 = new MyThread2("Thread-2");
        t2.start(); 
    */
}

//simple example of running thread by implementing Runnable interface.
class MyThread3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable thread " + Thread.currentThread().getName() + " is running.");
    }   
}


//Program to run two threads by implementing Runnable interface.
class MyThread4 implements Runnable{
    private String tName;
    MyThread4(String name){
        tName = name;
        System.out.println("Creating "+tName);
    }
    @Override
    public void run(){
         try{
            for(int i=1;i<4;i++){
                System.out.println(tName+","+"Iteraiton: "+i);
                Thread.sleep(50);
            }
        }
         catch(InterruptedException e){
            System.out.println("Thread:"+tName+"interrupted");
         }
        System.out.println(tName+" exiting");
    }
    /*In main:
        MyThread4 mt1 = new MyThread4("Thread-1");
        Thread t1 = new Thread(mt1);
        t1.start();
        MyThread4 mt2 = new MyThread4("Thread-2");
        Thread t2 = new Thread(mt2);
        t2.start();
    */
}

//Thread priority
class MyPriority implements Runnable {
    private String name;
    MyPriority(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " iteration " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted.");
            }
        }
        System.out.println(name + " finishing execution.");
    }
    /*In main:
        Thread thread1 = new Thread(new MyPriority("HighPriorityThread"));
        Thread thread2 = new Thread(new MyPriority("LowPriorityThread"));
        
        thread1.setPriority(Thread.MAX_PRIORITY);  // 10
        thread2.setPriority(Thread.MIN_PRIORITY);     // 1
        
        thread1.start();
        thread2.start();
    */
}

//Program to demonstrate thread synchronization by Synchronizing a Method
class SharedResource {
    private int count = 0;
    // Synchronized method to prevent race conditions
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
 }
    /*In main:
     SharedResource resource = new SharedResource();

        // Creating multiple threads to modify the shared resource
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    resource.increment();
                }
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.increment();
            }
        }, "Thread-2");

        t1.start();
        t2.start();
    */
}

class Customer{  
    int amount=10000;  
  
    synchronized void withdraw(int amount){  
        System.out.println("going to withdraw...");  
        if(this.amount<amount){  
            System.out.println("Less balance; waiting for deposit...");  
        try{
            wait();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }  
    } 

        if(this.amount>amount){
            this.amount-=amount;  
            System.out.println("withdraw completed...");  
        }  
}

    synchronized void deposit(int amount){  
        System.out.println("going to deposit...");  
        this.amount+=amount;  
        System.out.println("deposit completed... ");  
        notify();  
    }     
}  

class Man implements Serializable{
    private int age;
    private String name; 
    public Man(){
        
    }

    public Man(String name, int age){
        this.age = age;
        this.name = name;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}

class MyIO{
    void fileIO(){
        try{
            FileOutputStream fos = new FileOutputStream("example.bin");
            // Write some bytes (for example: representing an array of numbers)
            byte[] data = { 10, 20, 30, 40, 50 };
            fos.write(data);
            System.out.println("Data written to file using byte stream.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }

        // Read data from a file using FileInputStream
        try (FileInputStream fis = new FileInputStream("example.bin")) {
            int byteData;
            System.out.println("Reading data using byte stream:");
            // Reads the file byte by byte until end-of-file is reached (-1)
            while ((byteData = fis.read()) != -1) {
                System.out.print(byteData + " ");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }    
    }
    
    void charIO(){
        // Write data to a file using BufferedWriter and FileWriter
        try{ 
            BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"));
            bw.write("Hello, Java I/O!");
            bw.newLine();
            bw.write("This is an example of a character stream.");
            System.out.println("Text written to file using character stream.");
            bw.close();
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }

        // Read data from a file using BufferedReader and FileReader
        try{
            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String line;
            System.out.println("Reading text using character stream:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
        void scannerIO(){
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter Name: ");
        String name = s.nextLine();
        System.out.println("Enter Gender: ");
        char gender = s.next().charAt(0);
        System.out.println("Enter Age: ");
        int age = s.nextInt();
        System.out.println("Enter Mobile No: ");
        long MobileNO = s.nextLong();
        System.out.println("Enter Annual Income: ");
        Double AI = s.nextDouble();
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobli NO: "+MobileNO);
        System.out.println("Total: "+AI);
    }    
        
        void serialize(){
         try{  
              //Creating the object  
                Man m =new Man("Raj",20);  
                //Creating stream and writing the object  
                FileOutputStream fout=new FileOutputStream("D:\\file.txt");  
                ObjectOutputStream out=new ObjectOutputStream(fout);  
                out.writeObject(m);  
                out.flush();  
                //closing the stream  
                out.close();  
                System.out.println("success"); 
         
                FileInputStream fileIn = new FileInputStream("D:\\File.txt");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                m = (Man) in.readObject();
                System.out.println("Deserialized Person...");
                System.out.println("Name: " + m.getName());
                System.out.println("Age: " + m.getAge());
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
}

class CorePackages{
    void mWrapper(){
        //  byte data type 
        byte a = 1; 
        // wrapping around Byte object 
        Byte bobj = a; 
  
        int b = 10; 
        Integer iobj = b; 
  
        float c = 18.6f; 
        Float fobj = c; 
  
        char e='a'; 
        Character cobj=e; 
  
        //  printing the values from objects 
        System.out.println("Values of Wrapper objects (printing as objects)"); 
        System.out.println("Byte object byteobj:  " + bobj); 
        System.out.println("Integer object intobj:  " + iobj); 
        System.out.println("Float object floatobj:  " + fobj);  
        System.out.println("Character object charobj:  " + cobj); 
  
        // objects to data types (retrieving data types from objects) 
        // unwrapping objects to primitive data types 
        byte bv = bobj; 
        int iv = iobj; 
        float fv = fobj; 
        char cv = cobj; 
  
        // printing the values from data types 
        System.out.println("Unwrapped values (printing as data types)"); 
        System.out.println("byte value, bv: " + bv); 
        System.out.println("int value, iv: " + iv); 
        System.out.println("float value, fv: " + fv); 
        System.out.println("char value, cv: " + cv);    
    }
    
    void mMath(){
        double x = 2;
        double y = 4;
        System.out.println("Greater between x and y: "+ Math.max(x,y));
        System.out.println("Square root of y is: "+ Math.sqrt(y));
        System.out.println("power of x and y is: "+ Math.pow(x,y));
        System.out.println("Logarithm of x is: "+ Math.log(x));
        System.out.println("Log10 of x is: "+ Math.log10(x));
        System.out.println("Log1p of x is: "+ Math.log1p(x));
        System.out.println("exp of x is: "+ Math.exp(x));
        double a = 30;
        System.out.println("sine value of a is: "+ Math.sin(a));
        System.out.println("cosine value of a is: "+ Math.cos(a));
        System.out.println("Tangent value of a is: "+ Math.tan(a));
    }
    
    void mNumber(){
        Double d = Double.valueOf("6.9685"); 
    
        byte b = d.byteValue();  
        short s = d.shortValue();   
              
        System.out.println("value of d after converting it to byte : " + b); 
        System.out.println("value of d after converting it to short : " + s); 
         
        Integer i = Integer.valueOf("10"); 
     
        System.out.println(i.compareTo(7));  //1 shows i is greatre than 7
        System.out.println(i.compareTo(11)); //-1 shows i is less than 11 
        System.out.println(i.compareTo(10)); //0 shows i is equal with 10
        
        Integer in = Integer.valueOf("15"); 
        Integer x = 10; 
        System.out.println(in.equals(x));
    }
    
    void mStack(){
        Stack<String> s = new Stack<>();

        s.push("Jack");
        s.push("Queen");
        s.push("King");
        s.push("Ace");

        System.out.println("Stack : " + s);
        // Check if the Stack is empty
        System.out.println("Is Stack empty? : " + s.isEmpty());
        // Find the size of Stack
        System.out.println("Size of Stack : " + s.size());
        // Search for an element
        // The search() method returns the 1-based position of the element from the top of the stack
        // It returns -1 if the element was not found in the stack
        int position = s.search("Queen");

        if(position != -1) {
            System.out.println("Found the element \"Queen\" at position : " + position);
        } else {
            System.out.println("Element not found");
        }
        s.pop(); 
        System.out.println("After pop");
        System.out.println("Stack : " + s);
    }
    
    void mVector(){
                // create default vector 
        Vector v = new Vector(); 
  
        v.add(1); 
        v.add("Nepal"); 
        v.add(2); 
        v.add(3, "India");  
  
        System.out.println("Vector is " + v);
        v.clear();
        System.out.println("Vector is " + v);
    }
    
    void dictionary(){
        // Creating a Hashtable (Dictionary subclass)
        Hashtable<Integer, String> dictionary = new Hashtable<>();

        // Adding key-value pairs
        dictionary.put(1, "Apple");
        dictionary.put(2, "Banana");
        dictionary.put(3, "Cherry");

        // Retrieving a value
        System.out.println("Value for key 2: " + dictionary.get(2));

        // Checking if a key exists
        System.out.println("Contains key 3? " + dictionary.containsKey(3));

        // Removing a key-value pair
        dictionary.remove(1);
        System.out.println("Dictionary after removal: " + dictionary);

    }
    
    void mRandom(){
        //Generates a number between 0.0 and 1.0
        double randomValue = Math.random(); 
        System.out.println("Random Number: " + randomValue);
        //To generate a number in a specific range (e.g., 1 to 100):
        int randomNum = (int) (Math.random() * 100) + 1;
        System.out.println("Random Number (1-100): " + randomNum);
    }
}

class mCollection{
    void mArray(){
        //Array declaration
        int a[];
        //Array instantiating
        a = new int[4];
        //Array literal
        Integer[] arr = new Integer[]{1,2,3,4,5};
        
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        
        System.out.println("value at index 0: " + arr[0]);
        
        for (int i =0; i<a.length;i++)
            System.out.println("Array at index"+i+":"+a[i]);
    
        int ar[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
  
        // printing 2D array 
        for (int i=0; i< 3 ; i++){ 
            for (int j=0; j < 3 ; j++) 
                System.out.print(ar[i][j] + " "); 
                 System.out.println(); 
        }
    }
    
    void mArraylist(){
        //declaring ArrayList with initial size n 
       ArrayList<Integer> al = new ArrayList<>();
  
        // Appending the new element at the end of the list 
        for (int i=0; i<5; i++) 
            al.add(i); 
       
        // Printing elements 
        System.out.println(al); 
  
        // Remove element at index 3 
        al.remove(3); 
  
        // Displaying ArrayList after deletion 
        System.out.println(al); 
  
        // Printing elements one by one 
        Iterator<Integer> i = al.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next());
    }
    
    void mMap(){
       Map hm = new HashMap(); 
       hm.put(1, "Nepal"); 
       hm.put(2, "India"); 
       hm.put(3, "China"); 
       hm.put(4, "America"); 
  
       // Returns Set view      
       Set<Map.Entry> st = hm.entrySet();    
       //System.out.println(hm.remove(4));
       for(Map.Entry me:st) 
       { 
           System.out.print(me.getKey()+":"); 
           System.out.println(me.getValue()); 
       } 
       System.out.println(hm.get(1));
    }
    
    void mListInterface(){
          // Creating a list 
        List<Integer> a1 = new ArrayList<>(); 
        a1.add(0, 2); // adds 1 at 0 index 
        a1.add(1, 3); // adds 2 at 1 index 
        System.out.println("a1: "+a1); 
  
        // Creating another list 
        List<Integer> a2 = new ArrayList<>(); 
        a2.add(1); 
        a2.add(2); 
        a2.add(3); 
  
        // Will add list l2 from 1 index 
        a1.addAll(2, a2); 
        System.out.println("a1 after adding a2: "+a1); 
  
        // Removes element from index 1 
        a1.remove(1); 
        System.out.println("After removing index 1 element:"+a1); 
  
        // Prints element at index 3 
        System.out.println("Element at index 3: "+a1.get(3)); 
  
        // Replace 0th element with 5 
        a1.set(0, 5); 
        System.out.println("After replacing 0th element with 5: "+a1); 
        
        ListIterator<Integer> itr = a1.listIterator();       
        while(itr.hasNext()){         
        System.out.println(itr.nextIndex()+":"+itr.next());  //prints index and element  
        }
    }
    
    void mSetInterface(){
        // Set deonstration using HashSet 
        Set<String> hs = new HashSet<String>(); 
        hs.add("Nepal"); 
        hs.add("India"); 
        hs.add("Nepal"); 
        hs.add("China"); 
        hs.add("China"); 
        System.out.print("Set output without the duplicates"); 
  
        System.out.println(hs); 
        hs.remove("India");
        System.out.println("After removing India:"+hs); 
        
        // Iterating over hash set items 
        System.out.println("Iterating over Set:"); 
        Iterator<String> i = hs.iterator(); 
        while (i.hasNext()) {
            System.out.println(i.next()); //display element
        } 
        
        // Set deonstration using TreeSet 
        System.out.print("Sorted Set after passing into TreeSet"); 
        Set<String> ts = new TreeSet<>(hs); 
        System.out.println(ts);
    }
    
    void mTreeSet(){
        Set<String> ts1 = new TreeSet<String>(); 
        
        // Elements are added using add() method 
        ts1.add("B"); 
        ts1.add("A"); 
        ts1.add("C"); 
  
        // Duplicates will not get insert 
        ts1.add("C"); 
        
        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println(ts1); 
        
        System.out.println("Iterating over Set:"); 
        Iterator<String> i = ts1.iterator(); 
        while (i.hasNext()) {
            System.out.println(i.next()); //display element
        } 
    }
    
    void mLinkedList(){
        // Creating object of class linked list 
        LinkedList<String> L1 = new LinkedList<String>(); 
  
        // Adding elements to the linked list 
        L1.add("A"); 
        L1.add("B"); 
        L1.addLast("C"); //add at last
        L1.addFirst("D"); //add at first
        L1.add(2, "E"); //add at index 2
        L1.add("F"); 
        L1.add("G"); 
        System.out.println("Linked list : " + L1); 
  
        // Removing elements from the linked list 
        L1.remove("B"); 
        L1.remove(3); 
        L1.removeFirst(); 
        L1.removeLast(); 
        System.out.println("Linked list after deletion: " + L1); 
  
        // Finding elements in the linked list 
        boolean status = L1.contains("E"); 
        if(status) {
            System.out.println("List contains the element 'E' ");
        } else {
            System.out.println("List doesn't contain the element 'E'");
        } 
 
        // Get and set elements from linked list 
        System.out.println("Element returned by get() : " + L1.get(2)); 
        L1.set(2, "Y"); 
        System.out.println("Linked list after change : " + L1); 
        
        Iterator<String> i = L1.iterator(); 
        while (i.hasNext()) {
            System.out.println(i.next()); //displays element
        } 
    }
    
    void mHAshSet(){
         HashSet<Integer> h = new HashSet<>(); 
  
        // Adding elements into HashSet usind add() 
        h.add(1); 
        h.add(2); 
        h.add(3); 
        h.add(3);// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("List contains 5? " + h.contains(5)); 
  
        // Removing items from HashSet using remove() 
        h.remove(3); 
        System.out.println("List after removing 3:"+h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<Integer> i = h.iterator(); 
        while (i.hasNext()) {
            System.out.println(i.next());
         } 
    }
}

public class FirstJava{    
    public static void main(String args[]){
       mCollection c = new mCollection();
       c.mHAshSet();
    }
}


