class person{

String name;
int phone;

public void showAddress(){
System.out.println("name :"+name);
System.out.println("Phone no. :"+phone);
	}
}
class Teacher extends person{

}
class student extends person{

}

public class person1{

public static void main(String[] args){

Teacher t1 = new Teacher();
t1.name = "radhika";
t1.phone = 2255;

t1.showAddress();

student s1 = new student();
s1.name = "krishna p k";
s1.phone = 8866;
s1.showAddress();

}
}
