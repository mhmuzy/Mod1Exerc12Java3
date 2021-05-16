package Hitss.Treinamento.Infra;

public class Controller {
	public static void Play() {
		String[] musica = new String[5];
		musica[1] = "On the first day of Christmas, my love gave to me a";
		musica[2] = "partridge in a pear tree.";
		musica[3] = "On the second day of Christmas, my love gave to me two";
		musica[4] = "turtle doves";
		
		System.out.println("");
		System.out.println("      Hitss Treinamento");
		System.out.println("");
		System.out.println("Seguem a Música Natalina:");
		System.out.println("");
		
		for (int i = 1; i < musica.length; i++) {
			System.out.println(musica[i]);
		}
	}
}
