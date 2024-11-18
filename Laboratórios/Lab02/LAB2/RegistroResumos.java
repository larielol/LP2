package lab2;

/**
 * Esta classe serve para salvar uma quantidade limitada de resumos com temas, ou
 * seja, para cada resumo salvo, terá um tema que representa aquele resumo, quando
 * ultrapassa o limite da quantidade de resumos, os primeiro serão substituidos pelos
 * novos e assim ficando no looping até o usurário decidir parar.
* 
* @author Lucas Ariel Alves de Carvalho
*/

public class RegistroResumos {
	
	/**
	* o array temasResumos serve para salvar o tema do resumo que será adicionado
	*/
	
    private String[] temasResumo;
    
    /**
	* o array resumos serve para salvar os resumos
	*/
    
    private String[] Resumos;
    
    /**
	* o array resumosCompletos será para juntas ambos os arrays, ou seja, o
	* tema com o próprio resumo e deixa-los em um único array
	*/
    
    private String[] resumosCompletos;
    
    /**
	* contagemResumos será usado para sabermos quantos resumos já foram 
	* adicionados/cadastrados
	*/
    
    private int contagemResumos = 0;
    
    /**
     * serve para definirmos o tamanho do array de resumos completos caso 
     * ultrapasse o limite de resumos
     */
    
    private int quantResumosCadastrados = 0;
    
    /**
	* o atributo i será usado referente ao indice dos arrays
	*/
    
    private int i = 0;
    
    /**
	* este contrutor numeroDeResumos serve para sabemos o tamanho de cada array 
	* que foi definido no programa principal
	*/

    public RegistroResumos(int numeroDeResumos) {
        this.temasResumo = new String[numeroDeResumos];
        this.Resumos = new String[numeroDeResumos];
    }
    
    /**
	* o método adiciona serve para adicionar o resumo que foi cadastrado no programa
	* principal em cada um dos arrays, tanto tema como resumo serão adicionados
	* a partir do indice i que começa inicialmente com 0 e quando chegar ao indice
	* máximo, retornará a ser 0.
	*/

    public void adiciona(String temaResumo, String resumo) {
        this.temasResumo[this.i] = temaResumo;
        this.Resumos[this.i] = resumo;
        i++;
        contagemResumos += 1;
        quantResumosCadastrados += 1;
        if (i == temasResumo.length) {
            i = 0;
        }
        if (quantResumosCadastrados >= temasResumo.length) {
        	quantResumosCadastrados = temasResumo.length;
        }
    }
    
    /**
	* pegaResumos serve para quando os resumos forem adicionados por completo,
	* criar um novo array de acordo com a quantidade de resumos que foram cadastrados,
	* sendo assim resumos completos terá a quantidade exata de resumos que o usuário
	* enviará
	* 
	* @return retornando em apenas um array, tanto o tema como o resumo da forma:
	* "Tema: Resumo"
	*/

    public String[] pegaResumos() {
        this.resumosCompletos = new String[quantResumosCadastrados];
        for (int j = 0; j < quantResumosCadastrados; j++) {
            resumosCompletos[j] = temasResumo[j] + ": " + Resumos[j];
        }
        return resumosCompletos;
    }
    
    /**
	* conta serve para saber a quantidade de resumos completos já cadastrados, ou seja,
	* @return retorna o tamanho do array de resumos
	*/

    public int conta() {
        return resumosCompletos.length;
    }
    
    /**
	* imprimeResumos serve para separar os temas já cadastrados até o momento e 
	* retorna uma sequencia de informações, parecido com o toString()
	* 
	* @return retorna o numero de resumos e os temas que foram cadastrados até
	* o momento sendo separados por |
	*/

    public String imprimeResumos() {
        String tipoTemas = "";
        for (int h = 0; h < resumosCompletos.length; h++) {
            tipoTemas += this.temasResumo[h];
            if (h < resumosCompletos.length - 1) {
                tipoTemas += " | ";
            }
        }
        return "- " + contagemResumos + " resumo(s) cadastrado(s)" + System.lineSeparator() + "- " + tipoTemas;
    }
    
    /**
	* temResumo serve para comparar um tema que o usuario escrever e verificar se 
	* o mesmo existe no array salvo de resumos
	* 
	* @return retorna o valor true caso o tema digitado esteja no array e
	* false caso não existe esse tema
	*/

    public boolean temResumo(String tema) {
        for (int k = 0; k < resumosCompletos.length; k++) {
            if (temasResumo[k].equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
