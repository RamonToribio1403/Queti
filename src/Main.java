import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Variables.
        boolean ciclo = true;
        Scanner scan = new Scanner(System.in);
        String validacion;
        int va;
        //Bienvenida al programa.
        System.out.println("Bienvenido. :) \n");
        //Ciclo para matener el  programa activo.
        while (ciclo){
            //Menu principal.
            System.out.println("|-----------------------------|");
            System.out.println("|¿Que conversor necesitas?    |");
            System.out.println("|-----------------------------|");
            System.out.println("|1. Conversor de sistemas.    |");
            System.out.println("|2. Conversor de temperatura. |");
            System.out.println("|3. Conversor de unidades.    |");
            System.out.println("|4. Salir.                    |");
            System.out.println("|-----------------------------|");
            //Escaneo de la variable para el menu inicial.
            validacion = scan.nextLine();
            //Realiza la validacion.
            va = validacionsn(validacion);
            //Selecciona el caso segun el resultado de la validacion.
            if(va == 1){
                int opcion = Integer.parseInt(validacion);
                if(opcion == 1){
                    sistemas();
                }//Fin opcion uno.
                else if (opcion == 2) {
                    Temperaturas();
                }//Fin opcion dos.
                else if (opcion == 3) {
                    unidades();
                }//Fin opcion tres.
                else if (opcion == 4) {
                    System.out.println("Hasta la proxima, que te vaya bonito. :)");
                    ciclo = false;
                }//Fin opcion cuatro.
                else {
                    System.out.println("esa opción no esta disponible"
                            + "\n intente otra vez");
                }//Fin mensaje de opcion no valida.
            }//Fin validacion verdadera.
            else if (va == 0) {
                System.out.println("Que te parece s solo ingresamos numeros para elegir una opcion. °_°");
            }//Fin validacion falso.
        }//Fin del while.
    }//Fin del menu principal.
    //Comienza el convertidor de sistemas.
    public static void sistemas(){
        //Variables.
        boolean ciclo = true;
        Scanner scan = new Scanner(System.in);
        String datofinal;
        String indato;
        //Ciclo para mantener activa la funcion.
        while (ciclo){
            System.out.println("|----------------------------|");
            System.out.println("| ¿Que dato deseas ingresar? |");
            System.out.println("|----------------------------|");
            System.out.println("|2. Binario.                 |");
            System.out.println("|8. Octal.                   |");
            System.out.println("|10. Decimal.                |");
            System.out.println("|16. Hexadecimal.            |");
            System.out.println("|1. Regresar.                |");
            System.out.println("|----------------------------|");
            int opcion = scan.nextInt();
            scan.nextLine();
            if(opcion == 2){
                System.out.println("|--------------------------------------|");
                System.out.println("|Ingrese el número binario a convertir:|");
                System.out.println("|--------------------------------------|");
                String input = scan.nextLine();

                // Verificar si la entrada contiene solo 0 y 1
                if (input.matches("[01]+")) {
                    // La entrada es válida, continuar con la conversión
                    int entero = Conversor.convertirAEntero(input, opcion);
                    MenuSalida();
                    int opcion2 = scan.nextInt();
                    scan.nextLine();
                    datofinal = Conversor.convertir(entero, opcion2);
                    System.out.println("El número es: " + datofinal);
                } else {
                    // La entrada no es válida
                    System.out.println("La entrada no es un número binario válido.");
                }
            }//Fin opcion dos.
            else if (opcion == 8) {
                System.out.println("Ingrese el numero a convertir:");
                indato = scan.nextLine();
                int entero =Conversor.convertirAEntero(indato,opcion);
                MenuSalida();
                int opcion2 = scan.nextInt();
                scan.nextLine();
                datofinal = Conversor.convertir(entero,opcion2);
                System.out.println("El numero es: " + datofinal);
            }//Fin opcion ocho.
            else if (opcion == 10){
                System.out.println("Ingrese el numero a convertir:");
                indato = scan.nextLine();
                int entero =Conversor.convertirAEntero(indato,opcion);
                MenuSalida();
                int opcion2 = scan.nextInt();
                scan.nextLine();
                datofinal = Conversor.convertir(entero,opcion2);
                System.out.println("El numero es: " + datofinal);
            }//Fin opcion 10.
            else if (opcion == 16){
                System.out.println("Ingrese el numero a convertir:");
                indato = scan.nextLine();
                int entero =Conversor.convertirAEntero(indato,opcion);
                MenuSalida();
                int opcion2 = scan.nextInt();
                scan.nextLine();
                datofinal = Conversor.convertir(entero,opcion2);
                System.out.println("El numero es: " + datofinal);
            }//Fin de opcion dieciseis.
            else if (opcion == 1){
                ciclo = false;
            }//Fin opcion 5.
            else {
                System.out.println("esa opción no esta disponible"
                        + "\n intente otra vez");
            }
        }//Fin del while.
    }//Fin de sistemas.
    public static void MenuSalida(){
        System.out.println("|-----------------------------|");
        System.out.println("|¿A que dato deseas convertir.|");
        System.out.println("|-----------------------------|");
        System.out.println("|10. Decimal.                 |");
        System.out.println("|2. Binario.                  |");
        System.out.println("|16. Hexadecimal.             |");
        System.out.println("|8. Octal.                    |");
        System.out.println("|-----------------------------|");
    }//Fin de menu salida para sistemas.
    //Comienza el convertidor de temperaturas.
    public static void Temperaturas(){
        Scanner scan = new Scanner(System.in);
        boolean ciclotem = true;
        int opc2;
        double tementrada;
        double temcen;
        double temfinal;
        String validacion;
        int va;
        System.out.println("Bienvenido al conversor de temperatura. :) \n");
        while (ciclotem){
            System.out.println("|-------------------------------- |");
            System.out.println("|¿Cuál será la unidad de entrada? |");
            System.out.println("|---------------------------------|");
            System.out.println("|1. Centigrados.                  |");
            System.out.println("|2. Fahrenheits.                  |");
            System.out.println("|3. Kelvin.                       |");
            System.out.println("|4. Regresar.                     |");
            System.out.println("|---------------------------------|");
            //Escanea la entrada para el menu.
            validacion = scan.nextLine();
            //Realiza la validacion.
            va = validacionsn(validacion);
            //Limpia el búfer.
            scan.nextLine();
            if (va == 1){
                //Retorna el valor si la validacion es verdadera.
                int opc1  = Integer.parseInt(validacion);
                if (opc1 == 1){
                    System.out.println("Ingresa el dato de temperatura.\n");
                    tementrada = scan.nextDouble();
                    temcen = Temperatura.Convertircelcius(tementrada,opc1);
                    //Limpia el búfer.
                    scan.nextLine();
                    menutem2();
                    validacion = scan.nextLine();
                    va = validacionsn(validacion);
                    if (va == 1){
                        opc2 = Integer.parseInt(validacion);
                        temfinal = Temperatura.convertirtem(temcen, opc2);
                        salidatem(opc2, temfinal);
                    }
                    else if (va == 0) {
                        System.out.println("¿Recuerdas que solo debes usar numeros? *-*");
                    }//Fin de validacion.
                }//Fin opcion uno.
                else if (opc1 == 2) {
                    System.out.println("Ingresa el dato de temperatura.\n");
                    tementrada = scan.nextDouble();
                    temcen = Temperatura.Convertircelcius(tementrada,opc1);
                    //Limpia el búfer.
                    scan.nextLine();
                    menutem2();
                    validacion = scan.nextLine();
                    va = validacionsn(validacion);
                    if (va == 1){
                        opc2 = Integer.parseInt(validacion);
                        temfinal = Temperatura.convertirtem(temcen, opc2);
                        salidatem(opc2, temfinal);
                    } else if (va == 0) {
                        System.out.println("¿Recuerdas que solo debes usar numeros? *-*");
                    }//Fin validacion.
                }//Fin opcion dos.
                else if (opc1 == 3) {
                    System.out.println("Ingresa el dato de temperatura.\n");
                    tementrada = scan.nextDouble();
                    temcen = Temperatura.Convertircelcius(tementrada,opc1);
                    //Limpia el búfer.
                    scan.nextLine();
                    menutem2();
                    validacion = scan.nextLine();
                    va = validacionsn(validacion);
                    if (va == 1){
                        opc2 = Integer.parseInt(validacion);
                        temfinal = Temperatura.convertirtem(temcen, opc2);
                        salidatem(opc2, temfinal);
                    } else if (va == 0) {
                        System.out.println("¿Recuerdas que solo debes usar numeros? *-*");
                    }//Fin validacion.
                }//Fin opcion tres.
                else if (opc1 == 4) {
                    //Termina con el ciclo.
                    ciclotem = false;
                }//Fin opcion cuatro.
                else {
                    System.out.println("esa opción no esta disponible"
                            + "\n intente otra vez");
                }//Fin mensaje de opcion no valida.
            }//Fin validacion verdadero.
            else if (va == 0) {
                System.out.println("Que te parece si solo ingresamos numeros para elegir una opcion. °_°");
            }//Fin validacion falso
        }//Fin del ciclo
    }//Fin temperatura.
    public static void menutem2(){
        System.out.println("|-------------------------------- |");
        System.out.println("|¿A qué unidad deseas convertir?  |");
        System.out.println("|---------------------------------|");
        System.out.println("|1. Centigrados.                  |");
        System.out.println("|2. Fahrenheits.                  |");
        System.out.println("|3. Kelvin.                       |");
        System.out.println("|---------------------------------|");
    }//Fin menutem2.
    public static void salidatem(int opc2, double salida){
        if (opc2 == 1){
            System.out.println("La temperatura convertida es: " + salida + " " + "Centigrados. \n");
        }//Fin opcion uno.
        else if (opc2 == 2) {
            System.out.println("La temperatura convertida es: " + salida + " " + "Fahrenheits. \n");
        }//Fin opcion dos.
        else if (opc2 == 3) {
            System.out.println("La temperatura convertida es: " + salida + " " + "Kelvin. \n");
        }//Fin opcion tres.
    }//Fin salidatem
    //Comienza el convertidor de unidades.
    public static void unidades(){
        Scanner scan = new Scanner(System.in);
        boolean ciclo = true;
        float entrada;
        String unentrada;
        String unsalida;
        float salida;
        int opc2;
        String validacion;
        int va;
        System.out.println("Bienvenido al conversor de unidades. :) \n");
        while (ciclo){
            System.out.println("|-------------------------------- |");
            System.out.println("|¿Cuál será la unidad de entrada? |");
            System.out.println("|---------------------------------|");
            System.out.println("|1. Centímetros.                  |");
            System.out.println("|2. Metros.                       |");
            System.out.println("|3. Kilometros.                   |");
            System.out.println("|4. Pulgadas.                     |");
            System.out.println("|5. Yardas.                       |");
            System.out.println("|6. Millas.                       |");
            System.out.println("|7. Regresar.                     |");
            System.out.println("|---------------------------------|");
            validacion = scan.nextLine();
            va = validacionsn(validacion);
            if(va == 1){
                int opc1 = Integer.parseInt(validacion);
                if (opc1 == 1){
                    unentrada = "centímetros";
                    System.out.println("Ingresa el  valor de la unidad: ");
                    entrada = scan.nextFloat();
                    //Limpia el búfer.
                    scan.nextLine();
                    menu2unidades();
                    validacion = scan.nextLine();
                    va = validacionsn(validacion);
                    if (va ==1){
                        opc2 = Integer.parseInt(validacion);
                        unsalida = menu2uni(opc2);
                        salida = ConvertirUnidades.convertirUnidad(entrada, unentrada, unsalida);
                        salidafinal(opc2, salida);
                    } else if (va == 0) {
                        System.out.println("Recuerdas que solo debes usar numeros? *-*");
                    }//Fin validacion.
                }//Fin opcion uno.
                else if (opc1 == 2) {
                    unentrada = "metro";
                    System.out.println("Ingresa el  valor de la unidad: ");
                    entrada = scan.nextFloat();
                    //Limpia el búfer.
                    scan.nextLine();
                    menu2unidades();
                    validacion = scan.nextLine();
                    va = validacionsn(validacion);
                    if (va ==1){
                        opc2 = Integer.parseInt(validacion);
                        unsalida = menu2uni(opc2);
                        salida = ConvertirUnidades.convertirUnidad(entrada, unentrada, unsalida);
                        salidafinal(opc2, salida);
                    } else if (va == 0) {
                        System.out.println("Recuerdas que solo debes usar numeros? *-*");
                    }//Fin validacion.
                }//Fin opcion dos.
                else if (opc1 == 3) {
                    unentrada = "kilometros";
                    System.out.println("Ingresa el  valor de la unidad: ");
                    entrada = scan.nextFloat();
                    //Limpia el búfer.
                    scan.nextLine();
                    menu2unidades();
                    validacion = scan.nextLine();
                    va = validacionsn(validacion);
                    if (va ==1){
                        opc2 = Integer.parseInt(validacion);
                        unsalida = menu2uni(opc2);
                        salida = ConvertirUnidades.convertirUnidad(entrada, unentrada, unsalida);
                        salidafinal(opc2, salida);
                    } else if (va == 0) {
                        System.out.println("Recuerdas que solo debes usar numeros? *-*");
                    }//Fin validacion.
                }//Fin opcion tres.
                else if (opc1 == 4) {
                    unentrada = "pulgada";
                    System.out.println("Ingresa el  valor de la unidad: ");
                    entrada = scan.nextFloat();
                    //Limpia el búfer.
                    scan.nextLine();
                    menu2unidades();
                    validacion = scan.nextLine();
                    va = validacionsn(validacion);
                    if (va ==1){
                        opc2 = Integer.parseInt(validacion);
                        unsalida = menu2uni(opc2);
                        salida = ConvertirUnidades.convertirUnidad(entrada, unentrada, unsalida);
                        salidafinal(opc2, salida);
                    } else if (va == 0) {
                        System.out.println("Recuerdas que solo debes usar numeros? *-*");
                    }//Fin validacion.
                }//Fin opcion cuatro.
                else if (opc1 == 5) {
                    unentrada = "yarda";
                    System.out.println("Ingresa el  valor de la unidad: ");
                    entrada = scan.nextFloat();
                    //Limpia el búfer.
                    scan.nextLine();
                    menu2unidades();
                    validacion = scan.nextLine();
                    va = validacionsn(validacion);
                    if (va ==1){
                        opc2 = Integer.parseInt(validacion);
                        unsalida = menu2uni(opc2);
                        salida = ConvertirUnidades.convertirUnidad(entrada, unentrada, unsalida);
                        salidafinal(opc2, salida);
                    } else if (va == 0) {
                        System.out.println("Recuerdas que solo debes usar numeros? *-*");
                    }//Fin validacion.
                }//Fin opcion cinco.
                else if (opc1 == 6) {
                    unentrada = "milla";
                    System.out.println("Ingresa el  valor de la unidad: ");
                    entrada = scan.nextFloat();
                    //Limpia el búfer.
                    scan.nextLine();
                    menu2unidades();
                    validacion = scan.nextLine();
                    va = validacionsn(validacion);
                    if (va ==1){
                        opc2 = Integer.parseInt(validacion);
                        unsalida = menu2uni(opc2);
                        salida = ConvertirUnidades.convertirUnidad(entrada, unentrada, unsalida);
                        salidafinal(opc2, salida);
                    } else if (va == 0) {
                        System.out.println("Recuerdas que solo debes usar numeros? *-*");
                    }//Fin validacion.
                }//Fin opcion seis.
                else if (opc1 == 7) {
                    ciclo = false;
                }//Fin opcion siete.
                else {
                    System.out.println("esa opción no esta disponible"
                            + "\n intente otra vez");
                }//Fin mensaje de opcion no valida.
            }//Fin validacion verdadera.
            else if (va == 0) {
                System.out.println("Que te parece si solo ingresamos numeros para elegir una opcion. °_°");
            }
        }//Fin del ciclo.
    }//Fin de unidades.
    public static void menu2unidades(){
        System.out.println("|-------------------------------- |");
        System.out.println("|¿Cuál será la unidad de salida?  |");
        System.out.println("|---------------------------------|");
        System.out.println("|1. Centímetros.                  |");
        System.out.println("|2. Metros.                       |");
        System.out.println("|3. Kilometros.                   |");
        System.out.println("|4. Pulgadas.                     |");
        System.out.println("|5. Yardas.                       |");
        System.out.println("|6. Millas.                       |");
        System.out.println("|---------------------------------|");

    }//Fin menu2unidades.
    public static String menu2uni (int opc2){
        String unidadsalida= "";
        if (opc2 == 1){
            unidadsalida = "centimetro";

        }//Fin opcion uno.
        else if (opc2 == 2) {
            unidadsalida = "metro";

        }//Fin opcion dos.
        else if (opc2 == 3) {
            unidadsalida = "kilometro";

        }//Fin opcion tres.
        else if (opc2 == 4) {
            unidadsalida  = "pulgada";

        }//Fin opcion cuatro.
        else if (opc2 == 5) {
            unidadsalida = "yarda";

        }//Fin opcion cinco.
        else if (opc2 == 6) {
            unidadsalida = "milla";
            System.out.println();

        }//Fin opcion seis.
        else {
            System.out.println("esa opción no esta disponible"
                    + "\n intente otra vez");

        }//Fin mensaje de opcion no valida.
        return unidadsalida;
    }//Fin menu2uni.
    public static void salidafinal(int opc2, float salida){
        if (opc2 == 1){
            System.out.println("La unidad convertida es: " + salida + "Centimetros. \n");
        }//Fin opcion uno.
        else if (opc2 == 2) {
            System.out.println("La unidad convertida es: " + salida + "Metros. \n");
        }//Fin opcion dos.
        else if (opc2 == 3) {
            System.out.println("La unidad convertida es: " + salida + "Kilometros. \n");
        }//Fin opcion tres.
        else if (opc2 == 4) {
            System.out.println("La unidad convertida es: " + salida + "Pulgadas. \n");
        }//Fin opcion cuatro.
        else if (opc2 == 5) {
            System.out.println("La unidad convertida es: " + salida + "Yardas. \n");
        }//Fin opcion cinco.
        else if (opc2 == 6) {
            System.out.println("La unidad convertida es: " + salida + "Millas. \n");
        }//Fin opcion seis.
    }//Fin salida final.
    public static int validacionsn(String entradadato){
        try{
            Double.parseDouble(entradadato);
            return 1;
        }catch (Exception e){
            return 0;

        }
    }//Fin validacionsn.
}//Fin de Main