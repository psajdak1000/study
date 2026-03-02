package bootcamp.week3;

public class Arrays2 {
    public static void main(String[] args) {

        Arrays2 arrays2 = new Arrays2();
        arrays2.arrayExample();
    }
    private void arrayExample() {
        String[] array = new String[10];

        int i = 0;
        while(i<5){
            array[i] = "Hello new index " + i;
            i++;
        }

        String completeString = "";
        for (int k = 0; k < array.length; k++) {
            completeString += array[k] + "; ";
            System.out.println("index: " + k + " value: " + array[k]);
        }
            System.out.println("complete string: " + completeString);
    }
}
