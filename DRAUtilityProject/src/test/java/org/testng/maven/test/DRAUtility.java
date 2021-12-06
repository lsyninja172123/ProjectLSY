package org.testng.maven.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;


@SuppressWarnings({ "serial", "unused" })
public class DRAUtility extends JPanel{

	private static String companyFile, leadsFile;
	private static JLabel domesticHealthError;
	private static File inputImageFile;

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		//g.drawLine(300, 0, 300, 400);
		Font font = new Font("Calibri", Font.BOLD, 19);
		g.setFont(font);
		g.drawString("Contact Bulk Uploader", 155, 35);
	}

	public static String getPropertyValue(String key) throws IOException {

		String value = "";
		try {
			InputStream fileInputStream = Files.newInputStream(Paths.get("email.properties"));
			Properties property = new Properties();
			property.load(fileInputStream);
			value = property.getProperty(key);
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void main(String[] args) throws Exception {

		JFrame frame = new JFrame("Bulk Uploader_V002");
		String setProperty = System.getProperty("user.dir");
		//inputImageFile = new File(setProperty + "\\Resources\\".concat("frameLogo.jpg"));
		//ImageIcon img = new ImageIcon(inputImageFile.toString());
		DRAUtility panel = new DRAUtility();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		//frame.setIconImage(img.getImage());
		frame.setLayout(null);
		frame.setContentPane(panel);
		createDomesticHealthPanel(panel);
		//createStaticIPPanel(panel);
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static JPanel createDomesticHealthPanel(DRAUtility panel) throws Exception {

		String setProperty = System.getProperty("user.dir");
		//File dbimagepath = new File(setProperty + "\\Resources\\".concat("databaseImage.png"));
		//System.out.println("Welcome " + dbimagepath.getPath());
		//JLabel dbImage = new JLabel(new ImageIcon(dbimagepath.toString()));
		//dbImage.setBounds(250, 13, 30, 30);
		//panel.add(dbImage);
		domesticHealthError = new JLabel("");
		domesticHealthError.setBounds(50, 70, 250, 15);
		domesticHealthError.setForeground(Color.RED);
		panel.add(domesticHealthError);
		addLeadsDetailFile(panel);
		addcompanyLocationFile(panel);
		addAkshayaRunButton(panel);
		addCasaGrandeRunButton(panel);
		addRadianceRunButton(panel);
		addAllianceRunButton(panel);
		addShriramRunButton(panel);
		addUrbanTreeRunButton(panel);
		addTVSEmeraldRunButton(panel);
		addBharathiHomesRunButton(panel);
		return panel;
	}

	private static void addcompanyLocationFile(JPanel panel) {

		JLabel label = new JLabel("Login Details");
		panel.add(label);
		label.setBounds(87, 80, 250, 15);
		JButton c = new JButton("Upload");
		c.setBounds(87, 100, 80, 30);
		c.setToolTipText("Login Details File");
		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				showError(domesticHealthError, "");
				File temp = chooseFile();
				if (temp != null && temp.isFile() && temp.exists()) {
					companyFile = temp.getAbsolutePath();
				} else {
					showError(domesticHealthError, "Login details file not uploaded");
				}
			}
		});
		panel.add(c);
	}

	private static void addLeadsDetailFile(JPanel panel) {

		JLabel label = new JLabel("Contact Details");
		panel.add(label);
		label.setBounds(316, 80, 250, 15);
		JButton b = new JButton("Upload");
		b.setBounds(316, 100, 80, 30);
		b.setToolTipText("Contact Details File");
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				showError(domesticHealthError, "");
				File temp = chooseFile();
				if (temp != null && temp.isFile() && temp.exists()) {
					leadsFile = temp.getAbsolutePath();
				} else {
					showError(domesticHealthError, "Contact details file not uploaded");
				}
			}
		});
		panel.add(b);
	}

	private static void addAkshayaRunButton(JPanel panel) {

		JButton c = new JButton("Akshaya");
		c.setBounds(40, 225, 80, 25);
		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					if (companyFile != null && leadsFile != null) {
						DRA_Akshaya.akshayaTest(companyFile, leadsFile);
					} else {
						showError(domesticHealthError, "Please select required companyDetails and leadsDetail excel files");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(c);
	}
	
	private static void addCasaGrandeRunButton(JPanel panel) {

		JButton c = new JButton("CasaGrande");
		c.setBounds(150, 225, 80, 25);
		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					if (companyFile != null && leadsFile != null) {
						DRA_CasaGrande.casaGrandeTest(companyFile, leadsFile);
					} else {
						showError(domesticHealthError, "Please select required companyDetails and leadsDetail excel files");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(c);
	}
	
	private static void addRadianceRunButton(JPanel panel) {

		JButton c = new JButton("Radiance");
		c.setBounds(260, 225, 80, 25);
		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					if (companyFile != null && leadsFile != null) {
						DRA_Radiance.radianceTest(companyFile, leadsFile);
					} else {
						showError(domesticHealthError, "Please select required companyDetails and leadsDetails excel files");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(c);
	}
	
	private static void addAllianceRunButton(JPanel panel) {

		JButton c = new JButton("Alliance");
		c.setBounds(370, 225, 80, 25);
		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					if (companyFile != null && leadsFile != null) {
						DRA_Alliance.allianceTest(companyFile, leadsFile);
					} else {
						showError(domesticHealthError, "Please select required companyDetails and leadsDetail excel files");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(c);
	}
	
	private static void addShriramRunButton(JPanel panel) {

		JButton c = new JButton("Shriram");
		c.setBounds(40, 275, 80, 25);
		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					if (companyFile != null && leadsFile != null) {
						DRA_Shriram.shriramTest(companyFile, leadsFile);
					} else {
						showError(domesticHealthError, "Please select required companyDetails and leadsDetail excel files");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(c);
	}
	
	private static void addUrbanTreeRunButton(JPanel panel) {

		JButton c = new JButton("Urban Tree");
		c.setBounds(150, 275, 80, 25);
		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					if (companyFile != null && leadsFile != null) {
						DRA_UrbanTree.urbanTreeTest(companyFile, leadsFile);
					} else {
						showError(domesticHealthError, "Please select required companyDetails and leadsDetail excel files");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(c);
	}
	
	private static void addTVSEmeraldRunButton(JPanel panel) {

		JButton c = new JButton("TvsEmerald");
		c.setBounds(260, 275, 80, 25);
		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					if (companyFile != null && leadsFile != null) {
						DRA_TVSEmerald.tvsEmeraldTest(companyFile, leadsFile);
					} else {
						showError(domesticHealthError, "Please select required companyDetails and leadsDetail excel files");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(c);
	}
	
	private static void addBharathiHomesRunButton(JPanel panel) {

		JButton c = new JButton("BharathiHomes");
		c.setBounds(370, 275, 80, 25);
		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {
					if (companyFile != null && leadsFile != null) {
						DRA_BharathiHomesNew.bharathiHomesTest(companyFile, leadsFile);
					} else {
						showError(domesticHealthError, "Please select required companyDetails and leadsDetail excel files");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(c);
	}

	private static void showError(JLabel label, String string) {

		label.setText(string);
	}

	private static File chooseFolder() {

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setCurrentDirectory(new java.io.File(""));
		jfc.setAcceptAllFileFilterUsed(false);
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			return selectedFile;
		}
		return null;
	}

	private static File chooseFile() {

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			return selectedFile;
		}
		return null;
	}
}
