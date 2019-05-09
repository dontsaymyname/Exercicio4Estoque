public class Teste {
    public static void main(String[] args) {

        Estoque estoque = new Estoque("computador", 4, 1);

        System.out.println("Nome: " + estoque.getNome());
        System.out.println("Quantidade atual: " + estoque.getQtdAtual());
        System.out.println("Quantidade mínima: " + estoque.getQtdMinima());
        System.out.println("___________________________________");
        estoque.darBaixa(1);
        estoque.precisaRepor();
        System.out.println("Precisa repor: " + estoque.precisaRepor());
        estoque.repor(4);
        System.out.println("___________________________________");
        System.out.println("Nome: " + estoque.getNome());
        System.out.println("Quantidade atual: " + estoque.getQtdAtual());
        System.out.println("Quantidade mínima: " + estoque.getQtdMinima());

    }
}
