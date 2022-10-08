import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pesquisa {
	public static void main(String[] args) {

		String entradaParticipantes = JOptionPane.showInputDialog(
				"Informe o número de participantes da pesquisa \n" + "(Limite máximo de 150 participantes)");

		if (Integer.parseInt(entradaParticipantes) > 150) {
			JOptionPane.showMessageDialog(null, "Número de participantes inválido. Verifique!", "Pesquisa",
					JOptionPane.PLAIN_MESSAGE);
		} else {
			ArrayList<Pessoa> lista;

			lista = new ArrayList<Pessoa>();

			int calmos = 0, calmoMenorDezoito = 0, calmoOutros = 0, nervososMaioresQuarenta = 0, mulheresNervosas = 0,
					homensAgressivos = 0;

			for (int i = 0; i < Integer.parseInt(entradaParticipantes); i++) {
				String entradaIdade = JOptionPane.showInputDialog("Informe sua idade:");
				if (Integer.parseInt(entradaIdade) == 0) {
					JOptionPane.showMessageDialog(null, "Informe uma idade válida.");
					return;
				}
				String entradaSexo = JOptionPane.showInputDialog(
						"Informe seu sexo: \n" + "1 - Feminino \n" + "2 - Masculino \n" + "3 - Outros \n");
				if ((Integer.parseInt(entradaSexo) <= 0) && (Integer.parseInt(entradaSexo) > 3)) {
					JOptionPane.showMessageDialog(null, "Informe uma opção válida.");
					return;
				}
				String entradaTemperamento = JOptionPane.showInputDialog(
						"Informe seu temperamento: \n" + "1 - Calmo \n" + "2 - Nervoso \n" + "3 - Agressivo\n");
				if ((Integer.parseInt(entradaTemperamento) <= 0) && (Integer.parseInt(entradaSexo) > 3)) {
					JOptionPane.showMessageDialog(null, "Informe uma opção válida.");
					return;
				}
				lista.add(new Pessoa(Integer.parseInt(entradaIdade), Integer.parseInt(entradaSexo),
						Integer.parseInt(entradaTemperamento)));
			}

			for (int i = 0; i < lista.size(); i++) {

				if (lista.get(i).getTemperamento() == 1) {
					calmos++;
					if (lista.get(i).getIdade() < 18) {
						calmoMenorDezoito++;
					}
					if (lista.get(i).getSexo() == 3) {
						calmoOutros++;
					}
				}
				if (lista.get(i).getTemperamento() == 2) {
					if (lista.get(i).getIdade() > 40) {
						nervososMaioresQuarenta++;
					}
					if (lista.get(i).getSexo() == 1) {
						mulheresNervosas++;
					}
				}
				if ((lista.get(i).getTemperamento() == 3) && (lista.get(i).getSexo() == 2)) {
					homensAgressivos++;
				}
			}

			JOptionPane.showMessageDialog(null, "Total de Participamentes: " + Integer.parseInt(entradaParticipantes)
					+ '\n' + "Total de pessoas calmas: " + calmos + '\n' + "Pessoas calmas menores de 18 anos: "
					+ calmoMenorDezoito + '\n' + "Outros calmos: " + calmoOutros + '\n'
					+ "Pessoas nervosas com mais de 40 anos: " + nervososMaioresQuarenta + '\n' + "Mulheres nervosas: "
					+ mulheresNervosas + '\n' + "Homens Agressivos: " + homensAgressivos + '\n', "Pesquisa",
					JOptionPane.PLAIN_MESSAGE);

		}
	}

}