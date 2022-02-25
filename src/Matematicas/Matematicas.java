package Matematicas;

public class Matematicas{
	/**
	* Genera una aproximació n al nú mero pi mediante el mé todo de
	* Montecarlo. El pará metro ` pasos` indica el nú mero de puntos
	* generado.
	*
	* @author Paula Moure
	* @param pasos Número de dardos que se lanzan para poder tener una aproximación de pi más cercana
	* @return pi
	*/
	public static double generarNumeroPiRecursivo(){
		int pasos = 100;
		double termino = 2 * pasos + 1;
		boolean signo = termino % 2 != 0;
		double pi =  4 - generarNumeroPiRecursivoAux(termino, signo);

		return pi;
	}

	private static double generarNumeroPiRecursivoAux(double termino, boolean negativo) {
		double pi = 0;
		if (termino >= 3) {
			int signo = 1;
			if (negativo) {
				signo = -1;
			}
			pi += signo * (4 / termino) + generarNumeroPiRecursivoAux (termino - 2, !negativo);
		}
		return pi;
	}
}
