package bootcamp.week6.enums;

import java.util.ArrayList;
import java.util.List;

public enum Volkswagen implements MyExampleInterface {
    PASSAT("Passat", 1986),
    GOLF("Gold", 1986),
    ARTEON("Arteon", 1986),
    TIGUAN("Tiguan", 1986),
    TOUAREG("Touareg", 1986),;

    private String name;
    private int  productionYear;

    public static List<Volkswagen> ofName(String name) {
        List<Volkswagen> list = new ArrayList<>();

        for (Volkswagen value : values()) {
            if (value.getName().equals(name)) {
                list.add(value);
            }
        }

        return list;
    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    Volkswagen(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    @Override
    public String doSomething() {
        return productionYear + "doSomething";
    }
}




