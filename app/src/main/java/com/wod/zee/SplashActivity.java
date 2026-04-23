package com.wod.zee;
import android.app.Activity; import android.content.Intent; import android.os.Bundle; import android.os.Handler; import android.os.Looper;
public class SplashActivity extends Activity {
    @Override protected void onCreate(Bundle s){
        super.onCreate(s); setContentView(R.layout.activity_splash);
        new Handler(Looper.getMainLooper()).postDelayed(()->{startActivity(new Intent(SplashActivity.this,MainActivity.class));finish();},2500);
    }
}