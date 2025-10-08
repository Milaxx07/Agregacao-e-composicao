import javax.swing.JOptionPane;
public class CalculadoraSimples {
    public static void main(String[] args) {
        try {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            String[] opcoes = {"+", "-", "×", "÷"};
            int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha a operação:",
                "Calculadora Simples",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            double resultado = 0;
            String operacao = "";

            switch (escolha) {
                case 0:
                    resultado = num1 + num2;
                    operacao = "+";
                    break;
                case 1:
                    resultado = num1 - num2;
                    operacao = "-";
                    break;
                case 2:
                    resultado = num1 * num2;
                    operacao = "×";
                    break;
                case 3:
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
                        return;
                    }
                    resultado = num1 / num2;
                    operacao = "÷";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nenhuma operação selecionada!");
                    return;
            }

            JOptionPane.showMessageDialog(null, "Resultado de " + num1 + " " + operacao + " " + num2 + " = " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.");
        }
    }
}
