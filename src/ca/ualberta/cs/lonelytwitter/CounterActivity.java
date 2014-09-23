package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class CounterActivity extends Activity {
	private TextView text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_counter);
		text = (TextView) findViewById(R.id.counterText);
		int count = 0;
		//ArrayList<LonelyTweetModel> counterList = LonelyTwitterActivity.tweets;
		for (int i = 0; i < LonelyTwitterActivity.tweets.size(); i++) {
			count++;
		} // Same as count = LonelyTwitterActivity.tweets.size()
		String printText = "You have "+count+" tweets";
		text.setText(printText);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.counter, menu);
		return true;
	}

}
