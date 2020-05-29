package practice;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Practice extends JFrame {
	//定义组件
	private JPanel pan1, pan2, pan3;
	private JLabel labName, labPassword, labConfirm, labInstruction, labSex, labId, labNumber, labA;
	private JTextField textField1, textField2;
	private JPasswordField passwordField, passwordField2;
	private JTextArea textArea;
	private JRadioButton radioButton1, radioButton2;
	private JComboBox comboBox;
	private JCheckBox checkBox;
	
	//构造函数
	public Practice(String s) {
		super(s);
		setSize(500, 500);
		setLocationRelativeTo(null);
		
		JPanel contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		//界面第一行
		pan1 = new JPanel();
		contentPane.add(pan1, BorderLayout.NORTH);
		
		labName = new JLabel("用户名:");
		textField1 = new JTextField(20);
		
		labName = new JLabel("曾用名:");
		textField1 = new JTextField(20);
		
		labPassword = new JLabel("密码:");
		passwordField = new JPasswordField(20);
		passwordField.setEchoChar('*');
		labConfirm = new JLabel("确认密码:");
		passwordField2 = new JPasswordField(20);
		passwordField2.setEchoChar('*');
		
		pan1.add(labName);
		pan1.add(textField1);
		pan1.add(labPassword);
		pan1.add(passwordField);
		pan1.add(labConfirm);
		pan1.add(passwordField2);
		
		//界面第二行
		pan2 = new JPanel();
		contentPane.add(pan2, BorderLayout.CENTER);
		
		labInstruction = new JLabel("个人简介:");
		textArea = new JTextArea(10, 20);
		labSex = new JLabel("性别:");
		radioButton1 = new JRadioButton("男");
		radioButton2 = new JRadioButton("女");
		//下拉选项框
		labId = new JLabel("证件类型:");
		String[] item = { "身份证", "护照", "学生证", "驾驶证", "军官证", "其他" };
		comboBox = new JComboBox(item);
		ButtonGroup btngroup = new ButtonGroup();
		btngroup.add(radioButton1);
		btngroup.add(radioButton2);
		
		pan2.add(labInstruction);
		pan2.add(textArea);
		pan2.add(labSex);
		pan2.add(radioButton1);
		pan2.add(radioButton2);
		pan2.add(labId);
		pan2.add(comboBox);
		
		//界面第三行
		pan3 = new JPanel();
		contentPane.add(pan3, BorderLayout.SOUTH);
		labNumber = new JLabel("证件号码:");
		textField2 = new JTextField(20);
		labA = new JLabel("同意服务条款:");
		checkBox = new JCheckBox("我已经看过并同意使用协议");
		
		pan3.add(labNumber);
		pan3.add(textField2);
		pan3.add(labA);
		pan3.add(checkBox);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);pack();}
	}

