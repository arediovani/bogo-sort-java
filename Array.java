package randomarray;

import java.util.Scanner;
import java.util.Random;


public class Array {

    Random rd = new Random();
    Scanner sc = new Scanner(System.in);
    int[] array;
    boolean Sorted = false;

    public void CreateArray() { //create the array and populate it with values
        this.array = new int[sc.nextInt()];
        System.out.println("value of array is:" + array.length);
        for (int x=0;x<array.length;x++) {
            System.out.print(x +"index:");
            this.array[x] = rd.nextInt(89);
        }
    }

    public void RandomIndexSwap() {//firstly create create 2 different indexes and then swap values of them
       for(int x = 0;x<array.length;x++){
        int random1 = rd.nextInt(array.length);
        int random2 = NextRandom(random1);
        Swap(random1, random2);
       }
    }

    public int NextRandom(int random1) {
        int temp = rd.nextInt(array.length);
        while (temp == random1) {
            temp = rd.nextInt(array.length);
        }
        return temp;
    }//finds another random index different from the first one

    public void Swap(int first, int second) {
        int temp = this.array[first];
        this.array[first] = this.array[second];
        this.array[second] = temp;
    }

    public void Print() {
        for (int x =0; x<array.length;x++) {
            System.out.print(array[x] + " ");
        }
        System.out.println();
    }

    public boolean CheckSort() {
        for (int i = 0; i < this.array.length; i++);

        for (int i = 0; i < this.array.length - 1; i++) {
            if (this.array[i] > this.array[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
        }

        return true;
    }
}
