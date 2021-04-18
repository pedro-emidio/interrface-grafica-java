import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;

public class MyLabel extends JLabel {
	
	private static final long serialVersionUID = 1L;

	public MyLabel(String texto) {
		super(texto);
		init(); 
		
	}
	
	private void init() {
	
	this.setHorizontalAlignment(JLabel.LEFT);
	this.setForeground(Color.black); 
	this.setPreferredSize(new Dimension(100,50));
	this.setFont(new Font(null,Font.BOLD,15));
	
	}

}
