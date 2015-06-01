public class Chap12Part6{

  public static void main(String[] args) {
    Calc calculator = new Calc(2);
    System.out.println(calculator.show());
    calculator.add(10);
    System.out.println(calculator.show());
    calculator.subtract(2.250);
    System.out.println(calculator.show());
    calculator.mult(10);
    System.out.println(calculator.show());
    calculator.div(2);
    System.out.println(calculator.show());
  }
}
