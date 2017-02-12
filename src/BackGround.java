import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.TableModel;

/*
 * BackGround2.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class BackGround extends javax.swing.JFrame {

	/** Creates new form BackGround2 */
	public BackGround() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jOptionPane1 = new javax.swing.JOptionPane();
		jOptionPane2 = new javax.swing.JOptionPane();
		jOptionPane3 = new javax.swing.JOptionPane();
		panel1 = new java.awt.Panel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel17 = new javax.swing.JLabel();
		jTextField13 = new javax.swing.JTextField();
		jTextField14 = new javax.swing.JTextField();
		jLabel16 = new javax.swing.JLabel();
		jButton11 = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		panel3 = new java.awt.Panel();
		jButton7 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jTextField6 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField1 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jLabel18 = new javax.swing.JLabel();
		jTextField12 = new javax.swing.JTextField();
		jLabel19 = new javax.swing.JLabel();
		jTextField15 = new javax.swing.JTextField();
		jLabel20 = new javax.swing.JLabel();
		jTextField16 = new javax.swing.JTextField();
		panel2 = new java.awt.Panel();
		jLabel9 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jButton8 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		panel4 = new java.awt.Panel();
		jLabel21 = new javax.swing.JLabel();
		jButton21 = new javax.swing.JButton();
		jScrollPane21 = new javax.swing.JScrollPane();
		jTable21 = new javax.swing.JTable();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTable1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
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
								null } }, new String[] { "º½°àºÅ", "Æð·ÉµØ", "Ä¿µÄµØ",
						"Æð·ÉÊ±¼ä", "µ½´ïÊ±¼ä", "¾­¼Ã²Õ×ùÎ»Êý", "¾­¼Ã²Õ¼Û¸ñ", "ÉÌÎñ²Õ×ùÎ»Êý", "ÉÌÎñ²Õ¼Û¸ñ",
						"º½°à¶¯Ì¬" }));
	
		jScrollPane1.setViewportView(jTable1);

		jLabel17.setText("\u76ee\u7684\u5730\uff1a");

		jLabel16.setText("\u8d77\u98de\u5730\uff1a");

		jButton11.setText("\u5f00\u59cb\u67e5\u8be2");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton11ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel15.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 24));
		jLabel15.setText("\u822a\u73ed\u67e5\u8be2");

		jLabel10.setText("\u51fa\u53d1\u65e5\u671f\uff1a");

	

		jLabel11.setText("\u65e5\u671f\u683c\u5f0f\uff1a\u5e74/\u6708/\u65e5");

		jButton1.setText("\u4fee\u6539\u822a\u73ed\u52a8\u6001");
		jButton1.setActionCommand("jButton1");
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

		javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(
				panel1);
		panel1.setLayout(panel1Layout);
		panel1Layout
				.setHorizontalGroup(panel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 926,
								Short.MAX_VALUE)
						.addGroup(
								panel1Layout
										.createSequentialGroup()
										.addGroup(
												panel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																panel1Layout
																		.createSequentialGroup()
																		.addGap(
																				29,
																				29,
																				29)
																		.addComponent(
																				jLabel15))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																panel1Layout
																		.createSequentialGroup()
																		.addGap(
																				189,
																				189,
																				189)
																		.addComponent(
																				jLabel16)
																		.addGap(
																				12,
																				12,
																				12)
																		.addGroup(
																				panel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton11)
																						.addGroup(
																								panel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jTextField13,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												101,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												55,
																												55,
																												55)
																										.addComponent(
																												jLabel17)))))
										.addGap(12, 12, 12)
										.addGroup(
												panel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																panel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jTextField14,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				95,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				53,
																				53,
																				53)
																		.addComponent(
																				jLabel10))
														.addComponent(jButton1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jTextField8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																122,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel11))
										.addGap(72, 72, 72)));
		panel1Layout
				.setVerticalGroup(panel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								panel1Layout
										.createSequentialGroup()
										.addGap(95, 95, 95)
										.addComponent(jLabel15)
										.addGap(18, 18, 18)
										.addGroup(
												panel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel10)
														.addComponent(jLabel17)
														.addComponent(
																jTextField14,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField13,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel16))
										.addGap(16, 16, 16)
										.addGroup(
												panel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel11)
														.addComponent(jButton11)
														.addComponent(jButton1))
										.addGap(28, 28, 28)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												414,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

		jButton7.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton7.setText("\u8fd4\u56de");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton6.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton6.setText("\u91cd\u7f6e");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton5.setText("\u786e\u5b9a");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton5ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jTextField6.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));

		jTextField5.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));

		jTextField4.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));
		

		jTextField3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));

		jTextField2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));

		jTextField1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));

		jLabel7.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel7.setText("\u7ecf\u6d4e\u8231\u5ea7\u4f4d\u6570\uff1a");

		jLabel6.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel6.setText("\u5230\u8fbe\u65f6\u95f4\uff1a");

		jLabel5.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel5.setText("\u8d77\u98de\u65f6\u95f4\uff1a");

		jLabel4.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel4.setText("\u76ee\u7684\u5730\uff1a");

		jLabel3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel3.setText("\u8d77\u98de\u5730\uff1a");

		jLabel2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel2.setText("\u822a\u73ed\u53f7\uff1a");

		jLabel1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 24));
		jLabel1.setText("\u521b\u5efa\u822a\u73ed");

		jLabel14.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel14.setText("\u7ecf\u6d4e\u8231\u4ef7\u683c\uff1a");

		jTextField9.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));

		jLabel18.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel18.setText("\u5546\u52a1\u8231\u5ea7\u4f4d\u6570\uff1a");

		jTextField12.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));

		jLabel19.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel19.setText("\u5546\u52a1\u8231\u4ef7\u683c\uff1a");

		jTextField15.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));

		jLabel20.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel20.setText("\u51fa\u53d1\u65e5\u671f\uff1a");

		jTextField16.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));

		javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(
				panel3);
		panel3.setLayout(panel3Layout);
		panel3Layout
				.setHorizontalGroup(panel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panel3Layout
										.createSequentialGroup()
										.addGap(199, 199, 199)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																panel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton5)
																		.addGap(
																				48,
																				48,
																				48)
																		.addComponent(
																				jButton6)
																		.addGap(
																				47,
																				47,
																				47)
																		.addComponent(
																				jButton7))
														.addGroup(
																panel3Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				panel3Layout
																						.createSequentialGroup()
																						.addGroup(
																								panel3Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jLabel2)
																										.addComponent(
																												jLabel5)
																										.addComponent(
																												jLabel6)
																										.addComponent(
																												jLabel7)
																										.addComponent(
																												jLabel14)
																										.addComponent(
																												jLabel18)
																										.addComponent(
																												jLabel19)
																										.addComponent(
																												jLabel20)
																										.addComponent(
																												jLabel4)
																										.addComponent(
																												jLabel3))
																						.addGap(
																								26,
																								26,
																								26)
																						.addGroup(
																								panel3Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addComponent(
																												jTextField16)
																										.addComponent(
																												jTextField15)
																										.addComponent(
																												jTextField12)
																										.addComponent(
																												jTextField9)
																										.addComponent(
																												jTextField6)
																										.addComponent(
																												jTextField5)
																										.addComponent(
																												jTextField4)
																										.addComponent(
																												jTextField3)
																										.addComponent(
																												jTextField2,
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jTextField1,
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												142,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				panel3Layout
																						.createSequentialGroup()
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																								81,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel1)
																						.addGap(
																								125,
																								125,
																								125))))
										.addContainerGap(425, Short.MAX_VALUE)));
		panel3Layout
				.setVerticalGroup(panel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panel3Layout
										.createSequentialGroup()
										.addGap(25, 25, 25)
										.addComponent(jLabel1)
										.addGap(35, 35, 35)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																panel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				11,
																				11,
																				11))
														.addGroup(
																panel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jTextField6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel14)
														.addComponent(
																jTextField9,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel18)
														.addComponent(
																jTextField12,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel19)
														.addComponent(
																jTextField15,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel20)
														.addComponent(
																jTextField16,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(76, 76, 76)
										.addGroup(
												panel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton5)
														.addComponent(jButton6)
														.addComponent(jButton7))
										.addContainerGap(115, Short.MAX_VALUE)));

		jLabel9.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel9
				.setText("\u9700\u8981\u53d6\u6d88\u7684\u822a\u73ed\u53f7\uff1a");

		jTextField7.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));

		jButton8.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton8.setText("\u786e\u5b9a");
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

		jButton10.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton10.setText("\u8fd4\u56de");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(
				panel2);
		panel2.setLayout(panel2Layout);
		panel2Layout.setHorizontalGroup(panel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				panel2Layout.createSequentialGroup().addGap(296, 296, 296)
						.addComponent(jButton8).addGap(129, 129, 129)
						.addComponent(jButton10).addContainerGap(363,
								Short.MAX_VALUE)).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				panel2Layout.createSequentialGroup().addContainerGap(295,
						Short.MAX_VALUE).addComponent(jLabel9).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jTextField7,
								javax.swing.GroupLayout.PREFERRED_SIZE, 279,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								185, 185, 185)));
		panel2Layout
				.setVerticalGroup(panel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								panel2Layout
										.createSequentialGroup()
										.addContainerGap(257, Short.MAX_VALUE)
										.addGroup(
												panel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel9))
										.addGap(82, 82, 82)
										.addGroup(
												panel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton8)
														.addComponent(jButton10))
										.addGap(250, 250, 250)));

		jButton13.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jButton13.setText("\u67e5\u8be2\u822a\u73ed");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton14.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jButton14.setText("\u521b\u5efa\u822a\u73ed");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});

		jButton15.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jButton15.setText("\u53d6\u6d88\u822a\u73ed");
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});

		jButton16.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jButton16.setText("\u4fee\u6539\u822a\u73ed");
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});

		jButton17.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jButton17.setText("\u9000\u51fa");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 14));
		jButton2.setText("\u8ba2\u5355\u5904\u7406");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel21.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 24));
		jLabel21.setText("\u8ba2\u5355\u67e5\u8be2");

		jButton21.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		jButton21.setText("\u5f00\u59cb\u67e5\u8be2");
		jButton21.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton21ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jTable21.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jTable21.setModel(new javax.swing.table.DefaultTableModel(
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
				new String[] { "ÂÃ¿ÍÐÕÃû", "È¡Æ±Ê±¼ä", "º½°àºÅ", "×ùÎ»Êý", "º½°àÀàÐÍ", "¶©µ¥ºÅ",
						"×´Ì¬", "Ðè¸¶¼Û¸ñ" }));
		jScrollPane21.setViewportView(jTable21);

		jButton3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		jButton3.setText("\u5220\u9664\u8ba2\u5355");
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

		jButton4.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 16));
		jButton4.setText("\u6539\u7b7e\u5904\u7406");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton4ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(
				panel4);
		panel4.setLayout(panel4Layout);
		panel4Layout
				.setHorizontalGroup(panel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panel4Layout.createSequentialGroup().addGap(31,
										31, 31).addComponent(jLabel21).addGap(
										40, 40, 40).addComponent(jButton21)
										.addContainerGap(484, Short.MAX_VALUE))
						.addComponent(jScrollPane21,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 748,
								Short.MAX_VALUE)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								panel4Layout
										.createSequentialGroup()
										.addContainerGap(514, Short.MAX_VALUE)
										.addGroup(
												panel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton3)
														.addComponent(jButton4))
										.addGap(137, 137, 137)));
		panel4Layout
				.setVerticalGroup(panel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								panel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												panel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel21)
														.addComponent(jButton21))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												35, Short.MAX_VALUE)
										.addComponent(jButton4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton3)
										.addGap(30, 30, 30)
										.addComponent(
												jScrollPane21,
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
														.addComponent(jButton16)
														.addComponent(jButton15)
														.addComponent(jButton14)
														.addComponent(jButton13)
														.addComponent(jButton2)
														.addComponent(jButton17))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																panel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																panel3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																panel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)))
						.addGroup(
								layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												layout
														.createSequentialGroup()
														.addGap(0, 0,
																Short.MAX_VALUE)
														.addComponent(
																panel4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0,
																Short.MAX_VALUE))));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(panel2,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap(
										192, Short.MAX_VALUE).addComponent(
										jButton2).addGap(18, 18, 18)
										.addComponent(jButton13).addGap(18, 18,
												18).addComponent(jButton14)
										.addGap(18, 18, 18).addComponent(
												jButton15).addGap(18, 18, 18)
										.addComponent(jButton16).addGap(18, 18,
												18).addComponent(jButton17)
										.addGap(208, 208, 208))
						.addComponent(panel3,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(panel1,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 652,
								Short.MAX_VALUE)
						.addGroup(
								layout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												layout
														.createSequentialGroup()
														.addGap(0, 0,
																Short.MAX_VALUE)
														.addComponent(
																panel4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 0,
																Short.MAX_VALUE))));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		if (jTable21.getSelectedRow() != -1) {
			String a = (jTable21.getModel().getValueAt(jTable21
					.getSelectedRow(), 5)).toString();
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:flight",
					"123", "123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from take_info where OrderForm="
							+ a + "");
			if (rs.next()) {
				stmt
						.executeUpdate("UPDATE take_info SET id=id+'*' where OrderForm="
								+ a + "");
				Upd_OF k = new Upd_OF();
				k.setVisible(true);

			}

		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {

		if (jTable21.getSelectedRow() != -1) {
			String a = (jTable21.getModel().getValueAt(jTable21
					.getSelectedRow(), 5)).toString();
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:flight",
					"123", "123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from take_info where OrderForm="
							+ a + "");
			if (rs.next()) {
				jOptionPane1.showMessageDialog(null, "É¾³ý³É¹¦£¡");
				stmt.executeUpdate("delete from take_info where OrderForm=" + a
						+ "");
			}
		} else {
			jOptionPane1.showMessageDialog(null, "É¾³ý²»³É¹¦£¡ÇëÑ¡ÔñÐèÒªÉ¾³ýµÄ¶©µ¥¡£");
		}

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		if (jTable1.getSelectedRow() != -1) {
			String a = (jTable1.getModel().getValueAt(jTable1.getSelectedRow(),
					0)).toString();
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection("jdbc:odbc:flight",
					"123", "123");
			Statement stmt = conn.createStatement();
			stmt
					.executeUpdate("UPDATE flight_info SET FlightC=FlightC + '*' WHERE FlightNumber='"
							+ a + "'");
			Upd_FM k = new Upd_FM();
			k.setVisible(true);
		} else {
			jOptionPane1.showMessageDialog(null, "ÐÞ¸Ä²»³É¹¦£¡ÇëÑ¡Ôñº½°à¡£");
		}

	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		panel1.setVisible(false);
		panel2.setVisible(false);
		panel3.setVisible(false);
		panel4.setVisible(true);
	}

	private void jButton21ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("Select * from take_info");
		String[][] str;

		str = new String[100][100];
		int row = 0;

		while (rs.next()) {
			row++;
			for (int j = 1; j <= 8; j++) {
				str[row][j] = rs.getString(j);
			}

			TableModel model = this.jTable21.getModel();
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

			this.jTable21.setModel(model);

		}

	}

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
		Upd_flight e = new Upd_flight();
		e.setVisible(true);
	}

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {

		panel2.setVisible(true);
		panel1.setVisible(false);
		panel3.setVisible(false);
		panel4.setVisible(false);
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();

		String a = jTextField1.getText();
		String b = jTextField2.getText();
		String c = jTextField3.getText();
		String e = jTextField4.getText();
		String f = jTextField5.getText();
		String g = jTextField6.getText();
		String h = jTextField9.getText();
		String i = jTextField12.getText();
		String j = jTextField15.getText();
		String l = jTextField16.getText();

		if (a.equals("") || b.equals("") || c.equals("") || e.equals("")
				|| f.equals("") || g.equals("") || h.equals("") || i.equals("")
				|| j.equals("") || l.equals("")) {
			jOptionPane1.showMessageDialog(null, "ÊäÈëÎª¿Õ£¡", "´íÎó",
					jOptionPane1.ERROR_MESSAGE);
			return;
		}
		ResultSet rs = stmt
				.executeQuery("select * from flight_info where FlightNumber='"
						+ a + "'");
		if (rs.next()) {
			if (a.equals(rs.getString("FlightNumber"))) {
				jOptionPane2.showMessageDialog(null, "´´½¨²»³É¹¦£¡ÒÑ´æÔÚµÄº½°à£¬ÇëÎðÖØ¸´´´½¨¡£");

			}

		} else {
			jOptionPane2.showMessageDialog(null, "´´½¨³É¹¦£¡");
			stmt.executeUpdate("INSERT INTO flight_info VALUES('" + a + "' ,'"
					+ b + "','" + c + "' ,'" + e + "','" + f + "'," + g + " ,'"
					+ h + "'," + i + " ,'" + j + "',' ','" + l + "','ÄÏº½º½¿Õ')");
		}

		stmt.close();
		con.close();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextField1.setText("");
		jTextField2.setText("");
		jTextField3.setText("");
		jTextField4.setText("");
		jTextField5.setText("");
		jTextField6.setText("");
		jTextField9.setText("");
		jTextField12.setText("");
		jTextField15.setText("");
		jTextField16.setText("");
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		panel3.setVisible(false);
		panel1.setVisible(true);
		panel2.setVisible(false);
		panel3.setVisible(false);

	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();

		String x = jTextField13.getText();
		String y = jTextField14.getText();

		ResultSet rs = stmt
				.executeQuery("Select * from flight_info where TakeoffPlace='"
						+ x + "' and destination='" + y + "'");

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

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		panel2.setVisible(false);
		panel1.setVisible(true);

	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:flight", "123",
				"123");
		Statement stmt = con.createStatement();
		String a = jTextField7.getText();

		if (a.equals("")) {
			jOptionPane1.showMessageDialog(null, "ÊäÈëÎª¿Õ£¡", "´íÎó",
					jOptionPane1.ERROR_MESSAGE);
			return;
		}

		ResultSet rs = stmt
				.executeQuery("Select * from flight_info where FlightNumber='"
						+ a + "'");
		if (rs.next()) {
			if (a.equals(rs.getString("FlightNumber"))) {

				jOptionPane3.showMessageDialog(null, "È¡Ïû³É¹¦£¡");
				stmt
						.executeUpdate("DELETE FROM flight_info WHERE FlightNumber='"
								+ a + "'");
			}

		}

		else {
			jOptionPane3.showMessageDialog(null, "È¡Ïû²»³É¹¦£¡²»´æÔÚ¸Ãº½°à¡£");
		}

		stmt.close();
		con.close();
	}

	// </editor-fold>

	private void jButton1utton17ActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		panel4.setVisible(false);
		panel2.setVisible(false);
		panel1.setVisible(false);
		panel3.setVisible(true);
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {

		panel2.setVisible(false);
		panel1.setVisible(true);
		panel3.setVisible(false);
		panel4.setVisible(false);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BackGround().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton21;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JOptionPane jOptionPane1;
	private javax.swing.JOptionPane jOptionPane2;
	private javax.swing.JOptionPane jOptionPane3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane21;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable21;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField13;
	private javax.swing.JTextField jTextField14;
	private javax.swing.JTextField jTextField15;
	private javax.swing.JTextField jTextField16;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	private java.awt.Panel panel1;
	private java.awt.Panel panel2;
	private java.awt.Panel panel3;
	private java.awt.Panel panel4;
	// End of variables declaration//GEN-END:variables

}