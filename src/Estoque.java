public class Estoque {


    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque(String nome, int qtdAtual, int qtdMinima){
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this. qtdMinima = qtdMinima;
    }



    public String getNome() {
        return nome;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void mudarQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void repor(int qtd){
        qtdAtual = qtdAtual + qtd;

    }

    public void darBaixa(int qtd){
        qtdAtual = qtdAtual - qtd;

    }

    public void mostra(){
        System.out.println(nome);
        System.out.println(qtdAtual);
        System.out.println(qtdMinima);
    }

    public boolean precisaRepor(){

        if (qtdAtual < qtdMinima){
            return true;
        } else {
            return false;
        }

    }
}
