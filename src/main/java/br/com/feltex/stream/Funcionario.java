package br.com.feltex.stream;

public class Funcionario {

    private final Integer id;
    private final String nome;
    private final String telefone;
    private final Integer idade;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Funcionario that = (Funcionario) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (telefone != null ? !telefone.equals(that.telefone) : that.telefone != null) return false;
        if (idade != null ? !idade.equals(that.idade) : that.idade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        result = 31 * result + (idade != null ? idade.hashCode() : 0);
        return result;
    }

    public Funcionario(Integer id, String nome, String telefone, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}
