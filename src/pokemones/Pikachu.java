/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
 *
 * @author juans
 */
package pokemones;

import models.Pokemon;
import interfaces.Pokemon.PokemonElectrico;

/**
 * Clase que representa a Pikachu, un Pokémon de tipo Eléctrico.
 */
public class Pikachu extends Pokemon implements PokemonElectrico {
    /**
     * Constructor de Pikachu.
     * @param numPokedex Número en la Pokédex.
     * @param nombre Nombre del Pokémon.
     * @param temporada Temporada en la que apareció.
     */
    public Pikachu(int numPokedex, String nombre, int temporada) {
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
    public void atacarImpactrueno() {
        System.out.println(nombre + " usa Impactrueno!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println(nombre + " usa Puño Trueno!");
    }

    @Override
    public void atacarRayo() {
        System.out.println(nombre + " usa Rayo!");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println(nombre + " usa Rayo Carga!");
    }
}
