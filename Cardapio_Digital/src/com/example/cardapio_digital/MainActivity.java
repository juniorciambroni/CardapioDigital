package com.example.cardapio_digital;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	ImageButton pizza;
	ImageButton bebidas;
	ImageButton sobremesas;
	ImageButton porcoes;
	ImageButton sobre;
	ImageButton desenv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addListenerOnButtonPizza();
        addListenerOnButtonBebidas();
        addListenerOnButtonSobremesas();
        addListenerOnButtonPorcoes();
        addListenerOnButtonSobre();
        addListenerOnButtonDesenv();
       
        
    }

    
    public void addListenerOnButtonPizza() {
		final Context context = this;
 		pizza = (ImageButton) findViewById(R.id.btn1);
 		pizza.setOnClickListener(new android.view.View.OnClickListener() {
 
			public void onClick(View v) {
 			    Intent abrePizza = new Intent(context,GalleryPizza.class);
                startActivity(abrePizza);   
 			}
 		});
 	}
    
    public void addListenerOnButtonBebidas() {
		final Context context = this;
 		bebidas = (ImageButton) findViewById(R.id.btn2);
 		bebidas.setOnClickListener(new android.view.View.OnClickListener() {
 
			public void onClick(View v) {
 			    Intent abreBebidas = new Intent(context,GalleryBebidas.class);
                startActivity(abreBebidas);   
 			}
 		});
 	}
    
    public void addListenerOnButtonSobremesas() {
		final Context context = this;
 		bebidas = (ImageButton) findViewById(R.id.btn3);
 		bebidas.setOnClickListener(new android.view.View.OnClickListener() {
 
			public void onClick(View v) {
 			    Intent abreSobremesas = new Intent(context,GallerySobremesas.class);
                startActivity(abreSobremesas);   
 			}
 		});
 	}
    
    public void addListenerOnButtonPorcoes() {
		final Context context = this;
 		porcoes = (ImageButton) findViewById(R.id.btn4);
 		porcoes.setOnClickListener(new android.view.View.OnClickListener() {
 
			public void onClick(View v) {
 			    Intent abrePorcoes = new Intent(context,GalleryPorcoes.class);
                startActivity(abrePorcoes);   
 			}
 		});
 	}
    
    public void addListenerOnButtonSobre() {
		final Context context = this;
 		sobre = (ImageButton) findViewById(R.id.btnsobre);
 		sobre.setOnClickListener(new android.view.View.OnClickListener() {
 
 			public void onClick(View v) {
 			    Intent abreSobre = new Intent(context,Sobre.class);
                startActivity(abreSobre);   
 			}
 		});
 		
 	}
    
    
    public void addListenerOnButtonDesenv() {
		final Context context = this;
 		desenv = (ImageButton) findViewById(R.id.btndesenv);
 		desenv.setOnClickListener(new android.view.View.OnClickListener() {
 
 			public void onClick(View v) {
 			    Intent abreDes = new Intent(context,Desenv.class);
                startActivity(abreDes);   
 			}
 		});
    
    
    
}
  
  
}


