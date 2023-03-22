class Quadrilateral{
    int len,bre;
    Quadrilateral(int len,int bre){
        this.len=len;
        this.bre=bre;
    }
    public void displayDimensions(){
        System.out.println("length:"+len+" bredth:"+bre);
    }
}
class Rectangle extends Quadrilateral{
    Rectangle(int len,int bre){ super(len,bre);}
    public int area(){
        return len*bre;
    }
    public int paremeter(){
        return 2*(len+bre);
    }
}
class Cube extends Quadrilateral{
    int hei;
    Cube(int len,int bre,int hei){ super(len,bre); this.hei=hei;}
    public int volume(){
        return len*bre*hei;
    }
    public void displayDimensions(){
        System.out.println("length:"+len+" bredth:"+bre+" height:"+hei);
    }
}
public class QuadTest {
    public static void main(String[] args) {
        Rectangle rt1=new Rectangle(3,4);
        Rectangle rt2=new Rectangle(6,5);
        Cube c1=new Cube(3,3,3);
        Cube c2=new Cube(7,7,7);

        System.out.println("*********************** rectangle-1 ***********************");
        rt1.displayDimensions();
        System.out.println("area :"+ rt1.area());
        System.out.println("parimeter :"+rt1.paremeter());

        System.out.println("*********************** rectangle-2 ***********************");
        rt2.displayDimensions();
        System.out.println("area :"+ rt2.area());
        System.out.println("parimeter :"+rt2.paremeter());

        System.out.println("*********************** Cube-1 ***********************");
        c1.displayDimensions();
        System.out.println("volumn :"+ c1.volume());


        System.out.println("*********************** Cube-2 ***********************");
        c2.displayDimensions();
        System.out.println("volumn :"+     c2.volume());

    }
}