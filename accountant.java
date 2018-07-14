public class accountant extends employee {

  int hours = 40;
  double salary = 65000;
  string occupationName = "accountant";

  public accountant(int hrs, double slry, string occName) {
    hours = hrs;
    salary = slry;
    occupationName = occName;
  }

  public static void main(String[] args) {
    accountant myAccountant = new accountant();
  }

  public int getHours() {
    return hours;
  }
  public double salary() {
    return salary;
  }
  public string occupationName() {
    return occupationName;
  }

}
