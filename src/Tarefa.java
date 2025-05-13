public class Tarefa {




    private String nome;
    private String descricao;
    private boolean status;
    private static int valorId = 1;
    private int id;

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = false;
        this.id = valorId++;
    }

    public void markStatus() {
        this.status = true;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public static int getValorId() {
        return valorId;
    }

    public int getId() {
        return id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Descrição: " + descricao + ", Status: " + (status ? "Concluída" : "Pendente");
    }

}
