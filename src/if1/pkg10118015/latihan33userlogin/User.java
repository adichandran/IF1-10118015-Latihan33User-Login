/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan33userlogin;

/**
 *
 * @author ACER
 */
public class User {
    private String username = "adichandra";
    private String password = "123456";
    private boolean statusAkun = false;

    private boolean cekAkun(String userName, String Password){
        if ((userName.equals(username)) && (password.equals(Password)))
            statusAkun = true;
        else
            statusAkun = false;
        return statusAkun;   
    }  
    
    private void hasilLogin(boolean statusAkun, String username){
        if (statusAkun) {
            System.out.println("******HALLO " + username.toUpperCase() + "******");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else
            System.out.println("Ooops, Username atau Password anda salah");
    }
    
    public void pencetakanLogin(String userName, String Password){
        cekAkun(userName, Password);
        hasilLogin(statusAkun, userName);
    }
}
