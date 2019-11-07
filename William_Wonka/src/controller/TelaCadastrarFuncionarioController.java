/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
 import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import model.bean.Funcionario;
import model.dao.FuncionarioDAO;

public class TelaCadastrarFuncionarioController implements Initializable{
   


    @FXML
    private Button bCadastrar;

    @FXML
    private TextField tfCpf;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfDataNascimento;

    @FXML
    private TextField tfRg;

    @FXML
    void ActionBCadastrar(ActionEvent event) {
          
        if(conferirCpf(tfCpf.getText())==true && conferirRG(tfRg.getText())==true){
          Funcionario funcionario = new Funcionario(tfCpf.getText(),tfNome.getText(),tfRg.getText(),tfDataNascimento.getText());
          FuncionarioDAO dao = new FuncionarioDAO();
          dao.create(funcionario);
          JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } else {
        
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        }
          
    }
    public boolean conferirCpf(String cpf){
        cpf = tfCpf.getText();
        if(cpf.isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Campo do CPF está vazio!");
            return false;
        }
        else{
        return true;
        }  
    }
public boolean conferirRG (String rg){
        rg = tfRg.getText();
        if(rg.isEmpty()){
        
            System.out.println("campo CPF vazio.");
            return false;
        }
        else{
        return true;
        }  
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

}


