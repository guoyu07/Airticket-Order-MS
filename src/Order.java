import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.awt.*;

import javax.swing.JComboBox;
import javax.swing.JLabel;

/*
 * Order1.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class Order extends javax.swing.JFrame {

	public class JCheckBox {
		JCheckBox cb1, cd2;

	}

	/** Creates new form Order1 */
	public Order() {
		initComponents();

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

		jOptionPane1 = new javax.swing.JOptionPane();
		jOptionPane2 = new javax.swing.JOptionPane();
		panel1 = new java.awt.Panel();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();

		javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(
				panel1);
		panel1.setLayout(panel1Layout);
		panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));
		panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings
				.createAutoBinding(
						org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
						this, org.jdesktop.beansbinding.ELProperty
								.create("��Ʊҵ��"), this,
						org.jdesktop.beansbinding.BeanProperty.create("title"));
		bindingGroup.addBinding(binding);

		jLabel1.setFont(new java.awt.Font("����", 0, 18));
		jLabel1
				.setText("\u8bf7\u8f93\u5165\u60a8\u8981\u9884\u8ba2\u7684\u822a\u73ed\u53f7\uff1a");

		jLabel3.setFont(new java.awt.Font("����", 0, 18));
		jLabel3.setText("\u9884\u8ba2\u5ea7\u4f4d\u6570\uff1a");

		jLabel4.setFont(new java.awt.Font("����", 0, 18));
		jLabel4.setText("\u9884\u8ba2\u5ea7\u4f4d\u7c7b\u578b\uff1a");

		jTextField1.setFont(new java.awt.Font("����", 0, 18));

		jTextField3.setFont(new java.awt.Font("����", 0, 18));

		jButton1.setFont(new java.awt.Font("����", 0, 18));
		jButton1.setText("\u63d0\u4ea4\u8ba2\u5355");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton2.setFont(new java.awt.Font("����", 0, 18));
		jButton2.setText("\u8fd4\u56de");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jComboBox1.setFont(new java.awt.Font("����", 0, 18));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"���ò�", "�����" }));

		jLabel2.setFont(new java.awt.Font("����", 0, 18));
		jLabel2.setText("\u8eab\u4efd\u8bc1\u53f7\uff1a");

		jTextField2.setFont(new java.awt.Font("����", 0, 18));

		jButton3.setFont(new java.awt.Font("����", 0, 18));
		jButton3.setText("\u7f51\u4e0a\u652f\u4ed8");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton3ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(53, 53, 53)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel3))
																		.addGap(
																				33,
																				33,
																				33)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								159,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								159,
																								Short.MAX_VALUE)
																						.addComponent(
																								jComboBox1,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								87,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								159,
																								Short.MAX_VALUE))
																		.addGap(
																				66,
																				66,
																				66))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addGap(
																				64,
																				64,
																				64)
																		.addComponent(
																				jButton2)
																		.addGap(
																				74,
																				74,
																				74)
																		.addComponent(
																				jButton3)
																		.addGap(
																				81,
																				81,
																				81)))));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(44, 44, 44)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(29, 29, 29)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(31, 31, 31)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(36, 36, 36)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(46, 46, 46)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2)
														.addComponent(jButton3))
										.addGap(47, 47, 47)));

		bindingGroup.bind();

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws Exception{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from take_info where OrderForm>=ALL(SELECT OrderForm FROM take_info);");
		if(rs.next()){
		if(rs.getString("FlightNumber")!=null){
			
			Payment s=new Payment();
			s.setVisible(true);
		}
		else{
			jOptionPane1.showMessageDialog(null, "û�����Ӷ�����", "����",
					jOptionPane1.ERROR_MESSAGE);
			return;
		}
		}
		
	}

	@SuppressWarnings("deprecation")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();
		String a = jTextField1.getText();
		String b = jTextField2.getText();
		String c = jTextField3.getText();

		//final JComboBox jcb = new JComboBox(new String[] { "���ò�", "�����" });
		String e = ((String) jComboBox1.getSelectedItem()).equals("���ò�") ? "���ò�"
				: "�����";
		//if(rs.next()){
		if (a.equals("") || b.equals("") || c.equals("")) {
			jOptionPane1.showMessageDialog(null, "����Ϊ�գ�", "����",
					jOptionPane1.ERROR_MESSAGE);
			return;
		}
		ResultSet rs = stmt
				.executeQuery("select * from flight_info where FlightNumber='"
						+ a + "' ");
		if (rs.next()) {
			if (a.equals(rs.getString("FlightNumber"))) {
				rs = stmt
						.executeQuery("select * from take_info WHERE OrderForm>=ALL(SELECT OrderForm FROM take_info);");
				if (rs.next()) {
					jOptionPane2.showMessageDialog(null, "���Ӷ����ɹ������Ķ�����Ϊ��"
							+ rs.getLong("OrderForm") );

					stmt
							.executeUpdate("UPDATE take_info SET FlightNumber='"
									+ a
									+ "',SeatNumber="
									+ c
									+ ",FlightType='"
									+ e
									+ "',IfPay='δ����' WHERE OrderForm>=ALL(SELECT OrderForm FROM take_info);");
					if (e.equals("���ò�")) {
						rs=stmt.executeQuery("select * from flight_info where FlightNumber='"+a+"'");
						if(rs.next()){
						String q=rs.getString("Cprice");
						
						
						stmt.executeUpdate("UPDATE take_info SET price="+q+"*"+c+" WHERE OrderForm>=ALL(SELECT OrderForm FROM take_info);");
								
						stmt.executeUpdate("UPDATE flight_info SET CheapNumber=CheapNumber-"
										+ c + " where FlightNumber='" + a + "'");
					}
					}else {
						rs=stmt.executeQuery("select * from flight_info where FlightNumber='"+a+"'");
						if(rs.next()){
						String w=rs.getString("Bprice");
						stmt.executeUpdate("UPDATE take_info SET price="+w+"*"+c+" WHERE OrderForm>=ALL(SELECT OrderForm FROM take_info);");
						
						stmt.executeUpdate("UPDATE flight_info SET BusyNumber=BusyNumber-"
										+ c + " where FlightNumber='" + a + "'");

					}
					}
				
				}
			}
		} else {
			jOptionPane2.showMessageDialog(null, "���Ӷ������ɹ���");

		}

		stmt.close();
		con.close();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Order().setVisible(true);
			}
		});
	}

	/**
	 * @param args the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JOptionPane jOptionPane1;
	private javax.swing.JOptionPane jOptionPane2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private java.awt.Panel panel1;
	private org.jdesktop.beansbinding.BindingGroup bindingGroup;
	// End of variables declaration//GEN-END:variables

}