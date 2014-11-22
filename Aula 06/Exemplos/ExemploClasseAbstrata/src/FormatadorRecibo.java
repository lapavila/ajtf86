/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author treinamento
 */
public abstract class FormatadorRecibo {

    public abstract String gerarRecibo(String cliente,
            double valor,
            String data,
            String motivo);
}
