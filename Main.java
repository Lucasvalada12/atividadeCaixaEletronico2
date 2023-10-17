import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reed = new Scanner(System.in);
    Double opcao;
    Double saque;
    Double deposito;
    Double saldoRestante = (1000 - saque);
    Double depositoFinal = (saldoRestante + deposito);
    
    System.out.print("##--Teste Estrutura de Menu--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Saque             |\n");
        System.out.print("| Opção 2 - deposito          |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        opcao = reed.nextDouble();
   // while(!=0){
    if(opcao == 1){
      System.out.print("qual valor do saque? ");
      saque = reed.nextDouble();
        if(saque >= 1000){
          System.out.print("saque realizado com sucesso.");
          System.out.print("saldo restante de: "+saldoRestante);
        }
        } 
   else if(opcao == 2){
      System.out.print("qual o valor do deposito? ");
      deposito = reed.nextDouble();
      
    } 
    else {
      System.out.print("operaçao finalizada ");
    }
    
  }
}