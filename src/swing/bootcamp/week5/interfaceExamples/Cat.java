package swing.bootcamp.week5.interfaceExamples;

public class Cat implements CatStrokable, Voiceable{

    @Override
    public void doSomethingAssStrokeableCat() {
        System.out.println("I like being stroked");
    }

    @Override
    public void beStroked() {
        System.out.println("I am stroked");
    }

    @Override
    public String gimmeVoice() {
        return "I am giveing me a meow";
    }

    @Override
    public void sing(String songName) {
        System.out.println("Iam singing " + songName + "lalala");
    }
}
