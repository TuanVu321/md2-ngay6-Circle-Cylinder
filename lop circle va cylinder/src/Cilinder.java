public class Cilinder extends Circle {
    private double height;
    public Cilinder() {
    }
    public Cilinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cilinder{"
                +"radius= "+getRadius()
                +"height=" + height + "volume "+getVolume()
                +'}';
    }


}
