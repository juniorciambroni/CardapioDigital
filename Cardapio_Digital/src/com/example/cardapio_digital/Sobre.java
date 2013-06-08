package com.example.cardapio_digital;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

	
	public class Sobre extends Activity implements Runnable {

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.sobre);

			
			
		}

		public void run(){
			startActivity(new Intent(this, MainActivity.class));
			finish();
		}
	}

