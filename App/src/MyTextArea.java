import java.awt.Color;

import javax.swing.JTextArea;


public class MyTextArea extends JTextArea {
	
	private static final long serialVersionUID = 1L;
	
	private int linhas = 10;
	private int colunas =15;
	
	public MyTextArea(){
		super();
		init();
		
	}

	private void init() {
		this.setRows(linhas);
		this.setColumns(colunas);
		this.setBackground(Color.WHITE);
		this.setBorder(BordaFactory.create());		
	}		
}


