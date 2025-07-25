public class Staircase_search_sort {
    public static boolean Search( int matrix[][],int key){
        int row = 0; int col = matrix[0].length-1;
        while( row < matrix.length && col>=0 ){
            if (matrix[row][col] == key){
                System.out.println("Key Found At - " + "("+ row + ","+ col + ")");
                return true ;
            }
            else if(key > matrix[row][col]){
                row ++ ;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            // else{
            //     System.out.println("Key Not Found - ");
            //     break;
            // }
        }
        System.out.println("Key Not Found - ");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        Search(matrix, 48);
    }
}
