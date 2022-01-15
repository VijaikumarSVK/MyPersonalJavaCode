package YouTubeProgramming;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class orrange extends JFrame {

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordfield;
	
	public orrange(){
		
		super("My text box");
		setLayout  (new FlowLayout(10));
		
		item1 = new JTextField(20);
		add(item1);
		
		item2 = new JTextField("can't able to edit this",20);
		item2.setEditable(false);
		add(item2);
		
		item3 = new JTextField("Enter your name here");
		add(item3);
		
		passwordfield = new JPasswordField(10);
		add(passwordfield);
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordfield.addActionListener(handler);
	}
	
	private class thehandler implements ActionListener{
		
		public void actionPerformed (ActionEvent event){
			
			String str = "";
			
			if(event.getSource() == item1){
				str = String.format("The first fiels is: %s", event.getActionCommand());
			}
			else if(event.getSource()==item2){
				str = String.format("The Second fiels is: %s", event.getActionCommand());
			}
			else if(event.getSource()==item3){
				str = String.format("The Third Field is: %s", event.getActionCommand());
			}
			else if(event.getSource()==passwordfield){
				str =String.format("Your password is: %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null,str);
				
		}		
	}
}
