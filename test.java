interface animal{

void eat();

 }
 
interface WildAnimal{

void roar();

 }
 
class Tiger implements animal,WildAnimal{

public void eat(){
System.out.println("Animal is eating");
}

public void roar(){
System.out.println("Animal is roaring");
}

public void show(){
System.out.println("Show something");
}

public void display(){
System.out.println("Display something");
}
}

public class test{

public static void main(String[] args){

Tiger a = new Tiger();
a.show();
a.display();
a.eat();
a.roar();
}
	}
