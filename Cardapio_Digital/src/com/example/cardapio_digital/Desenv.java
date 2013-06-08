package com.example.cardapio_digital;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Desenv extends Activity implements Runnable {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.desenv);

		
	}

	public void run(){
		startActivity(new Intent(this, MainActivity.class));
		finish();
	}
}
