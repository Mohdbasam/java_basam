package Graphics;
interface inter_graph{
   public int rect(int l,int w);
   public double tria(double b,double h);
   public float squ(int a);
   public double cir(double r); 
 }
 
 public class area implements inter_graph{
   public int rect(int l,int w){
    return l*w;
    }
   public double tria(double b,double h){
     return 0.5*b*h;
    } 
   public float squ(int a){
     return a*a;
    } 
   public double cir(double r){
      return Math.PI*r*r;
    } 
  }
