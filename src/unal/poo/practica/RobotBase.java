package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,0);
            for(int i=0;i<5;i+=1){
                estudiante.move ();
                while(estudiante.canPickThing()==true){
                    estudiante.pickThing();
                }
                estudiante.turnLeft();
                int x=estudiante.countThingsInBackpack();
                for(int j=0;j<x;j+=1){
                    estudiante.putThing();
                    estudiante.move();
                }
                darVuelta();
                for(int k=0;k<x;k+=1){
                    estudiante.move();
                }
                estudiante.turnLeft();
            }
        }
        public static void darVuelta(){
            for (int i = 0; i < 2; i++){
                estudiante.turnLeft();
            };
        }
        
}

