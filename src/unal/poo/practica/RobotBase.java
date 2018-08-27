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
            estudiante = new Robot(objetos,0, 0, Direction.SOUTH,0);
            int x=0;
            char[] xd=new char[88];
            estudiante.move();
            if(estudiante.canPickThing()==true){
                x=1;
            }
            estudiante.move();
            if(estudiante.canPickThing()==true){
                x+=4;
            }
            estudiante.move();
            if(estudiante.canPickThing()==true){
                x+=9;
                xd[26]='M';
                xd[30]='P';
            }
            estudiante.turnLeft(); 
            estudiante.move();
            if(estudiante.canPickThing()==true){
                x+=36;
            }
            estudiante.turnLeft();
            estudiante.move();
            if(estudiante.canPickThing()==true){
                x+=25;
            }
            estudiante.move();
            if(estudiante.canPickThing()==true){
                x+=16;
            }
            
            xd[1]='A';
            xd[5]='B';
            xd[17]='C';
            xd[41]='D';
            xd[26]='E';
            xd[21]='F';
            xd[46]='G';
            xd[30]='H';
            xd[20]='I';
            xd[45]='J';
            xd[10]='K';
            xd[14]='L';
            xd[51]='N';
            xd[35]='O';
            xd[55]='Q';
            xd[39]='R';
            xd[29]='S';
            xd[54]='T';
            xd[46]='U';
            xd[50]='V';
            xd[81]='W';
            xd[62]='X';
            xd[87]='Y';
            xd[71]='Z';
       
            System.out.println(xd[x]);
            
        }
       
}

