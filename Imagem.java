import java.util.Objects;

public class Imagem {
    private String nome;
    private String formato;
    private Integer tamanho;

    // Construtor padrão
    public Imagem() {
    }

    // Construtor com parâmetros
    public Imagem(String nome, String formato, Integer tamanho) {
        this.nome = nome;
        this.formato = formato;
        this.tamanho = tamanho;
    }

    // Métodos de acesso para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos de acesso para formato
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    // Métodos de acesso para tamanho
    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    // Método toString para representação em string da classe
    @Override
    public String toString() {
        return "Imagem{" +
                "nome='" + nome + '\'' +
                ", formato='" + formato + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }

    // Método equals para comparar objetos Imagem
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imagem imagem = (Imagem) o;
        return Objects.equals(nome, imagem.nome) &&
                Objects.equals(formato, imagem.formato) &&
                Objects.equals(tamanho, imagem.tamanho);
    }

    // Método hashCode para gerar código hash do objeto
    @Override
    public int hashCode() {
        return Objects.hash(nome, formato, tamanho);
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Imagem
        Imagem imagem1 = new Imagem("foto1", "JPEG", 1024);
        Imagem imagem2 = new Imagem("foto2", "PNG", 2048);

        System.out.println(imagem1.toString());
        System.out.println(imagem2.toString());

        // Teste de igualdade
        System.out.println("As imagens são iguais? " + imagem1.equals(imagem2));

        // Teste de hashCode
        System.out.println("HashCode da imagem1: " + imagem1.hashCode());
        System.out.println("HashCode da imagem2: " + imagem2.hashCode());
    }
}
