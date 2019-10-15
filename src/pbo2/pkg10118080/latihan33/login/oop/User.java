/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan33.login.oop;

/**
 *
 * @author Trizky
 */
public class User {
    private  String username;
    private  String password;
    private  boolean statusAkun;

    public void setStatusAkun(boolean statusAkun) {
        this.statusAkun = statusAkun;
    }

    public boolean isStatusAkun() {
        return statusAkun;
    }
    
    
    private boolean cekAkun(String parUserName, String parPassword){
        PBO210118080Latihan33LoginOop a = new PBO210118080Latihan33LoginOop();
        if ((parUserName.equals(a.getUsName())) && (parPassword.equals(a.getPassWord()))) {
           this.setStatusAkun(true);
        } else {
            this.setStatusAkun(false);
        }
        return this.isStatusAkun();
    }
    
    private void hasilLogin(boolean status, String parUserName){
        if (status) {
            System.out.println("");
            System.out.println("****** HALLO "+parUserName.toUpperCase()+" *****");
            System.out.println("Selamat datang di aplikasi ini");
        } else {
            System.out.println("");
            System.out.println("Oooops, Username atau Password anda salah!");
        }
    }
    
    public void pengecekanLogin(String parUserName, String parPassword){
        this.hasilLogin(this.cekAkun(parUserName, parPassword), parUserName);
        
    }
}
