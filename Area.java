public class Area{
  //circle
  public double area(double r){
     return Math.PI*r*r;
    }
    // rectangle
  public double area(double l,double w){
      return l*w;
     }
   // triangle 
  public double area(int b,int h){
     return 0.5*b*h;
    }   
  // square  
  public int area(int l){
     return l*l;
    }  
    
  public static void main(String[] args){
     Area obj = new Area();
     System.out.println("area of circle r=5: "+obj.area(5.0));
     System.out.println("area of rectangle(3,4): "+obj.area(3.0,4.0));
     System.out.println("area of triangle(4,3): "+obj.area(4,3));
     System.out.println("area of square(8): "+obj.area(5));
   }  
 }
