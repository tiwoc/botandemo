package de.tiwoc.botandemo;

import de.tiwoc.botandemo.Native;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

    public void doDemo(View view) {
    	EditText editText = (EditText) findViewById(R.id.iterationCount);
    	TextView textView = (TextView) findViewById(R.id.demoOutput);
    	
    	int iterations = Integer.parseInt(editText.getText().toString());

        long startTime = System.currentTimeMillis();
        String ret = Native.pbkdf2Demo(iterations);
        long stopTime = System.currentTimeMillis();
        
        textView.setText("" + iterations + " iterations took " + (stopTime - startTime) + " ms\nresult=" + ret);
    }
}
