/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
 import controller.VeiculoController;

/**
 *
 * @author ti01.mtz
 */
public class LojaDeCarro {

    public static void main(String[] args) {
        VeiculoController controller = new VeiculoController();
        controller.cadastrarVeiculo();
        controller.mostrarVeiculo();
    }

}
