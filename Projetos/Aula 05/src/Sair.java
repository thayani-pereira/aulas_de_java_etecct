import javax.swing.JOptionPane;

public class Sair {
	public static void main(String[] args) {
		int res = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?");
		switch (res) {
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Escolheu SIM!");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Escolheu NÃO!");
			break;
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Escolheu CANCELAR!");
			break;
		case JOptionPane.CLOSED_OPTION:
			JOptionPane.showMessageDialog(null, "Fechou a caixa!");
			break;
		}
	}
}