import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class MyRadioGroup extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private ButtonGroup group = new ButtonGroup();
	private List<String> options;
	public String value;
	
	public String getValue() {
		return value;
	}
	
	public MyRadioGroup(List<String> options) {
		this.options = options;	 
		init();
		 		
	}
	
	private void init() {
		options.forEach(option ->{
			JRadioButton listoptions = new JRadioButton(option); 
			listoptions.setPreferredSize(new Dimension(110, 14));
			listoptions.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					value = option;
				}
			});
			
			group.add(listoptions);
			this.add(listoptions);
			
		});
	}
}
