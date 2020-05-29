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
	//�������
	private JPanel pan1, pan2, pan3;
	private JLabel labName, labPassword, labConfirm, labInstruction, labSex, labId, labNumber, labA;
	private JTextField textField1, textField2;
	private JPasswordField passwordField, passwordField2;
	private JTextArea textArea;
	private JRadioButton radioButton1, radioButton2;
	private JComboBox comboBox;
	private JCheckBox checkBox;
	
	//���캯��
	public Practice(String s) {
		super(s);
		setSize(500, 500);
		setLocationRelativeTo(null);
		
		JPanel contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		//�����һ��
		pan1 = new JPanel();
		contentPane.add(pan1, BorderLayout.NORTH);
		
		labName = new JLabel("�û���:");
		textField1 = new JTextField(20);
		
		labPassword = new JLabel("����:");
		passwordField = new JPasswordField(20);
		passwordField.setEchoChar('*');
		labConfirm = new JLabel("ȷ������:");
		passwordField2 = new JPasswordField(20);
		passwordField2.setEchoChar('*');
		
		pan1.add(labName);
		pan1.add(textField1);
		pan1.add(labPassword);
		pan1.add(passwordField);
		pan1.add(labConfirm);
		pan1.add(passwordField2);
		
		//����ڶ���
		pan2 = new JPanel();
		contentPane.add(pan2, BorderLayout.CENTER);
		
		labInstruction = new JLabel("���˼��:");
		textArea = new JTextArea(10, 20);
		labSex = new JLabel("�Ա�:");
		radioButton1 = new JRadioButton("��");
		radioButton2 = new JRadioButton("Ů");
		//����ѡ���
		labId = new JLabel("֤������:");
		String[] item = { "���֤", "����", "ѧ��֤", "��ʻ֤", "����֤", "����" };
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
		
		//���������
		pan3 = new JPanel();
		contentPane.add(pan3, BorderLayout.SOUTH);
		labNumber = new JLabel("֤������:");
		textField2 = new JTextField(20);
		labA = new JLabel("ͬ���������:");
		checkBox = new JCheckBox("���Ѿ�������ͬ��ʹ��Э��");
		
		pan3.add(labNumber);
		pan3.add(textField2);
		pan3.add(labA);
		pan3.add(checkBox);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);pack();}
	}

