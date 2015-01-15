package skillup.garcha.task.matrix;

/**
 * @author ggarchagudashvili
 */
public class Matrix {
    
    private int[][] arr;
    
    public Matrix(int a, int b) {
        arr = new int[a][b];
    }
    
    public int getElement(int x, int y) {
        return arr[x][y];
    }
    
    public void setElement(int x, int y, int value) {
        arr[x][y] = value;
    }
    
    public int getHorizontalSize() {
        return arr[0].length;
    }
    
    public int getVerticalSize() {
        return arr.length;
    }
    
    @Override
    public String toString() {
        String str = "";
        for (int[] a : arr){
           for (int b : a)
               str += "\t" + b;
           str += "\n";
        }
        return str;
    }
}
