//Single Inheritance
class Animal{  
void eat(){
    System.out.println("eating...");
    }  
}  
public class Dog extends Animal{  
    void bark(){System.out.println("barking...");
        
    } 
    public static void main(String[] args){  
    Dog d=new Dog();  
    d.bark();  
    d.eat();
}

//Multiple Inheritance
class Animal{  
void eat(){
    System.out.println("eating...");
    }  
}  
class Dog extends Animal{  
    void bark(){System.out.println("barking...");
        
    } 
    
}  

class BabyDog extends Dog
{
    void cry(){
        System.out.println("Crying...");
    }
}

class MultiLevelInherit{
    public static void main(String args[]){  
    BabyDog d=new BabyDog();  
    d.cry();
    d.bark();  
    d.eat();
}
}

//Heirarchical Inheritance
class Animal{  
void eat(){
    System.out.println("eating...");
    }  
}  
class Dog extends Animal{  
    void bark(){System.out.println("barking...");
        
    } 
    
}  

class Cat extends Animal
{
    void meow(){
        System.out.println("Meowing...");
    }
}

class Main{
    public static void main(String args[]){  
    Cat c=new Cat();  
    c.meow();
     
    c.eat();
}
}


//Hybrid doesn't work since it has multiple inheritance in it.
