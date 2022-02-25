package aplicacion;
import Matematicas.Matematicas;

public class Principal{
	public static void main(String[] args){
		System.out.println(args[0]);	
		System.out.println("El número PI (recursivo) es " + Matematicas.generarNumeroPiRecursivo());
	}
}
