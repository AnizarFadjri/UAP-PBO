/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uap.pbo;

/**
 *
 * @author LENOVO
 */
public class uappboo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barang brg = new Barang("Barang", "2022-10", "sabun", 30000, 300, 1000, "alat mandi");
        BarangModel bm = new BarangModel();
        bm.deleteBarang("Sabun");
    }
    }
    

