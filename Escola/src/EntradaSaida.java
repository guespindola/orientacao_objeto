import javax.swing.JOptionPane;

public class EntradaSaida {
	

	public static String solicitarNome(String mensagem) {
		String nome = JOptionPane.showInputDialog(mensagem);
		return nome;
	}
	
	public static long solicitarCpf(String mensagem) {
		long cpf = Long.parseLong(JOptionPane.showInputDialog(mensagem));
		return cpf;
	}
	
	public static double solicitarSalario(String mensagem) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
		return salario;
	}
	
	public static String solicitarDataNascimento (String mensagem) {
		String dataNascimento = JOptionPane.showInputDialog(mensagem);
		return dataNascimento;
	}
	
public static void mostrarDadosProfessor(Professor p) {
		
		JOptionPane.showMessageDialog(null,"Os dados do professor são: \n"
				+ "Nome: "+ p.getNomeCompleto()+"\n"
				+ "CPF: "+ p.getCpf()+"\n"
				+ "Preço: "+ p.getSalario());
	}

public static void mostrarDadosEstudante(Estudante e) {
	
	JOptionPane.showMessageDialog(null,"Os dados do estudante são: \n"
			+ "Nome: "+ e.getNomeCompleto()+"\n"
			+ "CPF: "+ e.getCpf()+"\n"
			+ "Data de nascimento: "+ e.getDataNascimento());
}

public static int solicitarOpMenu (String mensagem) {
	int opMenu = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
	return opMenu;
}



	
}