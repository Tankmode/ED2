/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2;

/**
 *
 * @author --
 */
public class Maxmin1 {
    public static int[] maxmin1(int a[]){
        int big = a[0];
        int small = a[0];
        int i = a.length;
        int count = 0;
        for (int b = 1; b < i; b++){
            count++;
            if (a[b] > big){
                big = a[b];
            }
            count++;
            if (a[b] > small){
                small = a[b];
            }
        }
        int maxmin[] = new int[2];
        maxmin[0] = big;
        maxmin[1] = small;
        System.out.println(count);
        return maxmin;
    }
    public static void main(String args[]) {
        int max = 20;
        int array[] = new int [max];
        int b = 0;
        
        for (b = 0; b < array.length; b++){
            array[b] = (array.length - 1) - b;//pior caso
            //array[b] = b //melhor caso//
            //array[b] = (int) (100*Math.random()+1)//caso medio//
            
        }
        maxmin1(array);
    }
    
}
