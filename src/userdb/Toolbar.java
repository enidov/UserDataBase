package userdb;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Toolbar extends JPanel implements ActionListener{
	
	private JButton helloButton;
	private JButton goodByeButton;
	private StringListener textListener;
	
	
	public Toolbar(){
		
		setBorder(BorderFactory.createEtchedBorder());
		
		helloButton = new JButton("Hello");
		goodByeButton= new JButton("GoodBye");
		
		helloButton.addActionListener(this);
		goodByeButton.addActionListener(this);
		
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodByeButton);
	}
	
	public void setStringListener(StringListener listener){
		this.textListener= listener;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
	if(clicked == helloButton){
		if(textListener != null){
			textListener.textEmitted("Hello\n");
		}
	}
	else if(clicked == goodByeButton){
		if(textListener != null){
			textListener.textEmitted("GoodBye\n");
		}
	}

	}
}
