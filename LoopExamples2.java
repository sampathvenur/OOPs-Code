/* One more example */


public class LoopExamples2 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4};
        int sum = 0;

        // Using a for loop to calculate the sum of numbers.
        System.out.println("Using a for loop: ");
        for(int i=0; i<number.length; i++) {
            System.out.print(number[i] + " ");
            sum += number[i];
        }
        System.out.println();
        System.out.println("Sum using a for loop: " + sum);

        // using a for-each loop to find the maximum number.
        int max = Integer.MIN_VALUE;
        System.out.println("Using a for-each loop: ");
        for(int num:number) {
            System.out.print(num + " ");
            if(num>max) {
                max = num;
            }
        }
        System.out.println();
        System.out.println("Maximum using a for-each loop: " + max);

        // Using a while loop to calculate the product of numbers.
        int product = 1;
        System.out.println("Using a while loop: ");
        int index = 0;
        while(index<number.length) {
            System.out.print(number[index] + " ");
            product *= number[index];
            index++;
        }        
        System.out.println();
        System.out.println("Product using a while loop: " + product);

        // Using a do while loop to find the minimum number.
        int min = Integer.MAX_VALUE;
        System.out.println("Using a do while loop: ");
        int i = 0;
        do {
            System.out.print(number[i] + " ");
            if(number[i] < min) {
                min = number[i];
            }
            i++;
        } while(i<number.length);
        System.out.println();
        System.out.println("Minimum using a do while loop: " + min);
    }
}