/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skillup.garcha.task.controlflow;

/**
 *
 * @author ggarchagudashvili
 */
public class ControlFlow {
    
    public static void main(String[] args) {
        System.out.println("Hello! This is control flow tasks home page");
        System.out.println("");
        
        // Find a's in b
        int a = 3;
        int b = -3130013;
        int count = findAinB(a, b);
        System.out.println("A in B: "+ a + " in " + b + " occurs " + count + "x times");
        
        
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
    
    
    
}
