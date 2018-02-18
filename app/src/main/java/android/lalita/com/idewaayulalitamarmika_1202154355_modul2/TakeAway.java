package android.lalita.com.idewaayulalitamarmika_1202154355_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
        setTitle("Take Away"); //mengeset tulisan pada title bar menjadi Take Away
    }

    //ketika button pilih pesanan pada layout dine in diklik
    public void pilihPesanan(View view) {
        //berpindah dari layout take away ke datfar menu
        startActivity(new Intent(TakeAway.this, DaftarMenu.class));
        finish();
    }
}
