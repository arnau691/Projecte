/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author arnau
 */
public class Projecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String nom_pilot = null, escuderia = null;
        int datanaixement = 0, pes = 0, num_pilot = 0;
        double minut_per_volta = 0.0;
        char codi_pilot = ' ', mirar;
        boolean acciden_pilot = false, omplit = false;

        int opcio = 0;

        do {
            System.out.println("Menu pilots Formula1");
            System.out.println("0.Sortida");
            System.out.println("1.Afegir un pilot");
            System.out.println("2.Borrar un pilot");
            System.out.println("3.Modificar un pilot");
            System.out.println("4.Listar els pilots");

            opcio = entrada.nextInt();

            switch (opcio) {
                case 0:
                    System.out.println("Sortir");
                    break;
                case 1:
                    System.out.println("Afegir");
                    if (!omplit) { //omplit==false
                        System.out.println("Posa el nom del pilot");
                        nom_pilot = entrada.next();

                        System.out.println("Posa la escuderia");
                        escuderia = entrada.next();

                        System.out.println("Posa data de naixement");
                        datanaixement = entrada.nextInt();

                        System.out.println("Posa el pes del pilot");
                        pes = entrada.nextInt();

                        System.out.println("Posa el numero del pilot");
                        num_pilot = entrada.nextInt();

                        System.out.println("Posa el minut de la volta");
                        minut_per_volta = entrada.nextDouble();

                        System.out.println("Introduix el codi del pilot");
                        codi_pilot = entrada.next().charAt(0);

                        System.out.println("A tingut algun acciden?");
                        acciden_pilot = entrada.nextBoolean();
                        omplit = true;
                    } else  {
                            System.out.println("Has introduit les dades correctes");
                    }
                    break;

                case 2:
                    if (omplit) {
                        System.out.println("Vols veure els pilots? S o N?");
                        mirar = entrada.next().charAt(0);
                        do {
                            switch (mirar) {
                                case 'S':
                                case 's':
                                    System.out.println("Nom:" + nom_pilot);
                                    System.out.println("Escuderia:" + escuderia);
                                    System.out.println("Data de naixement:" + datanaixement);
                                    System.out.println("Pes:" + pes);
                                    System.out.println("Numero del pilot:" + num_pilot);
                                    System.out.println("Minut per volta:" + minut_per_volta);
                                    System.out.println("Codi del pilot:" + codi_pilot);
                                    System.out.println("Acciden:" + acciden_pilot);
                                    mirar = 'N';
                                    break;
                                case 'N':
                                case 'n':
                                    System.out.println("Ok");
                                    break;
                                default:
                                    System.out.println("No es valida");
                                    System.out.println("Vols veure els pilots? S o N?");
                                    mirar = entrada.next().charAt(0);
                                    break;

                            }
                        } while (mirar != 'N');
                        System.out.println("Vols borrar el pilot S/N?");
                        mirar = entrada.next().charAt(0);
                        switch (mirar) {
                            case 'S':
                            case 's':
                                nom_pilot = null;
                                escuderia = null;
                                datanaixement = 0;
                                pes = 0;
                                num_pilot = 0;
                                minut_per_volta = 0.0;
                                codi_pilot = ' ';
                                acciden_pilot = false;
                                mirar = 'N';
                                omplit = false;
                                break;
                            case 'N':
                            case 'n':
                                System.out.println("Les dades no estan borrades");
                                break;
                            default:
                                System.out.println("La opcio no es valida");
                                System.out.println("Vols eliminar les dades S/N?");
                                mirar = entrada.next().charAt(0);
                                break;
                        }
                    } else {
                        System.out.println("No hi han dades");

                    }
                    break;

                case 3:
                    System.out.println("Modificar");
                    break;
                case 4:
                    System.out.println("Llistar");
                    break;
                default:
                    System.out.println("Posa una opcio correcta");

            }

        } while (opcio != 0);
    }
}
