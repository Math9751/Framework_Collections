import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Post implements Comparable<Post> {
    private String texto;
    private LocalDateTime momento;
    private List<Imagem> imagens;

    // Construtor padrão
    public Post() {
    }

    // Construtor com texto e momento
    public Post(String texto, LocalDateTime momento) {
        this.texto = texto;
        this.momento = momento;
    }

    // Construtor com texto, momento e imagens
    public Post(String texto, LocalDateTime momento, List<Imagem> imagens) {
        this.texto = texto;
        this.momento = momento;
        this.imagens = imagens;
    }

    // Métodos de acesso para texto
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // Métodos de acesso para momento
    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    // Métodos de acesso para imagens
    public List<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<Imagem> imagens) {
        this.imagens = imagens;
    }

    // Método toString para representação em string da classe
    @Override
    public String toString() {
        return "Post{" +
                "texto='" + texto + '\'' +
                ", momento=" + momento +
                ", imagens=" + imagens +
                '}';
    }

    // Método equals para comparar objetos Post
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(texto, post.texto) &&
                Objects.equals(momento, post.momento) &&
                Objects.equals(imagens, post.imagens);
    }

    // Método hashCode para gerar código hash do objeto
    @Override
    public int hashCode() {
        return Objects.hash(texto, momento, imagens);
    }

    // Método compareTo para comparar por ordem cronológica
    @Override
    public int compareTo(Post otherPost) {
        return this.momento.compareTo(otherPost.momento);
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Post
        Imagem imagem1 = new Imagem("foto1", "JPEG", 1024);
        Imagem imagem2 = new Imagem("foto2", "PNG", 2048);

        Post post1 = new Post("Texto do post 1", LocalDateTime.now(), List.of(imagem1, imagem2));
        Post post2 = new Post("Texto do post 2", LocalDateTime.now().minusHours(1));

        System.out.println(post1.toString());
        System.out.println(post2.toString());

        // Teste de igualdade
        System.out.println("Os posts são iguais? " + post1.equals(post2));

        // Teste de comparação por ordem cronológica
        int comparacao = post1.compareTo(post2);
        if (comparacao < 0) {
            System.out.println("post1 é mais antigo que post2");
        } else if (comparacao > 0) {
            System.out.println("post1 é mais recente que post2");
        } else {
            System.out.println("post1 e post2 têm o mesmo momento");
        }
        // Criando uma lista de posts
        List<Post> posts = new ArrayList<>();
        posts.add(post1);
        posts.add(post2);

        // Exibindo a lista antes da ordenação
        System.out.println("Lista antes da ordenação:");
        for (Post post : posts) {
            System.out.println(post);
        }

        // Ordenando a lista de posts usando Collections.sort() que utiliza a implementação de Comparable em Post
        Collections.sort(posts);

        // Exibindo a lista após a ordenação
        System.out.println("\nLista após a ordenação:");
        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
