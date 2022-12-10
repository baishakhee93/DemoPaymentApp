package com.ezetappaymentexample.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button btnNative,  btnSettings;
	Intent intent = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnNative = (Button) findViewById(R.id.btnNative);
		btnNative.setOnClickListener(this);
		btnSettings = (Button) findViewById(R.id.btnSettings);
		btnSettings.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnNative:
			intent = new Intent(MainActivity.this,
					EzeNativeSampleActivity.class);
			startActivity(intent);
			break;

		case R.id.btnSettings:
				intent = new Intent(MainActivity.this,
					Setting.class);
				startActivity(intent);
				break;
		default:
			break;
		}

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		finish();
	}

}
