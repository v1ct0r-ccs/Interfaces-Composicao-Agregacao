package TarefaAbstrata;

public class Programa {
    public static void main (String args[]){
        System.out.println("**** Dados da Pessoa ****");

        Fisica fisica = new Fisica();
        fisica.setNome("Victor Bruno");
        fisica.setSobrenome("Santos");
        fisica.setNascimento("29/03/1994");
        fisica.setCpf("000.000.000-10");
        fisica.setRg("000.000.0005-9");
        imprir(fisica);

        System.out.println("");

        Juridica juridica = new Juridica();
        juridica.setNome("Victor");
        juridica.setSobrenome("Santos");
        juridica.setNascimento("29/03/1994");
        juridica.setCnpj("00.000.000/1111-00");
        juridica.setEmpresa("Nova Empresa");
        imprir(juridica);
    }

    private static void imprir(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome() + " - Data de Nascimento: " + pessoa.getNascimento() );
        if (pessoa instanceof Fisica) {
            Fisica fis = (Fisica) pessoa;
            System.out.println("Documentos de Pessoa Física: " + "CPF: " + fis.getCpf() + " - RG: " + fis.getRg());
        } if (pessoa instanceof Juridica) {
            Juridica jur = (Juridica) pessoa;
            System.out.println("Documentos de Pessoa Juridica: " + "CNPJ: " + jur.getCnpj() + " - Empresa: " + jur.getEmpresa());
        }
    }
}
