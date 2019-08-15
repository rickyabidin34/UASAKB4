package rickyabidin34.com.uas.realmakb;

import android.content.Intent;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

/* Tanggal Pengerjaan
 *  12 Agustus 2019
 *
 * RICKY ABIDIN
 *  10116169
 *  IF-4
 *  */

import rickyabidin34.com.uas.realmakb.view.viewPager.IntroActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, IntroActivity.class));
                finish();
            }
        },2000);
    }
}
