import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
public class Comissao {
	public static void main(String[] args) {
		DecimalFormat decimal = new DecimalFormat("#,###.00");
		int qtdVendida;
		double vUnitario, pComissao, aReceber, vTotal;

		try { //Tratamento de erro

			// Pergunto o valor da peça
			vUnitario = decimal.parse(JOptionPane.showInputDialog(null, "Qual o valor unitário da peça (R$)?",
					"Cálculo de Comissão", JOptionPane.QUESTION_MESSAGE)).doubleValue();
			// Solicito a quantidade peças
			qtdVendida = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas peças você vendeu?",
					"Cálculo de Comissão", JOptionPane.QUESTION_MESSAGE));
			// Quanto eu recebo de comissão
			pComissao = decimal.parse(JOptionPane.showInputDialog(null, "Qual a porcentagem da comissão (%)?",
					"Cálculo de Comissão", JOptionPane.QUESTION_MESSAGE)).doubleValue();
            //Calculos vTotal e aReceber
			vTotal = qtdVendida * vUnitario;
			aReceber = vTotal * pComissao / 100;
            //Mensagem 
			JOptionPane.showMessageDialog(null, "O valor pago total é de R$ " + decimal.format(vTotal),
					"Cálculo de Comissão", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "O valor a receber será de R$ " + decimal.format(aReceber),
					"Cálculo de Comissão", JOptionPane.INFORMATION_MESSAGE);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
