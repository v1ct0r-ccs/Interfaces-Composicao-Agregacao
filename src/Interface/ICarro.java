package src.Interface;

public interface ICarro {
    default void parar() {
        System.out.println("Veículo está parando");
    }

    public void andar();
}
