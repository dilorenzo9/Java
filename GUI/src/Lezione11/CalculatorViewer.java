package Lezione11;

import javax.swing.JFrame;

/*
 * Main interfaccia GUI simula funzionamento calcolatrice base
 */

public class CalculatorViewer {

		   public static void main(String[] args)
		   {  
		      JFrame frame = new CalculatorFrame();
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setTitle("Calculator");
		      frame.setVisible(true);

		     		      
		   }

	
}
