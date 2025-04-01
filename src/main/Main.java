/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import models.Pokemon;
import pokemones.Bulbasaur;
import pokemones.Charmander;
import pokemones.Squirtle;
import pokemones.Pikachu;

/**
 *
 * @author juans
 *
 * Clase principal que prueba los ataques de los Pokémon.
 */
public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new Charmander(4, "Charmander", 1);
        charmander.atacarPlacaje();
        ((Charmander) charmander).atacarLanzallamas();

        Pokemon bulbasaur = new Bulbasaur(1, "Bulbasaur", 1);
        bulbasaur.atacarPlacaje();
        ((Bulbasaur) bulbasaur).atacarDrenaje();
        
        Pokemon squirtle = new Squirtle(7, "Squirtle", 1);
        squirtle.atacarPlacaje();
        ((Squirtle) squirtle).atacarHidrobomba();

        Pokemon pikachu = new Pikachu(25, "Pikachu", 1);
        pikachu.atacarPlacaje();
        ((Pikachu) pikachu).atacarRayo();
    }

}