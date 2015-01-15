package skillup.garcha.task.matrix;

import java.io.IOException;

/**
 * @author ggarchagudashvili
 */
public class Runner {
    
    public static void main(String[] args) {
        Matrix a = MatrixFactory.createMatrix(4, 6);
        Matrix b = MatrixFactory.createMatrix(4, 6);
        
        System.out.println("Matrix a:");
        System.out.println(a);
        System.out.println("Matrix b:");
        System.out.println(b);
        
        try {
            Matrix c = Summator.sum(a, b);
            System.out.println("Matrix c (sum of a and b):");
            System.out.println(c);
            
        } catch (IOException e) {
            System.out.println("Can't sum 'a' and 'b' matrixes - dimensions does not match");
        }
    }
}
