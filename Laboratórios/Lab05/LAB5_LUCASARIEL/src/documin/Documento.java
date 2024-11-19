package documin;

import java.util.ArrayList;
import java.util.Objects;

public class Documento {
	
	private String titulo;
	private int tamanho;
	private int quantElementos;
	private boolean temTamanho;
	private Elemento elementos;
	
	public Documento(String titulo) {
		this.titulo = titulo;
	}
	
	public Documento(String titulo, int tamanho) {
		this.titulo = titulo;
		this.tamanho = tamanho;
	}
	
	public boolean adicionaElemento(Elemento elemento) {
		if (!elementos.contains(elemento)) {
			elementos.add(elemento);
			return true;
		}
		return false;
	}
	
	public boolean removeElemento(Elemento elemento) {
		if (elementos.contains(elemento)) {
			elementos.remove(elemento);
			return true;
		}
		return false;
	}
	
	public int contaElemento() {
		return -1;
	}
	
	public String exibeElementos() {
		return "";
	}
	
	public void moveParaCima(int elementoPosicao) {
		
	}
	
	public void moveParaBaixo(int elementoPosicao) {
		
	}
	
	public boolean apagaElemento(int elementoPosicao) {
		return true;
	}
	
	public boolean verificaTamanho() {
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tamanho, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documento other = (Documento) obj;
		return tamanho == other.tamanho && Objects.equals(titulo, other.titulo);
	}
	
	
}