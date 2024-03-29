package _01_02b;

public class Employee {

  public static void main(String[] args) {
    int age = 29;
    System.out.println(age);
    boolean isAManager = true;
    System.out.println(isAManager);
    double yearsOfService = 2.5;
    System.out.println(yearsOfService);
    int baseSalary = 3000;
    int overtimePayment = 40;
    int totalPayment = baseSalary + overtimePayment;
    System.out.println(totalPayment);
    double firstBonus = 10., secondBonus = 22., thirdBonus = 35.;
    System.out.println(firstBonus + secondBonus + thirdBonus);
  }
}
