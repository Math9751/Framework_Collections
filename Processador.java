import java.util.Objects;

public class Processador {
    private String modelo;
    private int velocidade;
    private int nucleos;

    // Construtor padrão
    public Processador() {
    }

    // Construtor com parâmetros
    public Processador(String modelo, int velocidade, int nucleos) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.nucleos = nucleos;
    }

    // Métodos de acesso para modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos de acesso para velocidade
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // Métodos de acesso para número de núcleos
    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    // Método toString para representação em string da classe
    @Override
    public String toString() {
        return "Processador{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                ", nucleos=" + nucleos +
                '}';
    }

    // Método equals para comparar objetos Processador
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processador that = (Processador) o;
        return velocidade == that.velocidade &&
                nucleos == that.nucleos &&
                Objects.equals(modelo, that.modelo);
    }

    // Método hashCode para gerar código hash do objeto
    @Override
    public int hashCode() {
        return Objects.hash(modelo, velocidade, nucleos);
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Processador
        Processador processador1 = new Processador("Intel i5", 3000, 4);
        Processador processador2 = new Processador("AMD Ryzen 7", 3500, 8);

        System.out.println(processador1.toString());
        System.out.println(processador2.toString());

        // Teste de igualdade
        System.out.println("Os processadores são iguais? " + processador1.equals(processador2));

        // Teste de hashCode
        System.out.println("HashCode do processador1: " + processador1.hashCode());
        System.out.println("HashCode do processador2: " + processador2.hashCode());
    }
}
