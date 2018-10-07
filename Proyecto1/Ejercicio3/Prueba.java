/**
*Se crea la clase principal
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*Objetivo de la interfaz:
*permitimos la existencia de variables polimórficas y la invocación polimórfica de métodos
*/
public class Prueba{
	/**
	*En el metodo main se instancian los objetos de las clases
	*/
	public static void main(String[] args) {
		Perro p = new Perro();
		Gato g = new Gato();
		Vaca v = new Vaca();
		/**Se imprimen los metodos*/
		System.out.println("El perro dice: "+p.animalDice("Woof"));
		System.out.println("El gato dice: "+g.animalDice("Meow"));
		System.out.println("La vaca dice: "+v.animalDice("Muuuuh"));
		
	}
}
