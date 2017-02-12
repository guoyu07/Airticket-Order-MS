import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.TableModel;

/*
 * User1.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class User extends javax.swing.JFrame {

	public User() {
		initComponents();

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jOptionPane1 = new javax.swing.JOptionPane();
		panel1 = new java.awt.Panel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton6 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jButton7 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		panel2 = new java.awt.Panel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jButton8 = new javax.swing.JButton();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();

	

		

		jTable1.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null },
						{ null, null, null, null, null, null, null, null, null,
								null } }, new String[] { "航班号", "起飞地", "目的地",
						"起飞时间", "到达时间", "经济舱座位数", "经济舱票价", "商务舱座位数", "商务舱票价",
						"航班动态" }));
		jScrollPane1.setViewportView(jTable1);

		jButton6.setText("\u5f00\u59cb\u67e5\u8be2");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton6ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel3.setText("\u76ee\u7684\u5730\uff1a");

		jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel9.setText("\u822a\u73ed\u67e5\u8be2");

		jLabel1.setText("\u8d77\u98de\u5730\uff1a");

		jLabel2.setText("\u51fa\u53d1\u65e5\u671f\uff1a");

		jLabel4.setText("\u65e5\u671f\u683c\u5f0f\uff1a\u5e74/\u6708/\u65e5");

		jButton7.setText("\u9884\u8ba2");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton7ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(
				panel1);
		panel1.setLayout(panel1Layout);
		panel1Layout
				.setHorizontalGroup(panel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panel1Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(
												panel1Layout
														.createSequentialGroup()
														.addComponent(jLabel1)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(
																panel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				83,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton6))
														.addGap(42, 42, 42)
														.addGroup(
																panel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				panel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel3)
																						.addGap(
																								14,
																								14,
																								14)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								85,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGap(
																								35,
																								35,
																								35)
																						.addComponent(
																								jLabel2))
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				70,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(12, 12, 12)
														.addGroup(
																panel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jLabel4)
																		.addComponent(
																				jTextField3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				94,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												1060,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								panel1Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												panel1Layout
														.createSequentialGroup()
														.addGap(36, 36, 36)
														.addComponent(jLabel9)
														.addContainerGap(345,
																Short.MAX_VALUE))));
		panel1Layout
				.setVerticalGroup(panel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								panel1Layout
										.createSequentialGroup()
										.addContainerGap(121, Short.MAX_VALUE)
										.addGroup(
												panel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(jLabel3)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel4)
														.addGroup(
																panel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				27,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				27,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(33, 33, 33)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												255,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								panel1Layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												panel1Layout
														.createSequentialGroup()
														.addGap(4, 4, 4)
														.addComponent(jLabel9)
														.addContainerGap(295,
																Short.MAX_VALUE))));

		jButton1.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton1.setText("\u822a\u73ed\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton2.setText("\u8ba2\u5355\u67e5\u8be2");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton3.setText("\u8ba2\u7968");
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

		jButton4.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton4.setText("\u9000\u7968");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton5.setText("\u9000\u51fa");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

	

		jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 24));
		jLabel7.setText("\u8ba2\u5355\u67e5\u8be2");

		jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel8.setText("\u8ba2\u5355\u53f7\uff1a");

		jTextField5.setFont(new java.awt.Font("微软雅黑", 0, 18));

		jButton8.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton8.setText("\u5f00\u59cb\u67e5\u8be2");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton8ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jTable3.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null } },
				new String[] { "旅客姓名", "取票时间", "航班号", "座位数", "航班类型", "订单号",
						"状态", "需付价格" }));
		jScrollPane3.setViewportView(jTable3);

		jButton9.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton9.setText("\u7f51\u4e0a\u94f6\u884c\u652f\u4ed8");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton9ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton10.setFont(new java.awt.Font("微软雅黑", 0, 14));
		jButton10.setText("\u9000\u8ba2");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton10ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel5
				.setText("\uff08*\u5982\u9700\u6539\u7b7e\uff0c\u8bf7\u5e26\u9f50\u8bc1\u4ef6\u5230\u552e\u7968\u7a97\u53e3\u529e\u7406\u3002\uff09");

		javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(
				panel2);
		panel2.setLayout(panel2Layout);
		panel2Layout
				.setHorizontalGroup(panel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane3,
								javax.swing.GroupLayout.DEFAULT_SIZE, 1213,
								Short.MAX_VALUE)
						.addGroup(
								panel2Layout
										.createSequentialGroup()
										.addGap(31, 31, 31)
										.addGroup(
												panel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																panel2Layout
																		.createSequentialGroup()
																		.addGroup(
																				panel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel7)
																						.addGroup(
																								panel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel8)
																										.addGap(
																												18,
																												18,
																												18)
																										.addComponent(
																												jTextField5,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												112,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												54,
																												54,
																												54)
																										.addComponent(
																												jButton8)))
																		.addGap(
																				219,
																				219,
																				219))
														.addGroup(
																panel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton10)
																		.addGap(
																				18,
																				18,
																				18)))
										.addComponent(jButton9).addGap(48, 48,
												48).addComponent(jLabel5)));
		panel2Layout
				.setVerticalGroup(panel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel7)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel8)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton8))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												61, Short.MAX_VALUE)
										.addGroup(
												panel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton9)
														.addComponent(jButton10)
														.addComponent(jLabel5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												280,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

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
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton2)
														.addComponent(jButton3)
														.addComponent(jButton4)
														.addComponent(jButton5)
														.addComponent(jButton1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																panel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																1213,
																Short.MAX_VALUE)
														.addComponent(
																panel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(75, 75, 75).addComponent(
						jButton1).addGap(27, 27, 27).addComponent(jButton2)
						.addGap(24, 24, 24).addComponent(jButton3).addGap(27,
								27, 27).addComponent(jButton4).addGap(26, 26,
								26).addComponent(jButton5).addContainerGap(153,
								Short.MAX_VALUE)).addComponent(panel2,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();
		String a = jTextField5.getText();
		if (a.equals("")) {
			jOptionPane1.showMessageDialog(null, "操作不成功！");
		}
		ResultSet rs = stmt
				.executeQuery("select * from take_info where OrderForm=" + a
						+ "");
		if (rs.next()) {

			stmt
					.executeUpdate("UPDATE take_info SET id=id+'*' WHERE OrderForm="
							+ a + "");
			PM c = new PM();
			c.setVisible(true);
		}
		//else{
		//jOptionPane1.showMessageDialog(null, "操作不成功！");
		//}

	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		if (jTable3.getSelectedRow() != -1) {
			String p = (jTable3.getModel().getValueAt(jTable3.getSelectedRow(),
					5)).toString();
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:flight",
					"123", "123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from take_info where OrderForm="
							+ p + "");
			if (rs.next()) {

				jOptionPane1.showMessageDialog(null, "退订成功！");
				stmt.executeUpdate("delete from take_info where OrderForm=" + p
						+ "");
			}
		} else {
			jOptionPane1.showMessageDialog(null, "退订不成功！请选择订单。");

		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
		//		"123");
		//Statement stmt = con.createStatement();
		//ResultSet rs = stmt
		//		.executeQuery("select PassagerName from take_info where OrderForm>=ALL(select OrderForm from take_info);");
		//if (rs.next()) {
		//	String u = rs.getString("PassagerName");
			//stmt.executeUpdate("INSERT INTO take_info(PassagerName) VALUES('"
			//		+ u + "')");
		//}
		if (jTable1.getSelectedRow() != -1) {
			String a = (jTable1.getModel().getValueAt(jTable1.getSelectedRow(),
					0)).toString();
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
					"123");
			Statement stmt = con.createStatement();
			//rs = stmt
			//		.executeQuery("select * from flight_info where FlightNumber='"
			//				+ a + "'");
			//if (rs.next()) {

				stmt
						.executeUpdate("UPDATE take_info SET FlightNumber='"
								+ a
								+ "' WHERE OrderForm>=ALL(select OrderForm from take_info);");
				LoginOrder o = new LoginOrder();
				o.setVisible(true);
			//}
		} else {
			jOptionPane1.showMessageDialog(null, "预订不成功！请选择航班。");

		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();

		String x = jTextField1.getText();
		String y = jTextField2.getText();
		String k = jTextField3.getText();
		ResultSet rs = stmt
				.executeQuery("Select * from flight_info where TakeoffPlace='"
						+ x + "' and destination='" + y + "' and FlightTime='"
						+ k + "'");

		String[][] str;
		str = new String[100][100];
		int row = 0;
		while (rs.next()) {
			row++;
			for (int j = 1; j <= 10; j++) {
				str[row][j] = rs.getString(j);
			}
		}
		TableModel model = this.jTable1.getModel();
		for (int i = 0; i < row; i++) {
			model.setValueAt(str[i + 1][1], i, 0);
			model.setValueAt(str[i + 1][2], i, 1);
			model.setValueAt(str[i + 1][3], i, 2);
			model.setValueAt(str[i + 1][4], i, 3);
			model.setValueAt(str[i + 1][5], i, 4);
			model.setValueAt(str[i + 1][6], i, 5);
			model.setValueAt(str[i + 1][7], i, 6);
			model.setValueAt(str[i + 1][8], i, 7);
			model.setValueAt(str[i + 1][9], i, 8);
			model.setValueAt(str[i + 1][10], i, 9);
		}

		this.jTable1.setModel(model);

	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();
		String n = jTextField5.getText();

		if (n.equals("")) {
			jOptionPane1.showMessageDialog(null, "订单号为空，请重新输入！");
			return;
		}

		ResultSet rs = stmt
				.executeQuery("Select * from take_info where OrderForm=" + n
						+ "");

		String[][] str;

		str = new String[100][100];
		int row = 0;

		if (rs.next()) {
			row++;
			for (int j = 1; j <= 8; j++) {
				str[row][j] = rs.getString(j);
			}

			TableModel model = this.jTable3.getModel();
			for (int i = 0; i < row; i++) {
				model.setValueAt(str[i + 1][1], i, 0);
				model.setValueAt(str[i + 1][2], i, 1);
				model.setValueAt(str[i + 1][3], i, 2);
				model.setValueAt(str[i + 1][4], i, 3);
				model.setValueAt(str[i + 1][5], i, 4);
				model.setValueAt(str[i + 1][6], i, 5);
				model.setValueAt(str[i + 1][7], i, 6);
				model.setValueAt(str[i + 1][8], i, 7);
			}

			this.jTable3.setModel(model);

		} else {
			//this.jTable3.setVisible(false);
			jOptionPane1.showMessageDialog(null, "不存在该订单，请先添加订单！");
		}

	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		Out e = new Out();
		e.setVisible(true);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt
				.executeQuery("select PassagerName from take_info where OrderForm>=ALL(select OrderForm from take_info);");
		if (rs.next()) {
			String u = rs.getString("PassagerName");
			stmt.executeUpdate("INSERT INTO take_info(PassagerName) VALUES('"
					+ u + "')");
		}
		Order e = new Order();
		e.setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		panel1.setVisible(false);
		panel2.setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		panel1.setVisible(true);
		panel2.setVisible(false);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new User().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JOptionPane jOptionPane1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable3;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField5;
	private java.awt.Panel panel1;
	private java.awt.Panel panel2;
	// End of variables declaration//GEN-END:variables

}