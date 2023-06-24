package application;

import entities.*;

public class App {
    public static void main(String[] args) {

        Person[] sala = new Person[5];

        sala[0] = new Professor("Dixie Normus", "1271712", "Engenharia da Computação");
        sala[1] = new Aluno("Lucifer", "666", "Maldade");
        sala[2] = new Aluno("Tabaku Ma Luko", "46137461643", "Arquitetura");
        sala[3] = new Aluno("Kadeo-Bong", "420", "Queimar o Bravo");
        sala[4] = new Aluno("Çigar Duhčapeta", "0971474", "Enfermagem");

        for (int i = 0; i < sala.length; i++) {
            System.out.println(sala[i]);
        }
    }
}