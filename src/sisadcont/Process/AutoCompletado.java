/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisadcont.Process;

/**
 *
 * @author aaron
 */
public class AutoCompletado {
    private String usuario;


    public AutoCompletado(){
        
    }
    public AutoCompletado(String usuario) {
      this.usuario = usuario;
        
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String nombre) {
        this.usuario = nombre;
    }

    @Override
    public String toString() {
        return this.usuario;
    }
    
}
