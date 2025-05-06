import Graphics.area;
public class TestGra{
  public static void main(String[] args){
    area g =new area();
    System.out.println("area of rectangle:"+g.rect(4,5));
    System.out.println("area of triangle:"+g.tria(3,4.5));
    System.out.println("area of Square:"+g.squ(5));
    System.out.println("area of circle:"+g.cir(4.5));
  }
 }
