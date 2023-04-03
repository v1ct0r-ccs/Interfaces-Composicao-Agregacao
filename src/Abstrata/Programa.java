package src.Abstrata;

public class Programa {
    public static void main(String args[]) {
        Assalariado assalariado = new Assalariado();
        assalariado.setCpf("1");
        assalariado.setNome("Victor");
        assalariado.setSobrenome("Santos");
        assalariado.setSalario(2500d);
       imprimir(assalariado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Bruno");
        comissionado.setSobrenome("Santos");
        comissionado.setTotalVenda(22000d);
        comissionado.setTotalComissao(0.12d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Antonio");
        horista.setSobrenome("Santos");
        horista.setTotalHoraTrabalhada(50d);
        horista.setPrecoHora(47.5d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        if (empregado instanceof Horista) {
            Horista hor = (Horista) empregado;
            System.out.println(hor.getPrecoHora());
        }
        empregado.imprimirSobrenome();
        empregado.imprimirValores();
        System.out.println(empregado.getNome() + " Tem de salário: " + empregado.vencimento());
    }
}
