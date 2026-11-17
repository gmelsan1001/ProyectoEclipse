package tema03;

public class TestRegex2 {

	public static void main(String[] args) {
		String test = "4523890K";
		String patron = "[a-z]+";
		
		if (UtilidadesCadenas.validarDni(patron)) {
			System.out.println();
		} else {
			System.out.println();
		}

	}

}
