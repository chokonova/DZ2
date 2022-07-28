public class Audi extends Car {

    private int capacity;

    public Audi(String name, int volume, int capacity) {
        super(name, volume);


  this.capacity=capacity;  }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void print(){
        System.out.println(getInfo()+" \ncapacity:"+ capacity);
    }
}



