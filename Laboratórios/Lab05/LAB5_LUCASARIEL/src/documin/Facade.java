package documin;

public class Facade {
	
	private DocumentoController documentoController;
	
	public Facade() {
		this.documentoController = new DocumentoController();
	}
	
	public boolean criaDocumento(String titulo) {
		return this.documentoController.criaDocumento(titulo);
	}
	
	public boolean criaDocumento(String titulo, int tamanho) {
		return true;
	}
	
	public void removeDocumento(String titulo) {
		
	}
	
	public int contaElementos(String titulo) {
		return -1;
	}
	
	public String exibirDocumento(String titulo) {
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
	
	public int criarVisaoPrioritaria(String tituloDoc, int propriedade) {
		return -1;
	}
	
	public int criarVisaoTitulo(String tituloDoc) {
		return -1;
	}
	
	public String exibeVisao(int visaoId) {
		return "";
	}
	
	public int criaTexto(String tituloDoc, String valor, int propriedade) {
		return -1;
	}
	
	public int criaTitulo(String tituloDoc, String valor, int propriedade, int nivel, boolean linkavel) {
		return -1;
	}
	
	public int criaTermos(String tituloDoc, String valorlista, String prioridade, int separados, String ordem) {
		return -1;
	}
	
	public String mostraRepresentacaoCompleta(String tituloDoc, int elementoPosicao) {
		return "";
	}
	
	public String mostraRepresentacaoResumida(String tituloDoc, int elementoPosicao) {
		return "";
	}
	
	public boolean apagaElemento(String tituloDoc, int elementoPosicao) {
		return true;
	}
	
	public void moveParaCima(String tituloDoc, int elementoPosicao) {
		
	}
	
	public void moveParaBaixo(String tituloDoc, int elementoPosicao) {
		
	}
	
	
}