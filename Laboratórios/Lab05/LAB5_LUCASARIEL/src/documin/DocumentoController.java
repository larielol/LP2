package documin;

import java.util.ArrayList;
import java.util.HashMap;

public class DocumentoController {
	
	private HashMap<String, Documento> documentos;
	private ElementoController ElementoController;
	private ArrayList<Visao> visao;
	private Documento titulo;
	private Documento tamanho;
	
	public boolean criaDocumento(String titulo) {
		if (!documentos.containsKey(titulo)) {
			documentos.put(titulo, null);
			return true;
		}
		return false;
		
	}
	
	public boolean criaDocumento(String titulo, Documento tamanho) {
		if (!documentos.containsKey(titulo)) {
			documentos.put(titulo, tamanho);
			return true;
		}
		return false;
	}
	
	public boolean removeDocumento(String titulo) {
		if (documentos.containsKey(titulo)) {
			documentos.remove(titulo);
			return true;
		}
		return false;
	}
	
	public int contaElementos(String titulo) {
		return -1;
	}
	
	public String exibeDocumento(String titulo) {
		return "";
	}
	
	public boolean adicionaElemento(String titulo, Elemento elemento) {
		return true;
	}
	
	public boolean editaElemento(String titulo, Elemento elemento) {
		return true;
	}
	
	public boolean removeElemento(String titulo, Elemento elemento) {
		return true;
	}
	
	public int criaAtalho(String tituloDoc, String tituloDocReferenciado) {
		return -1;
	}
	
	public int criaVisaoCompleta(String tituloDoc) {
		return -1;
	}
	
	public int criaVisaoResumida(String tituloDoc) {
		return -1;
	}
	
	public int criaVisaoPrioritaria(String tituloDoc, int prioridade) {
		return -1;
	}
	
	public int criaVisaoTitulo(String tituloDoc) {
		return -1;
	}
	
	public String exibeVisao(int visaoId) {
		return "";
	}
	
	public boolean apagaElemento(String tituloDoc, int elementoPosicao) {
		return true;
	}
	
	public void moveParacima(String tituloDoc, int elementoPosicao) {
		
	}
	
	public void moverParaBaixo(String tituloDoc, int elementoPosicao) {
		
	}
	
	public boolean verificaTitulo(String titulo) {
		return true;
	}

}