/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author treinamento
 */
public class TesteRecibo {
    public static void main(String[] args) {
        FormatadorReciboModeloB f = new FormatadorReciboModeloB();
        String resultado = f.gerarRecibo("Jose", 200, "10;10;2014", "Compra de mercadorias");
        System.out.println(resultado);
    }
}
