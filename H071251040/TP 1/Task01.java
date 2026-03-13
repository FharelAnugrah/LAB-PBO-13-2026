import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Judul Film :");
        System.out.print("> ");
        String kalimat = input.nextLine();

        String hasil = format(kalimat);

        System.out.println(hasil);

        input.close();
    }

    
    public static String format(String teks) {
        if (teks == null || teks.isEmpty()) {
            return teks;
        }

        String[] kumpulanKata = teks.split("\\s+");
        StringBuilder hasilFinal = new StringBuilder();

        for (String kata : kumpulanKata) {
            if (kata.length() > 0) {
                String kataBaru = kata.substring(0, 1).toUpperCase() + kata.substring(1).toLowerCase();
                hasilFinal.append(kataBaru).append(" ");
            }
        }

        return hasilFinal.toString().trim();
    }
}