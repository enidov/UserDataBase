package userdb;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	
private TextPanel textPanel;
private Toolbar toolbar;
private FormPanel formPanel;
	
	public MainFrame(){
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();
		
		toolbar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				textPanel.appendText(text);
			}
		});
		
		formPanel.setFormListener(new FormListener() {
			public void formEventOccurred(FormEvent e){
				String name= e.getName();
				String occupation = e.getOccupation();
				
				textPanel.appendText(name + " : " + occupation + "\n");
			}
		});
		
		
		this.setTitle("Users DATABase!");
		this.setLayout(new BorderLayout());
		
		this.add(formPanel, BorderLayout.WEST);
		this.add(toolbar, BorderLayout.NORTH);
		this.add(textPanel, BorderLayout.CENTER);
		
		this.setMinimumSize(new Dimension(550,500));
		this.setSize(550, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
