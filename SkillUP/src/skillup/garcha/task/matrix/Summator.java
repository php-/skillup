package skillup.garcha.task.matrix;

import java.io.IOException;

/**
 * @author ggarchagudashvili
 */
public class Summator {
    
    public static Matrix sum(Matrix a, Matrix b) throws IOException {
        int ah = a.getHorizontalSize();
        int av = a.getVerticalSize();
        int bh = b.getHorizontalSize();
        int bv = b.getVerticalSize();
        
        if (ah != bh || av != bv)
            throw new IOException("Ar grcxvenia?!");
        
        Matrix c = new Matrix(av, ah);
        
        for (int i = 0; i < av; i++) 
            for (int j = 0; j < ah; j++) 
                c.setElement(i, j, a.getElement(i, j) + b.getElement(i, j));
        
        return c;
    }
}
