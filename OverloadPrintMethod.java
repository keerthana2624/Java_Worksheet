public class OverloadPrintMethod {
    public void print(int number) {
        System.out.println("Printing integer: " + number);
    }

    public void print(String text) {
        System.out.println("Printing string: " + text);
    }

    public static void main(String[] args) {
        OverloadPrintMethod printer = new OverloadPrintMethod();

        printer.print(10);
        printer.print("Hello, Java!");
    }
}
