public class manager extends Employee {



  int hours = 40;

  double salary = 100000;

  String occupationName = "manager";



  public manager(int hrs, double slry, String occName) {

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
