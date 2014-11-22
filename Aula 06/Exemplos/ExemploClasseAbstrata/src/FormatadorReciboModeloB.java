/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author treinamento
 */
public class FormatadorReciboModeloB extends FormatadorRecibo {

    @Override
    public String gerarRecibo(String cliente, double valor, String data, String motivo) {
         return "Recebemos de " + cliente + " na data de " + data + " o valor de " + valor + " referente a " + motivo;
    }
}
