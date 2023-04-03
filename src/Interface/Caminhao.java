package src.Interface;

public class Caminhao implements ICarro{
    @Override
    public void andar() {
        System.out.println("Caminhão está em movimento, baixa velocidade");
    }

    @Override
    public void parar() {
        System.out.println("Caminhão está no acostamento");
    }
}
