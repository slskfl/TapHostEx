package com.example.browser;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtUrl;
    Button btnGo, btnBack;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("간단 브라우저");
//        ActionBar bar=getSupportActionBar();
//        bar.setTitle("간단 브라우저");
        edtUrl=findViewById(R.id.edtUrl);
        btnGo=findViewById(R.id.btnGo);
        btnBack=findViewById(R.id.btnBack);
        webView=findViewById(R.id.webView);
        webView.setWebViewClient(new webBrowser());
        WebSettings webset=webView.getSettings();
        webset.setJavaScriptEnabled(true);
        webset.setBuiltInZoomControls(true);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=edtUrl.getText().toString();
                if(!str.substring(0,7).equals("http://")){
                    str="http://"+str;
                }
                webView.loadUrl(str);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.goBack();
            }
        });
    }

    class webBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
         return super.shouldOverrideUrlLoading(view, url);
        }
    }
}