package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("****CINECOLOMBIA****");
        System.out.println("********************");
        System.out.println("OPCIONES: ");
        System.out.println("1. Agregar una pelicula a la cartelera");
        System.out.println("2. Mostrar todas las peliculas de la cartelera");
        System.out.println("3. Buscar una pelicula de la cartelera");
        System.out.println("4. Modificar la clasificación");
        System.out.println("0. SALIR");


        Scanner leerTeclado = new Scanner(System.in);

        int elegirOpcion;

        ArrayList<HashMap<String,Object>> peliculas = new ArrayList<>();





        do {

            HashMap<String,Object>pelicula =new HashMap<>();

            System.out.println("Digita el numero de la opción que deseas ejecutar:");
            elegirOpcion=leerTeclado.nextInt();

            leerTeclado.nextLine();

            if (elegirOpcion==1){

                System.out.println("Agregando una pelicula");

                int idPelicula =new Random().nextInt(1000);

                System.out.println("Ingresa el nombre de la pelicula: ");
                String nombrePleicula=leerTeclado.nextLine();
                System.out.println("Ingresa la duración de la pelicula en minutos:");
                String duracionPelicula=leerTeclado.nextLine();
                System.out.println("Ingrese la clasificación de la pelicula:");
               String clasificacionPelicula =leerTeclado.nextLine();
                System.out.println("Ingrese la sinopsis del filme");
                String sinopsis=leerTeclado.nextLine();


                int dia,mes,anio;
                System.out.println("Ingresa dia de estreno: ");
                dia=leerTeclado.nextInt();

                System.out.println("Ingresa mes de estreno: ");
                mes=leerTeclado.nextInt();

                System.out.println("Ingresa año de estreno: ");
                anio=leerTeclado.nextInt();


                LocalDate fecha =LocalDate.of(anio,mes,dia);




                pelicula.put("id",idPelicula);
                pelicula.put("nombre",nombrePleicula);
                pelicula.put("Clasificacion",clasificacionPelicula);
                pelicula.put("duracion",duracionPelicula);
                pelicula.put("sinopsis",sinopsis);
                pelicula.put("fecha",fecha);

                peliculas.add(pelicula);











            } else if (elegirOpcion==2) {
                System.out.println("Mostrando toda la cartelera");

                for (HashMap<String,Object>cartelera:peliculas){
                    System.out.println(cartelera);
                }

            } else if (elegirOpcion==3) {
                System.out.println("Buscando una pelicula");

                System.out.println("Ingresa el nombre de la pelicula que deseas buscar: ");
                String peliculaBuscada=leerTeclado.nextLine();

                for (HashMap<String,Object>cartelera:peliculas){

                    if (peliculaBuscada.equals(cartelera.get("nombre")));{
                        System.out.println("Pelicula encontrada");

                        System.out.println(cartelera);
                    }
                }



            } else if (elegirOpcion==4) {
                System.out.println("Modificando la clasificación");
                for (HashMap<String,Object>cartelera:peliculas){

                    String peliculaBuscada=leerTeclado.nextLine();

                    if (peliculaBuscada.equals(cartelera.get("nombre")));{

                        System.out.println("Digita la nueva clasificacion");
                        String clasificacionNueva=leerTeclado.nextLine();
                        cartelera.put("clasificacion",clasificacionNueva);


                    }
                }




            } else if (elegirOpcion==0) {
                System.out.println("Saliendo...");

            }else {
                System.out.println("NO ES UNA OPCIÓN VALIDA GONORREITA");
            }


        } while (elegirOpcion !=0);

































    }
}