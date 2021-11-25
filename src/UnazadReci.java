import java.util.Scanner;

public class UnazadReci {

    public static void main(String[] args) {
        String original, reverse = "";
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ucitaj reci koje zelis da se ucitaju unazad");
        original = scanner.nextLine();
        int lenght = original.length();
        for (int i = lenght - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);


        }
        System.out.println("Unazad tekst zvuci : " + reverse);

    }
}

///////       koriscena buffer metoda
//        String word = " Lucky you ";
//        String reverse = new StringBuffer(word).reverse().toString();
//        System.out.printf("Original String %s , reverse String %s %n ", word, reverse);
//    }
//}

