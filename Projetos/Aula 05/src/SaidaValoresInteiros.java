import javax.swing.JOptionPane;
 
public class SaidaValoresInteiros { 
 
    public static void main(String[] args) throws NumberFormatException {
         
        double valorA =Double.parseDouble(JOptionPane.showInputDialog("Informe o valor A: "));
        double valorB = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor B: "));
        
         
        double resultado = valorA*valorB;
        
         
        JOptionPane.showMessageDialog(null,"Resultado final: "+resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
 
    }
}
