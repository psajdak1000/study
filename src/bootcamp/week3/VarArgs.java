package bootcamp.week3;

import java.util.Arrays;

public class VarArgs {
    public static void main(String... args) {
        VarArgs varArgs = new VarArgs();
        System.out.println("Example 1");
        varArgs.varArgs1(0,1,15,16,19);
        System.out.println();

        System.out.println("Example 2");
        varArgs.varArgs2(1,15,16,19);
        System.out.println();

        System.out.println("Example3");
        varArgs.varArgs3(4,2,-1,15);
    }

    private void varArgs3(int... args) {
        System.out.println();
        String conc = "";
        for (int arg : args) {
            conc = conc + arg +  ",";
        }
        System.out.println("All: " + conc);

        int[] arr = args;
        System.out.println("Arr: " + Arrays.toString(arr));
    }

    private void varArgs2(int ... args) {
        System.out.println("arg[0]: " + args[0]);
        System.out.println("arg[1]: " + args[1]);
        System.out.println("arg[2]: " + args[2]);
        System.out.println("arg[3]: " + args[3]);
        System.out.println("args.length: " + args.length);
    }

    private void varArgs1(int arg0, int... args) {

        System.out.println("arg0: " + arg0);
        System.out.println("args[0]: " + args[0]);
        System.out.println("args[1]: " + args[1]);
        System.out.println("args[2]: " + args[2]);
        System.out.println("args[3]: " + args[3]);
        System.out.println("args.length: " + args.length);


    }
}
