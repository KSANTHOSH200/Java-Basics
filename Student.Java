//import java.io.*;
//student class
public class Student{
    int no;
    String name;
    float marks;
    char intial;
    Boolean isStillStudying;
    
    Student(){
        System.out.println("Constructor is initialized");
    }
    
    Student(int no, String name, float marks, char initial, Boolean isthere){
        this.no=no;
        this.name=name;
        this.marks=marks;
        this.intial=initial;
        this.isStillStudying=isthere;
    }
    void setNo(int num){
        this.no=num;
    }
    int returnNo(){
        return this.no;
    }
    public static void main(String[] args){
        int Num;
       Student santhosh = new Student(26, "Santhosh", 40, 'K', true);
       Num=santhosh.returnNo();
       System.out.println(Num); 
    }
}

