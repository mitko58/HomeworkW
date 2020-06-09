public class Machine {
    private int power;
    private int height;
    private String color;

    public Machine(int power, int height, String color){
        this.power = power;
        this.height = height;
        this.color = color;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower(){
        return power;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

