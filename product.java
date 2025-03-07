public class product{

int p_code;
String p_name;
int price;

String display(){

return "Code is : "+p_code +"\tProduct Name is : "+p_name+" Product price is : "+price;
}

public static void main(String[] args){

product p1 = new product();
product p2 = new product();
product p3 = new product();

p1.p_code=101;
p1.p_name = "oreo";
p1.price = 10;

p2.p_code = 102;
p2.p_name = "tiger";
p2.price = 20;

p3.p_code = 103;
p3.p_name = "goodDay";
p3.price = 25;


System.out.println(p1.display());
System.out.println(p2.display());
System.out.println(p3.display());


if(p1.price < p2.price && p1.price < p3.price){
System.out.println("p1 is lowest : "+p1.price);
}
else if(p2.price < p1.price && p2.price < p3.price){
System.out.println("p2 is lowest : "+p2.price);
}
else if(p3.price < p1.price && p3.price < p2.price){
System.out.println("p3 is lowest : "+p3.price);
}
else{
System.out.println("All prices are equal");
}
}
}
