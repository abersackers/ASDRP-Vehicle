public class accountant extends Employee {

  int hours = 40;
  double salary = 65000;
  String occupationName = "accountant";

  public accountant(int hrs, double slry, String occName) {
    hours = hrs;
    salary = slry;
    occupationName = occName;
  }

  public int getHours() {
    return hours;
  }
  public double salary() {
    return salary;
  }
  public String occupationName() {
    return occupationName;
  }

}
