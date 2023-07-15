import java.util.Scanner;

public class Palindrom {

  public static void main(String[] args) {

    // Scanner sınıfını kullanarak kullanıcıdan giriş al.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bir kelime giriniz: ");
    String word = scanner.nextLine();

    // Kelimenin tersini bul.
    String reversedWord = new StringBuilder(word).reverse().toString();

    // Kelimenin tersini kontrol et.
    if (word.equals(reversedWord)) {
      System.out.println("Kelime palindromdur.");
    } else {
      System.out.println("Kelime palindrom değildir.");
    }
  }
}
