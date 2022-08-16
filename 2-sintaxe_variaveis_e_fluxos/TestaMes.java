
public class TestaMes {
	public static void main(String[] args) {
		int mes = 4;
		
		switch (mes) {
		case 1:
			System.out.println("O mês" + " " + mes + " é Janeiro");
			break;
		case 2:
			System.out.println("O mês" + " " + mes + " é Fevereiro");
			break;
		case 3:
			System.out.println("O mês" + " " + mes + " é Março");
			break;
		default:
			System.out.println("Mês inválido");
		}
	}
}
