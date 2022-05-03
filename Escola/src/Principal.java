import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Professor p = new Professor();
		Estudante e = new Estudante();
	
		int opcao; 
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo \n"
					+ "1- Registrar estudante \n"
					+ "2- Registrar professor \n"
					+ "3- Ver dados do estudante \n"
					+ "4- Ver dados do professor \n"
					+ "5- Apagar dados professor \n"
					+ "6- Apagar dados estudante \n"
					+ "7- Sair do programa"));
			switch (opcao) {
			case 1:
					
				e.setNomeCompleto(EntradaSaida.solicitarNome("Informe seu nome completo."));							
				while (Validacoes.validarNome(e.getNomeCompleto())==false) {
					e.setNomeCompleto(EntradaSaida.solicitarNome("Erro, Informe seu nome completo."));
				}				
				
				e.setCpf(EntradaSaida.solicitarCpf("Informe seu CPF."));							
				while (Validacoes.validarCpf(e.getCpf())==false) {
					e.setCpf(EntradaSaida.solicitarCpf("Erro, Informe seu CPF."));
				}		
				
				e.setDataNascimento(EntradaSaida.solicitarDataNascimento("Informe sua data de nascimento."));							
				while (Validacoes.validarDataNascimento(e.getDataNascimento())==false) {
					e.setDataNascimento(EntradaSaida.solicitarDataNascimento("Erro, Informe sua data de nascimento."));
				}	
				
			break;
			
			case 2:
				p.setNomeCompleto(EntradaSaida.solicitarNome("Informe seu nome completo."));						
				while (Validacoes.validarNome(p.getNomeCompleto())==false) {
					p.setNomeCompleto(EntradaSaida.solicitarNome("Erro, Informe seu nome completo."));
				}				
				
				p.setCpf(EntradaSaida.solicitarCpf("Informe seu CPF."));							
				while (Validacoes.validarCpf(p.getCpf())==false) {
					e.setCpf(EntradaSaida.solicitarCpf("Erro, Informe seu CPF."));
				}		
				
				p.setSalario(EntradaSaida.solicitarSalario("Informe seu salario."));							
				while (Validacoes.validarSalario(p.getSalario())==false) {
					p.setSalario(EntradaSaida.solicitarSalario("Erro, Informe seu salario."));
				}	
				
			break;
			
			case 3:
				
				EntradaSaida.mostrarDadosEstudante(e);
				
			break;
			
			case 4:
				
				EntradaSaida.mostrarDadosProfessor(p);
				
			break;
			
			case 5:
				
				p.setNomeCompleto("");
				p.setCpf(0);
				p.setSalario(0);
				JOptionPane.showMessageDialog(null, "Os dados do professor foram apagados.");	
				
			break;
			
			case 6:
				
				e.setNomeCompleto("");
				e.setCpf(0);
				e.setDataNascimento("");
				JOptionPane.showMessageDialog(null, "Os dados do estudante foram apagados.");	
				
			break;
			
			case 7:
				
				
				JOptionPane.showMessageDialog(null, "O programa está sendo encerrado e os dados foram perdidos.");	
				System.exit(0);

				
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");			
			}
		}while(opcao!=7);
		
		
	}

	}
	
	


