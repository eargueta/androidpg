package com.eargueta.fungame;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	public static ArrayList<String> correctwordlist = 
			new ArrayList<String>();
	
	public static InputStream path1 = null ;
	public static String words1 = null;
	public static InputStream path2 = null ;
	public static String words2 = null;
	public static InputStream path3 = null ;
	public static String words3 = null;
	public static InputStream path4 = null ;
	public static String words4 = null;
	public static InputStream path5 = null ;
	public static String words5 = null;
	public static InputStream path6 = null ;
	public static String words6 = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		path1 = MainActivity.class.getResourceAsStream("/words/correctwordlist1.txt");
		words1 = convertStreamToString(path1);
		path2 = MainActivity.class.getResourceAsStream("/words/correctwordlist2.txt");
		words2 = convertStreamToString(path2);
		path3 = MainActivity.class.getResourceAsStream("/words/correctwordlist3.txt");
		words3 = convertStreamToString(path3);
		path4 = MainActivity.class.getResourceAsStream("/words/correctwordlist4.txt");
		words4 = convertStreamToString(path4);
		path5 = MainActivity.class.getResourceAsStream("/words/correctwordlist5.txt");
		words5 = convertStreamToString(path5);
		path6 = MainActivity.class.getResourceAsStream("/words/correctwordlist6.txt");
		words6 = convertStreamToString(path6);
		
		correctwordlist.add(words1);
		correctwordlist.add(words2);
		correctwordlist.add(words3);
		correctwordlist.add(words4);
		correctwordlist.add(words5);
		correctwordlist.add(words6);
		
		System.out.println(correctwordlist.get(0));
		System.out.println(correctwordlist.get(1));
		System.out.println(correctwordlist.get(2));
		System.out.println(correctwordlist.get(3));
		System.out.println(correctwordlist.get(4));
		System.out.println(correctwordlist.get(5));

		
	}
	
	public String convertStreamToString(java.io.InputStream is) {
	    java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
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
