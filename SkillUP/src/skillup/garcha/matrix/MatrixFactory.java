package skillup.garcha.matrix;

/**
 * @author ggarchagudashvili
 */
public class MatrixFactory {
    
    public static Matrix createMatrix(int x, int y) {
        Matrix mx = new Matrix(x, y);
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                mx.setElement(i, j, (int)(Math.random() * x * y));
        return mx;
    }
    
}
