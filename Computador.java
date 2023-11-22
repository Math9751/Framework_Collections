import java.util.Objects;

public class Computador {
    private MemoriaRAM ram;
    private Processador processador;

    // Construtor padrão
    public Computador() {
    }

    // Construtor com parâmetros
    public Computador(MemoriaRAM ram, Processador processador) {
        this.ram = ram;
        this.processador = processador;
    }

    // Métodos de acesso para ram
    public MemoriaRAM getRam() {
        return ram;
    }

    public void setRam(MemoriaRAM ram) {
        this.ram = ram;
    }

    // Métodos de acesso para processador
    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    // Método toString para representação em string da classe
    @Override
    public String toString() {
        return "Computador{" +
                "ram=" + ram +
                ", processador=" + processador +
                '}';
    }

    // Método equals para comparar objetos Computador
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computador that = (Computador) o;
        return Objects.equals(ram, that.ram) &&
                Objects.equals(processador, that.processador);
    }

    // Método hashCode para gerar código hash do objeto
    @Override
    public int hashCode() {
        return Objects.hash(ram, processador);
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Computador
        MemoriaRAM memoria = new MemoriaRAM(16, "DDR4");
        Processador processador = new Processador("Intel i7", 4000, 8);

        Computador computador1 = new Computador(memoria, processador);
        Computador computador2 = new Computador(new MemoriaRAM(8, "DDR3"), new Processador("AMD Ryzen 5", 3500, 6));

        System.out.println(computador1.toString());
        System.out.println(computador2.toString());

        // Teste de igualdade
        System.out.println("Os computadores são iguais? " + computador1.equals(computador2));

        // Teste de hashCode
        System.out.println("HashCode do computador1: " + computador1.hashCode());
        System.out.println("HashCode do computador2: " + computador2.hashCode());
    }
}
