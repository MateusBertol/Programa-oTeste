package projeto;

import java.util.Random;

/*
       autor: Mateus Bertol
 */
public class RevisaoJava {

    //método de inicialização da classe
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.setCidade("Nova Bréscia");
        pessoa1.setCodigo(123);
        pessoa1.setTelefone(323232332);
        pessoa1.setNome("Mateus");
        pessoa1.setValor(1000.00);
        pessoa2.setCidade("Lajeado");
        pessoa2.setCodigo(321);
        pessoa2.setTelefone(544484155);
        pessoa2.setNome("Lucas");
        pessoa2.setValor(500.00);     
        
       
        

//        System.out.println("Seu Nome é " + pessoa1.getNome() + ", seu código é " + pessoa1.getCodigo()
//                + ", seu telefone é " + pessoa1.getTelefone() + " e sua cidade é " + pessoa1.getCidade() + ".\n");
//        System.out.println("Seu Nome é " + pessoa2.getNome() + ", seu código é " + pessoa2.getCodigo()
//                + ", seu telefone é " + pessoa2.getTelefone() + " e sua cidade é " + pessoa2.getCidade() + ".\n");

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        //        função com toString para fazer o método de cima;
        
         Funcoes transfere = new Funcoes();
        
        System.out.println(pessoa1.toString() + pessoa2.toString()+ transfere.transfer(pessoa1.getValor(),pessoa2.getValor())+ pessoa1.toString() + pessoa2.toString());

//        System.out.println("Olá Mundo\n");
//        int resultado = Funcoes.somarNumeros(1, 2);
//        System.out.println("Resultado = " + resultado);
//
//        //criamos uma instância de Funcoes
//        Funcoes func = new Funcoes();
//        resultado = func.subtrairNumeros(4, 1);
//        System.out.println("Resultado = " + resultado);
//
//        imprimirMensagem("TESTE 1");
//        imprimirMensagem("TESTE 2");
//        imprimirMensagem("TESTE 3");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("valor de i = " + i);
//        }
//
//        int x = 15;
//        while (x < 18) {
//            System.out.println("Sem permissão!!!");
//            x++;
//        }
//
//        int[] numeros = {1, 2, 3};
//        System.out.println("ENCHANCED FOR");
//        for (int var : numeros) {
//            System.out.println(var);
//        }//for de vetores
//
//        System.out.println("FOR COMUM");
//        for (int var = 0; var < numeros.length; var++) {
//            System.out.println(numeros[var]);
//        }
//
//        int[] numeros_array = {2, 2, 1};
//        int res_soma = Funcoes.somarNumeros(numeros_array);
//        System.out.println("RESULTADO DA SOMA = " + res_soma);
//
//        int res_mul = Funcoes.multiplicaNumeros(numeros_array);
//        System.out.println("RESULTADO DA MULTIPLICAÇÃO = " + res_mul);
//
//        double res_div = Funcoes.divideNumeros(numeros_array);
//        System.out.println("RESULTADO DA DIVISAO = " + res_div);
//
//        int res_sub = Funcoes.subtraiNumeros(numeros_array);
//        System.out.println("RESULTADO DA SUBTRACAO = " + res_sub);
//
//        System.out.println();//linha em branco
//        System.out.println();//linha em branco
//        System.out.println();//linha em branco
//        String sorteio = Funcoes.sortearNumeros(6, 60);
//        System.out.println("SORTEIO = " + sorteio);
//
//        //instância um objeto da classe Random usando o construtor básico
//        //Exige importação da classe java.util.Random
//        Random gerador = new Random();
//
//        //imprime sequência de 10 números inteiros aleatórios entre 1 e 5
//        for (int i = 0; i < 10; i++) {
//            System.out.println(gerador.nextInt(5) + 1);
//        }
    }

    public static void imprimirMensagem(String par1) {
        System.out.println();
    }

}
