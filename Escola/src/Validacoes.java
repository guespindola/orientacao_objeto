
public class Validacoes {

	public static boolean validarCpf(long cpf) {
		
		if(cpf>0) {
			return true;
		}		
		return false;
	}

	public static boolean validarNome(String nome) {
		if(nome.length()>=4) {
			return true;
		}
		return false;
	}
	
	public static boolean validarSalario (double salario) {
		if(salario>0) {
			return true;
		}
		return true;
	}
	
	public static boolean validarDataNascimento(String dataNascimento) {
		if(dataNascimento.length()<=8){
			return true;
		}		
		return false;
	}
		
	
}
