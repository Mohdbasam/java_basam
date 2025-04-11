class mobile{

String brand;
int price;
static String name="smartphone";

public void show(){
System.out.println(brand+":"+name+":"+price);
}
  }
public class demo{
public static void main(String[] args){

mobile obj1 = new mobile();
obj1.brand = "apple";
obj1.price = 1000;

mobile obj2 = new mobile();
obj2.brand = "samsung";
obj2.price = 500;


obj1.show();
obj2.show();


  }
     }
