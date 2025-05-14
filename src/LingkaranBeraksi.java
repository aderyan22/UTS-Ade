/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LingkaranBeraksi {
    public static void main(String[] args) {
        double r = 11.78;

        Lingkaran lingkaran = new Lingkaran();
        double luas = lingkaran.hitungLuas(r);

        System.out.println("Luas dalam bentuk pecahan: " + luas);
        System.out.println("Luas dalam bentuk bilangan bulat (type-casting): " + (int) luas);
        System.out.println("Luas dalam bentuk pembulatan (round): " + Math.round(luas));
    }
}
