//java program to reverse element of an array

public class Main {
    public static void main(String[] args)
    {
                int[] numbers = {1, 2, 3, 4, 5}; // Original array
                int length = numbers.length;

                // Reverse the array
                for (int i = 0; i < length / 2; i++) {
                    int temp = numbers[i];
                    numbers[i] = numbers[length - 1 - i];
                    numbers[length - 1 - i] = temp;
                }

                // Print the reversed array
                System.out.print("Reversed array: ");
                for (int num : numbers) {
                    System.out.print(num + " ");
                }
            }
        }


