package figure.square;
import figure.IFigure;
import figure.figures.Figures;
/**
 * The class for the square
 */
public class Square  extends Figures implements IFigure {

    public Square(int a){
        this.a = a;
    }

    @Override
    public int calculateArea(Figures figures) {
        return a*a;
    }

    @Override
    public int calculateScope(Figures figures) {
        array[1] = a*4;
        return a*4;
    }


    public int getA(){return a;}
    public void setSquareA(int a ) {
        this.a = a;
    }



}
