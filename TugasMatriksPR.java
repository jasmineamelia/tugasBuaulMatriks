/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author zalfa jasmine amelia
 */
public class TugasMatriksPR {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan jumlah baris ");
        int baris = scan.nextInt();
        System.out.println("Masukan jumlah kolom ");
        int kolom = scan.nextInt();
        int matriks[][] = new int[baris][kolom];

        for (int index = 0; index < matriks.length; index++) {
            for (int i = 0; i < matriks[index].length; i++) {
                System.out.println("masukan baris"+index+ " kolom " +i+ " : ");
                matriks[index][i] = scan.nextInt ();
                
            }
            System.out.println();
        }
        System.out.println("matriks");
        for (int x = 0; x< matriks.length; x++) {
            for (int j = 0; j < matriks[x].length; j++) {
                System.out.print(matriks[x][j] + " ");
                
            }
            System.out.println();
        }
    }
}















































