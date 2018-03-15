package TwentySixBase;

public class Main {

  /**
   * 期望输出：
   * 1 -> A
   * 2 -> B
   * .
   * .
   * .
   * 26 -> Z
   * 27 -> AA
   * 28 -> AB
   * .
   * .
   * .
   * @param a
   * @return
   */
  public static String getStringIndex(int a) {
    return "";
  }

  public static void main(String[] args) {
    for (int i = 1; i < 199; i++) {
      System.out.println(i + " " + getStringIndex(i));
    }
  }
}
