import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Upd_FM.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class Upd_FM extends javax.swing.JFrame {

	/** Creates new form Upd_FM */
	public Upd_FM() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jOptionPane1 = new javax.swing.JOptionPane();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

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

		jLabel1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		jLabel1
				.setText("\u9700\u4fee\u6539\u7684\u822a\u73ed\u52a8\u6001\u5185\u5bb9\uff1a");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jButton1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
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

		jButton2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
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
										.addGap(54, 54, 54)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				35,
																				35,
																				35)
																		.addComponent(
																				jButton1)
																		.addGap(
																				41,
																				41,
																				41)
																		.addComponent(
																				jButton2))
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																242,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(78, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(93, 93, 93).addGroup(
						layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1)).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72,
						Short.MAX_VALUE).addGroup(
						layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton2).addComponent(jButton1))
						.addGap(42, 42, 42)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void formWindowClosing(java.awt.event.WindowEvent evt) throws Exception{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");

		Statement stmt = con.createStatement();
		stmt.executeUpdate("UPDATE flight_info SET FlightC='ÄÏº½º½¿Õ' ");
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();

		String b = jTextArea1.getText();
		ResultSet rs = stmt
				.executeQuery("select * from flight_info where FlightC LIKE '%*'");
		if (rs.next()) {
			String c = rs.getString("FlightNumber");

			jOptionPane1.showMessageDialog(null, "ÐÞ¸Ä³É¹¦£¡");
			stmt.executeQuery("UPDATE flight_info SET FlightMove='" + b
					+ "' WHERE FlightNumber='" + c + "'");

		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");

		Statement stmt = con.createStatement();
		stmt.executeUpdate("UPDATE flight_info SET FlightC='ÄÏº½º½¿Õ' ");
		dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Upd_FM().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JOptionPane jOptionPane1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}