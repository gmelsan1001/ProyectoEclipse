package tema03;

public class testRegexDni {

	public static void main(String[] args) {
		String test = "4523890K";
		String patron = "[a-z]+";
		
		if (UtilidadesCadenas.testRegexDni(test, patron)) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}

}
