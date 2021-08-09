import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AtividadeAvaliativa1 extends JFrame implements ActionListener {

	private JLabel lblComidaPreferida;
	private JTextField txtComidaPreferida;
	private JButton btnComida, btnInformarComida, btnAzul, btnClick, btnSair;
	private JPanel painel;
	
	public AtividadeAvaliativa1(){
		
		this.setTitle("Comida Preferida");
		this.setSize(320, 180);
		this.setLocation(700,400);
		this.setResizable(false);
		
		lblComidaPreferida = new JLabel("Comida", JLabel.LEFT);
		
		txtComidaPreferida = new JTextField(20);
		txtComidaPreferida.setToolTipText("digite a comida favorita");
		
		btnComida = new JButton("Comida");
		btnComida.addActionListener(this);
		
		btnInformarComida = new JButton("Informar Comida");
		btnInformarComida.addActionListener(this);
		
		btnAzul = new JButton("Azul");
		btnAzul.addActionListener(this);
		
		btnClick = new JButton("Click");
		btnClick.addActionListener(this);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		
		painel = new JPanel();
		painel.add(lblComidaPreferida);
		painel.add(txtComidaPreferida);
		painel.add(btnComida);
		painel.add(btnInformarComida);
		painel.add(btnAzul);
		painel.add(btnClick);
		painel.add(btnSair);
		add(painel);
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		
		Object origem = evento.getSource();
	
		if(origem == btnComida) {
			JOptionPane.showMessageDialog(null,"Comida: " + txtComidaPreferida.getText(), "Comida", JOptionPane.INFORMATION_MESSAGE);
		}else if (origem == btnInformarComida) {
			String comida = JOptionPane.showInputDialog(null, "Informe sua comida favorita", "Comida Favorita", JOptionPane.QUESTION_MESSAGE);
			txtComidaPreferida.setText(comida);
		}else if (origem == btnAzul) {
			painel.setBackground(Color.BLUE);
		}else if (origem == btnClick) {
			JOptionPane.showMessageDialog(null,"O botão CLICK foi pressionado", "Botão Pressionado", JOptionPane.INFORMATION_MESSAGE);
		}else if (origem == btnSair) {
			Object[] opcoes = {"Sim", "Não"};
			int retorno = JOptionPane.showOptionDialog(
					null,
					"Tem certeza que deseja encerrar o programa?",
					"Fechar",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					opcoes,
					opcoes[0]);
			
			if(retorno == 0) {System.exit(0);}
		}
			
	}
	
	public static void main(String[] args) {
		
		AtividadeAvaliativa1 janela = new AtividadeAvaliativa1();
		janela.setVisible(true);

	}

}
