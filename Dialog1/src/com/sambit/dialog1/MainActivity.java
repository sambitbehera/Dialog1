package com.sambit.dialog1;

import android.os.Bundle;
import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button alertbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertbutton=(Button) findViewById(R.id.button1);
    }
    public void alertdlg(View view)
    {
    	AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
    	builder .setTitle("this is alert for u");
    	builder.setMessage("u want 2 return");
    	builder.setPositiveButton("yes", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				 
				finish();
			}
		});
    	builder.setNegativeButton("No", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				 
			}
		});
    	AlertDialog dialog=builder.create();
    	dialog.show();
    	
    }
}
     
	 