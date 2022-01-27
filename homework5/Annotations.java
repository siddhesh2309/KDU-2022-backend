package homework5;

class Phone {
    public void showTime() {
        System.out.println("This is 8AM");
    }
    public void turnOnPhone() {
        System.out.println("Turning on Phone");
    }
}

class NewPhone extends Phone {
    @Override
    public void showTime() {
        System.out.println("This is 8PM");
    }
    @Deprecated
    public void deprecatedFunction() {
        System.out.println("Deprecated Function is being called");
    }

}

public class Annotations {
    public static void main(String[] args) {
        NewPhone ph = new NewPhone();
        ph.showTime();
        ph.deprecatedFunction();
    }
}
