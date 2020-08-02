import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
public class Comissao {
	public static void main(String[] args) {
		DecimalFormat decimal = new DecimalFormat("#,###.00");
		int qtdVendida;
		double vUnitario, pComissao, aReceber, vTotal;

		try { //Tratamento de erro

			// Pergunto o valor da pe�a
			vUnitario = decimal.parse(JOptionPane.showInputDialog(null, "Qual o valor unit�rio da pe�a (R$)?",
					"C�lculo de Comiss�o", JOptionPane.QUESTION_MESSAGE)).doubleValue();
			// Solicito a quantidade pe�as
			qtdVendida = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas pe�as voc� vendeu?",
					"C�lculo de Comiss�o", JOptionPane.QUESTION_MESSAGE));
			// Quanto eu recebo de comiss�o
			pComissao = decimal.parse(JOptionPane.showInputDialog(null, "Qual a porcentagem da comiss�o (%)?",
					"C�lculo de Comiss�o", JOptionPane.QUESTION_MESSAGE)).doubleValue();
            //Calculos vTotal e aReceber
			vTotal = qtdVendida * vUnitario;
			aReceber = vTotal * pComissao / 100;
            //Mensagem 
			JOptionPane.showMessageDialog(null, "O valor pago total � de R$ " + decimal.format(vTotal),
					"C�lculo de Comiss�o", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O valor a receber ser� de R$ " + decimal.format(aReceber),
					"C�lculo de Comiss�o", JOptionPane.INFORMATION_MESSAGE);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
