public class Main {
    public static void main(String[] args) {

        // 1.a) Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”

        System.out.println("Ejercicio 1a");
        int numeroInicial1 = 2;
        int numeroFinal1 = 10;

        while (numeroInicial1 <= numeroFinal1) { // va a seguir en el bucle mientras la condición sea verdadera

            System.out.println(numeroInicial1);
            numeroInicial1++; // numeroInicial1 = numeroInicial1 + 1;
        }
        // Sigue por acá

        // 1.b) A lo anterior, solo muestre los números pares
        System.out.println("");
        System.out.println("Ejercicio 1b");
        int numeroInicial2 = 5;
        int numeroFinal2 = 20;

        while (numeroInicial2 <= numeroFinal2) {
            if (numeroInicial2 % 2 == 0) {
                System.out.println(numeroInicial2);
            }

            numeroInicial2++;
        }

        // 1.c) A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
        System.out.println("");
        System.out.println("Ejercicio 1c (Con String)");
        int numeroInicial3 = 7;
        int numeroFinal3 = 24;
        String mostrar = "par";

        if (mostrar == "par") {

            while (numeroInicial3 <= numeroFinal3) {
                if (numeroInicial3 % 2 == 0) {
                    System.out.println(numeroInicial3);
                }
                numeroInicial3++;
            }

        } else if (mostrar == "impar") {

            while (numeroInicial3 <= numeroFinal3) {
                if (numeroInicial3 % 2 != 0) {
                    System.out.println(numeroInicial3);
                }
                numeroInicial3++;
            }

        }

// ----------------------------------------------------------------------------------------------------
        System.out.println("");
        System.out.println("Ejercicio 1c (Con Booleano)");
        int numeroInicial3b = 7;
        int numeroFinal3b = 24;

        boolean mostrarSoloLosNumerosPares = false;

        if (mostrarSoloLosNumerosPares) { // Si "pasa tal cosa"

            while (numeroInicial3b <= numeroFinal3b) {

                if (numeroInicial3b % 2 == 0) { // 4 dividido 2 = 2 // resto = 0
                    System.out.println(numeroInicial3b);
                }

                numeroInicial3b++;
            }

        } else { // sino

            while (numeroInicial3b <= numeroFinal3b) {
                if (numeroInicial3b % 2 != 0) { // 5 dividido 2 = 2 // resto = 1
                    System.out.println(numeroInicial3b);
                }

                numeroInicial3b++;
            }

        }

        // 1.d) Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
        System.out.println("");
        System.out.println("Ejercicio 1d");
        int numeroInicial4 = 8;
        int numeroFinal4 = 25;


        for (; numeroInicial4 <= numeroFinal4; numeroFinal4--) {

            if (numeroFinal4 % 2 == 0) {
                System.out.println(numeroFinal4);
            }

        }


        // 2) Determinar si una persona pertenece al segmento de ingresos altos.
        System.out.println("");
        System.out.println("Ejercicio 2");

        int ingresosTotalesDelHogar = 50000;
        int totalDeVeiculosCon5oMasAños = 10;
        int totalInmuebles = 1;
        int totalDeEmbarcacionesAeronavesTitulos = 0;

        if (ingresosTotalesDelHogar >= 489083 || totalDeVeiculosCon5oMasAños >= 3 || totalInmuebles >= 3 || totalDeEmbarcacionesAeronavesTitulos > 0) {
            System.out.println("Posee ingresos altos");
        } else {
            System.out.println("No posee ingresos altos");
        }
    }
}
