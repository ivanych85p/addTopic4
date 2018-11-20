package Topic_4;

public class Appliances {
    //Task 24, page 56..................................................................................................

    String brand;
    String color;
    boolean isOnSocket;

    public Appliances(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void on() {
        isOnSocket = true;
    }

    public void off() {
        isOnSocket = false;
    }

    public boolean getState() {
        return isOnSocket;
    }
}

class SmallHomeAppliance extends Appliances {

    boolean tableTop;

    public SmallHomeAppliance(String brand, String color, boolean tableTop) {
        super(brand, color);
        this.tableTop = tableTop;
    }

    public boolean isTableTop() {
        return tableTop;
    }
}

class LargeHomeAppliance extends Appliances {

    boolean builtIn;

    public LargeHomeAppliance(String brand, String color, boolean builtIn) {
        super(brand, color);
        this.builtIn = builtIn;
    }

    public boolean getBuiltIn() {
        return builtIn;
    }
}

class Refrigerator extends LargeHomeAppliance {
    boolean noFrost;

    public Refrigerator(String brand, String color, boolean builtIn, boolean noFrost) {
        super(brand, color, builtIn);
        this.noFrost = noFrost;
    }

    public boolean isNoFrost() {
        return noFrost;
    }
}

class Blender extends SmallHomeAppliance {
    int numberOfSpeeds;

    public Blender(String brand, String color, boolean tableTop, int numberOfSpeeds) {
        super(brand, color, tableTop);
        this.numberOfSpeeds = numberOfSpeeds;
    }
}


class TestAppliance {
    public static void main(String[] args) {
        Blender blender = new Blender("Bosch", "White", true, 2);
        Refrigerator refrigerator = new Refrigerator("LG", "gray", true, false);
        blender.off();
        refrigerator.on();
        System.out.println("The blender is plugged in: " + blender.getState());
        System.out.println("The refrigerator is plugged in: " + refrigerator.getState());

    }
}






