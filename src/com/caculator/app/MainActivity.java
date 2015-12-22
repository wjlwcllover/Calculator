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

	// ��Ӧequation TextView�е� ֵ
	private static CharSequence resultInEquationView;
	// ��Ӧ��ǰresultView�е�ֵ
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
		// ����������¼���
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
				// ���resultInResultView �е����鲻Ϊ0
				// �ͽ�����ַ��� �����resultInEquationView��
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
		// ɾ���������ֵ��¼�
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
		// ɾ���������ֵ��¼�
		clearButton.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {

				CharSequence qString = equationTextView.getText();
				// �ж������ǰ equationTextView ���Ѿ�û�������ˣ���ô�Ͳ�����ɾ����ĩβ�� ���֣����򱨴�
				if (qString.toString().isEmpty()) {
					equationTextView.setText("");
					resultTextView.setText("0");
					
					resultInEquationView = "";
					resultInResultView = "0";
				} else {
					// ɾ����ĩβ���Ǹ���������
					CharSequence aCharSequence = qString.subSequence(0,
							qString.length() - 1);
					// ������µ�CharSequence ���� equationTextView
					// �У���������������ɾ�������һ�����������
					equationTextView.setText(aCharSequence);
				}
			}
		});

		//���İ�ť���ԣ���Ϊ����
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

				// ���û������
				if (equationTextView.getText().toString().isEmpty()) {
					// �������κβ���
				} else {
					resultInEquationView = equationTextView.getText();
					if (EndWithCalculator()) {
						// �������κβ���
					} else {
						// ���ü������ĺ����߼�������ǰ��resultInEquationView
						// �ַ�������CalculatorRegex����ת������
						// resultTextView.setText(resultInEquationView);
						CharSequence s = (CharSequence) UtilCal
								.sizeyunsuan(resultInEquationView.toString());
						//��resultInResultView ��Ϊ ���յ� �����������+��*/�������жϵ�ʱ�����֪�����Ƿ�Ϊ0,
						//ֻ�ڴ˴��ı� resultInResultView ��ֵ��
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
	 * ��һ���ַ�����ʽ�� ��ѧ��ʽ��ת����һ�� ��������ʽ�����������㣬�ó����
	 * ���磺"2344*23-477+23*32-32*32+32*-232" �����߼���������һ�����Ժ��û����
	 * �������㰴ť����ʱ��������������ʾ��������Ǹ�TextView�� Ȼ��EquationTextView����ʾ + ��ϲ�����������֣�û���һ��
	 * ���������ͼƬ������ִ��һ�Σ��ǾͲ��ٴ��� �û�ͬʱ�������������� ������ɵ��鷳��ÿ����һ��������žͽ���һ�����㣬��ô ��һ�ε�����
	 * ��ȥ��һ�εĽ����Ϊ ������ ����Ϊ ��С�׵� ������Ӧ�����õ��ַ�����ת�������������ܷ���ġ�
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
		
		// �ж������ַ��Ƿ�Ϊ ������ţ������û������˼���������ţ����һ��һ����������ţ�ֻҪ���һ����������ż����ж�Ϊ��������
		if (end == '+' || end == '-' || end == '*' || end == '/') {
			return true;
		} else
			return false;

	}

	public boolean EndWithCalculator(String s) {
		char end = s
				.charAt(s.length() - 1);
		
		// �ж������ַ��Ƿ�Ϊ ������ţ������û������˼���������ţ����һ��һ����������ţ�ֻҪ���һ����������ż����ж�Ϊ��������
		if (end == '+' || end == '-' || end == '*' || end == '/') {
			return true;
		} else
			return false;

	}

}
