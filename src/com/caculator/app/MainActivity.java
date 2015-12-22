package com.caculator.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
	private Button switchButton;
	private Button pointButton;

	// 对应equation TextView中的 值
	private static CharSequence resultInEquationView;
	// 对应当前resultView中的值
	private static CharSequence resultInResultView = "0";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		equationTextView = (TextView) findViewById(R.id.equation_textview);
		//resultInEquationView = equationTextView.getText();
		resultTextView = (TextView) findViewById(R.id.result_textview);
		//resultInResultView = resultTextView.getText();
		// 四则运算的事件：
		addButton = (Button) findViewById(R.id.add);
		addButton.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				if (!resultInResultView.equals("0")) {
					equationTextView.setText(resultInResultView);
				}
				
				if(equationTextView.getText().toString().isEmpty())
				    equationTextView.append("0+");
				else if(EndWithCalculator(equationTextView.getText().toString())) 
					equationTextView.append("(0+");
				else 
					equationTextView.append("+");

			}
		});
		dedButton = (Button) findViewById(R.id.ded);
		dedButton.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				// 如果resultInResultView 中的数组不为0
				// 就将这个字符串 替代进resultInEquationView中
				if (!resultInResultView.equals("0")) {
					equationTextView.setText(resultInResultView);
				}
				if(equationTextView.getText().toString().isEmpty())
				    equationTextView.append("0-");
				else if(EndWithCalculator(equationTextView.getText().toString())) 
					equationTextView.append("(0-");
				else 
					equationTextView.append("-");
			}
		});

		mulButton = (Button) findViewById(R.id.mul);
		mulButton.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				if (!resultInResultView.equals("0")) {
					equationTextView.setText(resultInResultView);
				}
				if(equationTextView.getText().toString().isEmpty())
				    equationTextView.append("0*");
				else if(EndWithCalculator(equationTextView.getText().toString())) 
					equationTextView.append("(0*");
				else 
					equationTextView.append("*");
			}
		});
		divButton = (Button) findViewById(R.id.div);
		divButton.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi") @Override
			public void onClick(View v) {
				if (!resultInResultView.equals("0")) {
					equationTextView.setText(resultInResultView);
				}
				if(equationTextView.getText().toString().isEmpty())
				    equationTextView.append("0/");
				else if(EndWithCalculator(equationTextView.getText().toString())) 
					equationTextView.append("(0/");
				else 
					equationTextView.append("/");
			}
		});

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
		// 删除所有文字的事件
		clearAllButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				equationTextView.setText("");
				resultTextView.setText("0");
				
				resultInEquationView = "";
				resultInResultView = "0";
			}
		});
		clearButton = (Button) findViewById(R.id.c);
		// 删除单个数字的事件
		clearButton.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {

				CharSequence qString = equationTextView.getText();
				// 判断如果当前 equationTextView 中已经没有文字了，那么就不能再删除最末尾的 文字，否则报错
				if (qString.toString().isEmpty()) {
					equationTextView.setText("");
					resultTextView.setText("0");
					
					resultInEquationView = "";
					resultInResultView = "0";
				} else {
					// 删除掉末尾的那个输入数字
					CharSequence aCharSequence = qString.subSequence(0,
							qString.length() - 1);
					// 将这个新的CharSequence 载入 equationTextView
					// 中，这样看起来就是删除了最后一个输入的文字
					equationTextView.setText(aCharSequence);
				}
			}
		});

		//更改按钮属性，改为括号
		absButton = (Button) findViewById(R.id.abs);
		absButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 
				equationTextView.append("(");
				
			}
		});
		equalButton = (Button) findViewById(R.id.equal);
		equalButton.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {

				// 如果没有输入
				if (equationTextView.getText().toString().isEmpty()) {
					// 不进行任何操作
				} else {
					resultInEquationView = equationTextView.getText();
					if (EndWithCalculator()) {
						// 不进行任何操作
					} else {
						// 调用计算器的核心逻辑，将当前的resultInEquationView
						// 字符串，用CalculatorRegex进行转化计算
						// resultTextView.setText(resultInEquationView);
						CharSequence s = (CharSequence) UtilCal
								.sizeyunsuan(resultInEquationView.toString());
						//将resultInResultView 改为 最终的 结果，这样在+—*/的书如判断的时候才能知道，是否为0,
						//只在此处改变 resultInResultView 的值。
						resultInResultView = s;
						resultTextView.setText(s);
					}
				}

			}
		});
		
		switchButton = (Button) findViewById(R.id.exchange);
		switchButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				equationTextView.append(")");
				
			}
		});
		pointButton = (Button) findViewById(R.id.dot);
		pointButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				equationTextView.append(".");
			}
		});

	}

	/**
	 * 将一个字符串形式的 数学算式，转化成一个 真正的算式，并进行运算，得出结果
	 * 比如："2344*23-477+23*32-32*32+32*-232" 更换逻辑，当输入一个数以后，用户点击
	 * 四则运算按钮，这时将这个输入的数显示到下面的那个TextView中 然后EquationTextView中显示 + 和喜爱个输入数字，没点击一次
	 * 四则运算的图片就这样执行一次，那就不再存在 用户同时输入多个四则运算 符号造成的麻烦。每输入一个运算符号就进行一次运算，那么 下一次的运算
	 * 就去上一次的结果作为 操作数 我认为 ：小米的 计算器应该是用的字符串的转化方法，这样很方便的。
	 */
	// public void CalculatorRegex() {
	// String equation = resultInEquationView.toString();
	// ScriptEngine se = new ScriptEngineManager()
	// .getEngineByName("JavaScript");
	//
	// try {
	// Double answer = (Double) se.eval(resultInEquationView.toString());
	// resultInResultView = (CharSequence) answer.toString();
	// } catch (ScriptException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	public boolean EndWithCalculator() {
		char end = resultInEquationView
				.charAt(resultInEquationView.length() - 1);
		
		// 判断最后的字符是否为 运算符号，不管用户输入了几个运算符号，最后一个一定是运算符号，只要最后一个是运算符号即可判断为不可运算
		if (end == '+' || end == '-' || end == '*' || end == '/') {
			return true;
		} else
			return false;

	}

	public boolean EndWithCalculator(String s) {
		char end = s
				.charAt(s.length() - 1);
		
		// 判断最后的字符是否为 运算符号，不管用户输入了几个运算符号，最后一个一定是运算符号，只要最后一个是运算符号即可判断为不可运算
		if (end == '+' || end == '-' || end == '*' || end == '/') {
			return true;
		} else
			return false;

	}

}
