package list.OperacoesBasicas;

public class tarefa {

    private  String descricao;

    public tarefa (String descricao){

        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return  descricao;
    }

    public String getDescricao() {

        return descricao;
    }

}
