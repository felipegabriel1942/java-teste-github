package conversao;

public class Metodos {
	
	public void converterDecimalParaHexadecimal(int x) {
		//Declaração para receber as variaveis
		int resto = x;
		int valor = x;
		String hexadecimal = "";
		
		//Loop para fazer a conversão
		do {
			
			//Para dar certo o calculo de resto tem que vir antes
			resto = valor % 16;
			valor = valor / 16;
			
			//Verificação de codigo hexadecimal para o resto
			switch(resto) {
				case 0:
					hexadecimal = "0" + hexadecimal;
					break;
				case 1:
					hexadecimal = "1" + hexadecimal;
					break;
				case 2:
					hexadecimal = "2" + hexadecimal;
					break;
				case 3:
					hexadecimal = "3" + hexadecimal;
					break;
				case 4:
					hexadecimal ="4" + hexadecimal;
					break;
				case 5:
					hexadecimal = "5" + hexadecimal;
					break;
				case 6:
					hexadecimal = "6" + hexadecimal;
					break;
				case 7:
					hexadecimal = "7" + hexadecimal;
					break;
				case 8:
					hexadecimal = "8" + hexadecimal;
					break;
				case 9:
					hexadecimal = "9" + hexadecimal;
					break;
				case 10:
					hexadecimal = "A" + hexadecimal;
					break;
				case 11:
					hexadecimal = "B" + hexadecimal;
					break;
				case 12:
					hexadecimal = "C" + hexadecimal;
					break;
				case 13:
					hexadecimal = "D" + hexadecimal;
					break;
				case 14:
					hexadecimal = "E" + hexadecimal;
					break;
				case 15:
					hexadecimal = "F" + hexadecimal;
					break;
				case 16:
					hexadecimal = "10" + hexadecimal;
					break;
				case 17:
					hexadecimal = "11" + hexadecimal;
					break;
				case 18:
					hexadecimal = "12" + hexadecimal;
					break;
				case 19:
					hexadecimal = "13" + hexadecimal;
					break;
				case 20:
					hexadecimal = "14" + hexadecimal;
					break;
				case 21:
					hexadecimal = "15" + hexadecimal;
					break;
				case 22:
					hexadecimal = "16" + hexadecimal;
					break;
				case 23:
					hexadecimal = "17" + hexadecimal;
					break;
				case 24:
					hexadecimal = "18" + hexadecimal;
					break;
				case 25:
					hexadecimal = "19" + hexadecimal;
					break;
				case 26:
					hexadecimal = "1A" + hexadecimal;
					break;
				case 27:
					hexadecimal = "1B" + hexadecimal;
					break;
				case 28:
					hexadecimal = "1C" + hexadecimal;
					break;
				case 29:
					hexadecimal = "1D" + hexadecimal;
					break;
				case 30:
					hexadecimal = "1E" + hexadecimal;
					break;
				case 31:
					hexadecimal = "1F" + hexadecimal;
					break;
				case 32:
					hexadecimal = "20" + hexadecimal;
					break;
						
			}
			
		}while(valor > 0);
		System.out.println("O valor " + x + " em Hexadecimal é " + hexadecimal);
	}

}
