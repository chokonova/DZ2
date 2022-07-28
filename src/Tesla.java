public class Tesla extends Car{
    private String type;

    public String getType() {
        return type;
    }

    public Tesla(String name, int volume, String type) {
        super(name, volume);

        this.type=type;
    }


    @Override
    public void print() {
        System.out.println(getInfo()+" \ntype:"+ type);
    }


    }

