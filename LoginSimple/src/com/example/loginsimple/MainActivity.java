package com.example.loginsimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        
        Button ingresa = (Button)findViewById(R.id.btingresar);
        ingresa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String usuario = ((EditText)findViewById(R.id.txtusuario)).getText().toString();
				String password = ((EditText)findViewById(R.id.txtpass)).getText().toString();
				
				
				if (usuario.equals("admin") && password.equals("admin")){
					
					Intent layout2 = new Intent(MainActivity.this, SegundaClase.class);
					startActivity(layout2);
					Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Error!, por favor Verifica tus datos", Toast.LENGTH_LONG).show();
					
				}
				
				
			
			
			
			}
		});
    	
    	
    }
    
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
