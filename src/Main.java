// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
public class Main {
    public static void main(String[] args) {
// Define BufferedReader y variables
        BufferedReader teclado = new BufferedReader(new
                InputStreamReader(System.in));
        int opc=0;
        String ipc="";
        double x=0, y=0;
        Vector2D A=null;//Objetos de la clase Complejo
        Vector2D B=null;
        do {
            //Menu
            System.out.println("**************MENU*************** ");
            System.out.println ("*******BIENVENIDO********:Que desea hacer? ");
            System.out.println (" ");
            System.out.println ("1.- Ingreso del Vector ");
            System.out.println ("2.- Vizualizacion del Vector");
            System.out.println ("3.- Forma Polar");
            System.out.println ("4.- Suma de Vectores");
            System.out.println ("5.- Resta de Vectores");
            System.out.println ("6.- Multiplicacion de Vectores");
            System.out.println ("7.- Division de VEctores");
            System.out.println ("8. Salir");
            System.out.println ("\n\nIngrese una opcion: ");
            //Lee desde teclado como String y transforma aentero
                    //Comprueba que sea un entero valido

            try{
                ipc =teclado.readLine();
                opc=Integer.parseInt(ipc);
            }
            catch (Exception ex)
            {
                System.out.println("Excepcion detectada " + ex);
                System.out.println("Ingrese un numero valido ");
            }
            finally{
                switch (opc){
                    case 1:
                        double a,b;
                        Vector2D C, D;
                        C=new Vector2D();
                        D=new Vector2D();
                        //Ingreso de numeros complejos
                        System.out.println ("Ingrese Vector");
                        System.out.println("Ingrese coordI ");
                        a=LeerDatos.leerReal();
                        System.out.println("Ingrese coordJ: ");
                        b=LeerDatos.leerReal();
                        A =new Vector2D (a,b);
                        break;
                    case 2:
                        A.ver();
                        break;
                    case 3:
                        //Forma polar
                        double r1= A.modulo();
                        double a1= A.angulo();
                        System.out.println(r1+ ","+a1 + "grados");
                        break;

                    case 4:
                        // Suma de Complejos
                        System.out.println ("Ingrese VEctor");
                        System.out.println("Ingrese coordI ");
                        a=LeerDatos.leerReal();
                        System.out.println("Ingrese coordJ ");
                        b=LeerDatos.leerReal();
                        B =new Vector2D (a,b);
                        x=A.get_coorI()+B.get_coorI();
                        y=A.get_coorJ()+B.get_coorJ();
                        System.out.println ("El resultado de la suma es: ("+x+ "i," +y+"j)");
                        break;
                    case 5:
                        //Resta de Complejos
                        System.out.println ("Ingrese Vector");
                        System.out.println("Ingrese coordI");
                        a=LeerDatos.leerReal();
                        System.out.println("Ingrese coordj ");
                        b=LeerDatos.leerReal();
                        B =new Vector2D (a,b);
                        x=A.get_coorI()-B.get_coorI();
                        y=A.get_coorJ()-B.get_coorJ();
                        System.out.println ("El resultado de la resta es: ("+x+ "i," +y+"j)");
                        break;
                    case 6:
                        //Multiplicación de Complejos
                        System.out.println ("Ingrese Vector ");
                                System.out.println("Ingrese coordI ");
                        a=LeerDatos.leerReal();
                        System.out.println("Ingrese coordj ");
                        b=LeerDatos.leerReal();
                        B =new Vector2D (a,b);
                        x=A.get_coorI()*B.get_coorI()- A.get_coorJ()*B.get_coorJ();
                        y=A.get_coorI()*B.get_coorJ()+A.get_coorJ()*B.get_coorI();
                        System.out.println ("El resultado es:   ("+x+ "i," +y+"j)");
                        break;
                    case 7:
                        //División de Complejos

                        System.out.println ("Ingrese Vector ");
                        System.out.println("Ingrese coordI  ");
                        a=LeerDatos.leerReal();
                        System.out.println("Ingrese coordj  ");
                        b=LeerDatos.leerReal();
                        B =new Vector2D (a,b);
                        double aux;
                        if(B.modulo()==0.0){
                            System.out.println ("No se puede dividir");
                        }
                        else{
                            aux=B.get_coorI()*B.get_coorI() +B.get_coorJ()*B.get_coorJ();
                            x=(A.get_coorI()*B.get_coorI() +A.get_coorJ()*B.get_coorJ())/aux;
                            y=(A.get_coorJ()*B.get_coorI()- A.get_coorI()*B.get_coorJ())/aux;
                            System.out.println ("El resultado es: ("+x+ "," +y+"i)");
                        }
                    case 8:
                        break;
                    default:
                        //controla que solo ingrese opciones validas
                        System.out.println("ERROR INGRESA    BIEN!! LA OPCION!!!!!!!");
                        break;
                }
            }
        }while (opc!=8);
        }
    }
