package figure.triangle;
import figure.IFigure;
import figure.figures.Figures;

/**
 * This class is for the triangel
 */
public class Triangle extends Figures implements IFigure {

    public Triangle(int a, int b, int c, int hC){
        this.a = a;
        this.b = b;
        this.c = c;
        this.hC = hC;
    }

    @Override
    public int calculateArea(Figures figures) {
       int result = 0;
       int c = figures.c;
       int hC = figures.hC;

       result = c*hC;
       result/=2;

        return result;
    }

    @Override
    public int calculateScope(Figures figures) {
        array[2] = a+b+c;
        return a+b+c;
    }

    public int getA(){return a;}
    public int getC(){return c;}
    public int getB(){return b;}

    public void setA(int a ) {
        this.a = a;
    }
    public void setB(int b ) {
        this.b = b;
    }
    public void setC(int c ) {
        this.c = c;
    }

}
