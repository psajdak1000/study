package bootcamp.week5.finalKeyWord;

public final class Cabriolet {
    private final boolean roofopened;
    private final String color;


    public Cabriolet(boolean roofopened, String color) {
        this.roofopened = roofopened;
        this.color = color;
    }

    public boolean isRoofopened() {
        return roofopened;
    }
    public String getColor() {
        return color;
    }

    public Cabriolet closeTheRoof() {
        return new Cabriolet(false, this.color);
        }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "roofopened=" + roofopened +
                ", color='" + color + '\'' +
                '}';
    }
}
