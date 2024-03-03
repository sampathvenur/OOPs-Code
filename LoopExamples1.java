/* Demonstrate for each, while and do while loops using java program. */


public class LoopExamples1 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};

        // Using a for loop.
        System.out.println("Using a for loop: ");
        for(int i=0; i<number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

        // Uisng a for each loop(enhanced for loop).
        System.out.println("Using a for each loop: ");
        for(int num:number) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Using a while loop.
        System.out.println("Using a while loop: ");
        int index = 0;
        while(index<number.length) {
            System.out.print(number[index++] + " ");
        }
        System.out.println();

        // Using a do-while loop.
        System.out.println("using a do-while loop: ");
        int i = 0;
        do {
            System.out.print(number[i] + " ");
            i++;
        } while(i<number.length);
        System.out.println();
    }
}

