/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;
        import java.util.Scanner;
/**
 *
 * @author josel
 */
public class conversor {
    public static void main(String[] args) {
        //Declarando variaveis
        float fah, cel, conversao, op;//Variaveis
        
        //Criando instancia do objeto da classe scanner
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("\n\t\t\t ---Conversor Celsios e Fahrenheit---\n");
        
        //Menu 
        System.out.println("[1] Celcius para Fahrenheit");
        System.out.println("[2] Fahrenheit para Celsius");
        
        System.out.print("Opção: ");
        op = entrada.nextInt();
        
        if (op == 1){
            System.out.println("Celsius para Fahrenheit");
            
            //Entrada
            System.out.print("Digite o valor em Celsius: ");
            cel = entrada.nextInt();
            
            //processamento
            conversao = 9 * cel / 5 + 32;
            
            //saida
            System.out.print("O valor em Fahrenheit é " + conversao); 
        }
        else if (op == 2){
            System.out.println("Fahrenheit para Celsius");
            
            //Entrada
            System.out.print("Digite a temperatura em Fahrenheit: ");
            fah = entrada.nextInt();
            
            //processamento
            conversao = (fah - 32) * 5/9;
            
            //saida
            System.out.println("O valor em Calsius é " + conversao);
     }
        else{
            System.out.println("Opção invalida1");
        }
    }
    
}
