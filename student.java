public class student{

String name;
int rollNO;
int mark;

public static void main(String[] args){

student s1 = new student();

s1.name = "rahul";
s1.rollNO = 35;
s1.mark = 75;

student s2 = new student();
s2.name = "hari";
s2.rollNO = 33;
s2.mark = 100;


student students[] = new student[2];

students[0] = s1;
students[1] = s2;

for(int i=0;i<students.length;i++){
System.out.println(students[i].name + ":" + students[i].mark);
	}
		}
			}
