class Main {
  public static void main(String[] args) {
    System.out.println(isLeapYear(2022)); //false
    System.out.println(isLeapYear(2024)); //true
    System.out.println(isLeapYear(1900)); //false
    System.out.print(isLeapYear(2000)); //true
  }
  
  public static boolean isLeapYear(int a) {
    if (a%4 != 0) {
      return false;
    }
    else if (a%100 != 0) {
      return true;
    }
    else if (a%400 != 0) {
      return false;
    }
    else {
      return true;
    }
  }
}
