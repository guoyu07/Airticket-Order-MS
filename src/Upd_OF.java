import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Upd_OF.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class Upd_OF extends javax.swing.JFrame {

	/** Creates new form Upd_OF */
	public Upd_OF() {
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

		jOptionPane1 = new javax.swing.JOptionPane();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				try {
					formWindowClosing(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel1.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel1.setText("\u6539\u7b7e\u540e\u7684\u8ba2\u5355\u4fe1\u606f");

		jTextField1.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jLabel2.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel2.setText("\u822a\u73ed\u53f7\uff1a");

		jLabel3.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel3.setText("\u5ea7\u4f4d\u6570\uff1a");

		jTextField2.setFont(new java.awt.Font("΢���ź�", 0, 14));

		jLabel4.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jLabel4.setText("\u4ed3\u4f4d\u7c7b\u578b\uff1a");

		jButton1.setText("\u786e\u5b9a");
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

		jButton2.setText("\u8fd4\u56de");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton2ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jComboBox1.setFont(new java.awt.Font("΢���ź�", 0, 14));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"���ò�", "�����" }));

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
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel1))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addContainerGap(
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jButton1))))
										.addGap(53, 53, 53)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton2)
																		.addContainerGap())
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
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																										.addComponent(
																												jTextField2,
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jTextField1,
																												javax.swing.GroupLayout.Alignment.LEADING,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												100,
																												Short.MAX_VALUE))
																						.addContainerGap(
																								91,
																								Short.MAX_VALUE))
																		.addGroup(
																				layout
																						.createSequentialGroup()
																						.addComponent(
																								jComboBox1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								78,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addContainerGap())))));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addGap(47, 47, 47)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(30, 30, 30)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(27, 27, 27)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												30, Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addGap(30, 30, 30)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");

		Statement stmt = con.createStatement();
		stmt.executeUpdate("UPDATE take_info SET id='id' ");
		dispose();
	}

	private void formWindowClosing(java.awt.event.WindowEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");

		Statement stmt = con.createStatement();
		stmt.executeUpdate("UPDATE take_info SET id='id' ");
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();
		String a = jTextField1.getText();
		String b = jTextField2.getText();
		String c = ((String) jComboBox1.getSelectedItem()).equals("���ò�")?"���ò�":"�����";
		if (a.equals("") || b.equals("") || c.equals("")) {
			jOptionPane1.showMessageDialog(null, "����Ϊ�գ��������޸����ݡ�");

		}
	
			ResultSet rs = stmt
			.executeQuery("select * from flight_info where FlightNumber='"+a+"'");
			if(rs.next()){
				if(a.equals(rs.getString("FlightNumber"))){
			jOptionPane1.showMessageDialog(null, "��ǩ�ɹ���");
			rs = stmt
			.executeQuery("select * from take_info where id LIKE '%*'");
	if (rs.next()) {
		


		String d = rs.getString("SeatNumber");
		String e = rs.getString("FlightType");
		String f = rs.getString("FlightNumber");
			if (e.equals("���ò�")) {
				stmt
						.executeUpdate("UPDATE flight_info SET CheapNumber=CheapNumber+"
								+ d
								+ " WHERE FlightNumber='"
								+ f
								+ "'");
				if (c.equals("���ò�")) {
					rs = stmt
							.executeQuery("select * from flight_info where FlightNumber='"+a+"'");
					while (rs.next()) {
						
						String g = rs.getString("Cprice");
						stmt.executeUpdate("UPDATE flight_info SET CheapNumber=CheapNumber-"+b+" where FlightNumber='"+a+"'");
						stmt.executeUpdate("UPDATE take_info SET FlightNumber='"
										+ a
										+ "',SeatNumber="
										+ b
										+ ",FlightType='"+c+"'," +
												"price="
										+ b + "*" + g + " WHERE id LIKE '%*'");
					}
				} else {
					rs = stmt
							.executeQuery("select * from flight_info where FlightNumber='"
									+ a + "'");
					while (rs.next()) {
						String h = rs.getString("Bprice");
						stmt.executeUpdate("UPDATE flight_info SET BusyNumber=BusyNumber-"+b+" where FlightNumber='"+a+"'");
						stmt.executeUpdate("UPDATE take_info SET FlightNumber='"
										+ a
										+ "',SeatNumber="
										+ b
										+ ",FlightType='"+c+"',price="
										+ b + "*" + h + " WHERE id LIKE '%*'");
					}
				}
			} else {	
				rs = stmt
				.executeQuery("select * from take_info where id LIKE '%*'");
				if(rs.next()){
				String x = rs.getString("SeatNumber");
				String y = rs.getString("FlightType");
				String k = rs.getString("FlightNumber");
				stmt.executeUpdate("UPDATE flight_info SET BusyNumber=BusyNumber+"
								+ x
								+ " WHERE FlightNumber='"
								+ k
								+ "'");
				if (c.equals("���ò�")) {
					rs = stmt
							.executeQuery("select * from flight_info where FlightNumber='"
									+ a + "'");
					while (rs.next()) {
						String i = rs.getString("Cprice");
						stmt.executeUpdate("UPDATE flight_info SET CheapNumber=CheapNumber-"+b+" where FlightNumber='"+a+"'");
						stmt.executeUpdate("UPDATE take_info SET FlightNumber='"
										+ a
										+ "',SeatNumber="
										+ b
										+ ",FlightType='"+c+"',price="
										+ b + "*" + i + " WHERE id LIKE '%*'");
					}
				} else {
					rs = stmt
							.executeQuery("select * from flight_info where FlightNumber='"
									+ a + "'");
					while (rs.next()) {
						String j = rs.getString("Bprice");
						stmt.executeUpdate("UPDATE flight_info SET BusyNumber=BusyNumber-"+b+" where FlightNumber='"+a+"'");
						stmt.executeUpdate("UPDATE take_info SET FlightNumber='"
										+ a
										+ "',SeatNumber="
										+ b
										+ ",FlightType='"+c+"',price="
										+ b + "*" + j + " WHERE id LIKE '%*'");
					}
				}
			}
		}
		}
			}
		}
		else {
			jOptionPane1.showMessageDialog(null, "��ǩ���ɹ��������ڸú���š�");
		}
		
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Upd_OF().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JOptionPane jOptionPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}