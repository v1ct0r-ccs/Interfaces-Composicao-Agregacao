package src.Interface;

public class CarroPasseio implements ICarro{
    @Override
    public void andar() {
        System.out.println("Carro está em movimento, alta velocidade");
    }
}
