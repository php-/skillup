package skillup.garcha.task.controlflow;

/**
 *
 * @author ggarchagudashvili
 */
public class ControlFlow {
    
    public static final int ALIGN_TOP = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int ALIGN_BOTTOM = 3;
    public static final int ALIGN_LEFT = 4;
    
    public static void main(String[] args) {
        System.out.println("Hello! This is control flow tasks home page");
        System.out.println("");
        
        // Find a's in b
        int a = 3;
        int b = -3130013;
        int count = findAinB(a, b);
        System.out.println("A in B: "+ a + " in " + b + " occurs " + count + "x times\n");
        
        System.out.println("Number statistics:");
        int[] numbers = new int[] {2,67,9,3,43};
        numberStatistics(numbers);
        
        System.out.println("\nNumber triangle printer left aligned:");
        numberTrianglePrintingLeft();
        
        System.out.println("\nNumber triangle printer right aligned:");
        numberTrianglePrintingRight();
    }

    public static int findAinB(int a, int b) {
        int count = 0;
        int remainder;
        //b = Math.abs(b);
        
        while (b != 0) {
            remainder = b % 10;
            if (remainder == a) {
                count ++;
            }
            b = b / 10;
        }
        
        return count;
    }
    
    
    public static void numberStatistics(int[] numbers) {
        int total = numbers.length;
        int min = numbers[0];
        int max = min;
        int sum = 0;
            
        for (int n: numbers) {
            if(n > max) 
                max = n;
            else if (n < min)
                min = n;
            sum += n;
        } 
        
        System.out.println("Statistics:");
        System.out.println("Total numbers: "+total);
        System.out.println("min: "+min);
        System.out.println("max: "+max);
        System.out.println("avg: "+(sum / total));
        
    }
    
    public static void numberTrianglePrintingLeft() {
        
        for (int i = 0; i < 5; i ++) {
            for (int j = 4; j > -1; j --) {
                if(j <= i)
                    System.out.print(" "+j);
                else
                    System.out.print("");
            }
            System.out.print("\n");
        }
    }
    
    public static void numberTrianglePrintingRight() {
        
        for (int i = 1; i < 6; i ++) {
            for (int j = 5; j > 0; j --) {
                if(j <= i)
                    System.out.print(" "+j);
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
    
    public static void carTrafficLight(Number t) {
        int green = 3;
        int yellow = 1;
        int red = 2;
        
        
        
    }
    
}
