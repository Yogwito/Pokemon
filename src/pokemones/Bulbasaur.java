/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemones;

import interfaces.Pokemon.PokemonPlanta;
import models.Pokemon;

/**
 *
 * @author juans
 */
/**
 * Clase que representa a un Bulbasaur, un Pokémon de tipo Planta.
 */

public class Bulbasaur extends Pokemon implements PokemonPlanta {
    /**
     * Constructor de Bulbasaur.
     * @param numPokedex Número en la Pokédex.
     * @param nombre Nombre del Pokémon.
     * @param temporada Temporada en la que apareció.
     */
    public Bulbasaur(int numPokedex, String nombre, int temporada) {
        super(numPokedex, nombre, temporada);
    }

    @Override
    public void atacarPlacaje() {
        System.out.println(nombre + " usa Placaje!");
    }

    @Override
    public void atacarArañazo() {
        System.out.println(nombre + " usa Arañazo!");
    }

    @Override
    public void atacarMordisco() {
        System.out.println(nombre + " usa Mordisco!");
    }

    @Override
    public void atacarParalizar() {
        System.out.println(nombre + " usa Paralizar!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println(nombre + " usa Drenaje!");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println(nombre + " usa Hoja Afilada!");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println(nombre + " usa Látigo Cepa!");
    }
}
