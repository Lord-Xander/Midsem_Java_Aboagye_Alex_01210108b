
//sum of 2D array

public class Main {
    public static void main(String[] args) {

                int[][] matrix = {
                        {0, 2, 3},
                        {4, 12, 6},
                        {2, 5, 11}
                };

                int sum = 0;

                // Calculate the sum of all elements
                for(int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        sum += matrix[i][j];
                    }
                }

                System.out.println("The sum of all elements is: " + sum);
            }
}