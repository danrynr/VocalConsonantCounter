import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        String word = "";
        int vokal = 0;
        int konsonan = 0;
        System.out.print("Masukan kalimat: ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vokal: " + vokal);
        System.out.println("Jumlah huruf konsonan: " + konsonan);
    }

    private static int num_vokal(String word) {
        int i;
        int jumlah_vokal = 0;

        for (i = 0; i < word.length(); i++) {
            char ch =  word.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }

    private static int num_konsonan(String word) {
        int i;
        int jumlah_konsonan = 0;

        for (i = 0; i < word.length(); i++) {
            char ch =  word.charAt(i);
            if (((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) && ((ch != 'a' && ch != 'i' && ch != 'u' && ch != 'e' && ch != 'o') && (ch != 'A' && ch != 'I' && ch != 'U' && ch != 'E' && ch != 'O'))) {
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }
}
