package bootcamp.week3;

public class Arrays3 {
    public static void main(String[] args) {
        arraysExample();
    }
    private static void arraysExample(){
        double[] array = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};

        double total = 0.0;
        for(double element:array){
            total += element;
        }
        System.out.println("Total is: " + total);

        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            
        }
        System.out.println("Max is: " + max);
    }
}
