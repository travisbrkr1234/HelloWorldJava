public class Formulas {
  public static void main(String[] args)
  {
    double a,x,y,z,zz,zzz,zzzz;
    x = -13.0;
    y = 2.0;
    z = x / y - 3;
    zz = x / (y - 3);
    zzz = 1 / (x + y);
    a = Math.abs(x + y);
    zzzz = Math.sqrt(Math.pow(x,6) + Math.pow(y,5));
    System.out.println(z);
    System.out.println(zz);
    System.out.println(zzz);
    System.out.println(zzzz);
    System.out.println(a);
  }
}
