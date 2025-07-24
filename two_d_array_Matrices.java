import java.util.*;

public class two_d_array_Matrices {
    public static boolean Search(int array[] [], int key) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == key) { 
                    System.out.println("Element found at - " + i + " " + j);
                    return true;     
                }
            }

        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
        int array[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements -");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println(" ");

        }
        Search(array, 9);
        sc.close();
    }

}