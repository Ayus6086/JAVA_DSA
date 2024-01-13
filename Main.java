/*JVM (Java virtual machine)
It provides a runtime environment in which Java
bytecode can be executed. It can also run those
programs which are written in other languages and
compiled to Java bytecode
JRE (Java Runtime Environment)
It is a set of software tools and libraries + other
files which are used for developing and it provides
the runtime environment
JDK (Java Development Kit)
It helps us to deveop Java applications,
JRE + development tools.
JVM JRE JDK are platform dependent because the
configuration of each OS is diferent however Java is
platform independent.
*/
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int a = 5;
    int b = 20;
    System.out.println(a+b);
    float num3 = 10.5f;
    System.out.println(num3);
    double num4 = 10.5;
    System.out.println(num4);
  }
}