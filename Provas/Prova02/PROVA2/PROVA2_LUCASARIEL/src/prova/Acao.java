package prova;

import java.util.Objects;

public class Acao implements Comparable<Acao> {
    private Desafio desafio;
    private String data;
    private int id;
    private int progresso;
    private boolean concluido = false;
    
    public Acao(Desafio desafio, String data, int id) {
        this.desafio = desafio;
        this.data = data;
        this.id = id;
        this.progresso = 0;
    }
    
    public void atualizarOProgresso(int valorProgresso) {
        this.progresso += valorProgresso;
        confereLimite();
        if (this.progresso == 100 && this.concluido == false) {
            this.desafio.adicionaExecucao();
            this.concluido = true;
        }
    }

    private void confereLimite() {
        if (this.progresso > 100) {
            this.progresso = 100;
        }
    }
    
    public String toString() {
        return "Ação" + "-" + this.data + desafio.getTitulo() + "- Progresso" + this.progresso;
    }
    
    public int getProgresso() {
        return this.progresso;
    }
    
    public Desafio getDesafio() {
        return this.desafio;
    }
    
    public int compareTo(Acao diversa) {
        if (this.progresso < diversa.progresso) {
            return -1;
        }
        if (this.progresso > diversa.progresso) {
            return 1;
        }
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Acao other = (Acao) obj;
        return id == other.id;
    }
    
}
