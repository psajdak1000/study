package bootcamp.week3;

public class SortingExample3 {
    public static void main(String[] args) {
       int[] array ={3,2,5,1,5,5,5};
       printIndexOfArraysElem(array, 5);
       printIndexesOfArraysElem(array, 5);
       printMultResult(array);

       Cat[] arr = { new Cat()};
       printMultCatAge();
    }

    private static void printIndexOfArraysElem(int[] array, int searchEl) {
        for (int i = 0; i < array.length; i++) {
            if(searchEl == array[i]){
                System.out.println("index of searching element: "
                        + i + " \nvalue of searching el : "  + searchEl );
                System.out.println("-------------------------------------");
                return;
            }

        }
    }
    private static void printIndexesOfArraysElem(int[] array, int searchEl) {
        for (int i = 0; i < array.length; i++) {
            if(searchEl == array[i]){
                System.out.println("index of searching elements: "
                        + i + " \nvalue of searching els : "  + searchEl );
                System.out.println("-------------------------------------");
            }

        }
    }

    private static void printMultResult(int ... args){
        int result = 1;
        for (int arg : args) {
            result *= arg;
        }
        System.out.println(" result = " + result);
    }
    private static void printMultCatAge(Cat ... args){
        int result = 1;
        for (Cat arg : args) {
            result *= arg.getAge();
        }
        System.out.println(" result = " + result);
    }


    private static class Cat {

        private int age = 11;

        public int getAge() {
            return age;
        }
    }
}
