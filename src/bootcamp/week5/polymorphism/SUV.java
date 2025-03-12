package bootcamp.week5.polymorphism;

public class SUV implements Car {

    private double height;

    public SUV(final double height) {

        this.height = height;
    }

    public double getHeight() { return height; }
    public void setHeight(final double height) { this.height = height; }
    @Override
    public void description(){
        System.out.println("SUV description start");
        System.out.println("SUV height: " + height);
        System.out.println("SUV description end");
    }
    @Override
    public String toString(){
        return "SUV{" +
                "height=" + height +
                '}';
    }

}
