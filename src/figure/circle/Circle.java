package figure.circle;
import figure.IFigure;
import figure.figures.Figures;

/**
 * The class for the circle.
 */
public class Circle extends Figures implements IFigure{

    public Circle(int r){
        this.a = r;
    }

    @Override
    public int calculateArea(Figures figures) {
        return a*a*3;
    }

    @Override
    public int calculateScope(Figures figures) {
        array[3] = (a+b)*2;
        return a*6;
        //pi is 3.1415926, so 2 pi is about 6.
    }
    public int getA(){return a;}
    public void setB(int a ) {
        this.a = a;
    }


}
