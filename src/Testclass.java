import java.text.SimpleDateFormat;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.JPanel;
/**
 * This class contains the GUI logic for the program.
 * @author Paul McMullen
 *
 */
public class Testclass extends JFrame implements ActionListener {

	// /////////////////////////////////////////////////////////////////////////
	// Add feature of total lift statistics for the program????????

	// /http://stackoverflow.com/questions/12021249/adding-jpanel-from-another-class-to-jpanel-in-jframe-begginer-java-programmer

	// Buttons
	
	public String[] fileNames;
	public int xz = 0;
	public int xz3 = 0;
	public int xz4 = 0;

	public int xz5 = 0;

	public int xz6 = 0;

	public int xz7 = 0;

	public int xz8 = 0;

	public static int printIntWeek = 1;

	private JButton submit, saveEditTwo, eqMax, printEqMax;
	private JButton goButton, weekJump;
	private JButton addEx;
	private JButton backButton;
	private JButton printProgram, printButtonTwo;
	private JButton saveEdit;
	private JButton libraryGoButton;

	public JButton getChart;

	private JButton totalStats, setNextWeek;

	// home panel buttons
	private JButton printList;
	private JLabel useTutorial;
	private JButton printButton;

	// Text Fields
	JTextField benchMax;
	JTextField squatMax;
	JTextField dlMax;
	public JTextField ohpMax;
	public JTextField fsqMax;

	// week one day 1
	private JTextField oneWk1D1;
	private JTextField twoWk1D1;
	private JTextField threeWk1D1;
	private JTextField fourWk1D1;
	private JTextField fiveWk1D1;

	// Day 2
	private JTextField oneWk1D2;
	private JTextField twoWk1D2;
	private JTextField threeWk1D2;
	private JTextField fourWk1D2;
	private JTextField fiveWk1D2;

	// Day 3
	private JTextField oneWk1D3;
	private JTextField twoWk1D3;
	private JTextField threeWk1D3;
	private JTextField fourWk1D3;
	private JTextField fiveWk1D3;

	// Day 4
	private JTextField oneWk1D4;
	private JTextField twoWk1D4;
	private JTextField threeWk1D4;
	private JTextField fourWk1D4;
	private JTextField fiveWk1D4;

	// week one day 1 sets

	private JTextField oneWk1D1set;
	private JTextField twoWk1D1set;
	private JTextField threeWk1D1set;
	private JTextField fourWk1D1set;
	private JTextField fiveWk1D1set;

	// Day 2
	private JTextField oneWk1D2set;
	private JTextField twoWk1D2set;
	private JTextField threeWk1D2set;
	private JTextField fourWk1D2set;
	private JTextField fiveWk1D2set;

	// Day 3
	private JTextField oneWk1D3set;
	private JTextField twoWk1D3set;
	private JTextField threeWk1D3set;
	private JTextField fourWk1D3set;
	private JTextField fiveWk1D3set;

	// Day 4
	private JTextField oneWk1D4set;
	private JTextField twoWk1D4set;
	private JTextField threeWk1D4set;
	private JTextField fourWk1D4set;
	private JTextField fiveWk1D4set;

	// /////////////////////////////////% of Max
	private JTextField oneWk1D1rep;
	private JTextField twoWk1D1rep;
	private JTextField threeWk1D1rep;
	private JTextField fourWk1D1rep;
	private JTextField fiveWk1D1rep;

	// Day 2
	private JTextField oneWk1D2rep;
	private JTextField twoWk1D2rep;
	private JTextField threeWk1D2rep;
	private JTextField fourWk1D2rep;
	private JTextField fiveWk1D2rep;

	// Day 3
	private JTextField oneWk1D3rep;
	private JTextField twoWk1D3rep;
	private JTextField threeWk1D3rep;
	private JTextField fourWk1D3rep;
	private JTextField fiveWk1D3rep;

	// Day 4
	private JTextField oneWk1D4rep;
	private JTextField twoWk1D4rep;
	private JTextField threeWk1D4rep;
	private JTextField fourWk1D4rep;
	private JTextField fiveWk1D4rep;

	// week 1 day 2
	private JTextField e1w1d2;
	private JTextField e2w1d2;
	private JTextField e3w1d2;
	private JTextField e4w1d2;
	private JTextField e5w1d2, fileNameInput1, fileNameSave;

	private JTextField fileNameInput;

	// Combo boxes
	private JComboBox upperPushBox;
	private static final String[] upperPushOption = { "Bench", "Jerk", "Dips" };

	private JComboBox weekBox;
	private static final String[] weekOption = { "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight" };

	private JComboBox dayBox;
	private static final String[] dayOption = { "One", "Two", "Three", "Four" };

	private JComboBox liftlibraryBox;
	private static final String[] libraryOption = { "5x5.txt",
			"Tex Method.txt", "Westside.txt" };

	// Labels
	public JLabel title, titleWeek, bwLabel;
	public JLabel titleTwo;

	public JLabel fileName;

	public JLabel weekChoiceLabel;
	public JLabel dayChoiceLabel;

	// week one
	public JLabel exLabelOne;
	public JLabel exLabeltwo;
	public JLabel exLabelthree;
	public JLabel exLabelfour;

	public JLabel dayLabelOne;

	JLabel picLabel;

	JLabel bmax, sqmax, dlmax, ohpmax, fsqmax;

	// Panel
	JPanel enterScreen, homeScreen, panelThree, weekOnePan, refresh;

	// Frame
	public JFrame x = new JFrame();

	public JFrame libraryFind, conPrintSave, liftStats;

	public JFrame conPrint;
	public JButton printB, saveEditprev;

	// public String weekOneArrayText[]= new String[20];
	public String weekOneArrayPrint[] = new String[20];
	public static String weekOneArrayEx[] = new String[20];
	public static String weekOneArraySet[] = new String[20];
	public static String weekOneArrayPercent[] = new String[20];

	public String weekTwoArrayPrint[] = new String[20];
	public static String weekTwoArrayEx[] = new String[20];
	public  static String weekTwoArraySet[] = new String[20];
	public  static String weekTwoArrayPercent[] = new String[20];

	public String weekThreeArrayPrint[] = new String[20];
	public static String weekThreeArrayEx[] = new String[20];
	public static String weekThreeArraySet[] = new String[20];
	public static String weekThreeArrayPercent[] = new String[20];

	public String weekFourArrayPrint[] = new String[20];
	public static String weekFourArrayEx[] = new String[20];
	public static String weekFourArraySet[] = new String[20];
	public static String weekFourArrayPercent[] = new String[20];

	public String weekFiveArrayPrint[] = new String[20];
	public static String weekFiveArrayEx[] = new String[20];
	public static String weekFiveArraySet[] = new String[20];
	public static String weekFiveArrayPercent[] = new String[20];

	public String weekSixArrayPrint[] = new String[20];
	public static String weekSixArrayEx[] = new String[20];
	public static String weekSixArraySet[] = new String[20];
	public static String weekSixArrayPercent[] = new String[20];

	public String weekSevenArrayPrint[] = new String[20];
	public static String weekSevenArrayEx[] = new String[20];
	public static String weekSevenArraySet[] = new String[20];
	public static String weekSevenArrayPercent[] = new String[20];

	public String weekEightArrayPrint[] = new String[20];
	public static String weekEightArrayEx[] = new String[20];
	public static String weekEightArraySet[] = new String[20];
	public static String weekEightArrayPercent[] = new String[20];
	JTextField bwnum;

	public JList list;

	public JLabel[] bstat, sqstat, dlstat;

	public int trstrNum;
	public String trString;

