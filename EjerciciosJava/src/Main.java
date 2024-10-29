import jdk.jshell.execution.Util;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido a la lista de ejercicios de Java");



        do {
            System.out.println("Elige el ejercicio que quieres que te muestre:\n Elige uno del 1 al 14 \n 15 para salir.");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    String nombre;
                    System.out.println("Introduce tu nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Que pasa "+nombre+"Guaper.. Que arte tiene .. Disfruta de la vida que son dos dias...");
                    break;

                case 2:
                    int numero;
                    System.out.println("Introduce un numero: ");
                    numero = sc.nextInt();
                    if (numero%2 == 0 ){
                        System.out.println("El numero es par");
                    }else{
                        System.out.println("El numero es impar");
                    }
                    break;

                case 3:
                    double a,r;
                    System.out.print("Introduce el radio de un circulo: ");
                    r = sc.nextDouble();
                    a=Math.PI*(r*r);
                    System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
                    break;

                case 4:
                    int numeroAleatorio,contador,opcionUsario;

                    numeroAleatorio = (int) (Math.random()*100);
                    contador = 0;
                    do {
                        System.out.println("Introduce un numero: ");
                        opcionUsario = sc.nextInt();
                        if (opcionUsario > numeroAleatorio){
                            System.out.println("El numero es menor");
                        }else if (opcionUsario < numeroAleatorio){
                            System.out.println("El numero es mayor");
                        }
                        contador++;
                    }while (opcionUsario != numeroAleatorio);
                    System.out.println("Has acertado el numero en "+contador+" intentos");

                    break;


                case 5:
                    int numeroTabla;
                    System.out.println("introduce un numero para mostrarte su tabla de multiplicar");
                    numeroTabla = sc.nextInt();
                    for (int i = 1; i <= 10; i++){
                        System.out.println(numeroTabla+" x "+i+" = "+numeroTabla*i);
                    }
                    break;


                case 6:
                    System.out.println("La suma de los numeros del 1 al 100");
                    int suma = 0;
                    for (int i = 1; i <= 100; i++){
                        suma += i;
                    }
                    System.out.println(" es: "+suma);
                    break;

                case 7:
                    String cadena;
                    String cadenaInvertida = "";
                    System.out.println("Introduce una cadena de texto: ");
                    cadena = sc.nextLine();
                    for (int i = cadena.length()-1; i >= 0; i--){
                        cadenaInvertida += cadena.charAt(i);
                    }
                    System.out.println("La cadena invertida es: "+cadenaInvertida);
                    break;

                case 8:
                    String cadena8;
                    int contadorVocales = 0;

                    System.out.println("Introduce una cadena de texto: ");
                    cadena8 = sc.nextLine();

                    for (int i = 0; i < cadena8.length(); i++) {
                        char c = cadena8.charAt(i);
                        if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
                                || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u'))
                            contadorVocales++;
                    }
                    System.out.println("El numero de vocales en la cadena es: "+contadorVocales);


                    break;

                case 9:
                    int numeroPrimo;
                    boolean esPrimo = true;

                    System.out.println("Introduce un numero: ");
                    numeroPrimo = sc.nextInt();
                    for (int i = 2; i < numeroPrimo; i++){
                        if (numeroPrimo % i == 0){
                            esPrimo = false;
                        }
                    }
                    if (esPrimo){
                        System.out.println("El numero "+numeroPrimo+" es primo");
                    }else{
                        System.out.println("El numero "+numeroPrimo+" no es primo");
                    }
                    break;

                case 10:
                    int opcionConversor;
                    double temperatura=  0;

                    System.out.println("Conversor de temperatura:\n1. Celsius a Fahrenheit\n2. Fahrenheit a Celsius");
                     opcionConversor = sc.nextInt();

                    switch (opcionConversor){
                        case 1:
                            System.out.println("Introduce la temperatura en grados Celsius: ");
                            temperatura = sc.nextDouble();
                            System.out.println("La temperatura en Fahrenheit es: "+(temperatura*1.8+32));// esta es la formula para pasar de celsius a fahrenheit
                            break;

                        case 2:
                            System.out.println("Introduce la temperatura en grados Fahrenheit: ");
                            temperatura = sc.nextDouble();
                            System.out.println("La temperatura en Celsius es: "+((temperatura-32)/1.8));// esta es la formula para pasar de fahrenheit a celsius
                            break;

                        default:
                            System.out.println("Elige una opcion correcta..");
                    }
                    break;

                case 11:
                    System.out.println("Fibonnaci:");
                    /*
                    la serie de fibonacci es una serie de numeros en la que el siguiente numero es la suma de los dos anteriores
                    0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610...

                     */
                    int n1 = 0;//primer numero de la serie
                    int n2 = 1;//segundo numero de la serie
                    int n3;//tercer numero de la serie
                    int numeroFibonnaci;//numero de elementos de la serie que queremos mostrar
                    System.out.println("Introduce un numero: ");
                    numeroFibonnaci = sc.nextInt();
                    System.out.print(n1+" "+n2);
                    for (int i = 2; i < numeroFibonnaci; i++){
                        n3 = n1 + n2;
                        System.out.print(" "+n3);
                        n1 = n2;
                        n2 = n3;
                    }

                    break;

                case 12:

                    System.out.println("Introduce un numero que quieres invertir: ");
                    int numero12 = sc.nextInt();
                    sc.nextLine();
                    int numeroInvertido = 0;
                    int resto = 0 ;

                    //  La logica de este bucle es la siguiente: vamos a ir sacando el ultimo digito del numero y lo vamos a ir añadiendo al numero invertido .
                    while(numero12> 0) {
                        resto = numero12 % 10;//sacamos el resto del numero por 10 para obtener el ultimo digito
                        numeroInvertido = numeroInvertido * 10 + resto; // multiplicamos el numero invertido por 10 y le sumamos el resto
                        numero12 = numero12 / 10;  // dividimos el numero entre 10 para ir eliminando el ultimo digito del numero original
                    }
                    System.out.println("El numero invertido es: "+numeroInvertido);
                    break;

                case 13:
                    System.out.println("Ejercicio 13");
                    String nombreAnime, generoAnime;
                    int numeroEpisodiosAnime;
                    System.out.println("Introduce el nombre del anime: ");
                    nombreAnime = sc.nextLine();
                    System.out.println("Introduce el genero del anime: ");
                    generoAnime = sc.nextLine();
                    System.out.println("Introduce el numero de episodios del anime: ");
                    numeroEpisodiosAnime = sc.nextInt();

                    Anime anime = new Anime(nombreAnime,generoAnime,numeroEpisodiosAnime);
                    System.out.println(anime);
                    break;

                case 14://TODO tenemos que terminar esto.

                    Utils.gestionarInventario();

                    break;


                case 15:
                    System.out.println("Hasta luego..");
                    break;

                default:
                    System.out.println("Elige una opcion correcta..");

            }



        }while (opcion != 15);




    }
}