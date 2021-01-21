package com.example.animaltab;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.text.style.TabStopSpan;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost=getTabHost();

        TabHost.TabSpec tabSpecDog=tabHost.newTabSpec("Dog").setIndicator("강아지");
        tabSpecDog.setContent(R.id.tabDog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecCat=tabHost.newTabSpec("Cat").setIndicator("고양이");
        tabSpecCat.setContent(R.id.tabCat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecMon=tabHost.newTabSpec("Monkey").setIndicator("원숭이");
        tabSpecMon.setContent(R.id.tabMon);
        tabHost.addTab(tabSpecMon);

        TabHost.TabSpec tabSpecRab=tabHost.newTabSpec("Rabbit").setIndicator("토끼");
        tabSpecRab.setContent(R.id.tabRab);
        tabHost.addTab(tabSpecRab);
    }
}