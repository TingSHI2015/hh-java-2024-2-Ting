public class Day3Exercise2 {
    public static void main(String[] args) {
        //Step 1: Create an array with numbers from 1 to 10 and print it to the console.
        //Step 2: Calculate the sum of all numbers in the array and print the result to the console.
        //Step 3: Find the largest number in the array and print it to the console.
        //Step 4: Create a second array with numbers from 11 to 20.
        // Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.
//       Please post the link to your GitHub repository here, where you have solved this task together.

        int[] numbers = new int[10];
        int[] numbers2 = new int[10];   // Step 4: Create a second array with numbers from 11 to 20.
        int[] numbersSum = new int[10];

        int sum = 0;

        for (int i=0;i<numbers.length;i++) {
            numbers[i] = i+1;
            System.out.println(numbers[i]);
            sum = sum + numbers[i];                   // ??? sum += numbers[i];  can auch =+  ??
            }

        System.out.println(sum);

        // my error: int[] testMaxNumber = new int[1, 2, 3, 80, 5, 60];     //must length 10!!!
        int[] testMaxNumber = {1, 2, 3, 80, 5, 60, 30, 100, 2, 0};        //directly give the value to int[],?? must langth 10!
//        System.out.println(findLargestNumber(testMaxNumber));


        for (int j=0; j<numbers2.length;j++){
            numbers[j] = j+11;
            System.out.println(numbers[j]);
        }

        for (int k=0; k<numbersSum.length;k++){
            numbersSum[k] = numbers[k]+numbers2[k];
            System.out.println(numbersSum[k]);
            }
        //System.out.println(numbersSum);
        }





//    public static int findLargestNumber(int[] numbers) {
//        int[] numbers = new int[10];      // length is not flexible!!!
//        int max = numbers[0];      //int max = numbers[0];
//        for(int i=1;i<numbers.length;i++) {
//            if (numbers[i] > numbers[i-1] ) {            //how change to for-loop!!!!!
//                max = numbers[i];
//            }
//        }
//        System.out.println(max);
//        return max;
//    }
}
