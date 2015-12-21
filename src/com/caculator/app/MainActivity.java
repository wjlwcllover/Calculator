package com.caculator.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView equationTextView;
	private TextView resultTextView;

	private Button addButton;
	private Button dedButton;
	private Button mulButton;
	private Button divButton;

	private Button oneButton;
	private Button twoButton;
	private Button threeButton;
	private Button fourButton;
	private Button fiveButton;
	private Button sixButton;
	private Button sevenButton;
	private Button eightButton;
	private Button nineButton;
	private Button zeroButton;

	private Button clearAllButton;
	private Button clearButton;

	private Button equalButton;
	private Button absButton;
	private Button pointButton;

	// 对应equation TextView中的 值
	private static double resultInEquationView;
	// 对应当前resultView中的值
	private static double resultInResultView = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		equationTextView = (TextView) findViewById(R.id.equation_textview);

		resultTextView = (TextView) findViewById(R.id.result_textview);

		addButton = (Button) findViewById(R.id.add);
		dedButton = (Button) findViewById(R.id.ded);
		mulButton = (Button) findViewById(R.id.mul);
		divButton = (Button) findViewById(R.id.div);

		oneButton = (Button) findViewById(R.id.one);
		oneButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				equationTextView.append("1");

			}
		});
		twoButton = (Button) findViewById(R.id.two);
		twoButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				equationTextView.append("2");

			}
		});
		threeButton = (Button) findViewById(R.id.three);
		threeButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				equationTextView.append("3");

			}
		});
		fourButton = (Button) findViewById(R.id.four);
		fourButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				equationTextView.append("4");

			}
		});
		fiveButton = (Button) findViewById(R.id.five);
		fiveButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				equationTextView.append("5");

			}
		});
		sixButton = (Button) findViewById(R.id.six);
		sixButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				equationTextView.append("6");

			}
		});
		sevenButton = (Button) findViewById(R.id.seven);
		sevenButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				equationTextView.append("7");

			}
		});
		eightButton = (Button) findViewById(R.id.eight);
		eightButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				equationTextView.append("8");

			}
		});
		nineButton = (Button) findViewById(R.id.nine);
		nineButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				equationTextView.append("9");

			}
		});
		zeroButton = (Button) findViewById(R.id.zero);
		zeroButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				equationTextView.append("0");

			}
		});

		clearAllButton = (Button) findViewById(R.id.ca);
		clearAllButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				equationTextView.setText("");
				resultTextView.setText("0");
			}
		});
		clearButton = (Button) findViewById(R.id.c);
		clearButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				CharSequence qString = equationTextView.getText();
				CharSequence aCharSequence = qString.subSequence(0, qString.length()-1);
				equationTextView.setText(aCharSequence);
				
			}
		});

		absButton = (Button) findViewById(R.id.abs);
		equalButton = (Button) findViewById(R.id.equal);
		pointButton = (Button) findViewById(R.id.dot);

	}

}
