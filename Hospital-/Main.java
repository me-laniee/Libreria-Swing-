import javax.swing.JFrame; // Importa la clase JFrame para crear una ventana
import javax.swing.JLabel; // Importa la clase JLabel para mostrar texto

public class Main { // Define la clase principal del programa

    public static void main(String[] args) { // Método principal donde inicia la ejecución

        JFrame miVentana = new JFrame(); // Crea una nueva ventana (objeto JFrame)
        miVentana.setTitle("Hospital-SCL"); // Establece el título de la ventana
        miVentana.setSize(900, 800); // Define el tamaño de la ventana (ancho 900, alto 800)

        // crear un texto con JLabel
        JLabel miTexto = new JLabel(); // Crea una etiqueta (JLabel) vacía
        miTexto.setText("Hola mundo, me llamo MILINI"); // Asigna un texto a la etiqueta

        miVentana.add(miTexto); // Agrega la etiqueta con el texto a la ventana

        miVentana.setVisible(true); // Hace visible la ventana en la pantalla

    } //
}