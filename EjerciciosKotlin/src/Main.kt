import kotlin.random.Random

fun main() {
    println("Bienvenido a la lista de ejercicios de Kotlin")

    var opcion: Int
    do {
        println("Elige un ejercicio del 1 al 14, o 15 para salir:")
        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                println("Introduce tu nombre:")
                val nombre = readLine()
                println("¡Hola $nombre! Disfruta de la vida.")
            }
            2 -> {
                println("Introduce un número, para saber si es par o no :")
                val numero = readLine()!!.toInt()

                if (numero % 2 == 0) {
                    println("El número es par")
                } else {
                    println("El número es impar")
                }
            }
            3 -> {
                println("Introduce el radio de un círculo:")
                val radio = readLine()!!.toDouble()
                val area = 3.1416 * radio * radio
                println("El área del círculo es: $area")
            }
            4 -> {
                val numeroAleatorio = Random.nextInt(1, 101)
                var contador = 0
                var opcionUsuario: Int

                println("Adivina el número entre 1 y 100")

                do {
                    println("Introduce un número:")
                    opcionUsuario = readLine()?.toIntOrNull() ?: -1

                    if (opcionUsuario > numeroAleatorio) {
                        println("El número es menor")
                    } else if (opcionUsuario < numeroAleatorio) {
                        println("El número es mayor")
                    }

                    contador++
                } while (opcionUsuario != numeroAleatorio)

                println("¡Has acertado el número en $contador intentos!")
            }
            5 -> {
                println("Introduce un número para mostrar su tabla de multiplicar:")
                val numero = readLine()!!.toInt()
                for (i in 1..10) {
                    println("$numero x $i = ${numero * i}")
                }
            }
            6 -> {
                println("La suma de los números del 1 al 100 es:")
                var suma: Int = 0
                for (i in 1..100) {
                    suma += i
                }
                println(suma)
            }
            7 -> {
                var cadena: String
                var cadenaInvertida: String = ""
                println("Introduce una palabra/cadena/numero para invertir:")
                println("Introduce una cadena de texto:")
                cadena = readLine()?.toString() ?: ""

                for (i in cadena.length - 1 downTo 0) {
                    cadenaInvertida += cadena[i]
                }
                println("La cadena invertida es: $cadenaInvertida")
            }
            8 -> {
                println("Introduce una cadena de texto:")
                val cadena8 = readLine() ?: ""
                var contadorVocales = 0

                for (i in cadena8.indices) {
                    val c = cadena8[i]
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                        contadorVocales++
                    }
                }
                println("El número de vocales en la cadena es: $contadorVocales")
            }
            9 -> {
                var numeroPrimo: Int
                var esPrimo = true

                println("Introduce un número para saber si es primo o no:")
                numeroPrimo = readLine()?.toIntOrNull() ?: -1
                for (i in 2 until numeroPrimo) {
                    if (numeroPrimo % i == 0) {
                        esPrimo = false
                        break // Para mejorar la eficiencia
                    }
                }
                if (esPrimo && numeroPrimo > 1) {
                    println("El número $numeroPrimo es primo")
                } else {
                    println("El número $numeroPrimo no es primo")
                }
            }
            10 -> {
                var opcionConversor: Int
                var temperatura: Double

                println("Conversor de temperatura:\n1. Celsius a Fahrenheit\n2. Fahrenheit a Celsius")
                opcionConversor = readLine()?.toIntOrNull() ?: -1

                when (opcionConversor) {
                    1 -> {
                        println("Introduce la temperatura en Celsius:")
                        temperatura = readLine()?.toDoubleOrNull() ?: -1.0
                        println("La temperatura en Fahrenheit es: ${temperatura * 9 / 5 + 32}")
                    }
                    2 -> {
                        println("Introduce la temperatura en Fahrenheit:")
                        temperatura = readLine()?.toDoubleOrNull() ?: -1.0
                        println("La temperatura en Celsius es: ${(temperatura - 32) * 5 / 9}")
                    }
                    else -> println("Elige una opción correcta.")
                }
            }
            11 -> {
                println("Fibonacci")
                /*
                   la serie de fibonacci es una serie de numeros en la que el siguiente numero es la suma de los dos anteriores
                   0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610...
                    */
                var n1 = 0
                var n2 = 1
                var n3: Int

                println("Introduce el número de elementos de la serie de Fibonacci que deseas:")
                val numeroFibonacci = readLine()?.toIntOrNull() ?: -1

                if (numeroFibonacci <= 0) {
                    println("Por favor, introduce un número mayor que 0.")
                } else {
                    println("Los primeros $numeroFibonacci números de la serie de Fibonacci son:")
                    if (numeroFibonacci >= 1) println(n1)
                    if (numeroFibonacci >= 2) println(n2)

                    for (i in 2 until numeroFibonacci) {
                        n3 = n1 + n2
                        println(n3)
                        n1 = n2
                        n2 = n3
                    }
                }
            }
            12 -> {
                println("Introduce un número que quieras invertir:")
                var numero12 = readLine()?.toIntOrNull() ?: -1
                var numeroInvertido = 0
                var resto: Int

                /*
                La logica de este bucle es la siguiente:
                vamos a ir sacando el ultimo digito del numero
                y lo vamos a ir añadiendo al numero invertido
                 */
                while (numero12 > 0) {
                    resto = numero12 % 10 //Sacamos el resto del numero por 10 para obtener el ultimo digito
                    numeroInvertido = numeroInvertido * 10 + resto // multiplicamos el numero invertido por 10 y le sumamos el resto
                    numero12 /= 10 // dividimos el numero entre 10 para ir eliminando el ultimo digito del numero original
                }
                println("El número invertido es: $numeroInvertido")
            }
            13 -> {

                println("Ejercicio 13")
                print("Introduce el nombre del anime: ")
                val nombreAnime = readLine() ?: ""
                print("Introduce el genero del anime: ")
                val generoAnime = readLine() ?: ""
                print("Introduce el numero de episodios del anime: ")
                val numeroEpisodiosAnime = readLine()?.toIntOrNull() ?: 0

                val anime = Anime(nombreAnime, generoAnime, numeroEpisodiosAnime)
                println(anime)


            }
            14 ->{
                Utils.gestionarInventario()
            }
            15 -> {
                println("Hasta luego.")
            }
            else -> println("Elige una opción correcta.")
        }

    } while (opcion != 15)
}
