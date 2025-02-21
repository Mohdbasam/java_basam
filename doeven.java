public class doeven{
public static void main(String[] args){

System.out.println("first 5 Even number : ");

int i=2;
int max =0;

do{
if(i%2==0){
System.out.println(i);
max++;
}
i++;
}
while(max<5);
}
}
