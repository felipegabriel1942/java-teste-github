package conversao;

public class Conversao {

	public static void main(String[] args) {
		
		Metodos m = new Metodos();
		m.converterDecimalParaHexadecimal(27856);
		
		Pessoa p1 = new Pessoa("Felipe Gabriel",29,"Fortaleza");
		
		System.out.println("Ol� " + p1.getNome() + " voc� tem " + p1.getIdade() + " anos e mora em " + p1.getCidade() + ", que bom... ");
	}
	
	
}
