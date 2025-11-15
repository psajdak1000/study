package warsztat1.podsumowanie5;

public class Sock <T extends Runnable<String> >{
    private T item;


    public boolean put(T element){
        if(this.item == null || !this.item.equals(element)){
            this.item = element;
            element.run("swim");
            return true;
        }
        element.run("swim");
        return false;
    }
    public T getItem(){
        return item;
    }

    @Override
    public String toString() {
        return "Sock{" +
                "item=" + item +
                '}';
    }
}
