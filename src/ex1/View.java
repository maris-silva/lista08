package ex1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class View {

	    private JFrame frame;
	    private JTextField inputField;
	    private JButton calculateButton;
	    private JLabel resultLabel;
	    private JDialog popup;
	    private JLabel error_message;

	    public View() {
	        configuraJanela();
	    }

	    

	    // cria a interface gráfica
	    public void configuraJanela() {
	        frame = new JFrame("Calculadora de Fatorial");
	        frame.setLayout(new FlowLayout());
	        frame.setSize(300, 150);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null);
	        
	        inputField = new JTextField(10);
	        calculateButton = new JButton("Calcular");
	        resultLabel = new JLabel("Resultado:");

	        frame.add(inputField);
	        frame.add(calculateButton);
	        frame.add(resultLabel);

	        calculateButton.addActionListener(new CalcularFatorial());

	        frame.setVisible(true);
	    }
	    
	    
	    // usa o Controller e faz o tratamento de exceções
	    private class CalcularFatorial implements ActionListener {
	    	public CalcularFatorial() {
	    	}
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
		        try {
		            int numero = Integer.parseInt(inputField.getText());
		            int resultado = Controller.calcularFatorial(numero);
		            resultLabel.setText("Resultado: " + resultado);
		        } catch (NumberFormatException ex) {
		        	criaPopUp("Inválido. Não inteiro.");
		        } catch (IllegalArgumentException ex) {
		        	criaPopUp(ex.getMessage());
		        }
	    	}
	    }

	    public void criaPopUp(String message) {
        	popup = new JDialog(frame, "Erro", true);
        	popup.setSize(300, 150);
        	error_message = new JLabel(message);
        	popup.add(error_message);
        	popup.setLocationRelativeTo(frame);
        	popup.setVisible(true);
        	popup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	    
	    // getters para testes 
	    public JTextField getInputField() {
	        return inputField;
	    }

	    public JButton getCalculateButton() {
	        return calculateButton;
	    }
	    
	    public JLabel getResultLabel() {
	    	return resultLabel;
	    }
	    
	    public JDialog getPopUp() {
	    	return popup;
	    }
	    
	    public JLabel getErrorMessage() {
	    	return error_message;
	    }
	    


	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new View();
	            }
	        });
	    }
}