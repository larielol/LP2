package lab2;

import java.util.Arrays;
	
/**
* Esta classe serve para verificarmos se o aluno foi aprovado ou não, a partir
* das notas do mesmo, se sua média por maior ou igual a 7.0, ele está aprovado,
* caso contrário, reprovado.
* 
* @author Lucas Ariel Alves de Carvalho
*/

public class Disciplina {
	
	/**
	* cadastraHoras serve para sabermos a quantidade de tempo referente aos
	* estudos do aluno
	*/
	
	private int cadastraHoras;
	
	/**
	* media serve para guardar o valor da media, somando as notas e dividindo 
	* pela quantidade das mesmas
	*/
	
	private double media;
	
	/**
	* notas é um array para guardarmos as notas que virão e depois realizarmos o
	* calculo da média do aluno, serão quatro notas, então o array será de 4 posições
	*/
	
	private double[] notas = new double [4];
	
	/**
	* nota é o valor da posição dentro do array de cada nota, ou seja, nota1, nota2
	* nota3 e nota4.
	*/
	
	private int nota;
	
	/**
	* nomeDisciplina valida o nome da disciplina
	*/
	
	private String nomeDisciplina;
	
	/**
	* o construtor Disciplina deixa salvo o nome da disciplina que virá do programa
	* principal
	*/
	
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	/**
	* o método cadastraHoras serve para salvar as horas cadastradas de estudo e ir
	* acumulando
	*/
	
	public void cadastraHoras(int horas) {
		this.cadastraHoras += horas;
	}
	
	/**
	* cadastraNotas serve para adicionar o valor da nota no Array, como será a nota 1
	* no array será 1-1 = 0, ou seja, a primeira nota será na posição 0 do array
	* assim seguindo de forma ordenada, até preenche-lo por completo
	*/
	
	public void cadastraNotas(int nota, double valorNota) {
		this.notas[nota - 1] = valorNota;
		this.nota = nota;
	}
	
	/**
	* calculaMedia serve para somar todas as notas do aluno, pegando cada nota
	* somando com as demais e jogando em uma variavel, após isso, dividir o valor
	* total com o proprio tamanho do array (quantidade de notas) e assim 
	* descobrindo a media
	*/
	
	public double calculaMedia(double notas[]) {
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		media = soma / notas.length;
		return media;
	}
	
	/**
	* aprovado serve para sabermos se o aluno foi ou não aprovado, se ele obtiver
	* uma média maior ou igual a 7.0
	* 
	* @return retorna o valor true se aprovado, caso não, retorna o valor false
	*/
	
	public boolean aprovado() {
		media = calculaMedia(notas);
		if (media >= 7.0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	* Retorna uma string de informações com o nome da disciplina, o tempo de horas
	* de estudo, o valor da media e as notas do aluno
	*/
	
	public String toString() {
		return this.nomeDisciplina + " " + this.cadastraHoras + " " + media + " " + Arrays.toString(notas);
	}
	
}
