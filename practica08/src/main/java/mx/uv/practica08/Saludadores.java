package mx.uv.practica08;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Saludadores {
    private String nombre;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
}