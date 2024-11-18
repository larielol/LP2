package lab2;

/**
* Essa classe será para verificar o tempo total que o aluno estará online para
* realizar a disciplina, sendo assim, saberemos o tempo online do aluno sobre a
* disciplina, o tempo esperado (de estudos) seria maior que o tempo 
* da disciplina.
* 
* @author Lucas Ariel Alves de Carvalho
*/

public class RegistroTempoOnline {
	
	/**
	* nomeDaDisciplina define qual é o nome da disciplina
	*/
	
	private String nomeDisciplina;
	
	/**
	* tempoOnline é para sabermos a quantidade de tempo online gasta pelo aluno
	*/
	
	private int tempoOnline;
	
	/**
	* tempoOnlineEsperado seria a carga horária da disciplina
	*/
	
	private int tempoOnlineEsperado;
	
	/**
	* o construtor RegistroTempoOnline é para ser definida o nome da disciplina e
	* definir a carga horaria do aluno, para as variaveis globais(atributos) salvarem as
	* informações que virão
	*/
	
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		this.tempoOnlineEsperado = tempoOnlineEsperado;
		this.nomeDisciplina = nomeDisciplina;
	}
	
	/**
	* o construtor registroTempoOnline define a quantidade de horas esperadas pro aluno sobre a
	* disciplina que já foi salva
	* por padrão, disciplinas de 60 horas tem tempo esperado 120, por isso o
	* construtor abaixo está definido
	*/
	
	public RegistroTempoOnline(String nomeDisciplina) {
		this.tempoOnlineEsperado = 120;
		this.nomeDisciplina = nomeDisciplina;
	}
	
	/**
	* o método adicionaTempoOnline vai salvando as horas que irão chegar do programa
	* principal e vai somando para sabermos a quantidade de tempo online do aluno
	*/
	
	public void adicionaTempoOnline(int tempoOnline) {
		this.tempoOnline += tempoOnline;
	}
	
	/**
	* atingiuMetaTempoOnline é o resultado final, se o tempo online for maior que o
	* tempo esperado, então significa que o aluno atingiu a meta da disciplina
	* 
	* @return retornará o valor true se o tempoOnline por maior ou igual ao 
	* esperado e false caso contrário
	*/
	
	public boolean atingiuMetaTempoOnline( ) {
		if (tempoOnline >= tempoOnlineEsperado) {
			return true;
		} else {
		return false;
		}
	}
	
	/**
	* Este toStringo retorna uma string de informações no programa principal, com o
	* nome da disciplina, as horas online/horas esperadas
	*/
	
	public String toString() {
		return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
	}
}
