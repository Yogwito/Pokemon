/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemones;

/**
 *
 * @author juans
 * 
 * Clase que representa a un Charmander, un Pokémon de tipo Fuego.
 */
class Charmander extends Pokemon implements PokemonFuego {
    /**
     * Constructor de Charmander.
     * @param numPokedex Número en la Pokédex.
     * @param nombre Nombre del Pokémon.
     * @param temporada Temporada en la que apareció.
     */
    public Charmander(int numPokedex, String nombre, int temporada) {
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
    public void atacarPunioFuego() {
        System.out.println(nombre + " usa Puño Fuego!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println(nombre + " usa Ascuas!");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println(nombre + " usa Lanzallamas!");
    }
}
