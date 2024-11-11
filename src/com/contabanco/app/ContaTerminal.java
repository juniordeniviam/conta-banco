package com.contabanco.app;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		String boasVindas = ""
				+ "---------------------------------------\n"
				+ "| Bem-vindo ao Banco Digital Terminal |\n"
				+ "---------------------------------------\n";
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println(boasVindas);
        System.out.println("Vamos simular o cadastro de conta bancaria com saldo \n");
        
        System.out.println("Por favor, digite seus dados e confirme com ENTER \n");
        System.out.println("Nome: ");
        String nome = sc.next();
        
        System.out.println("\nAgencia: ");
        String agencia = sc.next();
        
        System.out.println("\nConta sem tracos: ");
        int numero = sc.nextInt();
        
        System.out.println("\nPor favor, digite um valor para exibicao do saldo: ");
        Double saldo = sc.nextDouble();
		
        sc.close();
        
        String contaCadastrada = "\n"
        		+ "Ola "+ nome + ", obrigado por criar uma conta em nosso banco,"
				+ " sua agencia e: " + agencia + ", conta: " + numero  
				+ " e seu saldo: " + saldo + ", ja esta disponivel para saque.";
        
        System.out.println(contaCadastrada);
	}

}
