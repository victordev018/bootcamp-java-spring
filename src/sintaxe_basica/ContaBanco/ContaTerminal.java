package sintaxe_basica.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        // alterando locale para permitir que os valores decimais aceitem . ao invés da ,
        Locale.setDefault(Locale.US);

        // instancia do objeto in da classe Scanner
        Scanner in = new Scanner(System.in);

        // solicitando dados da conta para o usuário
        System.out.println("\n------> dados conta bancaria <-------");
        System.out.print("\n> numero da conta: ");
        int numeroDaConta = in.nextInt();
        System.out.print("\n> agencia da conta: ");
        in.nextLine();
        String agencia = in.nextLine();
        System.out.print("\n> titular: ");
        String nomeTitular = in.nextLine();
        System.out.print("\n> saldo: ");
        Double saldo = in.nextDouble();

        // saida de dados
        String relatorioConta = "\nOlá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroDaConta + " e seu saldo " + saldo +" já está disponível para saque";
        System.out.println(relatorioConta);

    }
}
