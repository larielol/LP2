package lab2;

/**
* Esta classe serve para verificar se o aluno está cansado ou não (descansado) através
* do calculo de horas de descando sobre o número de semanas.
* 
* @author Lucas Ariel Alves de Carvalho
*/

public class Descanso {
	
	/**
	* horasDescanso define as horas de descanso do aluno dentro do período semanal
	*/
	
	private int horasDescanso;
	
	/**
	* numeroSemanas define a quantidade de semanas sobre o descanso do aluno
	*/
	
	private int numeroSemanas;
	
	/**
	* statusGeral define se o aluno está descansado ou não, ele que será a palavra
	*final desta classe
	*/
	
	private String statusGeral;
	
	/**
	* defineHorasDescanso define as horas "inputadas"/enviadas como o atributo desta classe
	*/
	
	public void defineHorasDescanso(int horasDescanso) {
		this.horasDescanso = horasDescanso;
	}
	
	/**
	* defineHorasDescanso define o numero de semanas "inputadas"/enviadas como o atributo desta classe
	*/
	
	public void defineNumeroSemanas(int numeroSemanas) {
		this.numeroSemanas = numeroSemanas;
	}
	
	/**
	* calculaHorasDescanso calcula as horas de descanso semanal do aluno
	* Se o aluno descansar menos que 26 horas em 1 semana, o aluno não está descansado
	* Se ele descansar 26 ou mais, ele está descansado
	* @return	retorna o valor das horas descansadas (horas dividido pelo numero de semana)
	* */

	public int calculaHorasDescanso(int horas, int semanas) {
		if (numeroSemanas != 0) {
			int resultado = horas/semanas;
			return resultado;
		} else {
			return 0;
		}
	}
	
	/**
	* getStatusGeral mostra se o aluno está cansado  ou descansado atrvés do resultado anterior
	* @return	retorna se o aluno está cansado ou descansado 
	* */
	
	public String getStatusGeral() {
		int totalHoras = calculaHorasDescanso(horasDescanso, numeroSemanas);
		if (totalHoras >= 26) {
			this.statusGeral = "descansado";
		} else {
			this.statusGeral = "cansado";
		}
		return this.statusGeral;
	}
}
