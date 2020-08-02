import java.awt.*;
import javax.swing.*;
public class AplicacaoGrafica extends JFrame
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1852537318000039782L;
public AplicacaoGrafica(String nome) {
super(nome);
this.setSize(400,350);
this.setVisible(true);
}
public static void main(String[] args) {
new AplicacaoGrafica("Swinggy 1.0");
}
}