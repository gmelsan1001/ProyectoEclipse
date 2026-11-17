package tema03;

public class testregex4 {

	public static void main(String[] args) {
		String test = "4523890K";
		String patron = "[a-z]+";
		
		if (UtilidadesCadenas.validarTelefono(test)) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}
