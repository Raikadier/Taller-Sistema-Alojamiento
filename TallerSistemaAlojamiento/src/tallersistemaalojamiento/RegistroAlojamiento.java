/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersistemaalojamiento;

import java.util.ArrayList;

/**
 *
 * @author Jairo F
 */
public class RegistroAlojamiento implements ICrudRegistroAlojamiento{
    
    private ArrayList<Alojamiento> listAlojamiento;
    //private Map<String, Alojamiento>listAlojamiento = new HashMap();

    public RegistroAlojamiento() {
        this.listAlojamiento = new ArrayList();
    }

    public ArrayList<Alojamiento> getListAlojamiento() {
        return listAlojamiento;
    }

    public void setListAlojamiento(ArrayList<Alojamiento> listAlojamiento) {
        this.listAlojamiento = listAlojamiento;
    }
    
    public boolean agregarAlojamiento(Alojamiento a){
        return this.listAlojamiento.add(a);
    }
    
    public Alojamiento buscar(int codigo){
        for(Alojamiento a: this.listAlojamiento){
            if(a.getCodigo()==codigo){
                return a;
            }
        }
        return null;
        
//        return this.listAlojamiento.stream()
//                .filter((o) -> o.getCodigo()==codigo)
//                .findFirst()
//                .orElse(null);
    }
    
    public boolean eliminar(Alojamiento a){
        return this.listAlojamiento.remove(a);
    }
    
    public ArrayList<Alojamiento> obtenerAlojamientos(){
        return this.listAlojamiento;
    }
    
    
    
}
