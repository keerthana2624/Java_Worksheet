class MyClass {
    private int privateField;
    public MyClass(int value) {
        this.privateField = value;
    }
    public int getPrivateField() {
        return privateField;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(42);
        System.out.println("Value of privateField: " + obj.getPrivateField());
    }
}
