class Car{
String brand;
int year;

String display()
{
return brand;}
int print(){
return year;}

public static void main(String [] args){

Car car1 = new Car();

car1.brand = "BMW";
car1.year = 1957;

System.out.println("Car brand is : "+car1.display());
System.out.println("Manufacture year is : "+car1.print());
}
}
