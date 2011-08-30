package com.tbsf.android.piecalculator;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;

public class MainActivity extends ListActivity {
	
	protected String[] equations = {"Ohm's Law", "Resisters", "Capacitors", "Radiated Power"};
    //protected ListAdapter adapter;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, equations);
        setListAdapter(adapter);
    }
    
    public void onListItemClick(ListView parent, View view, int position, long id) {
    	if (position == 0) {
    		Intent intent = new Intent(this, Func_OhmsLaw.class);
        	startActivity(intent);
    	}
    }

}