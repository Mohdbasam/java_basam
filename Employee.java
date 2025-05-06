import java.util.*;
class Employee{
   int eno;
   String ename;
   int salary;
   
   public void read(){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the id:");
     this.eno = sc.nextInt();
     System.out.println("enter the employee name:");
     this.ename = sc.nextLine();
     System.out.println("enter the salary:");
     this.salary = sc.nextInt();
   }
   
   public void display(){
      System.out.println("employee id: "+this.eno);
      System.out.println("employee name: "+ this.ename);
      System.out.println("employee salary: "+this.salary);
     }
     public static void main(String []args){
        int i,n=3;
        employee emp[] = new employee[n];
        for(i=0;i<n;i++){
            emp[i] = new employee();
            emp[i].read();
        }
        System.out.println("Search"); 
        while(true){
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter ID : "); 
            int no = sc.nextLine();
            for(i=0;i<n;i++){
                if(emp[i].eno == no){
                    emp[i].display();
                    break;
                }
            }
        }

    }

  }
