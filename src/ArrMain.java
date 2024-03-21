public class ArrMain {
    public static void main(String[] args) {

        int[] numbers = { 3,6,9,2,1,8};

        // normal for loop
        double sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }
        System.out.println("sum is " + sum);
        System.out.println("average is " + sum / numbers.length);

        // enhanced for loop
        String[] colours = { "rood", "blauw", "groen"};
        for (String col : colours) {
            System.out.println(col);
        }
    }
}
