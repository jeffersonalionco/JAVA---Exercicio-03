/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author ti01.mtz
 */
import com.biblioteca.view.Veiculo;
import com.biblioteca.view.VeiculoView;

public class VeiculoController {
    private Veiculo model;
    private VeiculoView view;

    public VeiculoController() {
        this.model = new Veiculo("", "", 0);
        this.view = new VeiculoView();
    }

    public void cadastrarVeiculo() {
        model.setMarca(view.obterMarca());
        model.setModelo(view.obterModelo());
        model.setAno(view.obterAno());
    }

    public void mostrarVeiculo() {
        view.exibirVeiculo(model.getMarca(), model.getModelo(), model.getAno());
    }
}
