/*
 *
 */

package com.mycompany.concessionaria;

import concessionaria.Cliente;
import concessionaria.Marca;
import concessionaria.Venda;
import concessionaria.Vendedor;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Concessionaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       Venda v1 = new Venda();
        Vendedor vd1 = new Vendedor();
        Marca marca1 = new Marca("Toyota", "Japao");
        Marca marca2 = new Marca("Mitsubishi", "Japao");

        // ... outras inicializações

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar Cliente");
        System.out.println("2 - Calcular Comissão");
        System.out.println("3 - Exibir Informações da Marca");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
               
                System.out.println("Digite o nome do cliente: ");
                String nomeC1 = scanner.nextLine();
                

                System.out.println("Endereco do cliente: ");
                String enderecoC1 = scanner.nextLine();
                

                System.out.println("Telefone do cliente:");
                int telefoneC1 = scanner.nextInt();
                scanner.nextLine(); 
              
                Cliente cliente = new Cliente(nomeC1, enderecoC1, telefoneC1);
                

                System.out.println("\n");

                
                cliente.status();
                break;

            case 2:
                Vendedor vendedor = new Vendedor();
                vendedor.setComissao(40);

                System.out.println("Calcular comissao");
                System.out.println("Digite o valor da venda:");
                double valorVenda = scanner.nextDouble();

                Venda venda = new Venda();
                venda.setValorVenda(valorVenda);

                double receber = vendedor.calcularComissao(venda);
                System.out.println("Comissão a receber: " + receber);
                break;

            case 3:
                
                marca1.exibirInformacoes();
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}