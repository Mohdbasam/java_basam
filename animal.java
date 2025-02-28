class animal{

String name;
int lifespan;

String display(){

return "Animal name is :"+ name + "\tlifespan : "+lifespan;
}

public static void main(String[] args){

animal animal1 = new animal();
animal animal2 = new animal();
animal animal3 = new animal();

animal1.name = "rat";
animal1.lifespan = 3;

animal2.name = "wolf";
animal2.lifespan = 8;

animal3.name = "lion";
animal3.lifespan = 14;

System.out.println(animal1.display());
System.out.println(animal2.display());
System.out.println(animal3.display());
}

}
