/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ariefhermawan.pbo.pertemuan.z_1_kedua.tugas.rizky.v1;

/**
 *
 * @author user
 */

import java.util.Scanner;

class SimpleTextEditor {
    private final String[] undoStack;
    private final String[] redoStack;
    private int undoTop, redoTop;
    private String currentText;

    public SimpleTextEditor(int capacity) {
        undoStack = new String[capacity];
        redoStack = new String[capacity];
        undoTop = -1;
        redoTop = -1;
        currentText = "";
    }

    public void addText(String text) {
        if (undoTop < undoStack.length - 1) {
            undoStack[++undoTop] = currentText;
            currentText += text;
            redoTop = -1; // Kosongkan redo stack
            System.out.println("Teks saat ini: " + currentText);
        } else {
            System.out.println("Undo stack penuh.");
        }
    }

    public void undo() {
        if (undoTop >= 0) {
            redoStack[++redoTop] = currentText;
            currentText = undoStack[undoTop--];
            System.out.println("Undo: Teks saat ini: " + currentText);
        } else {
            System.out.println("Tidak ada yang bisa di-undo.");
        }
    }

    public void redo() {
        if (redoTop >= 0) {
            undoStack[++undoTop] = currentText;
            currentText = redoStack[redoTop--];
            System.out.println("Redo: Teks saat ini: " + currentText);
        } else {
            System.out.println("Tidak ada yang bisa di-redo.");
        }
    }
}

public class RizkyA_Tugas1PBO {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in) ;
        
        SimpleTextEditor editor = new SimpleTextEditor(10);

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan perintah (add <text>, undo, redo, exit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (input.startsWith("add ")){ 
                editor.addText(input.substring(4));
            }
            else if (input.equalsIgnoreCase("undo")) {
                editor.undo();
            }
            else if (input.equalsIgnoreCase("redo")) { 
                editor.redo();
            }
            else {
                System.out.println("Perintah tidak dikenali.");
            }
            
  
        }

        //scanner.close();
    }
}

