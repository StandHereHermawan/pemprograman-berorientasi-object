package ariefhermawan.pbo.pertemuan.kedua.tugas.arief.data;

//  class Menu {
//      String[] arrayMenu;
//  }
// import java.util.Arrays;

import java.util.Scanner;

class Stack {
    private final int CAPACITY;
    private final String[] stringStack;
    private int lastDataIndex;

    public Stack(int capacity) {
        this.lastDataIndex = -1;
        this.stringStack = new String[capacity];
        this.CAPACITY = capacity;
    }

    private boolean checkStackIsFull(String data, int maxCapStack, int indexPeakStackValue) {
        if (indexPeakStackValue == (maxCapStack - 1)) {
            System.out.println("Tumpukan Penuh!");
            System.out.println(data + " Tidak dimasukkan kedalam Tumpukan.");
            return true;
        }
        return false;
    }

    public int getCAPACITY() {
        return this.CAPACITY;
    }

    public int getLastDataIndex() {
        return this.lastDataIndex;
    }

    public String[] getStringStack() {
        return this.stringStack;
    }

    public String pop() {
        if (!empty()) {
            String data = stringStack[lastDataIndex];
            stringStack[lastDataIndex] = null;
            lastDataIndex--;
            return data;
        } else {
            throw new RuntimeException(getClass().getName() + " is Empty.");
            /**
             * Menyatakan tumpukan sudah kosong.
             * */
        }
    }

    public void push(String data) {
        /**
         * Periksa apakah tumpukan sudah penuh atau belum.
         * <pre>
         *  if (puncakTumpukan == (MAXCAPACITY - 1)) {
         *          System.out.println("Tumpukan Penuh!");
         *          System.out.println(data + " Tidak dimasukkan kedalam Tumpukan.");
         *          return false;
         *  }
         * </pre>
         * */
        boolean valueIsFull = checkStackIsFull(data, this.getCAPACITY(), this.getLastDataIndex());

        if (valueIsFull) {
            throw new RuntimeException(getClass().getName() + " is Full.");
        } else {
            /**
             * <b>Masukkan data kedalam tumpukan.</b>
             * */
            lastDataIndex++;
            stringStack[lastDataIndex] = data;
            System.out.println("\t\t" + data + " ditambahkan kedalam stack.");
        }
    }

    public boolean empty() {
        return (lastDataIndex == -1);
    }
}

class Util {
    public Util() {
    }

    public String tab() {
        return "\t";
    }

    public String doubleTab() {
        return "\t\t";
    }

    //    public void logStack(String data, String info) {
    //        System.out.println(this.doubleTab() + "Data: " + data + " " + info);
    //    }
}

class Repository {
    private final Stack stack;

    public Repository(int capacity) {
        this.stack = new Stack(capacity);
    }

    public Stack getStack() {
        return this.stack;
    }

    public void viewDataFromStack() {
        for (int i = 0; i < this.stack.getCAPACITY(); i++) {
            int index = i + 1;
            System.out.println("\t\t" + index + ". " + this.stack.pop());
        }
    }

    public void seedDataDummy() {
        for (int i = 0; i < 8; i++) {
            int index = i + 1;
            var data = "Test-";
            this.getStack().push(data + index);
        }
    }
}

class Service {
    private final Scanner scanner;
    private final Repository repository;

    public Service(Scanner scanner, Repository repository) {
        this.scanner = scanner;
        this.repository = repository;
    }

    public void inputStackDataManual() {
        String data = this.scanner.next();
        repository.getStack().push(data);
    }

    public int inputMenuInt() {
        return this.scanner.nextInt();
    }
}

class View {
    private final Util util;
    private final Scanner scanner;
    private Repository repository;
    private Service service;

    public View(Util util, Scanner scanner) {
        this.util = util;
        this.scanner = scanner;
    }

    public void judulProgram() {
        // System.out.println(view.tab() + "-==| Program tugas 1 matkul pemprograman berorientasi objek |==-");
        System.out.println(this.util.tab() + "Program tugas 1 matkul pemprograman berorientasi objek");
    }

    public void menuProgram() {
        judulProgram();
        System.out.println(this.util.doubleTab() + "Menu Program");
    }

    public int tampilanMenuMenentukanIsiStack() {
        System.out.println(this.util.doubleTab() + "Masukkan ukuran stack: ");
        System.out.print(this.util.doubleTab());

        return this.service.inputMenuInt();
    }

    public int tampilanMenuOpsiAktivitasStack() {
        System.out.println(this.util.doubleTab() + "1. Seeding array dan Tampilkan Data Seeding-nya.");
        System.out.println(this.util.doubleTab() + "2. Masukkan Data.");
        System.out.println(this.util.doubleTab() + "3. Tampilkan Data Dan Hapus.");
        System.out.println(this.util.doubleTab() + "4. Tampilkan Data.");
        System.out.println(this.util.doubleTab() + "5. Keluar dari Program.");
        System.out.println(this.util.doubleTab() + "Masukkan pilihan menu sesuai angka diatas: ");
        System.out.print(this.util.doubleTab());

        return this.service.inputMenuInt();
    }

