public class Lamborghini extends Car{
    private  int speed;

    public Lamborghini(String name, int volume, int speed) {
        super(name, volume);
     this.speed=speed;
    }


    @Override
    public void print() {
        System.out.println(getInfo()+" \nspeed:"+ speed);

    }

    public int getSpeed() {
        return speed;
    }
}

