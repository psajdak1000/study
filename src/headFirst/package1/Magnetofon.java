package headFirst.package1;

public class Magnetofon {
    private boolean mozeNagrywac = false;

    private boolean nagrywanie = false;
    void mozeNagrywac() {
        System.out.println("mozeNagrywac");
        this.mozeNagrywac = true;
    }
    void isMozeNagrywac() {
        if (mozeNagrywac == true) {
            System.out.println("nagrywam");
        }else{
            System.out.println("nagrywanie nie moze sie odbyc");
        }

    }





}
