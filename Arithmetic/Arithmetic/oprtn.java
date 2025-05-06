package Arithmetic;
interface inter_arith{
  public float add(int a,int b);
  public float sub(int a,int b);
  public float mult(int a,int b);
  public float div(int a,int b);
  public float rem(int a,int b);
 }
 
 public class oprtn implements inter_arith{
  public float add(int a,int b){
      return a+b;
   }
  public float sub(int a, int b){
     return a-b;
   } 
  public float mult(int a, int b){
    return a*b;
  } 
  public float div(int a, int b){
   return a/b;
  }
  public float rem(int a,int b){
   return a%b;
  }
  }
