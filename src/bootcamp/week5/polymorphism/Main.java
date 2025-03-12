package bootcamp.week5.polymorphism;

public class Main {

    public static void main(String[] args) {


        Car[] arr =   new Car[1000];

        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                arr[i] = new Cabriolet(i%4 ==0);
            }else {
                arr[i] = new SUV(1 + (double)i/100);
            }

            
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("itter: " + i);
            arr[i].description();
            openDoor(arr[i]);
            
        }
    }

    private static void openDoor(Car car){
        System.out.println("door opened");
    }
}
