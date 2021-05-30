public class Main {

  public static void main(String[] args) {
    int[] angka = {14, 8, 2000, 20, 12, 1967};
    boolean ditemukan = false;
    int key = 12;

    for (int i = 0; i < angka.length; i++) {
      if (key == angka[i]) {
        System.out.println("Data ditemukan pada index ke-" +i);
        ditemukan = true;
        break;
      }
    }

    if (ditemukan == false) {
      System.out.println("Data tidak ditemukan");
    }
  }
}