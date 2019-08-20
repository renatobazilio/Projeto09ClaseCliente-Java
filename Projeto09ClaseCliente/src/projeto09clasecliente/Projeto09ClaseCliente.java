/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09clasecliente;

/**
 *
 * @author aluno
 */
public class Projeto09ClaseCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //um OBJETO c1 do tipo da Classe Cliente,
        //Sendo instanciado por meio do operador NEW
        // que chma o método construtor Cliente()
        Cliente c1 = new Cliente("45454","Renato", "44784", "Guaranta", "Sp");
        c1.setRG("558887");
        System.out.println(c1.getRG());
        //System.out.println(c1.);
    }
    
}
