
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author treinamento
 */
public class Pedido {
    private String numero;
    private Date data;
    private ItemPedido[] itensPedido;
    private Pessoa pessoa;
    
    public String getNumero() {
        return this.numero;
    }
    
    public Date getData() {
        return this.data;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setData(Date data) {
        this.data = data;
    }

    public ItemPedido[] getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ItemPedido[] itensPedido) {
        this.itensPedido = itensPedido;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
