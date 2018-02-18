package android.lalita.com.idewaayulalitamarmika_1202154355_modul2;

/**
 * Created by lalita on 2/17/2018.
 */

//membuat class yang menampung variabel dengan tipe data berbeda
public class menulist {
    int gambar;
    String nama;
    int harga;
    String komposisi;

    //method setter
    public menulist(int gambar, String nama, int harga, String komposisi) {
        this.gambar=gambar;
        this.nama=nama;
        this.harga=harga;
        this.komposisi=komposisi;
    }

    //method get gambar
    public int getGambar() {
        return gambar;
    }

    //method get nama
    public String getNama() {
        return nama;
    }

    //method get harga
    public int getHarga() {
        return harga;
    }

    //method get komposisi
    public String getKomposisi() {
        return komposisi;
    }
}
