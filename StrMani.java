import java.util.*;
class StrMani{
 StringBuffer str;
 Scanner sc = new Scanner(System.in);

  public void read(){	    
    System.out.println("enter the string");
    this.str = new StringBuffer(sc.nextLine());
    }
    
    public void append(){
        System.out.println("enter the string you want to add ");
        String s1 = sc.nextLine();
        System.out.println("modified string is : "+str.append(s1));
      } 
    public void replace(){
         System.out.println("enter the string you want to add");
         String s1 = sc.nextLine();
         System.out.println("enter the starting postion for replacing");
         int p1 = sc.nextInt();
         System.out.println("enter the ending postion for replacing");
         int p2 = sc.nextInt();
         System.out.println("result: "+ str.replace(p1,p2,s1));
       }
  public void rev(){
       System.out.println("reverse of the string: "+this.str.reverse());
     }
  public void remove(){
      System.out.println("enter the start position for deleting");
      int p1 = sc.nextInt();
      System.out.println("enter the end position for deleting");
      int p2 = sc.nextInt();
      System.out.println("result : "+str.delete(p1,p2));
   }          
   
  public static void main(String[] args){ 
      Scanner sc = new Scanner(System.in);
      StrMani obj = new StrMani();
      while(true){
         System.out.println("1.enter the sentence");
         System.out.println("2.append the word");
         System.out.println("3.remove the specified word");
         System.out.println("4.reverse the word");
         System.out.println("5.replace the word");
         System.out.println("6.exit");
         System.out.println("enter the option");
         int opt = sc.nextInt();
         switch(opt){
            case 1:obj.read();
              break;
            case 2: obj.append();
               break;
            case 3: obj.remove();
               break;
            case 4: obj.rev();
              break;
            case 5:obj.replace();
               break;
            case 6: return;
            default: System.out.println("invalid option");
              break;             
          }
       } 
   } 
   
 }
