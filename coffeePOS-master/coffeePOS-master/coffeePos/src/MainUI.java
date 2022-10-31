import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import bean.Coffee;
import bean.Stock;
import dao.coffeedao;
import oracle.net.aso.f;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ButtonGroup;

//���â�� ����� ������ �ٸ��� ������ �Ѵ�. �׷��� �װ� ��� ������ ����غ��ߵɵ�
//�ϴ� ���ο��� ����� ��� �� �Էµ����ʹ� ���⼭ ���� �޾Ƽ� ������ ��־��ִ� �������� ������
public class MainUI {
	Vector<Coffee> list =new Vector<Coffee>();
	Coffee coffee = null; 
	Stock stock =null;
	coffeedao dao = null;
	JLabel lblNewLabel_1;
	String menu="";
	int count=0;
	boolean flag_size=false;//�ѹ��̶� Ŭ���ϸ� true
	boolean flag_shot=false;
	private JFrame frame = new JFrame();

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MainUI() {
		
		initialize();
		
	}
	
	public void initialize() {
		
		coffee = new Coffee();
		dao = new coffeedao();
		stock = new Stock();
		stock = dao.getstock();	//�������� ��� ������ �־��ֱ�	
		System.out.println(stock); // ��� ������ Ȯ��

		
		frame = new JFrame();
	
		frame.setTitle("ī��  POS ���α׷�");
		
		
		
		frame.setBounds(100, 100, 800, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153,204,204));
		panel.setBounds(0, 0, 784, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("����������");
		btnNewButton .setBackground(new Color(173,209,188));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count++;
				if(count > 1){
					stock.setWondu(stock.getWondu()+1);
				}
				stock.setWondu(stock.getWondu()-1); // ������� ����				
				showlabel("����������",3000);
				
			}
		});
		btnNewButton.setBounds(50, 37, 100, 70);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("�Ƹ޸�ī��");
		btnNewButton_1 .setBackground(new Color(196,222,207));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setWondu(stock.getWondu()+1);
				}
				
				stock.setWondu(stock.getWondu()-1);
				showlabel("�Ƹ޸�ī��",4000);
			}
		});
		btnNewButton_1.setBounds(200, 37, 100, 70);
		
	
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ī���");
		btnNewButton_2 .setBackground(new Color(173,209,188));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setWondu(stock.getWondu()+1);
					stock.setMilk(stock.getMilk()+1);
				}
				stock.setWondu(stock.getWondu()-1);
				stock.setMilk(stock.getMilk()-1);//��������
				showlabel("ī���",4500);
			}
		});
		btnNewButton_2.setBounds(350, 37, 100, 70);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uBC14\uB2D0\uB77C\uB77C\uB5BC");
		btnNewButton_3 .setBackground(new Color(196,222,207));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setWondu(stock.getWondu()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setSirup(stock.getSirup()+1);
				}
				stock.setWondu(stock.getWondu()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setSirup(stock.getSirup()-1);
				showlabel("�ٴҶ���",4600);
			}
		});
		btnNewButton_3.setBounds(500, 37, 100, 70);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uADF8\uB9B0\uD2F0\uB77C\uB5BC");
		btnNewButton_4 .setBackground(new Color(173,209,188));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setWondu(stock.getWondu()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setSirup(stock.getSirup()+1);
				}
				stock.setWondu(stock.getWondu()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setSirup(stock.getSirup()-1);
				showlabel("�׸�Ƽ��",4800);
			}
		});
		btnNewButton_4.setBounds(650, 37, 100, 70);
		panel.add(btnNewButton_4);
		
		JButton button = new JButton("\uCE74\uD478\uCE58\uB178");
		button  .setBackground(new Color(176,196,222));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setWondu(stock.getWondu()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setSirup(stock.getSirup()+1);
				}
				stock.setWondu(stock.getWondu()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setSirup(stock.getSirup()-1);
				showlabel("īǪġ��",4900);
			}
		});
		button.setBounds(50, 148, 100, 70);
		panel.add(button);
		
		JButton button_1 = new JButton("\uB3CC\uCCB4\uB77C\uB5BC");
		button_1 .setBackground(new Color(187,204,226));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setWondu(stock.getWondu()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setSirup(stock.getSirup()+1);
				}
				stock.setWondu(stock.getWondu()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setSirup(stock.getSirup()-1);
				showlabel("��ü���",5100);
			}
		});
		button_1.setBounds(200, 148, 100, 70);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\uCE74\uD398\uBAA8\uCE74");
		button_2  .setBackground(new Color(176,196,222));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setWondu(stock.getWondu()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setChoco(stock.getChoco()+1);
					stock.setSirup(stock.getSirup()+1);
				}
				stock.setWondu(stock.getWondu()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setChoco(stock.getChoco()-1);
				stock.setSirup(stock.getSirup()-1);
				showlabel("ī���ī",4300);
			}
		});
		button_2.setBounds(350, 148, 100, 70);
		panel.add(button_2);
		
		JButton button_3 = new JButton("\uD504\uB77C\uD504\uCE58\uB178");
		button_3 .setBackground(new Color(187,204,226));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setWondu(stock.getWondu()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setChoco(stock.getChoco()+1);
					stock.setSirup(stock.getSirup()+1);
				}
				stock.setWondu(stock.getWondu()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setChoco(stock.getChoco()-1);
				stock.setSirup(stock.getSirup()-1);
				showlabel("������ġ��",4700);
			}
		});
		button_3.setBounds(500, 148, 100, 70);
		panel.add(button_3);
		
		JButton button_4 = new JButton("\uB538\uAE30\uC2A4\uBB34\uB514");
		button_4.setBackground(new Color(176,196,222));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setBerry(stock.getBerry()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setSirup(stock.getSirup()+1);
				}
				stock.setBerry(stock.getBerry()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setSirup(stock.getSirup()-1);
				showlabel("���⽺����",5000);
			}
		});
		button_4.setBounds(650, 148, 100, 70);
		panel.add(button_4);
		
		JButton button_5 = new JButton("\uB9DD\uACE0\uC2A4\uBB34\uB514");
		button_5.setBackground(new Color(237,212,213));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setMilk(stock.getMilk()+1);
					stock.setMango(stock.getMango()+1);
					stock.setSirup(stock.getSirup()+1);
				}
				stock.setMilk(stock.getMilk()-1);
				stock.setMango(stock.getMango()-1);
				stock.setSirup(stock.getSirup()-1);
				showlabel("��������",5000);
			}
		});
		button_5.setBounds(50, 266, 100, 70);
		panel.add(button_5);
		
		JButton button_6 = new JButton("\uD56B\uCD08\uCF54");
		button_6.setBackground(new Color(242,224,225));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setMilk(stock.getMilk()+1);
					stock.setChoco(stock.getChoco()+1);
					stock.setSirup(stock.getSirup()+1);
				}
				stock.setChoco(stock.getChoco()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setSirup(stock.getSirup()-1);
				showlabel("������",3000);
			}
		});
		button_6.setBounds(200, 266, 100, 70);
		panel.add(button_6);
		
		JButton button_7 = new JButton("\uBE14\uB799\uD2F0");
		button_7.setBackground(new Color(237,212,213));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setBlack(stock.getBlack()+1);
				}
				stock.setBlack(stock.getBlack()-1);
				showlabel("��Ƽ",4000);
			}
		});
		button_7.setBounds(350, 266, 100, 70);
		panel.add(button_7);
		
		JButton button_8 = new JButton("\uBC84\uBE14\uD2F0");
		button_8.setBackground(new Color(242,224,225));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setBlack(stock.getBlack()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setSirup(stock.getSirup()+1);
				}			
				stock.setMilk(stock.getMilk()-1);
				stock.setBlack(stock.getBlack()-1);
				stock.setSirup(stock.getSirup()-1);
				showlabel("����Ƽ",4000);
			}
		});
		button_8.setBounds(500, 266, 100, 70);
		panel.add(button_8);
		
		JButton button_9 = new JButton("\uADF8\uB9B0\uD2F0");
		button_9.setBackground(new Color(237,212,213));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setGreen(stock.getGreen()+1);
				}
				stock.setGreen(stock.getGreen()-1);
				showlabel("�׸�Ƽ",4000);
			}
		});
				
		button_9.setBounds(650, 266, 100, 70);
		panel.add(button_9);		
		//��ư
		
	
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(219,236,233));
		panel_1.setBounds(0, 396, 784, 115);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("  ICE");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				coffee.setTemp("ICE");
				showlabel(coffee.getName(),coffee.getPrice());
				
				
			}
		});
		rdbtnNewRadioButton.setBounds(145, 42, 60, 26);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnHot = new JRadioButton("  HOT");
		buttonGroup.add(rdbtnHot);
		rdbtnHot.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				coffee.setTemp("HOT");
				showlabel(coffee.getName(),coffee.getPrice());
				
			}
		});
		rdbtnHot.setBounds(209, 42, 121, 26);
		panel_1.add(rdbtnHot);
		
		JRadioButton rdbtnSmall = new JRadioButton("  SMALL");
		buttonGroup_1.add(rdbtnSmall);
		rdbtnSmall.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
									
				clicksize(coffee.getSize(),"SMALL",flag_size);
				coffee.setSize("SMALL");
				showlabel(coffee.getName(),coffee.getPrice());
				flag_size=true;
				
			}
		});
		rdbtnSmall.setBounds(469, 42, 80, 26);
		panel_1.add(rdbtnSmall);
		
		JRadioButton rdbtnTall = new JRadioButton("  TALL");
		buttonGroup_1.add(rdbtnTall);
		rdbtnTall.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			clicksize(coffee.getSize(),"TALL",flag_size);
			coffee.setSize("TALL");
			showlabel(coffee.getName(),coffee.getPrice());
			flag_size=true;
				
			}
		});
		rdbtnTall.setBounds(561, 42, 80, 26);
		panel_1.add(rdbtnTall);
		
		JRadioButton rdbtnLarge = new JRadioButton("  LARGE");
		buttonGroup_1.add(rdbtnLarge);
		rdbtnLarge.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				clicksize(coffee.getSize(),"LARGE",flag_size);
				coffee.setSize("LARGE");
				showlabel(coffee.getName(),coffee.getPrice());
				flag_size=true;
				
			}
		});
		rdbtnLarge.setBounds(644, 42, 121, 26);
		panel_1.add(rdbtnLarge);
		
		JLabel lblNewLabel = new JLabel("HOT / ICE");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(59, 45, 99, 18);
		panel_1.add(lblNewLabel);
		
		JLabel label = new JLabel("\uC74C\uB8CC \uC0AC\uC774\uC988");
		label.setFont(new Font("Dialog", Font.BOLD, 15));
		label.setBounds(373, 45, 99, 18);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\uC0F7\uCD94\uAC00");
		label_1.setFont(new Font("Dialog", Font.BOLD, 15));
		label_1.setBounds(59, 86, 99, 18);
		panel_1.add(label_1);
		
		JRadioButton rdbtnYes = new JRadioButton("  YES");
		buttonGroup_2.add(rdbtnYes);
		rdbtnYes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				clickshot(coffee.getShot(), "���߰�", flag_shot);
				coffee.setShot("���߰�");
				showlabel(coffee.getName(),coffee.getPrice());
				flag_shot= true;
				
				
			
				
				
				/*
				count_shot++;
				if(count_shot > 1){
					coffee.setPrice(coffee.getPrice()-500);
					stock.setWondu(stock.getWondu()+1);
				}
				
				coffee.setPrice(coffee.getPrice()+500);
				coffee.setShot("���߰�");
				stock.setWondu(stock.getWondu()-1);*/
				
			}
		});
		rdbtnYes.setBounds(145, 83, 60, 26);
		panel_1.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("  NO");
		buttonGroup_2.add(rdbtnNo);
		rdbtnNo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(coffee.getShot()==("���߰�")){
					coffee.setPrice(coffee.getPrice()-500);
				}
				
				coffee.setShot("NO��");
				showlabel(coffee.getName(),coffee.getPrice());
			}
		});
		rdbtnNo.setBounds(209, 83, 121, 26);
		panel_1.add(rdbtnNo);
		//������ư
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153,204,204));
		panel_2.setBounds(0, 512, 784, 217);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_1.setText("\uCEE4\uD53C");
		
		lblNewLabel_1.setBounds(81, 40, 618, 26);
		panel_2.add(lblNewLabel_1);
		//��Ʈ���� ���ڿ��� �ְ� �׼��� ���Ë����� ��Ʈ���� ���� �־��ְ� ���������� ���� �־��ش�.
		lblNewLabel_1.setText(menu);
				
		
		JButton btnNewButton_5 = new JButton("\uACB0\uC81C");//���� ������ ������ �Է�
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count=0;
				
				if(checkOrder() == 0){
					checkOrder();
										
					dao.coffeeadd(coffee);//�Ǹ����� �����Ϳ� ����
					System.out.println(coffee);
					//����پ���
					dao.stockorder(stock);//��� ������ ����
					System.out.println(stock);
					buttonGroup.clearSelection();
					buttonGroup_1.clearSelection();
					buttonGroup_2.clearSelection();
					lblNewLabel_1.setText("");
					JOptionPane.showMessageDialog(null, "���� �Ǿ����ϴ�");
					//��� �ڵ����� �޼ҵ�
					coffee.setName(null);
					coffee.setShot(null);
					coffee.setSize(null);
					coffee.setTemp(null);
					coffee.setPrice(0);
					flag_size=false;
					flag_shot=false;
				}else{
					buttonGroup.clearSelection();
					buttonGroup_1.clearSelection();
					buttonGroup_2.clearSelection();
					lblNewLabel_1.setText("");
					coffee.setName(null);
					coffee.setShot(null);
					coffee.setSize(null);
					coffee.setTemp(null);
					coffee.setPrice(0);
					JOptionPane.showMessageDialog(null, "��ᰡ ���������ϴ�.��Ḧ �ֹ��ϼ���.");
					flag_size=false;
					flag_shot=false;
				}
			
			}
		});
		btnNewButton_5.setBounds(598, 121, 123, 38);
		panel_2.add(btnNewButton_5);
		
		JButton button_10 = new JButton("\uC120\uD0DD\uCDE8\uC18C");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count=0;
				flag_shot=false;
				flag_size=false;
				coffee.setName(null);
				coffee.setShot(null);
				coffee.setSize(null);
				coffee.setTemp(null);
				coffee.setPrice(0);
				lblNewLabel_1.setText("");
				// ��ư �ʱ�ȭ
				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection(); 
				System.out.println(coffee);
				JOptionPane.showMessageDialog(null, "������ҵǾ����ϴ�.");
				
			}
		});
		button_10.setBounds(431, 121, 123, 38);
		panel_2.add(button_10);
		
		JButton button_11 = new JButton("\uD310\uB9E4\uBCF4\uAE30");//�Ǹ�Ȯ��
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new SellListUI();
				System.out.println(dao.GetAllSellList());								
				
			}
		});
		button_11.setBounds(57, 121, 123, 38);
		panel_2.add(button_11);
		
		JButton btnNewButton_6 = new JButton("\uC7AC\uACE0\uAD00\uB9AC");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InventoryUI();
				
			}
		});
		btnNewButton_6.setBounds(192, 121, 123, 38);
		panel_2.add(btnNewButton_6);
	}
	
	
	
	public void showlabel(String name, int price){//�Ǹ� ������ �Է�
		
		coffee.setName(name);
		coffee.setPrice(price);
				
		if(coffee.getName() != null && coffee.getPrice() != 0 ){
			menu = coffee.getName()+ " / " + coffee.getPrice();
			
			if(coffee.getShot() != null){
				menu = menu+ " / " +coffee.getShot();
			}
			
			if(coffee.getSize() != null){
				menu = menu+ " / " +coffee.getSize();
			}
			
			if(coffee.getTemp() != null){
				menu = menu+ " / " +coffee.getTemp();
			}
		}		
		lblNewLabel_1.setText(menu);
		
		
		
	}//showlabel

	
	//�ֹ��Ҷ� ��� Ȯ�� �ϴ� �޼ҵ�
	public int checkOrder(){
		int result=0;
		if(	stock.getWondu() == -1 || 
			stock.getMilk() == -1 || 
			stock.getSirup() == -1 ||
			stock.getBerry() == -1 ||
			stock.getMango() == -1 ||
			stock.getGreen() == -1 ||
			stock.getBlack() == -1 ||
			stock.getChoco() == -1
		){
			result=-1;	
		}	
			return result;
	}//checkOrder
	
	
	public void clicksize(String befor_size,String size,boolean flag_size){// ��������õ� Ŭ���������� �޼ҵ�
		
		if(flag_size){
			//�ι�° �̻�
			switch (size) {
			
			case "SMALL":
				switch (befor_size) {
				case "SMALL":
					
					break;
				case "TALL":
					coffee.setPrice(coffee.getPrice()-500);
					break;
				case "LARGE":
					coffee.setPrice(coffee.getPrice()-1000);
					break;
				default:
					break;
				}				
				break;
				
			case "TALL":
				switch (befor_size) {
				case "SMALL":
					coffee.setPrice(coffee.getPrice()+500);
					break;
				case "TALL":
					
					break;
				case "LARGE":
					coffee.setPrice(coffee.getPrice()-500);
					break;
				default:
					break;
				}
				break;
				
			case "LARGE":
				switch (befor_size) {
				case "SMALL":
					coffee.setPrice(coffee.getPrice()+1000);
					break;
				case "TALL":
					coffee.setPrice(coffee.getPrice()+500);
					break;
				case "LARGE":
					break;
				default:
					break;
				}
				break;
				
			default:
				break;
			}
			
		}else{
			//ó��������
			switch (size) {
			
			case "SMALL":
				
				break;
			case "TALL":
				coffee.setPrice(coffee.getPrice()+500);
				break;
			case "LARGE":
				coffee.setPrice(coffee.getPrice()+1000);
				break;	
				
			default:
				break;
			}
			
		}
		
	}//clicksize
	
	
	
	
	public void clickshot(String befor_shot,String shot,boolean flag_shot){//�����õ� ��ư����
		if(flag_shot){
			//�ι��̻�
			switch (shot) {
			case "���߰�":
				switch (befor_shot) {
				case "���߰�":
					
					break;
				case "NO��":
					coffee.setPrice(coffee.getPrice()+500);
					break;		
				default:
					break;
				}
				break;
				
			case "NO��":
				switch (befor_shot) {
				case "���߰�":
					coffee.setPrice(coffee.getPrice()-500);
					break;
				case "NO��":
					break;		
				default:
					break;
				}
				break;		
			default:
				break;
			}
		}else {
			//�ѹ�������
			switch (shot) {
			case "���߰�":
				coffee.setPrice(coffee.getPrice()+500);
				break;
			case "NO��":
				break;		
			default:
				break;
			}
		}	
	}//clickshot
	
	
	
	
	
}


