/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan33userlogin;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program validasi user login
 */
public class IF110118015Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User login = new User();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Username\t: ");
        String user = input.next();
        System.out.print("Masukan Password\t: ");
        String pass = input.next();
        System.out.println();
        
        login.pencetakanLogin(user, pass);
    }
    
}
