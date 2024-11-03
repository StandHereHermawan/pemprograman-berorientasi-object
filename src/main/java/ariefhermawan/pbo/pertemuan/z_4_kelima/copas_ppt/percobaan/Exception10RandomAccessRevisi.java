package ariefhermawan.pbo.pertemuan.z_4_kelima.copas_ppt.percobaan;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Exception10RandomAccessRevisi {
    public static void main(String[] args) {
        String[] bookList = {
                "Satu",
                "Dua",
                "Tiga"
        };

        int[] yearList = {
                1920,
                1930,
                1940
        };

        try {

            RandomAccessFile books;
            books = new RandomAccessFile("books.txt", "rw");

            for (int i = 0; i < 3; i++) {
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }

            books.seek(0);
            System.out.println(books.readUTF() + " " + books.readInt());
            System.out.println(books.readUTF() + " " + books.readInt());
            books.close();

        } catch (IOException exception) {
            System.out.println("Indeks Melebihi Batas.");
        }

        System.out.println("Test");
    }
}
