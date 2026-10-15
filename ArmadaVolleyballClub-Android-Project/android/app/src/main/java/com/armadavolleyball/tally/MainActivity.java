package com.armadavolleyball.tally;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Window w = getWindow();
    w.setStatusBarColor(android.graphics.Color.rgb(16,37,31));
    w.setNavigationBarColor(android.graphics.Color.rgb(16,37,31));
    WebView view = new WebView(this);
    view.setBackgroundColor(android.graphics.Color.rgb(245,247,245));
    WebSettings settings = view.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(true);
    settings.setAllowFileAccess(true);
    view.setWebViewClient(new WebViewClient());
    view.setWebChromeClient(new WebChromeClient());
    setContentView(view);
    view.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed() { super.onBackPressed(); }
}
