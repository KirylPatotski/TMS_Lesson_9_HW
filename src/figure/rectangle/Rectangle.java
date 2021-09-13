package figure.rectangle;
import figure.IFigure;
import figure.figures.Figures;

/**
 * The class for the rectangle
 */
public class Rectangle extends Figures implements IFigure  {

    public Rectangle(int a1, int b1){
        this.a = a1;
        this.b = b1;
    }

    @Override
    public int calculateArea(Figures figures) {
        return a*b;
    }

    @Override
    public int calculateScope(Figures figures) {
        array[0] =(a+b)*2;
        return (a+b)*2;
    }

    public int getA(){return a;}
    public int getB(){return b;}
    public void setA(int a ) {
        this.a = a;
    }
    public void setB(int b ) {
        this.b = b;
    }

}
