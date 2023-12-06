package ejercisios;

public class Bucles {

	public static void main(String[] args) {

		// casos para terminar los for //auterfor

		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + j);
				if (j == 1) {
					break outer;
				}

				/*
				 * if(i==2) { continue; } System.out.println(i);
				 */
			}

		}
	}
}
