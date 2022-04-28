package br.edu.ifsul.controle;

import java.io.Serializable;
import java.util.Calendar;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author 20191PF.CC0202
 */
@Named(value = "controleIndex")
//@RequestScoped //ciclo de vida mais curto
@SessionScoped //dura enquanto a sessão durar
//@ApplicationScoped //cilo de vida mais longo
public class ControleIndex implements Serializable{
    
    private String ola;
    private Calendar dataSO;
    
    public ControleIndex(){
        System.out.println("Criou o controleIndex...");
        ola = "Seja Bem-vindo ao Java Server Faces";
        dataSO = Calendar.getInstance();
    }
    
    public String index(){
        return "index?faces-redirect=true";
    }
    
    public String sobre(){
        return "sobre?faces-redirect=true";
    }
    public String getOla() {
        return ola;
    }

    public void setOla(String ola) {
        this.ola = ola;
    }

    public Calendar getDataSO() {
        return dataSO;
    }

    public void setDataSO(Calendar dataSO) {
        this.dataSO = dataSO;
    }
    
}
