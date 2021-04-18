
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Color;

public class MyTextField extends JTextField {
	
	private static final long serialVersionUID = 1L;
	
	public MyTextField() {
		super();
		init();
		
		
	}

	private void init() {
		this.setPreferredSize(new Dimension(200,30));
		this.setBackground(Color.WHITE);
		this.setBorder(BordaFactory.create());
		
	}

}
 