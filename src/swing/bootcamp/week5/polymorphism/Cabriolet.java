package swing.bootcamp.week5.polymorphism;

public class Cabriolet implements Car {
    private boolean roofOpened;

    public Cabriolet(final String color, final boolean roofOpened) {
        this.roofOpened = roofOpened;
    }

    public boolean isRoofOpened() { return roofOpened; }

    public void setRoofOpened(final boolean roofOpened) {
        this.roofOpened = roofOpened;
    }
    @Override
    public void description(){
        System.out.println("cabriolet description start");
        System.out.println("roof is opened: " + isRoofOpened());
        System.out.println("cabriolet description end");
    }

    public String toString(){
        return "Cabriolet{" +
                "roofOpened=" + roofOpened +
                '}';
    }
}
