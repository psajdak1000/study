package bootcamp.week5.finalKeyWord;

public class finalKeyword {
    public static void main(String[] args) {
        Cabriolet cabriolet = new Cabriolet(true,"red");
        cabriolet.getColor();
        cabriolet.isRoofopened();
        Cabriolet cabriolet1 = cabriolet.closeTheRoof();
        System.out.println("cabrio " +cabriolet);
        System.out.println("cabrio1 " +cabriolet1);
        System.out.println(cabriolet==cabriolet1);
    }
}
