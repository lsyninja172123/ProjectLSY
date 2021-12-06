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


@SuppressWarnings("serial")
public class DomesticUtility extends JPanel{

	private static String companyFile, leadsFile;

	private static JLabel domesticHealthError;

	private static File inputImageFile;

	@Override

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawLine(300, 0, 300, 400);

		Font font = new Font("Calibri", Font.BOLD, 19);

		g.setFont(font);

		g.drawString("Domestic Reality Health Check", 30, 35);

		//g.drawString("Static IP Lookup", 380, 35);

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

		JFrame frame = new JFrame("Domestic Reality Accelarator (DRA)");

		String setProperty = System.getProperty("user.dir");

		//inputImageFile = new File(setProperty + "\\Resources\\".concat("frameLogo.jpg"));

		//ImageIcon img = new ImageIcon(inputImageFile.toString());

		DomesticUtility panel = new DomesticUtility();

		panel.setLayout(null);

		panel.setBackground(Color.WHITE);

		//frame.setIconImage(img.getImage());

		frame.setLayout(null);

		frame.setContentPane(panel);

		createDomesticHealthPanel(panel);

		//createStaticIPPanel(panel);

		frame.setSize(600, 400);

		frame.setVisible(true);

		frame.setResizable(false);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/*private static JPanel createStaticIPPanel(DomesticUtility panel) throws Exception {

		String setProperty = System.getProperty("user.dir");

		inputImageFile = new File(setProperty + "\\Resource\\".concat("lensImage.png"));

		JLabel lensImage = new JLabel(new ImageIcon(inputImageFile.toString()));

		lensImage.setBounds(510, 21, 20, 20);

		panel.add(lensImage);

		staticIPError = new JLabel("");

		staticIPError.setForeground(Color.RED);

		staticIPError.setBounds(330, 70, 250, 15);

		panel.add(staticIPError);

		addStaticIPFileButton(panel);

		addStaticIPRunButton(panel);

		return panel;

	}

	private static void addStaticIPFileButton(JPanel panel) {

		JLabel staticIPHeading = new JLabel("Configuration File Details");

		panel.add(staticIPHeading);

		staticIPHeading.setBounds(368, 100, 290, 15);

		JButton c = new JButton("Browse");

		c.setBounds(397, 120, 80, 30);

		c.setToolTipText("Select The Folder Path Containing Configuration Files");

		c.addActionListener(new ActionListener()

		{

			public void actionPerformed(ActionEvent e) {

				showError(staticIPError, "");

				File temp = chooseFolder();

				if (temp != null && temp.exists()) {

					staticIPFile = temp.getAbsolutePath();

				} else {

					showError(staticIPError, "Configuration folder path is not valid");

				}

			}

		});

		panel.add(c);

	}

	private static void addStaticIPRunButton(JPanel panel) throws Exception {

		String setProperty = System.getProperty("user.dir");

		inputImageFile = new File(setProperty + "\\Resource\\".concat("cognizantLogo.jpg"));

		JLabel cognizantLogo = new JLabel(new ImageIcon(inputImageFile.toString()));

		cognizantLogo.setBounds(0, 295, 600, 98);

		panel.add(cognizantLogo);

		inputImageFile = new File(setProperty + "\\Resource\\".concat("fileImage.png"));

		JLabel cognizantLogo1 = new JLabel(new ImageIcon(inputImageFile.toString()));

		cognizantLogo1.setBounds(390, 165, 100, 105);

		panel.add(cognizantLogo1);

		JButton c = new JButton("Submit");

		c.setBounds(400, 275, 80, 30);

		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					if (staticIPFile != null) {

						StaticIPLookup.staticIP(staticIPFile);

					} else {

						showError(staticIPError, "Please select configuration folder path");

					}

				} catch (Exception e1) {

					e1.printStackTrace();

				}

			}

		});

		panel.add(c);

	}*/

	private static JPanel createDomesticHealthPanel(DomesticUtility panel) throws Exception {

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

		addRunButton(panel);

		return panel;

	}

	private static void addcompanyLocationFile(JPanel panel) {

		JLabel label = new JLabel("Company Websites Location Details");

		panel.add(label);

		label.setBounds(72, 100, 250, 15);

		JButton c = new JButton("Upload");

		c.setBounds(100, 120, 80, 30);

		c.setToolTipText("Select Company Website Excel File");

		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				showError(domesticHealthError, "");

				File temp = chooseFile();

				if (temp != null && temp.isFile() && temp.exists()) {

					companyFile = temp.getAbsolutePath();

				} else {

					showError(domesticHealthError, "Company Website Location file is not valid");

				}

			}

		});

		panel.add(c);

	}

	private static void addLeadsDetailFile(JPanel panel) {

		JLabel label = new JLabel("Leads Details");

		panel.add(label);

		label.setBounds(65, 180, 250, 15);

		JButton b = new JButton("Upload");

		b.setBounds(100, 200, 80, 30);

		b.setToolTipText("Select The Excel File Containing Lead Details");

		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				showError(domesticHealthError, "");

				File temp = chooseFile();

				if (temp != null && temp.isFile() && temp.exists()) {

					leadsFile = temp.getAbsolutePath();

				} else {

					showError(domesticHealthError, "Leads Detail file is not valid");

				}

			}

		});

		panel.add(b);

	}

	private static void addRunButton(JPanel panel) {

		JButton c = new JButton("Submit");

		c.setBounds(100, 275, 80, 30);

		c.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					if (companyFile != null && leadsFile != null) {

						DRA_Akshaya.akshayaTest(companyFile, leadsFile);

					} else {

						showError(domesticHealthError, "Please select required MS excel files");

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
