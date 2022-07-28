public abstract class Car implements Printable {

    private String name;
    private int volume;

    public Car(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getInfo(){ return " name: " + name + "\n volume:" + volume;


    }
}
