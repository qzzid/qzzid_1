import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;

import javax.swing.JFrame;

import dao.coffeedao;
import javax.swing.JPanel;
import javax.swing.JTable;

import bean.Stock;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;

public class InventoryUI extends JFrame {


	
	Container container = getContentPane();
	

	
	Panel pal =new Panel();
	coffeedao dao = new coffeedao();
	Stock stock = new Stock();
	private JTable table;
	Object columnNames[] = {"����","����","�÷�","����","����","����","ȫ��","����"};
	int num;
	String stockname;
	private JTextField textField;
	JLabel lblNewLabel;
	public InventoryUI(){
		num=0;//�ʱ�ȭ
		
		stock = dao.getstock();// �������� ������ �ޱ�
		
		setTitle("������");
		setSize(550, 700);
		setVisible(true);
		setLocation(900, 100);
		getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219,236,233));
		panel.setBounds(0, 0, 534, 198);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		table = new JTable(dao.makestocklistArr(stock),columnNames);
		table.setBounds(39, 25, 450, 150);
		panel.add(table);
		
	
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(39, 57, 450, 120);
		panel.add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("\uC7AC\uACE0\uD604\uD669");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel_1.setBounds(39, 26, 100, 20);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 202, 534, 341);
		panel_1.setBackground(new Color(153,204,204));
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC6D0\uB450");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				stockname="����";
				lblNewLabel.setText(stockname+"�� �ֹ��Ͻǰǰ���? ������ �Է��ϼ���.");
			}
		});
		btnNewButton.setBounds(30, 61, 100, 60);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC6B0\uC720");
		btnNewButton_1.setBounds(153, 61, 100, 60);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				stockname="����";
				lblNewLabel.setText(stockname+"�� �ֹ��Ͻǰǰ���? ������ �Է��ϼ���.");
			}
		});
		
		JButton btnNewButton_2 = new JButton("\uC2DC\uB7FD");
		btnNewButton_2.setBounds(276, 60, 100, 60);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				stockname="�÷�";
				lblNewLabel.setText(stockname+"�� �ֹ��Ͻǰǰ���? ������ �Է��ϼ���.");
			}
		});
		
		JButton btnNewButton_3 = new JButton("\uB538\uAE30");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stockname="����";
				lblNewLabel.setText(stockname+"�� �ֹ��Ͻǰǰ���? ������ �Է��ϼ���.");
			}
		});
		btnNewButton_3.setBounds(399, 60, 100, 60);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uB9DD\uACE0");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stockname="����";
				lblNewLabel.setText(stockname+"�� �ֹ��Ͻǰǰ���? ������ �Է��ϼ���.");
			}
		});
		btnNewButton_4.setBounds(30, 149, 100, 60);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\uB179\uCC28");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stockname="����";
				lblNewLabel.setText(stockname+"�� �ֹ��Ͻǰǰ���? ������ �Է��ϼ���.");
			}
		});
		btnNewButton_5.setBounds(153, 149, 100, 60);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\uD64D\uCC28");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stockname="ȫ��";
				lblNewLabel.setText(stockname+"�� �ֹ��Ͻǰǰ���? ������ �Է��ϼ���.");
			
			}
		});
		btnNewButton_6.setBounds(276, 149, 100, 60);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("\uCD08\uCF54");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stockname="����";
				lblNewLabel.setText(stockname+"�� �ֹ��Ͻǰǰ���? ������ �Է��ϼ���.");
			}
		});
		btnNewButton_7.setBounds(399, 149, 100, 60);
		panel_1.add(btnNewButton_7);
		
		JLabel lblNewLabel_2 = new JLabel("\uBB3C\uD488\uC8FC\uBB38");
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel_2.setBounds(30, 30, 100, 20);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uC8FC\uBB38\uC218\uB7C9\uC785\uB825 :");
		lblNewLabel_3.setFont(new Font("����", Font.BOLD, 12));
		lblNewLabel_3.setBounds(30, 237, 100, 20);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();		
		textField.setBounds(137, 237, 116, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 17));
		lblNewLabel.setBounds(30, 275, 450, 30);
		panel_1.add(lblNewLabel);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(219,236,233));
		panel_3.setBounds(0, 541, 534, 120);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("POS");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_8.setBounds(26, 23, 100, 50);
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("\uC8FC\uBB38");//�ֹ�
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
								
				if(stockname.equals("����")){// �ֹ��ϱ�
					stock.setWondu(stock.getWondu()+(Integer.parseInt(textField.getText())));
				}else if (stockname.equals("����")){
					stock.setMilk(stock.getMilk()+(Integer.parseInt(textField.getText())));					
				}else if (stockname.equals("�÷�")){
					stock.setSirup(stock.getSirup()+(Integer.parseInt(textField.getText())));
				}else if (stockname.equals("����")){
					stock.setBerry(stock.getBerry()+(Integer.parseInt(textField.getText())));
				}else if (stockname.equals("����")){
					stock.setMango(stock.getMango()+(Integer.parseInt(textField.getText())));
				}else if (stockname.equals("����")){
					stock.setGreen(stock.getGreen()+(Integer.parseInt(textField.getText())));
				}else if (stockname.equals("ȫ��")){
					stock.setBlack(stock.getBlack()+(Integer.parseInt(textField.getText())));
				}else if (stockname.equals("����")){
					stock.setChoco(stock.getChoco()+(Integer.parseInt(textField.getText())));
				}
				System.out.println(stock);
				dao.stockorder(stock);
				stockname="";
				//Integer.parseInt(textField.getText());//�Է°� ���ڷκ�ȯ
				textField.setText("");
				lblNewLabel.setText("");
				JOptionPane.showMessageDialog(null, "�ֹ��� �����Ͽ����ϴ�.");
			}
		});
		btnNewButton_9.setBounds(156, 23, 100, 50);
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("\uD310\uB9E4\uD604\uD669");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new SellListUI();
			}
		});
		btnNewButton_10.setBounds(281, 23, 100, 50);
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\uCD08\uAE30\uD654");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stock=dao.getstock();
				
				JPanel panel = new JPanel();
				
				panel.setBounds(0, 0, 534, 198);
				getContentPane().add(panel);
				panel.setLayout(null);
				
				table = new JTable(dao.makestocklistArr(stock),columnNames);
				table.setBounds(39, 25, 450, 150);
				panel.add(table);
				
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(39, 57, 450, 120);
				panel.add(scrollPane);
								
			}
		});
		btnNewButton_11.setBounds(409, 23, 100, 50);
		panel_3.add(btnNewButton_11);
			
	}
}
