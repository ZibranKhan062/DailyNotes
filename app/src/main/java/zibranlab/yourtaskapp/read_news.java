package zibranlab.yourtaskapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class read_news extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_news);

        WebView mywebview=findViewById(R.id.webview_id);

        mywebview.getSettings().setLoadWithOverviewMode(true);
        mywebview.getSettings().setUseWideViewPort(true);

        mywebview.loadUrl("https://abpnews.abplive.in/");

    }
}
