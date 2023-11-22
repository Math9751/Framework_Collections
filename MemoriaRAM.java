import java.util.Objects;

public class MemoriaRAM {
    private int capacidade;
    private String tipo;

    // Construtor padrão
    public MemoriaRAM() {
    }

    // Construtor com parâmetros
    public MemoriaRAM(int capacidade, String tipo) {
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    // Métodos de acesso para capacidade
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    // Métodos de acesso para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método toString para representação em string da classe
    @Override
    public String toString() {
        return "MemoriaRAM{" +
                "capacidade=" + capacidade +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    // Método equals para comparar objetos MemoriaRAM
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemoriaRAM that = (MemoriaRAM) o;
        return capacidade == that.capacidade &&
                Objects.equals(tipo, that.tipo);
    }

    // Método hashCode para gerar código hash do objeto
    @Override
    public int hashCode() {
        return Objects.hash(capacidade, tipo);
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe MemoriaRAM
        MemoriaRAM memoria1 = new MemoriaRAM(8, "DDR4");
        MemoriaRAM memoria2 = new MemoriaRAM(16, "DDR4");

        System.out.println(memoria1.toString());
        System.out.println(memoria2.toString());

        // Teste de igualdade
        System.out.println("As memórias são iguais? " + memoria1.equals(memoria2));

        // Teste de hashCode
        System.out.println("HashCode da memória1: " + memoria1.hashCode());
        System.out.println("HashCode da memória2: " + memoria2.hashCode());
    }
}
