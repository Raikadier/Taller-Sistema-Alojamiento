/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallersistemaalojamiento;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author ESTUDIANTES
 */
public class RegistroAlojamientoImplMapa implements ICrudRegistroAlojamiento{
    
    private Map<Integer, Alojamiento> mapsAlojamiento;

    public RegistroAlojamientoImplMapa() {
    }

    public RegistroAlojamientoImplMapa(Map<Integer, Alojamiento> mapsAlojamiento) {
        this.mapsAlojamiento = mapsAlojamiento;
    }
    
    @Override
    public boolean agregarAlojamiento(Alojamiento a){
        this.mapsAlojamiento.put(a.getCodigo(), a);
        return true;
    }
    
    @Override
    public Alojamiento buscar(int codigo) {
        
        return this.mapsAlojamiento.get(codigo);
    }
    
    @Override
    public boolean eliminar(Alojamiento a) {
        return this.mapsAlojamiento.remove(a.getCodigo(), a);
    }
    @Override
    public ArrayList<Alojamiento> obtenerAlojamientos() {
        
        return new ArrayList<>();
    }
}
