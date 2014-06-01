package com.example.basedatos;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class BaseDeDatosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base_de_datos);
		

		AdaptadorBD db=new AdaptadorBD(this);
//		añadir contactos
		
		db.abrir();
		long id=db.insertarContacto("Luis", "pedro@ex.com");
		Toast.makeText(this, "se ha insetado "+id, Toast.LENGTH_LONG).show();
		 id=db.insertarContacto("Marco", "juan@ex.com");
		 Toast.makeText(this, "se ha insetado "+id, Toast.LENGTH_LONG).show();
		 db.cerrar();
		 
		 
//			obtener todos los contactos
//			db.abrir();
//			Cursor c=db.obtenerTodosLosContactos();
//			if(c.moveToFirst()){
//				
//				do{
//					DisplayContact(c);
//				}while(c.moveToNext());
//			}
//			db.cerrar();
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.base_de_datos, menu);
		return true;
	}

}
