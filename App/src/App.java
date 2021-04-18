import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;

 

public class App {
    public static void main(String[] args) {
    JFrame frame = new JFrame("My Movies");
    JPanel content = new JPanel(new BorderLayout(20,0));
 
    JPanel image = new JPanel();
    JPanel window = new JPanel(new GridLayout(0,1,0,0));
    JPanel selection = new JPanel (new GridLayout(0,1,0,0));
    selection.setPreferredSize(new Dimension(130,400));
    
    image.add(new JLabel(new ImageIcon("src/imagem2.png")));

    
    MyLabel title = new MyLabel("Título");
    window.add(title);
    MyTextField titulo =  new MyTextField();
    window.add(titulo);
    
    MyLabel sinopsesynopsis = new MyLabel("Sinopse");
    window.add(sinopsesynopsis);
    MyTextField sinopse =  new MyTextField();
    window.add(sinopse);
    
    MyLabel gender = new MyLabel("Gênero");
    window.add(gender);
    
    String[] type_gender = {"Drama", "Comédia", "Ação", "Aventura", "Terror", "Animação", "Documentário"};
    JComboBox combo= new JComboBox<String>(type_gender);
    window.add(combo);
    
    
    JButton printButton = new JButton("Print");
    JButton cancelButton = new JButton("Cancel");
    
    
    JPanel painelBotao = new JPanel();
    painelBotao.add(printButton);
    painelBotao.add(cancelButton);
    window.add(painelBotao);
    
    MyLabel where = new MyLabel("Onde assistir");
    selection.add(where);

    List<String> listoptions = List.of("Netflix", "Prime Vídeo", "Globo play"); 
    MyRadioGroup group = new MyRadioGroup(listoptions);
    selection.add(group);
   
    JCheckBox check = new JCheckBox("Assistido");
    selection.add(check);

    MyLabel assessment = new MyLabel("Avaliação");
    selection.add(assessment);
     
    StarRater avaliacao = new StarRater(5);
    selection.add(avaliacao);
    avaliacao.addStarListener(new StarRater.StarListener() {

        @Override
        public void handleSelection(int selection) {
            // TODO Auto-generated method stub
        	avaliacao.setRating(selection );

        }
    });
    
    content.add(image, BorderLayout.WEST);
    content.add(window, BorderLayout.CENTER);
    content.add(selection, BorderLayout.EAST);
    
    
    JTabbedPane abas = new JTabbedPane();
    abas.add("Cadastro", content);
    abas.add("Lista", new JPanel());
    frame.add(abas);    
    
    frame.setSize(600,420);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    printButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
				System.out.println("Título: " + titulo.getText() );
				System.out.println("Assitido: " + check.isSelected());
				System.out.println("Sinopse: " + sinopse.getText() );
				System.out.println("Onde Assistir: " + group.getValue());
				System.out.println("Gênero: " + combo.getSelectedItem());
				System.out.println("Avaliação: " + avaliacao.getRating());
			}
		});
      }

}