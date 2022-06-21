package main;

public class CadastraLivros implements Comparable<CadastraLivros>{
    private String nome;
    private String autor;
    private int dataPubli;
    private String status;
    private int prioridade;

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getDataPubli() {
        return dataPubli;
    }

    public String getStatus() {
        return status;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDataPubli(int dataPubli) {
        this.dataPubli = dataPubli;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + getNome() + "\n" + "Autor: " + getAutor() + "\n" + "Ano: " + getDataPubli() + "\n" + "Prioridade: " + getPrioridade() + "\n";
    }
    
    public int compareTo(CadastraLivros outroCadastro){
      return this.getNome().compareTo(outroCadastro.getNome());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CadastraLivros outroCadastro = (CadastraLivros) o;

        return this.nome != null ? (outroCadastro.nome).equals(this.nome) : outroCadastro.nome == null;
    }
}