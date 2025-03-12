package view;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ti01.mtz
 */



public class VeiculoView {
    private Scanner scanner = new Scanner(System.in);

    public String obterMarca() {
        System.out.print("Digite a marca: ");
        return scanner.nextLine();
    }
    
    public String obterModelo() {
        System.out.print("Digite o modelo: ");
        return scanner.nextLine();
    }
    
    public int obterAno() {
        System.out.print("Digite o ano: ");
        return scanner.nextInt();
    }
    
    public void exibirVeiculo(String marca, String modelo, int ano) {
        System.out.println("Veículo cadastrado: " + marca + " " + modelo + " (" + ano + ")");
    }
}



