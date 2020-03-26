import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10,"black");
        System.out.println(circle);
        Cilinder cilinder = new Cilinder();
        cilinder.setHeight(10);
        cilinder.setColor("white");
        cilinder.setRadius(1.0);
        System.out.println(cilinder);

    }


}
