package com.exmple.fb;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class ECE extends Activity {
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecdays);
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.days, menu);
        return true;
    }
}