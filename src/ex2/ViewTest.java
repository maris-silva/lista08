package ex2;

import org.junit.Test;
import ex1.View;
import static org.junit.Assert.*;

import javax.accessibility.Accessible;
import javax.swing.*;

public class ViewTest {
    
	
	// para testar nossa interface, vamos simular o comportamento do usuário apertando o botão e etc
	
    @Test
    public void testCalculoFatorial() {        
        View view = new View();
        
        view.getInputField().setText("5");
        view.getCalculateButton().doClick();
        assertEquals("Resultado: 120", view.getResultLabel().getText());
    }
    
    @Test
    public void testEntradaString() {
        View view = new View();
        view.getInputField().setText("aaaaaaaaaaaaaaa");
        boolean erro = false;
        
        try {
        	view.getCalculateButton().doClick();
        } catch (Exception e) {
        	erro = true;
        }
        assertTrue(erro);
    }
    
    @Test
    public void testValorNegativo() {
        View view = new View();
        view.getInputField().setText("-5");
        boolean erro = false;

        try {
        	view.getCalculateButton().doClick();
        } catch (Exception e) {
        	erro = true;
        }
        assertTrue(erro);
    }    
}
