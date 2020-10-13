package cancino2406joptionpane;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Cancino2406JOptionPane {

    public static void main(String[] args) {
        //SELECCION DE EJERCICIO
        String ejercicio = "";
        do {
            ejercicio = JOptionPane.showInputDialog(null,
                    "Por favor seleccione el ejercicio que desea ver: "
                    + "\nA. Operaciones con números enteros"
                    + "\nB. Ingreso a la universidad");
            
            if (ejercicio.equalsIgnoreCase("a")) {
                //EJERCICIO A
                //se necesitan 2 numeros
                int cantidadNumeros = 2;
                int numeros[] = new int[cantidadNumeros];
                //se necesita hacer suma, resta, division, multiplicacion y modulo
                int suma, resta, multi, modulo;
                float division;

                //inicio
                ImageIcon icon = new ImageIcon("src/img/numbers.png");
                JOptionPane.showMessageDialog(null,
                        "A continuación se le va a pedir que\n ingrese dos números enteros ",
                        "EJERCICIO A", JOptionPane.INFORMATION_MESSAGE, icon);

                //ingreso de números
                for (int i = 0; i < cantidadNumeros; i++) {
                    numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Número " + (i + 1) + ": Ingrese un número entero", "Ingreso de números", JOptionPane.QUESTION_MESSAGE));
                }

                //acceso a las operaciones
                int resp;
                int opcion;
                
                do {
                    //para hacer otra operacion
                    
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Por favor seleccione la operación que desea realizar: \n"
                                + "1. Suma \n"
                                + "2. Resta \n"
                                + "3. Multiplicación \n"
                                + "4. División \n"
                                + "5. Módulo (resto de la división)",
                                "Operaciones disponibles", JOptionPane.QUESTION_MESSAGE));

                        //operaciones
                        switch (opcion) {
                            case 1:
                                //suma
                                suma = 0;
                                for (int i = 0; i < cantidadNumeros; i++) {
                                    suma += numeros[i];
                                }
                                JOptionPane.showMessageDialog(null, "El resultado de la suma es " + suma + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 2:
                                //resta
                                resta = numeros[0];
                                for (int i = 1; i < cantidadNumeros; i++) {
                                    resta -= numeros[i];
                                }
                                JOptionPane.showMessageDialog(null, "El resultado de la resta es " + resta + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 3:
                                //multiplicacion
                                multi = numeros[0];
                                for (int i = 1; i < cantidadNumeros; i++) {
                                    multi *= numeros[i];
                                }
                                JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es " + multi + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 4:
                                //division
                                division = numeros[0];
                                for (int i = 1; i < cantidadNumeros; i++) {
                                    division /= numeros[i];
                                }
                                JOptionPane.showMessageDialog(null, "El resultado de la división es " + division + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            case 5:
                                //módulo
                                modulo = numeros[0];
                                for (int i = 1; i < cantidadNumeros; i++) {
                                    modulo %= numeros[i];
                                }
                                JOptionPane.showMessageDialog(null, "El resto de la división es " + modulo + ".", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Seleccione una opción válida", null, JOptionPane.ERROR_MESSAGE);
                        }

                    } while (opcion < 1 || opcion > 5);

                    resp = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?", null, JOptionPane.YES_NO_OPTION);
                    
                } while (JOptionPane.YES_OPTION == resp);
                
                // FIN EJERCICIO A
                
                
            } else if (ejercicio.equalsIgnoreCase("b")) {
                //EJERCICIO B
                ImageIcon uni = new ImageIcon("src/img/imagenuni.png");
                ImageIcon felicidades = new ImageIcon("src/img/felicidades.png");

                JOptionPane.showMessageDialog(null,
                        "                           CURSO DE INGRESO - UNIVERSIDAD CFP"
                        + "\n Luego de haber ingresado sus datos podrá conocer los resultados de su examen",
                        "EJERCICIO B", JOptionPane.INFORMATION_MESSAGE, uni);

                String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre: ");

                int puntaje = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el puntaje obtenido: "));

                if (puntaje >= 500) {
                    JOptionPane.showMessageDialog(null,
                            "NOMBRE: " + nombre
                            + "\nNRO DE IDENTIFICACION: 0036"
                            + "\nRESULTADO: INGRESADO/A",
                            "RESULTADO EXAMEN", JOptionPane.INFORMATION_MESSAGE, felicidades);

                } else {
                    JOptionPane.showMessageDialog(null,
                            "NOMBRE: " + nombre
                            + "\nNRO DE IDENTIFICACION: 0036"
                            + "\nRESULTADO: NO INGRESADO/A",
                            "RESULTADO EXAMEN", JOptionPane.INFORMATION_MESSAGE);
                }
                
                //FIN EJERCICIO B
                
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una opción válida", null, JOptionPane.ERROR_MESSAGE);
            } 

        } while (!(ejercicio.equalsIgnoreCase("a") || ejercicio.equalsIgnoreCase("b")));
        // FIN SELECCION DE EJERCICIO
        
    //FIN
    }

}