    public int tampilanMenuOpsiMenambahIsiStackAtauKembaliKeHalamanSebelumnya() {
        System.out.println(this.util.doubleTab() + "Pilih menu dibawah: ");
        System.out.println(this.util.doubleTab() + this.util.tab() + "1. Masukkan data ke Stack.");
        System.out.println(this.util.doubleTab() + this.util.tab() + "2. Kembali ke Halaman Utama");
        System.out.println(this.util.doubleTab() + this.util.tab() + "Masukkan nomor menu: ");
        System.out.print(this.util.doubleTab());

        try {
            return this.service.inputMenuInt();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void tampilanMenuMenambahIsiStackManual() {
        System.out.println(
                this.util.doubleTab() +
                        this.util.tab() +
                        "Masukkan data teks yang dimasukkan kedalam Stack: "
        );
        System.out.print(this.util.doubleTab());

        try {
            this.service.inputStackDataManual();
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void tampilanMenuMasukkanUkuranStack() {
        System.out.println(this.util.doubleTab() + "1. Masukkan Ukuran Stack.");
    }

    void programUtama() {
        // Inisiasi Service dan Repository,
        // biar object dari Class Service bisa jalan duluan.
        this.service = new Service(this.scanner, this.repository);
        this.repository = new Repository(1);

        this.judulProgram();
        this.tampilanMenuMasukkanUkuranStack();

        int ukuranRepository = this.tampilanMenuMenentukanIsiStack();
        this.repository = new Repository(ukuranRepository);
        this.service = new Service(this.scanner, this.repository);

        boolean mainProgramRunning = true;
        do {
            this.menuProgram();
            int inputMenu = this.tampilanMenuOpsiAktivitasStack();
            try {
                /**
                 * <pre>
                 *  if (inputMenu == 1) {
                 *      try {
                 *          this.masukkanDanTampilkanDataDummy();
                 *      } catch (RuntimeException e) {
                 *          throw new RuntimeException(e);
                 *      }
                 *  } else if (inputMenu == 2) {
                 *      try {
                 *          this.menambahDataSecaraManualKeStack();
                 *      } catch (RuntimeException e) {
                 *          throw new RuntimeException(e);
                 *      }
                 *  } else if (inputMenu == 3) {
                 *      try {
                 *          this.tampilkanDataStack();
                 *      } catch (RuntimeException e) {
                 *          throw new RuntimeException(e);
                 *      }
                 *  } else if (inputMenu == 4) {
                 *      this.tampilkanDataStackTanpaHapus();
                 *  } else if (inputMenu == 5) {
                 *      mainProgramRunning = false;
                 *  } else {
                 *      System.out.println(this.util.doubleTab() + "Pilihan yang anda maksud tidak ditemukan.");
                 *  }
                 * </pre>
                 */
                switch (inputMenu) {
                    case 1:
                        try {
                            this.masukkanDanTampilkanDataDummy();
                        } catch (RuntimeException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 2:
                        try {
                            this.menambahDataSecaraManualKeStack();
                        } catch (RuntimeException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 3:
                        try {
                            this.tampilkanDataStack();
                        } catch (RuntimeException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 4:
                        this.tampilkanDataStackTanpaHapus();
                        break;
                    case 5:
                        mainProgramRunning = false;
                        break;
                    default:
                        System.out.println(this.util.doubleTab() + "Pilihan yang anda maksud tidak ditemukan.");
                        break;
                }
            } catch (RuntimeException e) {
            }
        } while (mainProgramRunning);
    }

    void masukkanDanTampilkanDataDummy() {
        // Program Otomasi isi Stack dan tampilkan isinya.
        this.repository.seedDataDummy();
        this.repository.viewDataFromStack();
    }

    void tampilkanDataStack() {
        this.repository.viewDataFromStack();
    }

    void tampilkanDataStackTanpaHapus() {
        // Program Otomasi isi Stack dan tampilkan isinya.
        for (int i = 0; i < this.repository.getStack().getCAPACITY(); i++) {
            int index = i + 1;
            if (this.repository.getStack().getStringStack()[i] != null) {
                System.out.println(this.util.doubleTab() + index + ". " + this.repository.getStack().getStringStack()[i]);
            }
        }
    }

    // Program Menambah data ke Stack Manual
    void menambahDataSecaraManualKeStack() {
        boolean inputStackProgramRunning = true;
        do {
            int inputSubMenu = this.tampilanMenuOpsiMenambahIsiStackAtauKembaliKeHalamanSebelumnya();

            if (inputSubMenu == 1) {
                this.tampilanMenuMenambahIsiStackManual();
            } else if (inputSubMenu == 2) {
                inputStackProgramRunning = false;
            }
        } while (inputStackProgramRunning);
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Util util = new Util();
        View view = new View(util, scanner);

        view.programUtama();
    }
}
