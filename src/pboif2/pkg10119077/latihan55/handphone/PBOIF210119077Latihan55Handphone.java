/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan55.handphone;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF - 2
 * Deskripsi    : Menampilkan Handphone,Model,OS,Harga,dsb.
 */
public class PBOIF210119077Latihan55Handphone {

    public static void main(String[] args) {
        Android objAndroid = new Android("Samsung", "Android", "Grand", 3000000);
        objAndroid.setKeyStore("234ibfd3840fo");
        BlackBerry objBlackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        objBlackBerry.setPinBB("BHS249");
        WindowsPhone objWindowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        objWindowsPhone.setWpKeyStore("UUUQIJWORJ");
        
        objAndroid.displayProduct();
        System.out.println("Android Key Store : "+objAndroid.getKeyStore());
        System.out.println("");
        objBlackBerry.displayProduct();
        System.out.println("PIN : "+objBlackBerry.getPinBB());
        System.out.println("");
        objWindowsPhone.displayProduct();
        System.out.println("Wp Key Store : "+objWindowsPhone.getWpKeyStore());
    }
    
}
