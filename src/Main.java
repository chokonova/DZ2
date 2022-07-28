public class Main {
    public static void main(String[] args) {

        Printable printable[] = {
                createObject("oneCar"), createObject("second"), createObject("third")
        };

        for (Printable print : printable) {

            print.print();
        }

    }

    private static Printable createObject(String className) {
        switch (className) {
            case "oneCar":
                Audi audi = new Audi("audi", 2,5);
                return audi;
            case "second":
                Tesla tesla = new Tesla("tesla",5, "class Pickup");
                return tesla;
            case  "third":
                Lamborghini lamborghini = new Lamborghini("lamborghini",4, 250);
                return lamborghini;

        }
        return null;
    }
}