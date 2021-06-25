import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main extends Fibonacci {
    public static void main (String[] args) throws Exception {
        
        //Exercicio_1.
        Queue<String> fila = new LinkedList<>();

        fila.add("Tiago");  
        fila.add("Carla");   
        fila.add("Gabriel"); 
        fila.add("Lucy"); 
        fila.add("Carlos");  
        fila.add("João"); 
        fila.add("Joaquim");  
        fila.add("Amanda"); 
        fila.add("Rodrigo");  
        
        Random eliminado = new Random();
        int num = 0;
        while (num == 0){
            num = eliminado.nextInt(9);
        }
        while (fila.size() > 1){
            for (int i = 0; i < num; i++) {
                fila.add(fila.remove()); 
            }
            System.out.println("O Jogador Eliminado Foi: " + fila.remove()); 
        }
        System.out.println("O Ganhador Foi : " + fila + "\n");


        //Exercicio_2.

        String palavra = "anilina";
        String palavra1 = "";
        int i;

        for (i = 0; i < palavra.length(); i++){
            palavra1 = palavra.charAt(i) + palavra1;
        }

        if (palavra.equalsIgnoreCase(palavra1)){
            System.out.println("É um Palíndromo\n");
            
        }else{
            System.out.println("Não é um Palíndromo\n");
        }


        // Exercicio_3.
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho da sequência: ");
        int vlr = scan.nextInt();
        
        for (int j = 0; j < vlr; j++) {
            System.out.print(Fibonacci.fibo(j) + " ");
        }

        // Exercicio_4.
        Stack<Integer> pilha = new Stack<Integer>();
        Scanner entrada = new Scanner(System.in);
        int escolha = 0;
        
        while (escolha != 5) {
            
            System.out.print("\n\nSelecione uma opção: ");
            System.out.println("\n1. Empilhar");
            System.out.println("2. Desempilhar ");
            System.out.println("3. Mostrar o topo. ");
            System.out.println("4. Imprimir tudo e zerar a pilha. ");
            System.out.println("5. Sair \n");
           
            escolha = entrada.nextInt();
            
            if (escolha == 1) {
                System.out.print("Digite o Item a Ser Empilhado: ");
                int valorpilha = entrada.nextInt();
                pilha.push(valorpilha);
            } else if (escolha == 2) {
                //Os Itens devem ser inseridos um a um e retirados também.
                if (!pilha.isEmpty()) { //Verifica se a pilha não está vazia.
                    int sub;
                    System.out.print("Digite o item da Pilha: ");
                    pilha.pop();
                    System.out.println("\nItem Desempilhado " + pilha.pop());
                } else {
                    System.out.println("Pilha Vazia");
                }
            } else if (escolha == 3) {

                if (!pilha.isEmpty()) { 
                    System.out.println("O Topo da Pilha é: " + pilha.lastElement());
                } else {
                    System.out.println("Pilha Vazia");
                        }
            } else if (escolha == 4) {

                System.out.print("Pilha Completa ");
                for (int k = pilha.size() - 1; k >= 0; k--) {
                    System.out.print(pilha.get(k) + " ");
                }
                pilha.clear();
            }
            
        }

       // Exercicio_5
       Scanner entrada2 = new Scanner(System.in);
     
       System.out.print("Informe o Primeiro Valor: ");
       int a = Integer.parseInt(entrada2.nextLine());//pareseInt convert e retorna um inteiro.
       System.out.print("Informe o Segundo Valor: ");
       int b = Integer.parseInt(entrada2.nextLine());
        
       System.out.print("O MDC dos Valores : " + a + " e " +  b + " é " + mdc(a, b));
       
     }

     public static int mdc(int x, int y){
       
       if(y == 0){
         return x;
       }
       else{
         return mdc(y, x % y); 
       }
     }     
}
