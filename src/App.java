import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.text.Utilities;


public class App {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){

			
			public void run() {
				new MainFrame();
				
				
			}
			
		});
		
	}

}
