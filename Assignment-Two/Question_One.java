
//finding the largest element in ana array

public class Main {
    public static void main(String[] args) {
                int[] numbers = {5, 8, 2, 15, 1}; // Array of numbers
                int max = numbers[0]; // Assume first element is the largest

                for (int num : numbers) {
                    if (num > max) {
                        max = num;
                    }
                }

                System.out.println("The largest element is: " + max);
            }
        }