	/**
	 * 
	 * Tests to see if a string is a number
	 * 
	 * 
	 * @param str Used to verify if the string is indeed a number.
	 * @return
	 */
	public static boolean isNumeric(String str) {
		try {
			int d = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * Displays a GUI for a fitness program
	 * 
	 * @throws IOException 
	 */
	public void display() throws IOException {
		// ///refreshes the page
		JPanel refresh = new JPanel();
		x.add(refresh);
		refresh.setVisible(false);
		// //
		x.setTitle("319 Lifting Program");
		// //////////enter screen

		enterScreen = new JPanel();
		enterScreen.setPreferredSize(new Dimension(300, 300));

		JLabel imgLabel = new JLabel(new ImageIcon("deadlift-heavy-tips.jpg"));
		imgLabel.setSize(20, 20);
		enterScreen.add(imgLabel);
		enterScreen.setBackground(Color.BLACK);
		
		submit = new JButton("Enter");
		submit.addActionListener(this);
		submit.setLayout((LayoutManager) (new GridLayout(1, 3, 2, 0)));

		enterScreen.add(submit);
		// addEx = new JButton("New");
		// addEx.addActionListener(this);
		// addEx.setPreferredSize(new Dimension(300, 40));
		// enterScreen.add(addEx);

		// upperPushBox = new JComboBox(upperPushOption);
		// upperPushBox.setMaximumRowCount(3);
		// upperPushBox.addActionListener(this);
		// enterScreen.add(Box.createVerticalStrut(25));
		// // enterScreen.add(upperPushBox);

		x.add(enterScreen);

		// /////////////////////////////////////////////homeScreen\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

		JPanel HSnorth = new JPanel();
		JPanel HSsouth = new JPanel();
		JPanel HSwest = new JPanel();
		JPanel HSeast = new JPanel();
		JPanel HScenter = new JPanel();

		homeScreen = new JPanel();
		homeScreen.setLayout(new BorderLayout(5, 5));

		titleTwo = new JLabel("Lift Library", JLabel.CENTER);
		titleTwo.setFont(new Font("Comic Sans", Font.PLAIN, 22));
		HSnorth.add(titleTwo);

		HSnorth.add(Box.createHorizontalStrut(250));

		title = new JLabel("Lift Creator", JLabel.CENTER);
		title.setFont(new Font("Comic Sans", Font.PLAIN, 22));
		HSnorth.add(title);

		useTutorial = new JLabel("Make sure to have a folder called ProgramFiles in your desktop.", JLabel.CENTER);
		useTutorial.setForeground(Color.white);
		//useTutorial.addActionListener(this);
		//useTutorial.setPreferredSize(new Dimension(100, 40));
		HSsouth.add(useTutorial);
		// HSeast.add(Box.createHorizontalStrut(50));

		weekChoiceLabel = new JLabel("Week Number: ");
		HSeast.add(weekChoiceLabel);

		weekBox = new JComboBox(weekOption);
		weekBox.setMaximumRowCount(8);
		weekBox.addActionListener(this);
		homeScreen.add(Box.createHorizontalStrut(25));
		HSeast.add(weekBox);

		// titleTwo = new JLabel("Lift Library", JLabel.CENTER);
		// titleTwo.setFont(new Font("Comic Sans", Font.PLAIN, 22));
		// HSwest.add(titleTwo);

		HScenter.add(Box.createHorizontalStrut(50));

		bmax = new JLabel("Bench 1rm:", JLabel.CENTER);
		bmax.setFont(new Font("Comic Sans", Font.PLAIN, 14));
		HScenter.add(bmax);
		benchMax = new JTextField("");
		benchMax.setSize(150, 80);
		benchMax.setColumns(5);

		HScenter.add(Box.createVerticalStrut(25));
		HScenter.add(benchMax);
		HScenter.add(Box.createHorizontalStrut(50));

		sqmax = new JLabel("Squat 1rm:", JLabel.CENTER);
		sqmax.setFont(new Font("Comic Sans", Font.PLAIN, 14));
		HScenter.add(sqmax);

		squatMax = new JTextField("");
		squatMax.setSize(150, 80);
		squatMax.setColumns(5);

		HScenter.add(Box.createVerticalStrut(25));
		HScenter.add(squatMax);
		HScenter.add(Box.createHorizontalStrut(250));

		dlmax = new JLabel("Deadlift 1rm:", JLabel.CENTER);
		dlmax.setFont(new Font("Comic Sans", Font.PLAIN, 14));
		HScenter.add(dlmax);
		dlMax = new JTextField("");
		dlMax.setSize(150, 80);
		dlMax.setColumns(5);

		HScenter.add(Box.createVerticalStrut(25));
		HScenter.add(dlMax);
		HScenter.add(Box.createHorizontalStrut(250));

		bwLabel = new JLabel("Bodyweight:", JLabel.CENTER);
		bwLabel.setFont(new Font("Comic Sans", Font.PLAIN, 14));
		HScenter.add(bwLabel);
		bwnum = new JTextField("");
		bwnum.setSize(150, 80);
		bwnum.setColumns(5);

		HScenter.add(Box.createVerticalStrut(25));
		HScenter.add(bwnum);

		/*
		 * 
		 * 
		 * 
		 * LIFT STATS HERE
		 */
		totalStats = new JButton("Lift Stats");
		totalStats.addActionListener(this);
		totalStats.setPreferredSize(new Dimension(100, 40));
		HScenter.add(totalStats);

		// liftlibraryBox = new JComboBox(libraryOption);
		// liftlibraryBox.setMaximumRowCount(3);
		// liftlibraryBox.addActionListener(this);
		// HSwest.add(Box.createHorizontalStrut(120));
		// HSwest.add(liftlibraryBox);

		libraryGoButton = new JButton("Load workout");
		libraryGoButton.addActionListener(this);
		// libraryGoButton.setPreferredSize(new Dimension(300, 40));
		HSwest.add(Box.createHorizontalStrut(120));

		HSwest.add(libraryGoButton);

		goButton = new JButton("Go");
		goButton.addActionListener(this);
		// goButton.setPreferredSize(new Dimension(300, 40));
		HSeast.add(goButton);

		homeScreen.setBackground(Color.WHITE);
		HSsouth.setBackground(Color.darkGray);
		HSnorth.setBackground(Color.lightGray);
		HSeast.setBackground(Color.lightGray);

		HSwest.setBackground(Color.lightGray);
		HScenter.setBackground(Color.lightGray);

		homeScreen.add(HSnorth, BorderLayout.NORTH);
		homeScreen.add(HSsouth, BorderLayout.SOUTH);
		homeScreen.add(HSwest, BorderLayout.WEST);
		homeScreen.add(HSeast, BorderLayout.EAST);
		homeScreen.add(HScenter, BorderLayout.CENTER);

		// /////////////////////////////////////////////weekOnePan\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

		JPanel w1north = new JPanel();
		JPanel w1south = new JPanel();
		JPanel w1west = new JPanel();
		// JPanel w1east = new JPanel();
		// JPanel w1center = new JPanel();
		w1west.setLayout(new BoxLayout(w1west, BoxLayout.Y_AXIS));
		// w1east.setLayout(new BoxLayout(w1east, BoxLayout.Y_AXIS));
		// w1center.setLayout(new BoxLayout(w1east, BoxLayout.Y_AXIS));

		w1west.add(Box.createRigidArea(new Dimension(25, 5)));
		// w1east.add(Box.createRigidArea(new Dimension(25, 5)));
		// w1center.add(Box.createRigidArea(new Dimension(25, 5)));
		w1west.setBackground(Color.lightGray);

		weekOnePan = new JPanel();
		weekOnePan.setLayout(new BorderLayout(5, 5));

		// ////////////////////////////////http://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html

		titleWeek = new JLabel("Lift Creator         ", JLabel.CENTER);
		titleWeek.setFont(new Font("Calibri", Font.PLAIN, 22));
		w1north.add(titleWeek);
		w1north.add(Box.createHorizontalStrut(50));

		dayChoiceLabel = new JLabel("Jump to Week: ");
		w1north.add(dayChoiceLabel);

		weekBox = new JComboBox(weekOption);
		weekBox.setMaximumRowCount(8);
		weekBox.addActionListener(this);
		w1north.add(weekBox);

		weekJump = new JButton("Go");
		weekJump.addActionListener(this);
		// weekJump.setPreferredSize(new Dimension(100, 40));
		w1north.add(weekJump);

		printButton = new JButton("Print Workout");
		printButton.addActionListener(this);
		// weekJump.setPreferredSize(new Dimension(100, 40));
		w1north.add(printButton);

		// /////////////////////////////////////////////////////////////////////
		// ////////west panel

		w1west.add(Box.createHorizontalStrut(300));

		exLabelOne = new JLabel("Day One");
		exLabelOne.setFont(new Font("Comic Sans", Font.BOLD, 12));

		w1west.add(exLabelOne);
		// w1west.add(Box.createVerticalStrut(25));
		// w1west.add(Box.createHorizontalStrut(1100));

		oneWk1D1 = new JTextField("Exercise 1");

		w1west.add(oneWk1D1);

		twoWk1D1 = new JTextField("Exercise 2");

		w1west.add(twoWk1D1);

		threeWk1D1 = new JTextField("Exercise 3");

		w1west.add(threeWk1D1);

		fourWk1D1 = new JTextField("Exercise 4");
		fourWk1D1.setSize(150, 800);
		w1west.add(fourWk1D1);

		fiveWk1D1 = new JTextField("Exercise 5");
		w1west.add(fiveWk1D1);
		// w1west.add(Box.createVerticalStrut(250));

		exLabeltwo = new JLabel("Day Two");
		exLabeltwo.setFont(new Font("Comic Sans", Font.BOLD, 12));

		w1west.add(exLabeltwo);

		oneWk1D2 = new JTextField("Exercise 1");

		w1west.add(oneWk1D2);

		twoWk1D2 = new JTextField("Exercise 2");

		w1west.add(twoWk1D2);

		threeWk1D2 = new JTextField("Exercise 3");

		w1west.add(threeWk1D2);

		fourWk1D2 = new JTextField("Exercise 4");
		fourWk1D2.setSize(150, 800);
		w1west.add(fourWk1D2);

		fiveWk1D2 = new JTextField("Exercise 5");
		w1west.add(fiveWk1D2);

		exLabelthree = new JLabel("Day Three");
		exLabelthree.setFont(new Font("Comic Sans", Font.BOLD, 12));
		w1west.add(exLabelthree);

		oneWk1D3 = new JTextField("Exercise 1");

		w1west.add(oneWk1D3);

		twoWk1D3 = new JTextField("Exercise 2");

		w1west.add(twoWk1D3);

		threeWk1D3 = new JTextField("Exercise 3");

		w1west.add(threeWk1D3);

		fourWk1D3 = new JTextField("Exercise 4");
		fourWk1D3.setSize(150, 800);
		w1west.add(fourWk1D3);

		fiveWk1D3 = new JTextField("Exercise 5");
		w1west.add(fiveWk1D3);

		exLabelfour = new JLabel("Day Four");
		exLabelfour.setFont(new Font("Comic Sans", Font.BOLD, 12));
		w1west.add(exLabelfour);

		oneWk1D4 = new JTextField("Exercise 1");

		w1west.add(oneWk1D4);

		twoWk1D4 = new JTextField("Exercise 2");

		w1west.add(twoWk1D4);

		threeWk1D4 = new JTextField("Exercise 3");

		w1west.add(threeWk1D4);

		fourWk1D4 = new JTextField("Exercise 4");
		fourWk1D4.setSize(150, 800);
		w1west.add(fourWk1D4);

		fiveWk1D4 = new JTextField("Exercise 5");
		w1west.add(fiveWk1D4);

		weekOnePan.add(w1west, BorderLayout.WEST);

		// ///////////////////////////////////////////////////////
		// ////////////////////////////////// /////center panel
		JPanel w1center = new JPanel();

		w1center.add(Box.createRigidArea(new Dimension(25, 5)));
		w1center.setLayout(new BoxLayout(w1center, BoxLayout.Y_AXIS));
		w1center.setBackground(Color.lightGray);

		exLabelOne = new JLabel("Sets x Reps");
		exLabelOne.setFont(new Font("Comic Sans", Font.BOLD, 12));

		w1center.add(exLabelOne);
		// w1center.add(Box.createVerticalStrut(25));
		// w1center.add(Box.createHorizontalStrut(1100));

		oneWk1D1set = new JTextField("Sets x Reps");

		w1center.add(oneWk1D1set);

		twoWk1D1set = new JTextField("Sets x Reps");

		w1center.add(twoWk1D1set);

		threeWk1D1set = new JTextField("Sets x Reps");

		w1center.add(threeWk1D1set);

		fourWk1D1set = new JTextField("Sets x Reps");
		fourWk1D1set.setSize(150, 800);
		w1center.add(fourWk1D1set);

		fiveWk1D1set = new JTextField("Sets x Reps");
		w1center.add(fiveWk1D1set);
		// w1center.add(Box.createVerticalStrut(250));

		exLabeltwo = new JLabel("Day Two Sets");
		exLabeltwo.setFont(new Font("Comic Sans", Font.BOLD, 12));

		w1center.add(exLabeltwo);

		oneWk1D2set = new JTextField("Sets x Reps");

		w1center.add(oneWk1D2set);

		twoWk1D2set = new JTextField("Sets x Reps");

		w1center.add(twoWk1D2set);

		threeWk1D2set = new JTextField("Sets x Reps");

		w1center.add(threeWk1D2set);

		fourWk1D2set = new JTextField("Sets x Reps");
		fourWk1D2set.setSize(150, 800);
		w1center.add(fourWk1D2set);

		fiveWk1D2set = new JTextField("Sets x Reps");
		w1center.add(fiveWk1D2set);

		exLabelthree = new JLabel("Day Three Sets");
		exLabelthree.setFont(new Font("Comic Sans", Font.BOLD, 12));
		w1center.add(exLabelthree);

		oneWk1D3set = new JTextField("Sets x Reps");

		w1center.add(oneWk1D3set);

		twoWk1D3set = new JTextField("Sets x Reps");

		w1center.add(twoWk1D3set);

		threeWk1D3set = new JTextField("Sets x Reps");

		w1center.add(threeWk1D3set);

		fourWk1D3set = new JTextField("Sets x Reps");
		fourWk1D3set.setSize(150, 800);
		w1center.add(fourWk1D3set);

		fiveWk1D3set = new JTextField("Sets x Reps");
		w1center.add(fiveWk1D3set);

		exLabelfour = new JLabel("Day Four Sets");
		exLabelfour.setFont(new Font("Comic Sans", Font.BOLD, 12));
		w1center.add(exLabelfour);

		oneWk1D4set = new JTextField("Sets x Reps");

		w1center.add(oneWk1D4set);

		twoWk1D4set = new JTextField("Sets x Reps");

		w1center.add(twoWk1D4set);

		threeWk1D4set = new JTextField("Sets x Reps");

		w1center.add(threeWk1D4set);

		fourWk1D4set = new JTextField("Sets x Reps");
		fourWk1D4set.setSize(150, 800);
		w1center.add(fourWk1D4set);

		fiveWk1D4set = new JTextField("Sets x Reps");
		w1center.add(fiveWk1D4set);

		weekOnePan.add(w1center, BorderLayout.CENTER);

		// ////////////////////////////////////////////////////////////
		// ///////east panel

		JPanel w1east = new JPanel();
		w1east.setLayout(new BoxLayout(w1east, BoxLayout.Y_AXIS));

		w1east.add(Box.createRigidArea(new Dimension(25, 5)));
		// w1east.add(Box.createRigidArea(new Dimension(25, 5)));
		// w1center.add(Box.createRigidArea(new Dimension(25, 5)));
		w1east.setBackground(Color.lightGray);

		exLabelOne = new JLabel("Day One % of Max");
		exLabelOne.setFont(new Font("Comic Sans", Font.BOLD, 12));

		w1east.add(exLabelOne);
		// w1east.add(Box.createVerticalStrut(25));
		// w1east.add(Box.createHorizontalStrut(1100));

		oneWk1D1rep = new JTextField("%");
		w1east.add(oneWk1D1rep);

		twoWk1D1rep = new JTextField("%");

		w1east.add(twoWk1D1rep);

		threeWk1D1rep = new JTextField("%");

		w1east.add(threeWk1D1rep);

		fourWk1D1rep = new JTextField("%");
		fourWk1D1rep.setSize(150, 800);
		w1east.add(fourWk1D1rep);

		fiveWk1D1rep = new JTextField("%");
		w1east.add(fiveWk1D1rep);
		// w1east.add(Box.createVerticalStrut(250));

		exLabeltwo = new JLabel("Day Two % of Max");
		exLabeltwo.setFont(new Font("Comic Sans", Font.BOLD, 12));

		w1east.add(exLabeltwo);

		oneWk1D2rep = new JTextField("%");

		w1east.add(oneWk1D2rep);

		twoWk1D2rep = new JTextField("%");

		w1east.add(twoWk1D2rep);

		threeWk1D2rep = new JTextField("%");

		w1east.add(threeWk1D2rep);

		fourWk1D2rep = new JTextField("%");
		fourWk1D2rep.setSize(150, 800);
		w1east.add(fourWk1D2rep);

		fiveWk1D2rep = new JTextField("%");
		w1east.add(fiveWk1D2rep);

		exLabelthree = new JLabel("Day Three % of Max");
		exLabelthree.setFont(new Font("Comic Sans", Font.BOLD, 12));
		w1east.add(exLabelthree);

		oneWk1D3rep = new JTextField("%");

		w1east.add(oneWk1D3rep);

		twoWk1D3rep = new JTextField("%");

		w1east.add(twoWk1D3rep);

		threeWk1D3rep = new JTextField("%");

		w1east.add(threeWk1D3rep);

		fourWk1D3rep = new JTextField("%");
		fourWk1D3rep.setSize(150, 800);
		w1east.add(fourWk1D3rep);

		fiveWk1D3rep = new JTextField("%");
		w1east.add(fiveWk1D3rep);

		exLabelfour = new JLabel("Day Four % of Max");
		exLabelfour.setFont(new Font("Comic Sans", Font.BOLD, 12));
		w1east.add(exLabelfour);

		oneWk1D4rep = new JTextField("%");

		w1east.add(oneWk1D4rep);

		twoWk1D4rep = new JTextField("%");

		w1east.add(twoWk1D4rep);

		threeWk1D4rep = new JTextField("%");

		w1east.add(threeWk1D4rep);

		fourWk1D4rep = new JTextField("%");
		fourWk1D4rep.setSize(150, 800);
		w1east.add(fourWk1D4rep);

		fiveWk1D4rep = new JTextField("%");
		w1east.add(fiveWk1D4rep);

		weekOnePan.add(w1east, BorderLayout.EAST);

		// ////////////////////////////////////////////////////////////south
		// panel
		backButton = new JButton("Back");
		backButton.addActionListener(this);
		backButton.setPreferredSize(new Dimension(100, 40));
		w1south.add(backButton);
		w1south.add(Box.createHorizontalStrut(200));

		setNextWeek = new JButton("Set Next Week Same");
		setNextWeek.addActionListener(this);
		setNextWeek.setPreferredSize(new Dimension(120, 40));
		w1south.add(setNextWeek);

		saveEdit = new JButton("Save ");
		saveEdit.addActionListener(this);
		saveEdit.setPreferredSize(new Dimension(100, 40));
		w1south.add(saveEdit);

		// weekChoiceLabel = new JLabel("Jump to week: ");
		// w1south.add(weekChoiceLabel);

		// weekBox = new JComboBox(weekOption);
		// weekBox.setMaximumRowCount(3);
		// weekBox.addActionListener(this);
		//
		// w1south.add(weekBox);
		w1north.setBackground(Color.lightGray);
		w1south.setBackground(Color.darkGray);

		weekOnePan.add(w1north, BorderLayout.NORTH);
		weekOnePan.add(w1south, BorderLayout.SOUTH);
		// weekOnePan.add(w1west, BorderLayout.WEST);
		// weekOnePan.add(w1east, BorderLayout.EAST);
		// weekOnePan.add(w1center, BorderLayout.CENTER);

		// ////////////////////////////////////////////////////x window
		x.setSize(600, 700);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setResizable(false);
		x.setVisible(true);

		x.add(enterScreen);
		enterScreen.setVisible(true);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event) {

		/*
		 * 
		 * get wkt program into java program
		 */
		if (event.getSource() == libraryGoButton) {

			libraryFind = new JFrame();
			libraryFind.setLayout(new BorderLayout(5, 5));
			libraryFind.add(Box.createVerticalStrut(50), BorderLayout.NORTH);

			String userHomeFolder = System.getProperty("user.home");
			File folder = new File(userHomeFolder + "/Desktop/ProgramFiles");
			File[] listOfFiles = folder.listFiles();

			fileNames = new String[listOfFiles.length];

			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					fileNames[i] = listOfFiles[i].getName();

					System.out.println(listOfFiles[i].getName());
				}
			}

			list = new JList(fileNames);
			list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			list.setLayoutOrientation(JList.VERTICAL);
			JScrollPane listScroller = new JScrollPane(list);
			listScroller.setPreferredSize(new Dimension(250, 80));

			libraryFind.add(listScroller, BorderLayout.CENTER);

			printB = new JButton("Open File Into Viewer");
			printB.addActionListener(this);
			// weekJump.setPreferredSize(new Dimension(100, 40));
			libraryFind.add(printB, BorderLayout.SOUTH);

			// fileName = new JLabel("File Name:");
			// fileName.setFont(new Font("Comic Sans", Font.BOLD, 12));
			// libraryFind.add(fileName, BorderLayout.WEST);

			// fileNameInput1 = new JTextField("");
			// // fileNameInput.setSize(150, 80);
			// //
			// libraryFind.add(Box.createVerticalStrut(250),BorderLayout.EAST);
			//
			// libraryFind.add(fileNameInput1, BorderLayout.CENTER);

			libraryFind.setSize(300, 400);
			libraryFind.setBackground(Color.BLACK);

			// libraryFind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			libraryFind.setResizable(false);
			libraryFind.setVisible(true);

			homeScreen.setVisible(false);

			weekOnePan.setVisible(true);
			x.add(weekOnePan);

		}

		// //////////////////////////////////////load text into program

		if (event.getSource() == printB) {

			System.out.println("Whats : " + (String) list.getSelectedValue());

			String listSelection = (String) list.getSelectedValue();

			Scanner newFile = null;

			try {
				// String testword = new String(fileNameInput1.getText());

				String userHomeFolder = System.getProperty("user.home");

				newFile = new Scanner(new File(userHomeFolder
						+ "/Desktop/ProgramFiles", listSelection));

			} catch (FileNotFoundException e) {
				System.out.println("Error: File not found");
			}
			// creates an array of parts from the parts.txt file

			int txtCount = 0;
			int cv = 0;
			while (newFile.hasNext()) {

				String record = newFile.nextLine();
				String[] tokens = record.split(",");

				if (tokens[0] == null || tokens[0] == " ") {
					System.out.println("<><><><><><><><><><><><><> ");
				}

				System.out.println(tokens[0] + " " + tokens[1] + " "
						+ tokens[2]);

				if (txtCount == 0) {

					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 1) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 2) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 3) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 4) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}
				// ////////////////////////////////////////////////Day 2
				if (txtCount == 5) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;

				}

				if (txtCount == 6) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 7) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 8) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 9) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				// ////////////////////////day 3
				if (txtCount == 10) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;

				}

				if (txtCount == 11) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 12) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 13) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 14) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				// ////Day 4
				if (txtCount == 15) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;

				}

				if (txtCount == 16) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 17) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 18) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				if (txtCount == 19) {
					weekOneArrayEx[cv] = (tokens[0]);
					weekOneArraySet[cv] = (tokens[1]);
					weekOneArrayPercent[cv] = (tokens[2]);
					cv++;
				}

				// day 2
				if (txtCount == 20) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;

				}

				if (txtCount == 21) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 22) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 23) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 24) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}
				// ////////////////////////////////////////////////Day 2
				if (txtCount == 25) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;

				}

				if (txtCount == 26) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 27) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 28) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 29) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				// ////////////////////////day 3
				if (txtCount == 30) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;

				}

				if (txtCount == 31) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 32) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 33) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 34) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				// ////Day 4
				if (txtCount == 35) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;

				}

				if (txtCount == 36) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 37) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 38) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				if (txtCount == 39) {
					weekTwoArrayEx[xz] = (tokens[0]);
					weekTwoArraySet[xz] = (tokens[1]);
					weekTwoArrayPercent[xz] = (tokens[2]);
					xz++;
				}

				// //week 3

				if (txtCount == 40) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;

				}

				if (txtCount == 41) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 42) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 43) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 44) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}
				// ////////////////////////////////////////////////Day 2
				if (txtCount == 45) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;

				}

				if (txtCount == 46) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 47) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 48) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 49) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				// ////////////////////////day 3
				if (txtCount == 50) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;

				}

				if (txtCount == 51) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 52) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 53) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 54) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				// ////Day 4
				if (txtCount == 55) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;

				}

				if (txtCount == 56) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 57) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 58) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				if (txtCount == 59) {
					weekThreeArrayEx[xz3] = (tokens[0]);
					weekThreeArraySet[xz3] = (tokens[1]);
					weekThreeArrayPercent[xz3] = (tokens[2]);
					xz3++;
				}

				// four
				if (txtCount == 60) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;

				}

				if (txtCount == 61) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 62) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 63) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 64) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}
				// ////////////////////////////////////////////////Day 2
				if (txtCount == 65) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;

				}

				if (txtCount == 66) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 67) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 68) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 69) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				// ////////////////////////day 3
				if (txtCount == 70) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;

				}

				if (txtCount == 71) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 72) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 73) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 74) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				// ////Day 4
				if (txtCount == 75) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;

				}

				if (txtCount == 76) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 77) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 78) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 79) {
					weekFourArrayEx[xz4] = (tokens[0]);
					weekFourArraySet[xz4] = (tokens[1]);
					weekFourArrayPercent[xz4] = (tokens[2]);
					xz4++;
				}

				if (txtCount == 80) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;

				}

				if (txtCount == 81) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 82) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 83) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 84) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}
				// ////////////////////////////////////////////////Day 2
				if (txtCount == 85) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;

				}

				if (txtCount == 86) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 87) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 88) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 89) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				// ////////////////////////day 3
				if (txtCount == 90) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;

				}

				if (txtCount == 91) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 92) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 93) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 94) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				// ////Day 4
				if (txtCount == 95) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;

				}

				if (txtCount == 96) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 97) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 98) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 99) {
					weekFiveArrayEx[xz5] = (tokens[0]);
					weekFiveArraySet[xz5] = (tokens[1]);
					weekFiveArrayPercent[xz5] = (tokens[2]);
					xz5++;
				}

				if (txtCount == 100) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;

				}

				if (txtCount == 101) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 102) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 103) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 104) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}
				// ////////////////////////////////////////////////Day 2
				if (txtCount == 105) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;

				}

				if (txtCount == 106) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 107) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 108) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 109) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				// ////////////////////////day 3
				if (txtCount == 110) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;

				}

				if (txtCount == 111) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 112) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 113) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 114) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				// ////Day 4
				if (txtCount == 115) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;

				}

				if (txtCount == 116) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 117) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 118) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 119) {
					weekSixArrayEx[xz6] = (tokens[0]);
					weekSixArraySet[xz6] = (tokens[1]);
					weekSixArrayPercent[xz6] = (tokens[2]);
					xz6++;
				}

				if (txtCount == 120) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;

				}

				if (txtCount == 121) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 122) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 123) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 124) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}
				// ////////////////////////////////////////////////Day 2
				if (txtCount == 125) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;

				}

				if (txtCount == 126) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 127) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 128) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 129) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				// ////////////////////////day 3
				if (txtCount == 130) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;

				}

				if (txtCount == 131) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 132) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 133) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 134) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				// ////Day 4
				if (txtCount == 135) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;

				}

				if (txtCount == 136) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 137) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 138) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 139) {
					weekSevenArrayEx[xz7] = (tokens[0]);
					weekSevenArraySet[xz7] = (tokens[1]);
					weekSevenArrayPercent[xz7] = (tokens[2]);
					xz7++;
				}

				if (txtCount == 140) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;

				}

				if (txtCount == 141) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 142) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 143) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 144) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}
				// ////////////////////////////////////////////////Day 2
				if (txtCount == 145) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;

				}

				if (txtCount == 146) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 147) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 148) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 149) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				// ////////////////////////day 3
				if (txtCount == 150) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;

				}

				if (txtCount == 151) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 152) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 153) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 154) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				// ////Day 4
				if (txtCount == 155) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;

				}

				if (txtCount == 156) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 157) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 158) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				if (txtCount == 159) {
					weekEightArrayEx[xz8] = (tokens[0]);
					weekEightArraySet[xz8] = (tokens[1]);
					weekEightArrayPercent[xz8] = (tokens[2]);
					xz8++;
				}

				txtCount++;
			}
			jumpTo(weekOneArrayEx, weekOneArraySet, weekOneArrayPercent);
			libraryFind.setVisible(false);

		}

		if (event.getSource() == submit) {

			// submit.setText("Working");
			enterScreen.setVisible(false);
			homeScreen.setVisible(true);
			// x.remove(enterScreen);
			x.add(homeScreen);

		}
		// if (event.getSource() == goButton) {
		//
		// // submit.setText("Working");
		// homeScreen.setVisible(false);
		// // enterScreen.setVisible(true);
		//
		// weekOnePan.setVisible(true);
		// x.add(weekOnePan);
		// // x.setSize(1200, 700);
		//
		// // enterScreen.add(upperPushBox);
		//
		// }

		if (event.getSource() == goButton && weekBox.getSelectedIndex() == 0) {
			titleWeek.setText("Week One");

			jumpTo(weekOneArrayEx, weekOneArraySet, weekOneArrayPercent);
			homeScreen.setVisible(false);
			// enterScreen.setVisible(true);

			weekOnePan.setVisible(true);
			x.add(weekOnePan);

		}
		if (event.getSource() == goButton && weekBox.getSelectedIndex() == 1) {

			titleWeek.setText("Week Two");

			jumpTo(weekTwoArrayEx, weekTwoArraySet, weekTwoArrayPercent);
			homeScreen.setVisible(false);
			// enterScreen.setVisible(true);

			weekOnePan.setVisible(true);
			x.add(weekOnePan);

		}
		if (event.getSource() == goButton && weekBox.getSelectedIndex() == 2) {

			titleWeek.setText("Week Three");

			jumpTo(weekThreeArrayEx, weekThreeArraySet, weekThreeArrayPercent);
			homeScreen.setVisible(false);
			// enterScreen.setVisible(true);

			weekOnePan.setVisible(true);
			x.add(weekOnePan);

		}

		if (event.getSource() == goButton && weekBox.getSelectedIndex() == 3) {

			titleWeek.setText("Week Four");

			jumpTo(weekFourArrayEx, weekFourArraySet, weekFourArrayPercent);
			homeScreen.setVisible(false);
			// enterScreen.setVisible(true);

			weekOnePan.setVisible(true);
			x.add(weekOnePan);

		}
		if (event.getSource() == goButton && weekBox.getSelectedIndex() == 4) {

			titleWeek.setText("Week Five");

			jumpTo(weekFiveArrayEx, weekFiveArraySet, weekFiveArrayPercent);
			homeScreen.setVisible(false);
			// enterScreen.setVisible(true);

			weekOnePan.setVisible(true);
			x.add(weekOnePan);

		}
		if (event.getSource() == goButton && weekBox.getSelectedIndex() == 5) {
			jumpTo(weekSixArrayEx, weekSixArraySet, weekSixArrayPercent);

			titleWeek.setText("Week Six");
			homeScreen.setVisible(false);
			// enterScreen.setVisible(true);

			weekOnePan.setVisible(true);
			x.add(weekOnePan);

		}
		if (event.getSource() == goButton && weekBox.getSelectedIndex() == 6) {

			titleWeek.setText("Week Seven");
			jumpTo(weekSevenArrayEx, weekSevenArraySet, weekSevenArrayPercent);
			homeScreen.setVisible(false);
			// enterScreen.setVisible(true);

			weekOnePan.setVisible(true);
			x.add(weekOnePan);

		}
		if (event.getSource() == goButton && weekBox.getSelectedIndex() == 7) {
			homeScreen.setVisible(false);
			// enterScreen.setVisible(true);

			weekOnePan.setVisible(true);
			x.add(weekOnePan);

			titleWeek.setText("Week Eight");
			jumpTo(weekEightArrayEx, weekEightArraySet, weekEightArrayPercent);

		}

		if (event.getSource() == addEx) {

			enterScreen.add(upperPushBox);
			enterScreen.setVisible(false);
			enterScreen.setVisible(true);

		}

		// ///////////////////////////////////////////////////////////// week 1
		// events||||||||||||||||||||||||||||||||||||||||||||||||||
		if (event.getSource() == backButton) {

			weekOnePan.setVisible(false);
			// enterScreen.setVisible(true);
			x.setSize(600, 700);

			homeScreen.setVisible(true);

		}

		// goButton

		if (event.getSource() == weekJump && weekBox.getSelectedIndex() == 0) {
			titleWeek.setText("Week One");

			jumpTo(weekOneArrayEx, weekOneArraySet, weekOneArrayPercent);

		}
		if (event.getSource() == weekJump && weekBox.getSelectedIndex() == 1) {

			titleWeek.setText("Week Two");

			jumpTo(weekTwoArrayEx, weekTwoArraySet, weekTwoArrayPercent);

		}
		if (event.getSource() == weekJump && weekBox.getSelectedIndex() == 2) {

			titleWeek.setText("Week Three");

			jumpTo(weekThreeArrayEx, weekThreeArraySet, weekThreeArrayPercent);

		}

		if (event.getSource() == weekJump && weekBox.getSelectedIndex() == 3) {

			titleWeek.setText("Week Four");

			jumpTo(weekFourArrayEx, weekFourArraySet, weekFourArrayPercent);

		}
		if (event.getSource() == weekJump && weekBox.getSelectedIndex() == 4) {

			titleWeek.setText("Week Five");

			jumpTo(weekFiveArrayEx, weekFiveArraySet, weekFiveArrayPercent);

		}
		if (event.getSource() == weekJump && weekBox.getSelectedIndex() == 5) {
			jumpTo(weekSixArrayEx, weekSixArraySet, weekSixArrayPercent);

			titleWeek.setText("Week Six");
		}
		if (event.getSource() == weekJump && weekBox.getSelectedIndex() == 6) {

			titleWeek.setText("Week Seven");
			jumpTo(weekSevenArrayEx, weekSevenArraySet, weekSevenArrayPercent);

		}
		if (event.getSource() == weekJump && weekBox.getSelectedIndex() == 7) {

			titleWeek.setText("Week Eight");
			jumpTo(weekEightArrayEx, weekEightArraySet, weekEightArrayPercent);

		}
		// //////////////////////////////////////Save handling

		if (event.getSource() == saveEdit) {

			conPrintSave = new JFrame();
			conPrintSave.setLayout(new BorderLayout(5, 5));
			conPrintSave.add(Box.createVerticalStrut(50), BorderLayout.NORTH);

			saveEditprev = new JButton("Save Over Current File");
			saveEditprev.addActionListener(this);
			// weekJump.setPreferredSize(new Dimension(100, 40));
			conPrintSave.add(saveEditprev, BorderLayout.NORTH);

			saveEditTwo = new JButton("Save as new file");
			saveEditTwo.addActionListener(this);
			// weekJump.setPreferredSize(new Dimension(100, 40));
			conPrintSave.add(saveEditTwo, BorderLayout.SOUTH);

			fileName = new JLabel("New File Name:");
			fileName.setFont(new Font("Comic Sans", Font.BOLD, 12));
			conPrintSave.add(fileName, BorderLayout.WEST);

			fileNameSave = new JTextField("");
			// fileNameSave.setSize(150, 80);
			// conPrintSave.add(Box.createVerticalStrut(250),BorderLayout.EAST);

			conPrintSave.add(fileNameSave, BorderLayout.CENTER);

			conPrintSave.setSize(300, 150);
			conPrintSave.setBackground(Color.BLACK);

			// conPrintSave.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			conPrintSave.setResizable(false);
			conPrintSave.setVisible(true);

		}

		if (event.getSource() == saveEditprev) {

			if (trString != null) {

				try {
					saveMethod(1);

				} catch (Exception e) {
					e.printStackTrace();

				}

				conPrintSave.setVisible(false);
			} else {
				fileNameSave.setText("Error: No current file");
			}
		}
		if (event.getSource() == saveEditTwo) {

			if (!fileNameSave.getText().equals("Error: No current file")) {
				try {
					saveMethod(0);
					System.out.println("WORKS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

				} catch (Exception e) {
					e.printStackTrace();

				}

				conPrintSave.setVisible(false);
			} else {
				fileNameSave.setText("");
			}

		}

		if (event.getSource() == saveEdit && weekBox.getSelectedIndex() == 0) {

			weekOneArrayEx[0] = (oneWk1D1.getText());
			weekOneArrayEx[1] = (twoWk1D1.getText());
			weekOneArrayEx[2] = (threeWk1D1.getText());
			weekOneArrayEx[3] = (fourWk1D1.getText());
			weekOneArrayEx[4] = (fiveWk1D1.getText());

			weekOneArrayEx[5] = (oneWk1D2.getText());
			weekOneArrayEx[6] = (twoWk1D2.getText());
			weekOneArrayEx[7] = (threeWk1D2.getText());
			weekOneArrayEx[8] = (fourWk1D2.getText());
			weekOneArrayEx[9] = (fiveWk1D2.getText());

			weekOneArrayEx[10] = (oneWk1D3.getText());
			weekOneArrayEx[11] = (twoWk1D3.getText());
			weekOneArrayEx[12] = (threeWk1D3.getText());
			weekOneArrayEx[13] = (fourWk1D3.getText());
			weekOneArrayEx[14] = (fiveWk1D3.getText());

			weekOneArrayEx[15] = (oneWk1D4.getText());
			weekOneArrayEx[16] = (twoWk1D4.getText());
			weekOneArrayEx[17] = (threeWk1D4.getText());
			weekOneArrayEx[18] = (fourWk1D4.getText());
			weekOneArrayEx[19] = (fiveWk1D4.getText());

			weekOneArraySet[0] = (oneWk1D1set.getText());
			weekOneArraySet[1] = (twoWk1D1set.getText());
			weekOneArraySet[2] = (threeWk1D1set.getText());
			weekOneArraySet[3] = (fourWk1D1set.getText());
			weekOneArraySet[4] = (fiveWk1D1set.getText());

			weekOneArraySet[5] = (oneWk1D2set.getText());
			weekOneArraySet[6] = (twoWk1D2set.getText());
			weekOneArraySet[7] = (threeWk1D2set.getText());
			weekOneArraySet[8] = (fourWk1D2set.getText());
			weekOneArraySet[9] = (fiveWk1D2set.getText());

			weekOneArraySet[10] = (oneWk1D3set.getText());
			weekOneArraySet[11] = (twoWk1D3set.getText());
			weekOneArraySet[12] = (threeWk1D3set.getText());
			weekOneArraySet[13] = (fourWk1D3set.getText());
			weekOneArraySet[14] = (fiveWk1D3set.getText());

			weekOneArraySet[15] = (oneWk1D4set.getText());
			weekOneArraySet[16] = (twoWk1D4set.getText());
			weekOneArraySet[17] = (threeWk1D4set.getText());
			weekOneArraySet[18] = (fourWk1D4set.getText());
			weekOneArraySet[19] = (fiveWk1D4set.getText());

			weekOneArrayPercent[0] = (oneWk1D1rep.getText());
			weekOneArrayPercent[1] = (twoWk1D1rep.getText());
			weekOneArrayPercent[2] = (threeWk1D1rep.getText());
			weekOneArrayPercent[3] = (fourWk1D1rep.getText());
			weekOneArrayPercent[4] = (fiveWk1D1rep.getText());

			weekOneArrayPercent[5] = (oneWk1D2rep.getText());
			weekOneArrayPercent[6] = (twoWk1D2rep.getText());
			weekOneArrayPercent[7] = (threeWk1D2rep.getText());
			weekOneArrayPercent[8] = (fourWk1D2rep.getText());
			weekOneArrayPercent[9] = (fiveWk1D2rep.getText());

			weekOneArrayPercent[10] = (oneWk1D3rep.getText());
			weekOneArrayPercent[11] = (twoWk1D3rep.getText());
			weekOneArrayPercent[12] = (threeWk1D3rep.getText());
			weekOneArrayPercent[13] = (fourWk1D3rep.getText());
			weekOneArrayPercent[14] = (fiveWk1D3rep.getText());

			weekOneArrayPercent[15] = (oneWk1D4rep.getText());
			weekOneArrayPercent[16] = (twoWk1D4rep.getText());
			weekOneArrayPercent[17] = (threeWk1D4rep.getText());
			weekOneArrayPercent[18] = (fourWk1D4rep.getText());
			weekOneArrayPercent[19] = (fiveWk1D4rep.getText());

		}

		if (event.getSource() == saveEdit && weekBox.getSelectedIndex() == 1) {

			weekTwoArrayEx[0] = (oneWk1D1.getText());
			weekTwoArrayEx[1] = (twoWk1D1.getText());
			weekTwoArrayEx[2] = (threeWk1D1.getText());
			weekTwoArrayEx[3] = (fourWk1D1.getText());
			weekTwoArrayEx[4] = (fiveWk1D1.getText());

			weekTwoArrayEx[5] = (oneWk1D2.getText());
			weekTwoArrayEx[6] = (twoWk1D2.getText());
			weekTwoArrayEx[7] = (threeWk1D2.getText());
			weekTwoArrayEx[8] = (fourWk1D2.getText());
			weekTwoArrayEx[9] = (fiveWk1D2.getText());

			weekTwoArrayEx[10] = (oneWk1D3.getText());
			weekTwoArrayEx[11] = (twoWk1D3.getText());
			weekTwoArrayEx[12] = (threeWk1D3.getText());
			weekTwoArrayEx[13] = (fourWk1D3.getText());
			weekTwoArrayEx[14] = (fiveWk1D3.getText());

			weekTwoArrayEx[15] = (oneWk1D4.getText());
			weekTwoArrayEx[16] = (twoWk1D4.getText());
			weekTwoArrayEx[17] = (threeWk1D4.getText());
			weekTwoArrayEx[18] = (fourWk1D4.getText());
			weekTwoArrayEx[19] = (fiveWk1D4.getText());

			weekTwoArraySet[0] = (oneWk1D1set.getText());
			weekTwoArraySet[1] = (twoWk1D1set.getText());
			weekTwoArraySet[2] = (threeWk1D1set.getText());
			weekTwoArraySet[3] = (fourWk1D1set.getText());
			weekTwoArraySet[4] = (fiveWk1D1set.getText());

			weekTwoArraySet[5] = (oneWk1D2set.getText());
			weekTwoArraySet[6] = (twoWk1D2set.getText());
			weekTwoArraySet[7] = (threeWk1D2set.getText());
			weekTwoArraySet[8] = (fourWk1D2set.getText());
			weekTwoArraySet[9] = (fiveWk1D2set.getText());

			weekTwoArraySet[10] = (oneWk1D3set.getText());
			weekTwoArraySet[11] = (twoWk1D3set.getText());
			weekTwoArraySet[12] = (threeWk1D3set.getText());
			weekTwoArraySet[13] = (fourWk1D3set.getText());
			weekTwoArraySet[14] = (fiveWk1D3set.getText());

			weekTwoArraySet[15] = (oneWk1D4set.getText());
			weekTwoArraySet[16] = (twoWk1D4set.getText());
			weekTwoArraySet[17] = (threeWk1D4set.getText());
			weekTwoArraySet[18] = (fourWk1D4set.getText());
			weekTwoArraySet[19] = (fiveWk1D4set.getText());

			weekTwoArrayPercent[0] = (oneWk1D1rep.getText());
			weekTwoArrayPercent[1] = (twoWk1D1rep.getText());
			weekTwoArrayPercent[2] = (threeWk1D1rep.getText());
			weekTwoArrayPercent[3] = (fourWk1D1rep.getText());
			weekTwoArrayPercent[4] = (fiveWk1D1rep.getText());

			weekTwoArrayPercent[5] = (oneWk1D2rep.getText());
			weekTwoArrayPercent[6] = (twoWk1D2rep.getText());
			weekTwoArrayPercent[7] = (threeWk1D2rep.getText());
			weekTwoArrayPercent[8] = (fourWk1D2rep.getText());
			weekTwoArrayPercent[9] = (fiveWk1D2rep.getText());

			weekTwoArrayPercent[10] = (oneWk1D3rep.getText());
			weekTwoArrayPercent[11] = (twoWk1D3rep.getText());
			weekTwoArrayPercent[12] = (threeWk1D3rep.getText());
			weekTwoArrayPercent[13] = (fourWk1D3rep.getText());
			weekTwoArrayPercent[14] = (fiveWk1D3rep.getText());

			weekTwoArrayPercent[15] = (oneWk1D4rep.getText());
			weekTwoArrayPercent[16] = (twoWk1D4rep.getText());
			weekTwoArrayPercent[17] = (threeWk1D4rep.getText());
			weekTwoArrayPercent[18] = (fourWk1D4rep.getText());
			weekTwoArrayPercent[19] = (fiveWk1D4rep.getText());

		}

		if (event.getSource() == saveEdit && weekBox.getSelectedIndex() == 2) {

			weekThreeArrayEx[0] = (oneWk1D1.getText());
			weekThreeArrayEx[1] = (twoWk1D1.getText());
			weekThreeArrayEx[2] = (threeWk1D1.getText());
			weekThreeArrayEx[3] = (fourWk1D1.getText());
			weekThreeArrayEx[4] = (fiveWk1D1.getText());

			weekThreeArrayEx[5] = (oneWk1D2.getText());
			weekThreeArrayEx[6] = (twoWk1D2.getText());
			weekThreeArrayEx[7] = (threeWk1D2.getText());
			weekThreeArrayEx[8] = (fourWk1D2.getText());
			weekThreeArrayEx[9] = (fiveWk1D2.getText());

			weekThreeArrayEx[10] = (oneWk1D3.getText());
			weekThreeArrayEx[11] = (twoWk1D3.getText());
			weekThreeArrayEx[12] = (threeWk1D3.getText());
			weekThreeArrayEx[13] = (fourWk1D3.getText());
			weekThreeArrayEx[14] = (fiveWk1D3.getText());

			weekThreeArrayEx[15] = (oneWk1D4.getText());
			weekThreeArrayEx[16] = (twoWk1D4.getText());
			weekThreeArrayEx[17] = (threeWk1D4.getText());
			weekThreeArrayEx[18] = (fourWk1D4.getText());
			weekThreeArrayEx[19] = (fiveWk1D4.getText());

			weekThreeArraySet[0] = (oneWk1D1set.getText());
			weekThreeArraySet[1] = (twoWk1D1set.getText());
			weekThreeArraySet[2] = (threeWk1D1set.getText());
			weekThreeArraySet[3] = (fourWk1D1set.getText());
			weekThreeArraySet[4] = (fiveWk1D1set.getText());

			weekThreeArraySet[5] = (oneWk1D2set.getText());
			weekThreeArraySet[6] = (twoWk1D2set.getText());
			weekThreeArraySet[7] = (threeWk1D2set.getText());
			weekThreeArraySet[8] = (fourWk1D2set.getText());
			weekThreeArraySet[9] = (fiveWk1D2set.getText());

			weekThreeArraySet[10] = (oneWk1D3set.getText());
			weekThreeArraySet[11] = (twoWk1D3set.getText());
			weekThreeArraySet[12] = (threeWk1D3set.getText());
			weekThreeArraySet[13] = (fourWk1D3set.getText());
			weekThreeArraySet[14] = (fiveWk1D3set.getText());

			weekThreeArraySet[15] = (oneWk1D4set.getText());
			weekThreeArraySet[16] = (twoWk1D4set.getText());
			weekThreeArraySet[17] = (threeWk1D4set.getText());
			weekThreeArraySet[18] = (fourWk1D4set.getText());
			weekThreeArraySet[19] = (fiveWk1D4set.getText());

			weekThreeArrayPercent[0] = (oneWk1D1rep.getText());
			weekThreeArrayPercent[1] = (twoWk1D1rep.getText());
			weekThreeArrayPercent[2] = (threeWk1D1rep.getText());
			weekThreeArrayPercent[3] = (fourWk1D1rep.getText());
			weekThreeArrayPercent[4] = (fiveWk1D1rep.getText());

			weekThreeArrayPercent[5] = (oneWk1D2rep.getText());
			weekThreeArrayPercent[6] = (twoWk1D2rep.getText());
			weekThreeArrayPercent[7] = (threeWk1D2rep.getText());
			weekThreeArrayPercent[8] = (fourWk1D2rep.getText());
			weekThreeArrayPercent[9] = (fiveWk1D2rep.getText());

			weekThreeArrayPercent[10] = (oneWk1D3rep.getText());
			weekThreeArrayPercent[11] = (twoWk1D3rep.getText());
			weekThreeArrayPercent[12] = (threeWk1D3rep.getText());
			weekThreeArrayPercent[13] = (fourWk1D3rep.getText());
			weekThreeArrayPercent[14] = (fiveWk1D3rep.getText());

			weekThreeArrayPercent[15] = (oneWk1D4rep.getText());
			weekThreeArrayPercent[16] = (twoWk1D4rep.getText());
			weekThreeArrayPercent[17] = (threeWk1D4rep.getText());
			weekThreeArrayPercent[18] = (fourWk1D4rep.getText());
			weekThreeArrayPercent[19] = (fiveWk1D4rep.getText());

		}

		if (event.getSource() == saveEdit && weekBox.getSelectedIndex() == 3) {

			weekFourArrayEx[0] = (oneWk1D1.getText());
			weekFourArrayEx[1] = (twoWk1D1.getText());
			weekFourArrayEx[2] = (threeWk1D1.getText());
			weekFourArrayEx[3] = (fourWk1D1.getText());
			weekFourArrayEx[4] = (fiveWk1D1.getText());

			weekFourArrayEx[5] = (oneWk1D2.getText());
			weekFourArrayEx[6] = (twoWk1D2.getText());
			weekFourArrayEx[7] = (threeWk1D2.getText());
			weekFourArrayEx[8] = (fourWk1D2.getText());
			weekFourArrayEx[9] = (fiveWk1D2.getText());

			weekFourArrayEx[10] = (oneWk1D3.getText());
			weekFourArrayEx[11] = (twoWk1D3.getText());
			weekFourArrayEx[12] = (threeWk1D3.getText());
			weekFourArrayEx[13] = (fourWk1D3.getText());
			weekFourArrayEx[14] = (fiveWk1D3.getText());

			weekFourArrayEx[15] = (oneWk1D4.getText());
			weekFourArrayEx[16] = (twoWk1D4.getText());
			weekFourArrayEx[17] = (threeWk1D4.getText());
			weekFourArrayEx[18] = (fourWk1D4.getText());
			weekFourArrayEx[19] = (fiveWk1D4.getText());

			weekFourArraySet[0] = (oneWk1D1set.getText());
			weekFourArraySet[1] = (twoWk1D1set.getText());
			weekFourArraySet[2] = (threeWk1D1set.getText());
			weekFourArraySet[3] = (fourWk1D1set.getText());
			weekFourArraySet[4] = (fiveWk1D1set.getText());

			weekFourArraySet[5] = (oneWk1D2set.getText());
			weekFourArraySet[6] = (twoWk1D2set.getText());
			weekFourArraySet[7] = (threeWk1D2set.getText());
			weekFourArraySet[8] = (fourWk1D2set.getText());
			weekFourArraySet[9] = (fiveWk1D2set.getText());

			weekFourArraySet[10] = (oneWk1D3set.getText());
			weekFourArraySet[11] = (twoWk1D3set.getText());
			weekFourArraySet[12] = (threeWk1D3set.getText());
			weekFourArraySet[13] = (fourWk1D3set.getText());
			weekFourArraySet[14] = (fiveWk1D3set.getText());

			weekFourArraySet[15] = (oneWk1D4set.getText());
			weekFourArraySet[16] = (twoWk1D4set.getText());
			weekFourArraySet[17] = (threeWk1D4set.getText());
			weekFourArraySet[18] = (fourWk1D4set.getText());
			weekFourArraySet[19] = (fiveWk1D4set.getText());

			weekFourArrayPercent[0] = (oneWk1D1rep.getText());
			weekFourArrayPercent[1] = (twoWk1D1rep.getText());
			weekFourArrayPercent[2] = (threeWk1D1rep.getText());
			weekFourArrayPercent[3] = (fourWk1D1rep.getText());
			weekFourArrayPercent[4] = (fiveWk1D1rep.getText());

			weekFourArrayPercent[5] = (oneWk1D2rep.getText());
			weekFourArrayPercent[6] = (twoWk1D2rep.getText());
			weekFourArrayPercent[7] = (threeWk1D2rep.getText());
			weekFourArrayPercent[8] = (fourWk1D2rep.getText());
			weekFourArrayPercent[9] = (fiveWk1D2rep.getText());

			weekFourArrayPercent[10] = (oneWk1D3rep.getText());
			weekFourArrayPercent[11] = (twoWk1D3rep.getText());
			weekFourArrayPercent[12] = (threeWk1D3rep.getText());
			weekFourArrayPercent[13] = (fourWk1D3rep.getText());
			weekFourArrayPercent[14] = (fiveWk1D3rep.getText());

			weekFourArrayPercent[15] = (oneWk1D4rep.getText());
			weekFourArrayPercent[16] = (twoWk1D4rep.getText());
			weekFourArrayPercent[17] = (threeWk1D4rep.getText());
			weekFourArrayPercent[18] = (fourWk1D4rep.getText());
			weekFourArrayPercent[19] = (fiveWk1D4rep.getText());

		}

		if (event.getSource() == saveEdit && weekBox.getSelectedIndex() == 4) {

			weekFiveArrayEx[0] = (oneWk1D1.getText());
			weekFiveArrayEx[1] = (twoWk1D1.getText());
			weekFiveArrayEx[2] = (threeWk1D1.getText());
			weekFiveArrayEx[3] = (fourWk1D1.getText());
			weekFiveArrayEx[4] = (fiveWk1D1.getText());

			weekFiveArrayEx[5] = (oneWk1D2.getText());
			weekFiveArrayEx[6] = (twoWk1D2.getText());
			weekFiveArrayEx[7] = (threeWk1D2.getText());
			weekFiveArrayEx[8] = (fourWk1D2.getText());
			weekFiveArrayEx[9] = (fiveWk1D2.getText());

			weekFiveArrayEx[10] = (oneWk1D3.getText());
			weekFiveArrayEx[11] = (twoWk1D3.getText());
			weekFiveArrayEx[12] = (threeWk1D3.getText());
			weekFiveArrayEx[13] = (fourWk1D3.getText());
			weekFiveArrayEx[14] = (fiveWk1D3.getText());

			weekFiveArrayEx[15] = (oneWk1D4.getText());
			weekFiveArrayEx[16] = (twoWk1D4.getText());
			weekFiveArrayEx[17] = (threeWk1D4.getText());
			weekFiveArrayEx[18] = (fourWk1D4.getText());
			weekFiveArrayEx[19] = (fiveWk1D4.getText());

			weekFiveArraySet[0] = (oneWk1D1set.getText());
			weekFiveArraySet[1] = (twoWk1D1set.getText());
			weekFiveArraySet[2] = (threeWk1D1set.getText());
			weekFiveArraySet[3] = (fourWk1D1set.getText());
			weekFiveArraySet[4] = (fiveWk1D1set.getText());

			weekFiveArraySet[5] = (oneWk1D2set.getText());
			weekFiveArraySet[6] = (twoWk1D2set.getText());
			weekFiveArraySet[7] = (threeWk1D2set.getText());
			weekFiveArraySet[8] = (fourWk1D2set.getText());
			weekFiveArraySet[9] = (fiveWk1D2set.getText());

			weekFiveArraySet[10] = (oneWk1D3set.getText());
			weekFiveArraySet[11] = (twoWk1D3set.getText());
			weekFiveArraySet[12] = (threeWk1D3set.getText());
			weekFiveArraySet[13] = (fourWk1D3set.getText());
			weekFiveArraySet[14] = (fiveWk1D3set.getText());

			weekFiveArraySet[15] = (oneWk1D4set.getText());
			weekFiveArraySet[16] = (twoWk1D4set.getText());
			weekFiveArraySet[17] = (threeWk1D4set.getText());
			weekFiveArraySet[18] = (fourWk1D4set.getText());
			weekFiveArraySet[19] = (fiveWk1D4set.getText());

			weekFiveArrayPercent[0] = (oneWk1D1rep.getText());
			weekFiveArrayPercent[1] = (twoWk1D1rep.getText());
			weekFiveArrayPercent[2] = (threeWk1D1rep.getText());
			weekFiveArrayPercent[3] = (fourWk1D1rep.getText());
			weekFiveArrayPercent[4] = (fiveWk1D1rep.getText());

			weekFiveArrayPercent[5] = (oneWk1D2rep.getText());
			weekFiveArrayPercent[6] = (twoWk1D2rep.getText());
			weekFiveArrayPercent[7] = (threeWk1D2rep.getText());
			weekFiveArrayPercent[8] = (fourWk1D2rep.getText());
			weekFiveArrayPercent[9] = (fiveWk1D2rep.getText());

			weekFiveArrayPercent[10] = (oneWk1D3rep.getText());
			weekFiveArrayPercent[11] = (twoWk1D3rep.getText());
			weekFiveArrayPercent[12] = (threeWk1D3rep.getText());
			weekFiveArrayPercent[13] = (fourWk1D3rep.getText());
			weekFiveArrayPercent[14] = (fiveWk1D3rep.getText());

			weekFiveArrayPercent[15] = (oneWk1D4rep.getText());
			weekFiveArrayPercent[16] = (twoWk1D4rep.getText());
			weekFiveArrayPercent[17] = (threeWk1D4rep.getText());
			weekFiveArrayPercent[18] = (fourWk1D4rep.getText());
			weekFiveArrayPercent[19] = (fiveWk1D4rep.getText());

		}

		if (event.getSource() == saveEdit && weekBox.getSelectedIndex() == 5) {

			weekSixArrayEx[0] = (oneWk1D1.getText());
			weekSixArrayEx[1] = (twoWk1D1.getText());
			weekSixArrayEx[2] = (threeWk1D1.getText());
			weekSixArrayEx[3] = (fourWk1D1.getText());
			weekSixArrayEx[4] = (fiveWk1D1.getText());

			weekSixArrayEx[5] = (oneWk1D2.getText());
			weekSixArrayEx[6] = (twoWk1D2.getText());
			weekSixArrayEx[7] = (threeWk1D2.getText());
			weekSixArrayEx[8] = (fourWk1D2.getText());
			weekSixArrayEx[9] = (fiveWk1D2.getText());

			weekSixArrayEx[10] = (oneWk1D3.getText());
			weekSixArrayEx[11] = (twoWk1D3.getText());
			weekSixArrayEx[12] = (threeWk1D3.getText());
			weekSixArrayEx[13] = (fourWk1D3.getText());
			weekSixArrayEx[14] = (fiveWk1D3.getText());

			weekSixArrayEx[15] = (oneWk1D4.getText());
			weekSixArrayEx[16] = (twoWk1D4.getText());
			weekSixArrayEx[17] = (threeWk1D4.getText());
			weekSixArrayEx[18] = (fourWk1D4.getText());
			weekSixArrayEx[19] = (fiveWk1D4.getText());

			weekSixArraySet[0] = (oneWk1D1set.getText());
			weekSixArraySet[1] = (twoWk1D1set.getText());
			weekSixArraySet[2] = (threeWk1D1set.getText());
			weekSixArraySet[3] = (fourWk1D1set.getText());
			weekSixArraySet[4] = (fiveWk1D1set.getText());

			weekSixArraySet[5] = (oneWk1D2set.getText());
			weekSixArraySet[6] = (twoWk1D2set.getText());
			weekSixArraySet[7] = (threeWk1D2set.getText());
			weekSixArraySet[8] = (fourWk1D2set.getText());
			weekSixArraySet[9] = (fiveWk1D2set.getText());

			weekSixArraySet[10] = (oneWk1D3set.getText());
			weekSixArraySet[11] = (twoWk1D3set.getText());
			weekSixArraySet[12] = (threeWk1D3set.getText());
			weekSixArraySet[13] = (fourWk1D3set.getText());
			weekSixArraySet[14] = (fiveWk1D3set.getText());

			weekSixArraySet[15] = (oneWk1D4set.getText());
			weekSixArraySet[16] = (twoWk1D4set.getText());
			weekSixArraySet[17] = (threeWk1D4set.getText());
			weekSixArraySet[18] = (fourWk1D4set.getText());
			weekSixArraySet[19] = (fiveWk1D4set.getText());

			weekSixArrayPercent[0] = (oneWk1D1rep.getText());
			weekSixArrayPercent[1] = (twoWk1D1rep.getText());
			weekSixArrayPercent[2] = (threeWk1D1rep.getText());
			weekSixArrayPercent[3] = (fourWk1D1rep.getText());
			weekSixArrayPercent[4] = (fiveWk1D1rep.getText());

			weekSixArrayPercent[5] = (oneWk1D2rep.getText());
			weekSixArrayPercent[6] = (twoWk1D2rep.getText());
			weekSixArrayPercent[7] = (threeWk1D2rep.getText());
			weekSixArrayPercent[8] = (fourWk1D2rep.getText());
			weekSixArrayPercent[9] = (fiveWk1D2rep.getText());

			weekSixArrayPercent[10] = (oneWk1D3rep.getText());
			weekSixArrayPercent[11] = (twoWk1D3rep.getText());
			weekSixArrayPercent[12] = (threeWk1D3rep.getText());
			weekSixArrayPercent[13] = (fourWk1D3rep.getText());
			weekSixArrayPercent[14] = (fiveWk1D3rep.getText());

			weekSixArrayPercent[15] = (oneWk1D4rep.getText());
			weekSixArrayPercent[16] = (twoWk1D4rep.getText());
			weekSixArrayPercent[17] = (threeWk1D4rep.getText());
			weekSixArrayPercent[18] = (fourWk1D4rep.getText());
			weekSixArrayPercent[19] = (fiveWk1D4rep.getText());

		}

		if (event.getSource() == saveEdit && weekBox.getSelectedIndex() == 6) {

			weekSevenArrayEx[0] = (oneWk1D1.getText());
			weekSevenArrayEx[1] = (twoWk1D1.getText());
			weekSevenArrayEx[2] = (threeWk1D1.getText());
			weekSevenArrayEx[3] = (fourWk1D1.getText());
			weekSevenArrayEx[4] = (fiveWk1D1.getText());

			weekSevenArrayEx[5] = (oneWk1D2.getText());
			weekSevenArrayEx[6] = (twoWk1D2.getText());
			weekSevenArrayEx[7] = (threeWk1D2.getText());
			weekSevenArrayEx[8] = (fourWk1D2.getText());
			weekSevenArrayEx[9] = (fiveWk1D2.getText());

			weekSevenArrayEx[10] = (oneWk1D3.getText());
			weekSevenArrayEx[11] = (twoWk1D3.getText());
			weekSevenArrayEx[12] = (threeWk1D3.getText());
			weekSevenArrayEx[13] = (fourWk1D3.getText());
			weekSevenArrayEx[14] = (fiveWk1D3.getText());

			weekSevenArrayEx[15] = (oneWk1D4.getText());
			weekSevenArrayEx[16] = (twoWk1D4.getText());
			weekSevenArrayEx[17] = (threeWk1D4.getText());
			weekSevenArrayEx[18] = (fourWk1D4.getText());
			weekSevenArrayEx[19] = (fiveWk1D4.getText());

			weekSevenArraySet[0] = (oneWk1D1set.getText());
			weekSevenArraySet[1] = (twoWk1D1set.getText());
			weekSevenArraySet[2] = (threeWk1D1set.getText());
			weekSevenArraySet[3] = (fourWk1D1set.getText());
			weekSevenArraySet[4] = (fiveWk1D1set.getText());

			weekSevenArraySet[5] = (oneWk1D2set.getText());
			weekSevenArraySet[6] = (twoWk1D2set.getText());
			weekSevenArraySet[7] = (threeWk1D2set.getText());
			weekSevenArraySet[8] = (fourWk1D2set.getText());
			weekSevenArraySet[9] = (fiveWk1D2set.getText());

			weekSevenArraySet[10] = (oneWk1D3set.getText());
			weekSevenArraySet[11] = (twoWk1D3set.getText());
			weekSevenArraySet[12] = (threeWk1D3set.getText());
			weekSevenArraySet[13] = (fourWk1D3set.getText());
			weekSevenArraySet[14] = (fiveWk1D3set.getText());

			weekSevenArraySet[15] = (oneWk1D4set.getText());
			weekSevenArraySet[16] = (twoWk1D4set.getText());
			weekSevenArraySet[17] = (threeWk1D4set.getText());
			weekSevenArraySet[18] = (fourWk1D4set.getText());
			weekSevenArraySet[19] = (fiveWk1D4set.getText());

			weekSevenArrayPercent[0] = (oneWk1D1rep.getText());
			weekSevenArrayPercent[1] = (twoWk1D1rep.getText());
			weekSevenArrayPercent[2] = (threeWk1D1rep.getText());
			weekSevenArrayPercent[3] = (fourWk1D1rep.getText());
			weekSevenArrayPercent[4] = (fiveWk1D1rep.getText());

			weekSevenArrayPercent[5] = (oneWk1D2rep.getText());
			weekSevenArrayPercent[6] = (twoWk1D2rep.getText());
			weekSevenArrayPercent[7] = (threeWk1D2rep.getText());
			weekSevenArrayPercent[8] = (fourWk1D2rep.getText());
			weekSevenArrayPercent[9] = (fiveWk1D2rep.getText());

			weekSevenArrayPercent[10] = (oneWk1D3rep.getText());
			weekSevenArrayPercent[11] = (twoWk1D3rep.getText());
			weekSevenArrayPercent[12] = (threeWk1D3rep.getText());
			weekSevenArrayPercent[13] = (fourWk1D3rep.getText());
			weekSevenArrayPercent[14] = (fiveWk1D3rep.getText());

			weekSevenArrayPercent[15] = (oneWk1D4rep.getText());
			weekSevenArrayPercent[16] = (twoWk1D4rep.getText());
			weekSevenArrayPercent[17] = (threeWk1D4rep.getText());
			weekSevenArrayPercent[18] = (fourWk1D4rep.getText());
			weekSevenArrayPercent[19] = (fiveWk1D4rep.getText());

		}

		if (event.getSource() == saveEdit && weekBox.getSelectedIndex() == 7) {

			weekEightArrayEx[0] = (oneWk1D1.getText());
			weekEightArrayEx[1] = (twoWk1D1.getText());
			weekEightArrayEx[2] = (threeWk1D1.getText());
			weekEightArrayEx[3] = (fourWk1D1.getText());
			weekEightArrayEx[4] = (fiveWk1D1.getText());

			weekEightArrayEx[5] = (oneWk1D2.getText());
			weekEightArrayEx[6] = (twoWk1D2.getText());
			weekEightArrayEx[7] = (threeWk1D2.getText());
			weekEightArrayEx[8] = (fourWk1D2.getText());
			weekEightArrayEx[9] = (fiveWk1D2.getText());

			weekEightArrayEx[10] = (oneWk1D3.getText());
			weekEightArrayEx[11] = (twoWk1D3.getText());
			weekEightArrayEx[12] = (threeWk1D3.getText());
			weekEightArrayEx[13] = (fourWk1D3.getText());
			weekEightArrayEx[14] = (fiveWk1D3.getText());

			weekEightArrayEx[15] = (oneWk1D4.getText());
			weekEightArrayEx[16] = (twoWk1D4.getText());
			weekEightArrayEx[17] = (threeWk1D4.getText());
			weekEightArrayEx[18] = (fourWk1D4.getText());
			weekEightArrayEx[19] = (fiveWk1D4.getText());

			weekEightArraySet[0] = (oneWk1D1set.getText());
			weekEightArraySet[1] = (twoWk1D1set.getText());
			weekEightArraySet[2] = (threeWk1D1set.getText());
			weekEightArraySet[3] = (fourWk1D1set.getText());
			weekEightArraySet[4] = (fiveWk1D1set.getText());

			weekEightArraySet[5] = (oneWk1D2set.getText());
			weekEightArraySet[6] = (twoWk1D2set.getText());
			weekEightArraySet[7] = (threeWk1D2set.getText());
			weekEightArraySet[8] = (fourWk1D2set.getText());
			weekEightArraySet[9] = (fiveWk1D2set.getText());

			weekEightArraySet[10] = (oneWk1D3set.getText());
			weekEightArraySet[11] = (twoWk1D3set.getText());
			weekEightArraySet[12] = (threeWk1D3set.getText());
			weekEightArraySet[13] = (fourWk1D3set.getText());
			weekEightArraySet[14] = (fiveWk1D3set.getText());

			weekEightArraySet[15] = (oneWk1D4set.getText());
			weekEightArraySet[16] = (twoWk1D4set.getText());
			weekEightArraySet[17] = (threeWk1D4set.getText());
			weekEightArraySet[18] = (fourWk1D4set.getText());
			weekEightArraySet[19] = (fiveWk1D4set.getText());

			weekEightArrayPercent[0] = (oneWk1D1rep.getText());
			weekEightArrayPercent[1] = (twoWk1D1rep.getText());
			weekEightArrayPercent[2] = (threeWk1D1rep.getText());
			weekEightArrayPercent[3] = (fourWk1D1rep.getText());
			weekEightArrayPercent[4] = (fiveWk1D1rep.getText());

			weekEightArrayPercent[5] = (oneWk1D2rep.getText());
			weekEightArrayPercent[6] = (twoWk1D2rep.getText());
			weekEightArrayPercent[7] = (threeWk1D2rep.getText());
			weekEightArrayPercent[8] = (fourWk1D2rep.getText());
			weekEightArrayPercent[9] = (fiveWk1D2rep.getText());

			weekEightArrayPercent[10] = (oneWk1D3rep.getText());
			weekEightArrayPercent[11] = (twoWk1D3rep.getText());
			weekEightArrayPercent[12] = (threeWk1D3rep.getText());
			weekEightArrayPercent[13] = (fourWk1D3rep.getText());
			weekEightArrayPercent[14] = (fiveWk1D3rep.getText());

			weekEightArrayPercent[15] = (oneWk1D4rep.getText());
			weekEightArrayPercent[16] = (twoWk1D4rep.getText());
			weekEightArrayPercent[17] = (threeWk1D4rep.getText());
			weekEightArrayPercent[18] = (fourWk1D4rep.getText());
			weekEightArrayPercent[19] = (fiveWk1D4rep.getText());

		}

		if (event.getSource() == setNextWeek && weekBox.getSelectedIndex() == 0) {

			setNextWeek(weekOneArrayEx, weekTwoArrayEx);
			setNextWeek(weekOneArraySet, weekTwoArraySet);
			setNextWeek(weekOneArrayPercent, weekTwoArrayPercent);

		}

		if (event.getSource() == setNextWeek && weekBox.getSelectedIndex() == 1) {

			setNextWeek(weekTwoArrayEx, weekThreeArrayEx);
			setNextWeek(weekTwoArraySet, weekThreeArraySet);
			setNextWeek(weekTwoArrayPercent, weekThreeArrayPercent);

		}

		if (event.getSource() == setNextWeek && weekBox.getSelectedIndex() == 2) {

			setNextWeek(weekThreeArrayEx, weekFourArrayEx);
			setNextWeek(weekThreeArraySet, weekFourArraySet);
			setNextWeek(weekThreeArrayPercent, weekFourArrayPercent);

		}

		if (event.getSource() == setNextWeek && weekBox.getSelectedIndex() == 3) {

			setNextWeek(weekFourArrayEx, weekFiveArrayEx);
			setNextWeek(weekFourArraySet, weekFiveArraySet);
			setNextWeek(weekFourArrayPercent, weekFiveArrayPercent);

		}
		if (event.getSource() == setNextWeek && weekBox.getSelectedIndex() == 4) {

			setNextWeek(weekFiveArrayEx, weekSixArrayEx);
			setNextWeek(weekFiveArraySet, weekSixArraySet);
			setNextWeek(weekFiveArrayPercent, weekSixArrayPercent);

		}
		if (event.getSource() == setNextWeek && weekBox.getSelectedIndex() == 5) {

			setNextWeek(weekSixArrayEx, weekSevenArrayEx);
			setNextWeek(weekSixArraySet, weekSevenArraySet);
			setNextWeek(weekSixArrayPercent, weekSevenArrayPercent);

		}
		if (event.getSource() == setNextWeek && weekBox.getSelectedIndex() == 6) {

			setNextWeek(weekSevenArrayEx, weekEightArrayEx);
			setNextWeek(weekSevenArraySet, weekEightArraySet);
			setNextWeek(weekSevenArrayPercent, weekEightArrayPercent);

		}
		if (event.getSource() == printButton) {

			conPrint = new JFrame();
			conPrint.setLayout(new BorderLayout(5, 5));
			conPrint.add(Box.createVerticalStrut(50), BorderLayout.NORTH);

			printButtonTwo = new JButton("Confirm Print");
			printButtonTwo.addActionListener(this);
			// weekJump.setPreferredSize(new Dimension(100, 40));
			conPrint.add(printButtonTwo, BorderLayout.SOUTH);

			fileName = new JLabel("File Name:");
			fileName.setFont(new Font("Comic Sans", Font.BOLD, 12));
			conPrint.add(fileName, BorderLayout.WEST);

			fileNameInput = new JTextField("File Name");
			// fileNameInput.setSize(150, 80);
			// conPrint.add(Box.createVerticalStrut(250),BorderLayout.EAST);

			conPrint.add(fileNameInput, BorderLayout.CENTER);

			conPrint.setSize(300, 150);
			conPrint.setBackground(Color.BLACK);

			// conPrint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			conPrint.setResizable(false);
			conPrint.setVisible(true);

		}
		if (event.getSource() == printButtonTwo) {

			try {

				String testword = new String(fileNameInput.getText());

				String userHomeFolder = System.getProperty("user.home");

				// File file = new File(userHomeFolder + "/Desktop/", testword
				// + ".txt");
				File file = new File(userHomeFolder + "/Desktop/", testword
						+ ".doc");

				PrintWriter out = new PrintWriter(file);

				printWkt(out, weekOneArrayEx, weekOneArraySet,
						weekOneArrayPercent);

				printWkt(out, weekTwoArrayEx, weekTwoArraySet,
						weekTwoArrayPercent);

				printWkt(out, weekThreeArrayEx, weekThreeArraySet,
						weekThreeArrayPercent);

				printWkt(out, weekFourArrayEx, weekFourArraySet,
						weekFourArrayPercent);

				printWkt(out, weekFiveArrayEx, weekFiveArraySet,
						weekFiveArrayPercent);

				printWkt(out, weekSixArrayEx, weekSixArraySet,
						weekSixArrayPercent);

				printWkt(out, weekSevenArrayEx, weekSevenArraySet,
						weekSevenArrayPercent);

				printWkt(out, weekEightArrayEx, weekEightArraySet,
						weekEightArrayPercent);

				printIntWeek = 1;
				out.close();
			} catch (Exception e) {
				e.printStackTrace();

			}

			conPrint.setVisible(false);

		}

		/**
		 * 
		 * 
		 * 
		 * |||||||||||||||||||||||||| lift stats here \/\/\/\/\/\/\/\/\/\/\/\/\/
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		if (event.getSource() == totalStats) {
			liftStats = new JFrame();
			liftStats.setLayout(new BorderLayout(5, 5));
			liftStats.add(Box.createVerticalStrut(50), BorderLayout.NORTH);
			JPanel nPanel = new JPanel();

			bstat = new JLabel[9];

			eqMax = new JButton("Get Equivalent Maxes");
			eqMax.addActionListener(this);
			// weekJump.setPreferredSize(new Dimension(100, 40));
			liftStats.add(eqMax, BorderLayout.SOUTH);

			// getChart = new JButton("Chart of Percentages");
			// getChart.addActionListener(this);
			// liftStats.add(getChart, BorderLayout.NORTH);

			JPanel xPanel = new JPanel();
			xPanel.setLayout(new BoxLayout(xPanel, BoxLayout.Y_AXIS));

			double holdsbw;
			double holds;

			if (bwnum.getText().equals("")) {
				bwnum.setText("0");
			}

			if (!benchMax.getText().equals("")) {
				holds = Double.parseDouble(benchMax.getText());

				holdsbw = Double.parseDouble(bwnum.getText());

				JLabel bwcomp = new JLabel("Benching " + (holds / holdsbw)
						* 100 + " % of bodyweight");
				bwcomp.setFont(new Font("Comic Sans", Font.BOLD, 12));

				xPanel.add(bwcomp, BorderLayout.WEST);
			} else {
				holds = 0;

				holdsbw = Double.parseDouble(bwnum.getText());

				JLabel bwcomp = new JLabel("Benching " + (holds / holdsbw)
						* 100 + " % of bodyweight");
				bwcomp.setFont(new Font("Comic Sans", Font.BOLD, 12));

				xPanel.add(bwcomp, BorderLayout.WEST);

			}

			if (!squatMax.getText().equals("")) {
				holds = Double.parseDouble(squatMax.getText());

				holdsbw = Double.parseDouble(bwnum.getText());

				JLabel bwcomp2 = new JLabel("Squatting " + (holds / holdsbw)
						* 100 + " % of bodyweight");

				xPanel.add(bwcomp2, BorderLayout.WEST);
			} else {
				holds = 0;

				holdsbw = Double.parseDouble(bwnum.getText());

				JLabel bwcomp2 = new JLabel("Squatting " + (holds / holdsbw)
						* 100 + " % of bodyweight");

				xPanel.add(bwcomp2, BorderLayout.WEST);
			}

			if (!dlMax.getText().equals("")) {
				holds = Double.parseDouble(dlMax.getText());

				holdsbw = Double.parseDouble(bwnum.getText());

				JLabel bwcomp3 = new JLabel("Deadlifting " + (holds / holdsbw)
						* 100 + " % of bodyweight");

				xPanel.add(bwcomp3, BorderLayout.WEST);
				xPanel.setBackground(Color.LIGHT_GRAY);

				liftStats.add(xPanel, BorderLayout.WEST);
			} else {
				holds = 0;

				holdsbw = Double.parseDouble(bwnum.getText());

				JLabel bwcomp3 = new JLabel("Deadlifting " + (holds / holdsbw)
						* 100 + " % of bodyweight");

				xPanel.add(bwcomp3, BorderLayout.WEST);
				xPanel.setBackground(Color.LIGHT_GRAY);

				liftStats.add(xPanel, BorderLayout.WEST);
			}

			liftStats.setSize(500, 600);
			liftStats.setBackground(Color.BLUE);

			liftStats.setResizable(false);
			liftStats.setVisible(true);
		}

		if (event.getSource() == getChart) {

			setChart(weekOneArrayPercent);

		}

		if (event.getSource() == eqMax) {
			liftStats = new JFrame();
			liftStats.setLayout(new BorderLayout(5, 5));
			// liftStats.add(Box.createVerticalStrut(50), BorderLayout.NORTH);

			JPanel nPanel = new JPanel();
			JLabel[] lcol = new JLabel[9];
			// JLabel[] bstat= new JLabel[9];
			nPanel.setLayout(new BoxLayout(nPanel, BoxLayout.Y_AXIS));

			JLabel btitle = new JLabel("-Bench-");
			nPanel.add(btitle);

			int holds;
			String back;

			if (!benchMax.getText().equals("")) {

				bstat[0] = new JLabel("1RM = " + benchMax.getText());
				nPanel.add(bstat[0]);

				holds = Integer.parseInt(benchMax.getText());
				holds = (holds / 100) * 95;
				System.out.println("Equiv Max: " + holds);
				bstat[1] = new JLabel("2RM = " + holds);
				nPanel.add(bstat[1]);

				holds = Integer.parseInt(benchMax.getText());
				holds = (holds / 100) * 90;
				System.out.println("Equiv Max: " + holds);
				bstat[2] = new JLabel("3RM = " + holds);
				nPanel.add(bstat[2]);

				holds = Integer.parseInt(benchMax.getText());
				holds = (holds / 100) * 88;
				System.out.println("Equiv Max: " + holds);
				bstat[3] = new JLabel("4RM = " + holds);
				nPanel.add(bstat[3]);

				holds = Integer.parseInt(benchMax.getText());
				holds = (holds / 100) * 86;
				System.out.println("Equiv Max: " + holds);
				bstat[4] = new JLabel("5RM = " + holds);
				nPanel.add(bstat[4]);

				holds = Integer.parseInt(benchMax.getText());
				holds = (holds / 100) * 83;
				System.out.println("Equiv Max: " + holds);
				bstat[5] = new JLabel("6RM = " + holds);
				nPanel.add(bstat[5]);

				holds = Integer.parseInt(benchMax.getText());
				holds = (holds / 100) * 80;
				System.out.println("Equiv Max: " + holds);
				bstat[6] = new JLabel("7RM = " + holds);
				nPanel.add(bstat[6]);

				holds = Integer.parseInt(benchMax.getText());
				holds = (holds / 100) * 78;
				System.out.println("Equiv Max: " + holds);
				bstat[7] = new JLabel("8RM = " + holds);
				nPanel.add(bstat[7]);

			}
			liftStats.add(nPanel, BorderLayout.WEST);

			JPanel ePanel = new JPanel();
			lcol = new JLabel[9];
			dlstat = new JLabel[9];
			// JLabel[] dlstat= new JLabel[9];
			ePanel.setLayout(new BoxLayout(ePanel, BoxLayout.Y_AXIS));

			btitle = new JLabel("-Deadlift-");
			ePanel.add(btitle);

			if (!dlMax.getText().equals("")) {
				System.out.println(dlMax.getText());
				dlstat[0] = new JLabel("1RM = " + dlMax.getText() + " ");
				ePanel.add(dlstat[0]);

				holds = Integer.parseInt(dlMax.getText());
				holds = (holds / 100) * 95;
				System.out.println("Equiv Max: " + holds);
				dlstat[1] = new JLabel("2RM = " + holds + " ");
				ePanel.add(dlstat[1]);

				holds = Integer.parseInt(dlMax.getText());
				holds = (holds / 100) * 90;
				System.out.println("Equiv Max: " + holds);
				dlstat[2] = new JLabel("3RM = " + holds + " ");
				ePanel.add(dlstat[2]);

				holds = Integer.parseInt(dlMax.getText());
				holds = (holds / 100) * 85;
				System.out.println("Equiv Max: " + holds);
				dlstat[3] = new JLabel("4RM = " + holds + " ");
				ePanel.add(dlstat[3]);

				holds = Integer.parseInt(dlMax.getText());
				holds = (holds / 100) * 85;
				System.out.println("Equiv Max: " + holds);
				dlstat[4] = new JLabel("5RM = " + holds + " ");
				ePanel.add(dlstat[4]);

				holds = Integer.parseInt(dlMax.getText());
				holds = (holds / 100) * 85;
				System.out.println("Equiv Max: " + holds);
				dlstat[5] = new JLabel("6RM = " + holds + " ");
				ePanel.add(dlstat[5]);

				holds = Integer.parseInt(dlMax.getText());
				holds = (holds / 100) * 80;
				System.out.println("Equiv Max: " + holds);
				dlstat[6] = new JLabel("7RM = " + holds + " ");
				ePanel.add(dlstat[6]);

				holds = Integer.parseInt(dlMax.getText());
				holds = (holds / 100) * 78;
				System.out.println("Equiv Max: " + holds);
				dlstat[7] = new JLabel("8RM = " + holds + " ");
				ePanel.add(dlstat[7]);
			}
			liftStats.add(ePanel, BorderLayout.EAST);

			JPanel wPanel = new JPanel();
			lcol = new JLabel[9];
			sqstat = new JLabel[9];
			// JLabel[] sqstat= new JLabel[9];
			wPanel.setLayout(new BoxLayout(wPanel, BoxLayout.Y_AXIS));

			btitle = new JLabel("       -Squat-");
			wPanel.add(btitle);
			if (!squatMax.getText().equals("")) {
				System.out.println(squatMax.getText());
				sqstat[0] = new JLabel("       1RM = " + squatMax.getText());
				wPanel.add(sqstat[0]);

				holds = Integer.parseInt(squatMax.getText());
				holds = (holds / 100) * 95;
				System.out.println("Equiv Max: " + holds);
				sqstat[1] = new JLabel("       2RM = " + holds);
				wPanel.add(sqstat[1]);

				holds = Integer.parseInt(squatMax.getText());
				holds = (holds / 100) * 90;
				System.out.println("Equiv Max: " + holds);
				sqstat[2] = new JLabel("       3RM = " + holds);
				wPanel.add(sqstat[2]);

				holds = Integer.parseInt(squatMax.getText());
				holds = (holds / 100) * 85;
				System.out.println("Equiv Max: " + holds);
				sqstat[3] = new JLabel("       4RM = " + holds);
				wPanel.add(sqstat[3]);

				holds = Integer.parseInt(squatMax.getText());
				holds = (holds / 100) * 85;
				System.out.println("Equiv Max: " + holds);
				sqstat[4] = new JLabel("       5RM = " + holds);
				wPanel.add(sqstat[4]);

				holds = Integer.parseInt(squatMax.getText());
				holds = (holds / 100) * 85;
				System.out.println("Equiv Max: " + holds);
				sqstat[5] = new JLabel("       6RM = " + holds);
				wPanel.add(sqstat[5]);

				holds = Integer.parseInt(squatMax.getText());
				holds = (holds / 100) * 80;
				System.out.println("Equiv Max: " + holds);
				sqstat[6] = new JLabel("       7RM = " + holds);
				wPanel.add(sqstat[6]);

				holds = Integer.parseInt(squatMax.getText());
				holds = (holds / 100) * 78;
				System.out.println("Equiv Max: " + holds);
				sqstat[7] = new JLabel("       8RM = " + holds);
				wPanel.add(sqstat[7]);

			}
			liftStats.add(wPanel, BorderLayout.CENTER);

			liftStats.add(Box.createVerticalStrut(25), BorderLayout.NORTH);

			liftStats.setSize(240, 240);
			liftStats.setBackground(Color.BLACK);

			// liftStats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			liftStats.setResizable(false);
			liftStats.setVisible(true);
		}

	}

	/**
	 * This method is used to remove any null fields in the program when a 
	 * lifting template is loaded into program.
	 */
	public static void removeNull() {
		
		System.out.println("><><><><><><><><><><><><><><><>");

		for (int ss = 0; ss < 20; ss++) {
			
			if(weekOneArrayEx[ss].equals("") ){
				weekOneArrayEx[ss]="---";
			}
			if(weekOneArraySet[ss].equals("") ){
				weekOneArraySet[ss]="---";
			}
			if(weekOneArrayPercent[ss].equals("") ){
				weekOneArrayPercent[ss]="---";
			}
			
			
			
		}
			

		
		

	}

	/**
	 * This method saves the program to a text file in the users desktop
	 * directory.
	 * @param zz This is used to verify whether the selected file exists already.
	 * @throws FileNotFoundException
	 */
	public void saveMethod(int zz) throws FileNotFoundException {

		removeNull();

		String testword = new String(fileNameSave.getText());

		PrintWriter out;

		String userHomeFolder = System.getProperty("user.home");
		if (zz == 0) {
			File file = new File(userHomeFolder + "/Desktop/ProgramFiles",
					testword + ".txt");

			trString = testword;

			out = new PrintWriter(file);

		} else {
			File file = new File(userHomeFolder + "/Desktop/ProgramFiles",
					trString + ".txt");

			out = new PrintWriter(file);
		}

		// PrintWriter out = new PrintWriter(file);

		for (int z = 0; z < 5; z++) {
			// if (weekOneArrayEx[z] != null) {
			out.println(weekOneArrayEx[z] + "," + weekOneArraySet[z] + ","
					+ weekOneArrayPercent[z]);
			// }

		}
		for (int z = 5; z < 10; z++) {
			// if (weekOneArrayEx[z] != null) {

			out.println(weekOneArrayEx[z] + "," + weekOneArraySet[z] + ","
					+ weekOneArrayPercent[z]);
			// }
		}
		for (int z = 10; z < 15; z++) {
			// if (weekOneArrayEx[z] != null) {

			out.println(weekOneArrayEx[z] + "," + weekOneArraySet[z] + ","
					+ weekOneArrayPercent[z]);
			// }
		}
		for (int z = 15; z < 20; z++) {

			out.println(weekOneArrayEx[z] + "," + weekOneArraySet[z] + ","
					+ weekOneArrayPercent[z]);

		}
		for (int t2 = 0; t2 < 5; t2++) {
			// if (weekTwoArrayEx[t2] != null) {
			out.println(weekTwoArrayEx[t2] + "," + weekTwoArraySet[t2] + ","
					+ weekTwoArrayPercent[t2]);
			// }

		}
		for (int t2 = 5; t2 < 10; t2++) {
			// if (weekTwoArrayEx[t2] != null) {

			out.println(weekTwoArrayEx[t2] + "," + weekTwoArraySet[t2] + ","
					+ weekTwoArrayPercent[t2]);
			// }
		}
		for (int t2 = 10; t2 < 15; t2++) {
			// if (weekTwoArrayEx[t2] != null) {

			out.println(weekTwoArrayEx[t2] + "," + weekTwoArraySet[t2] + ","
					+ weekTwoArrayPercent[t2]);
			// }
		}

		for (int t2 = 15; t2 < 20; t2++) {
			// if (weekTwoArrayEx[t2] != null) {
			out.println(weekTwoArrayEx[t2] + "," + weekTwoArraySet[t2] + ","
					+ weekTwoArrayPercent[t2]);
			// }
		}

		// week 3
		for (int t2 = 0; t2 < 5; t2++) {
			// if (weekThreeArrayEx[t2] != null) {
			out.println(weekThreeArrayEx[t2] + "," + weekThreeArraySet[t2]
					+ "," + weekThreeArrayPercent[t2]);
			// }

		}
		for (int t222 = 5; t222 < 10; t222++) {
			// if (weekThreeArrayEx[t222] != null) {

			out.println(weekThreeArrayEx[t222] + "," + weekThreeArraySet[t222]
					+ "," + weekThreeArrayPercent[t222]);
			// }
		}
		for (int t222 = 10; t222 < 15; t222++) {
			// if (weekThreeArrayEx[t222] != null) {

			out.println(weekThreeArrayEx[t222] + "," + weekThreeArraySet[t222]
					+ "," + weekThreeArrayPercent[t222]);
			// }
		}
		for (int t2222 = 15; t2222 < 20; t2222++) {
			// if (weekThreeArrayEx[t2222] != null) {
			out.println(weekThreeArrayEx[t2222] + ","
					+ weekThreeArraySet[t2222] + ","
					+ weekThreeArrayPercent[t2222]);
			// }
		}

		// week 4
		for (int t42 = 0; t42 < 5; t42++) {
			// if (weekFourArrayEx[t42] != null) {
			out.println(weekFourArrayEx[t42] + "," + weekFourArraySet[t42]
					+ "," + weekFourArrayPercent[t42]);
			// }

		}
		for (int t24 = 5; t24 < 10; t24++) {
			// if (weekFourArrayEx[t24] != null) {

			out.println(weekFourArrayEx[t24] + "," + weekFourArraySet[t24]
					+ "," + weekFourArrayPercent[t24]);
			// }
		}
		for (int t244 = 10; t244 < 15; t244++) {
			// if (weekFourArrayEx[t244] != null) {

			out.println(weekFourArrayEx[t244] + "," + weekFourArraySet[t244]
					+ "," + weekFourArrayPercent[t244]);
			// }
		}
		for (int t2444 = 15; t2444 < 20; t2444++) {
			// if (weekFourArrayEx[t2444] != null) {
			out.println(weekFourArrayEx[t2444] + "," + weekFourArraySet[t2444]
					+ "," + weekFourArrayPercent[t2444]);
			// }
		}
		// week 5
		for (int t52 = 0; t52 < 5; t52++) {
			// if (weekFiveArrayEx[t52] != null) {
			out.println(weekFiveArrayEx[t52] + "," + weekFiveArraySet[t52]
					+ "," + weekFiveArrayPercent[t52]);
			// }

		}
		for (int t25 = 5; t25 < 10; t25++) {
			// if (weekFiveArrayEx[t25] != null) {

			out.println(weekFiveArrayEx[t25] + "," + weekFiveArraySet[t25]
					+ "," + weekFiveArrayPercent[t25]);
			// }
		}
		for (int t255 = 10; t255 < 15; t255++) {
			// if (weekFiveArrayEx[t255] != null) {

			out.println(weekFiveArrayEx[t255] + "," + weekFiveArraySet[t255]
					+ "," + weekFiveArrayPercent[t255]);
			// }
		}
		for (int t2555 = 15; t2555 < 20; t2555++) {
			// if (weekFiveArrayEx[t2555] != null) {
			out.println(weekFiveArrayEx[t2555] + "," + weekFiveArraySet[t2555]
					+ "," + weekFiveArrayPercent[t2555]);
			// }
		}
		// week 6
		for (int t62 = 0; t62 < 5; t62++) {
			// if (weekSixArrayEx[t62] != null) {
			out.println(weekSixArrayEx[t62] + "," + weekSixArraySet[t62] + ","
					+ weekSixArrayPercent[t62]);
			// }

		}
		for (int t26 = 5; t26 < 10; t26++) {
			// if (weekSixArrayEx[t26] != null) {

			out.println(weekSixArrayEx[t26] + "," + weekSixArraySet[t26] + ","
					+ weekSixArrayPercent[t26]);
			// }
		}
		for (int t266 = 10; t266 < 15; t266++) {
			// if (weekSixArrayEx[t266] != null) {

			out.println(weekSixArrayEx[t266] + "," + weekSixArraySet[t266]
					+ "," + weekSixArrayPercent[t266]);
			// }
		}
		for (int t2666 = 15; t2666 < 20; t2666++) {
			// if (weekSixArrayEx[t2666] != null) {
			out.println(weekSixArrayEx[t2666] + "," + weekSixArraySet[t2666]
					+ "," + weekSixArrayPercent[t2666]);
			// }
		}

		// week 7
		for (int t27 = 0; t27 < 5; t27++) {
			// if (weekSevenArrayEx[t27] != null) {
			out.println(weekSevenArrayEx[t27] + "," + weekSevenArraySet[t27]
					+ "," + weekSevenArrayPercent[t27]);
			// }

		}
		for (int t72 = 5; t72 < 10; t72++) {
			// if (weekSevenArrayEx[t72] != null) {

			out.println(weekSevenArrayEx[t72] + "," + weekSevenArraySet[t72]
					+ "," + weekSevenArrayPercent[t72]);
			// }
		}
		for (int t772 = 10; t772 < 15; t772++) {
			// if (weekSevenArrayEx[t772] != null) {

			out.println(weekSevenArrayEx[t772] + "," + weekSevenArraySet[t772]
					+ "," + weekSevenArrayPercent[t772]);
			// }
		}
		for (int t7772 = 15; t7772 < 20; t7772++) {
			// if (weekSevenArrayEx[t7772] != null) {
			out.println(weekSevenArrayEx[t7772] + ","
					+ weekSevenArraySet[t7772] + ","
					+ weekSevenArrayPercent[t7772]);
			// }
		}

		// week 8
		for (int t81 = 0; t81 < 5; t81++) {
			// if (weekEightArrayEx[t81] != null) {
			out.println(weekEightArrayEx[t81] + "," + weekEightArraySet[t81]
					+ "," + weekEightArrayPercent[t81]);
			// }

		}
		for (int t82 = 5; t82 < 10; t82++) {
			// if (weekEightArrayEx[t82] != null) {

			out.println(weekEightArrayEx[t82] + "," + weekEightArraySet[t82]
					+ "," + weekEightArrayPercent[t82]);
			// }
		}
		for (int t882 = 10; t882 < 15; t882++) {
			// if (weekEightArrayEx[t882] != null) {

			out.println(weekEightArrayEx[t882] + "," + weekEightArraySet[t882]
					+ "," + weekEightArrayPercent[t882]);
			// }
		}
		for (int t8882 = 18885; t8882 < 20; t8882++) {
			// if (weekEightArrayEx[t8882] != null) {
			out.println(weekEightArrayEx[t8882] + ","
					+ weekEightArraySet[t8882] + ","
					+ weekEightArrayPercent[t8882]);
			// }
		}

		out.close();
	}

	/**
	 * @param location
	 * @param destination
	 */
	public static void setNextWeek(String[] location, String[] destination) {

		for (int x = 0; x < location.length; x++) {
			destination[x] = location[x];
			System.out.println(destination[x]);
		}

	}

	/**
	 * This method is used to jump to various
	 * @param weekOneArrayEx
	 * @param weekOneArraySet
	 * @param weekOneArrayPercent
	 */
	public void jumpTo(String[] weekOneArrayEx, String[] weekOneArraySet,
			String[] weekOneArrayPercent) {

		// ex
		oneWk1D1.setText(weekOneArrayEx[0]);
		twoWk1D1.setText(weekOneArrayEx[1]);
		threeWk1D1.setText(weekOneArrayEx[2]);
		fourWk1D1.setText(weekOneArrayEx[3]);
		fiveWk1D1.setText(weekOneArrayEx[4]);

		oneWk1D2.setText(weekOneArrayEx[5]);
		twoWk1D2.setText(weekOneArrayEx[6]);
		threeWk1D2.setText(weekOneArrayEx[7]);
		fourWk1D2.setText(weekOneArrayEx[8]);
		fiveWk1D2.setText(weekOneArrayEx[9]);

		oneWk1D3.setText(weekOneArrayEx[10]);
		twoWk1D3.setText(weekOneArrayEx[11]);
		threeWk1D3.setText(weekOneArrayEx[12]);
		fourWk1D3.setText(weekOneArrayEx[13]);
		fiveWk1D3.setText(weekOneArrayEx[14]);

		oneWk1D4.setText(weekOneArrayEx[15]);
		twoWk1D4.setText(weekOneArrayEx[16]);
		threeWk1D4.setText(weekOneArrayEx[17]);
		fourWk1D4.setText(weekOneArrayEx[18]);
		fiveWk1D4.setText(weekOneArrayEx[19]);

		// /sets

		oneWk1D1set.setText(weekOneArraySet[0]);
		twoWk1D1set.setText(weekOneArraySet[1]);
		threeWk1D1set.setText(weekOneArraySet[2]);
		fourWk1D1set.setText(weekOneArraySet[3]);
		fiveWk1D1set.setText(weekOneArraySet[4]);

		oneWk1D2set.setText(weekOneArraySet[5]);
		twoWk1D2set.setText(weekOneArraySet[6]);
		threeWk1D2set.setText(weekOneArraySet[7]);
		fourWk1D2set.setText(weekOneArraySet[8]);
		fiveWk1D2set.setText(weekOneArraySet[9]);

		oneWk1D3set.setText(weekOneArraySet[10]);
		twoWk1D3set.setText(weekOneArraySet[11]);
		threeWk1D3set.setText(weekOneArraySet[12]);
		fourWk1D3set.setText(weekOneArraySet[13]);
		fiveWk1D3set.setText(weekOneArraySet[14]);

		oneWk1D4set.setText(weekOneArraySet[15]);
		twoWk1D4set.setText(weekOneArraySet[16]);
		threeWk1D4set.setText(weekOneArraySet[17]);
		fourWk1D4set.setText(weekOneArraySet[18]);
		fiveWk1D4set.setText(weekOneArraySet[19]);

		// percents

		oneWk1D1rep.setText(weekOneArrayPercent[0]);
		twoWk1D1rep.setText(weekOneArrayPercent[1]);
		threeWk1D1rep.setText(weekOneArrayPercent[2]);
		fourWk1D1rep.setText(weekOneArrayPercent[3]);
		fiveWk1D1rep.setText(weekOneArrayPercent[4]);

		oneWk1D2rep.setText(weekOneArrayPercent[5]);
		twoWk1D2rep.setText(weekOneArrayPercent[6]);
		threeWk1D2rep.setText(weekOneArrayPercent[7]);
		fourWk1D2rep.setText(weekOneArrayPercent[8]);
		fiveWk1D2rep.setText(weekOneArrayPercent[9]);

		oneWk1D3rep.setText(weekOneArrayPercent[10]);
		twoWk1D3rep.setText(weekOneArrayPercent[11]);
		threeWk1D3rep.setText(weekOneArrayPercent[12]);
		fourWk1D3rep.setText(weekOneArrayPercent[13]);
		fiveWk1D3rep.setText(weekOneArrayPercent[14]);

		oneWk1D4rep.setText(weekOneArrayPercent[15]);
		twoWk1D4rep.setText(weekOneArrayPercent[16]);
		threeWk1D4rep.setText(weekOneArrayPercent[17]);
		fourWk1D4rep.setText(weekOneArrayPercent[18]);
		fiveWk1D4rep.setText(weekOneArrayPercent[19]);

	}

	/**
	 * Unused method. Charting was a feature that was never finished.
	 * @param arperc
	 */
	@Deprecated
	public static void setChart(String[] arperc) {

		int[] x = new int[arperc.length];

		int[] xv = { 90, 80, 85, 85, 45, 34, 78, 90, 90, 80, 85, 85, 45, 34,
				78, 90 };

		// for(int z = 0; z<=arperc.length; z++){
		// System.out.println(arperc[z]);
		//
		// if(arperc[z] != null){
		// x[z]= Integer.parseInt(arperc[z]);
		//
		// System.out.println(x[z]);
		// }
		// }

		/**
		 * 
		 * 
		 * Use the heaviest lift?
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		createAndShowGui(xv);

		// createAndShowGui(x);
	}

	/**
	 * Unused method.
	 * @param x2
	 */
	@Deprecated
	private static void createAndShowGui(int[] x2) {
		List<Double> scores = new ArrayList<>();

		for (int z = 0; z < 15; z++) {
			System.out.println(x2[z]);

			scores.add((double) x2[z]);

		}

		GraphPanel mainPanel = new GraphPanel(scores);
		mainPanel.setPreferredSize(new Dimension(800, 600));
		JFrame frame = new JFrame("X Axis is: Week,Day,EX");
		frame.getContentPane().add(mainPanel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	/**
	 * This method is used to print out the workout into a text file.
	 * Wasn't finished in time.
	 * @param out
	 * @param weekOneArrayEx
	 * @param weekOneArraySet
	 * @param weekOneArrayPercent
	 */
	@Deprecated
	public static void printWkt(PrintWriter out, String[] weekOneArrayEx,
			String[] weekOneArraySet, String[] weekOneArrayPercent) {

		if (printIntWeek == 1) {
			out.println("---------------Week One---");
		} else if (printIntWeek == 2) {
			out.println("---------------Week Two---");
		} else if (printIntWeek == 3) {
			out.println("---------------Week Three---");
		} else if (printIntWeek == 4) {
			out.println("---------------Week Four---");
		} else if (printIntWeek == 5) {
			out.println("---------------Week Five---");
		} else if (printIntWeek == 6) {
			out.println("---------------Week Six---");
		} else if (printIntWeek == 7) {
			out.println("---------------Week Seven---");
		} else if (printIntWeek == 8) {
			out.println("---------------Week Eight---");
		}

		out.println("\n");
		if (weekOneArrayEx[0] == null) {

		} else {
			out.println("---Day One---");
			for (int zs = 0; zs < 5; zs++) {

				out.println(weekOneArrayEx[zs] + " - " + weekOneArraySet[zs]
						+ " at " + weekOneArrayPercent[zs] + "%");

			}
			out.println("\n");
		}
		if (weekOneArrayEx[5] == null) {

		} else {

			out.println("---Day Two---");
			for (int z1 = 5; z1 < 10; z1++) {

				out.println(weekOneArrayEx[z1] + " - " + weekOneArraySet[z1]
						+ " at " + weekOneArrayPercent[z1] + "%");

			}
			out.println("\n");
		}
		if (weekOneArrayEx[10] == null) {

		} else {
			out.println("---Day Three---");
			for (int z = 10; z < 15; z++) {

				out.println(weekOneArrayEx[z] + " - " + weekOneArraySet[z]
						+ " at " + weekOneArrayPercent[z] + "%");

			}
			out.println("\n");
		}

		if (weekOneArrayEx[15] == null) {

		} else {
			out.println("---Day Four---");
			for (int z = 15; z < 20; z++) {

				out.println(weekOneArrayEx[z] + " - " + weekOneArraySet[z]
						+ " at " + weekOneArrayPercent[z] + "%");

			}
		}
		printIntWeek++;

	}

}

//