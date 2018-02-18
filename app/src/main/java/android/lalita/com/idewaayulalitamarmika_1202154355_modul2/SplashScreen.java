package android.lalita.com.idewaayulalitamarmika_1202154355_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    private static int splashInterval = 2000; //inisialisasi waktu selama 2 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        //menjadwalkan kapan di eksekusi dan lama penundaan sampai runnable di eksekusi
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //berpindah dari splashscreen ke menu utama
                startActivity(new Intent(SplashScreen.this, MenuUtama.class));
                //menampilkan toast nama_nim
                Toast.makeText(SplashScreen.this, "I DEWA AYU LALITA MARMIKA_1202154355", Toast.LENGTH_LONG).show();
                finish();
            }
        },splashInterval);

    }
}
