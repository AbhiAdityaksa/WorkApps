package c.progmob.WorkoutPedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(4000);
                }catch (InterruptedException ini){
                    ini.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashActivity.this,MenuUtama.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
