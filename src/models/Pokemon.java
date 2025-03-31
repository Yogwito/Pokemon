/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author juans
 * 
 * Clase abstracta que representa un Pokémon.
 */
public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected int temporada;

    /**
     * Constructor de la clase Pokemon.
     * @param numPokedex Número en la Pokédex.
     * @param nombre Nombre del Pokémon.
     * @param temporada Temporada en la que apareció.
     */
    
    public Pokemon(int numPokedex, String nombre, int temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.temporada = temporada;
    }

    /** Métodos abstractos para ataques generales */
    public abstract void atacarPlacaje();
    public abstract void atacarArañazo();
    public abstract void atacarMordisco();
}