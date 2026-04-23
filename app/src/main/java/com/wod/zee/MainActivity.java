package com.wod.zee;
import android.app.Activity; import android.os.Bundle; import android.webkit.*;
public class MainActivity extends Activity {
    WebView wv;
    @Override protected void onCreate(Bundle s) {
        super.onCreate(s);
        getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(android.view.View.SYSTEM_UI_FLAG_FULLSCREEN|android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_main);
        wv = (WebView)findViewById(R.id.webview);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true); ws.setDomStorageEnabled(true);
        ws.setLoadWithOverviewMode(true); ws.setUseWideViewPort(true);
        ws.setAllowFileAccess(true); ws.setAllowContentAccess(true);
        ws.setMediaPlaybackRequiresUserGesture(false);
        ws.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        wv.setWebViewClient(new WebViewClient(){ @Override public boolean shouldOverrideUrlLoading(WebView v,String url){v.loadUrl(url);return true;} });
        wv.setWebChromeClient(new WebChromeClient());
        wv.loadUrl("https://hussenyioh-art.github.io/App-Doctor-/");
    }
    @Override public void onBackPressed(){ if(wv!=null&&wv.canGoBack())wv.goBack(); else super.onBackPressed(); }
}