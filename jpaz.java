public class jpaz {

    private String saludoParrafo = "Hola a todos, bienvenidos a Coffe & Java. \nEsto es un tutorial de como usar java desde la terminal!\n";
    private String[] versionParrafo = {
        "1. Primero debemos comprobar tener instalado java en nuestro ordenador",
        "Para ver que  version de Java tenemos instalado, abrimos nuestra terminal favorita (En mi caso Powershell), y ejecutamos el siguiente comando:",
        "\n\"java -version\"",
        "\n",
        "Nos aparecera un mensaje como este:",
        "\n",
        "java version \"17.0.8\" 2023-07-18 LTS",
        "Java(TM) SE Runtime Environment (build 17.0.8+9-LTS-211)",
        "Java HotSpot(TM) 64-Bit Server VM (build 17.0.8+9-LTS-211, mixed mode, sharing)",
        "\n"
    };

    private String[] javaParrafo = {
        "2. Si no lo tenes instalado, no podes seguir el tutorial :(",
        "Ya que es un tutorial para ejecutar un codigo de Java y no de como instalar Java :(",
        "Igual si quedate, porque para ejecutar un codigo de Java, tenemos que seguir unos pasos nuevos.",
        "\n",
        "3_.En nuestra terminal de comandos, nos dirigimos hasta el espacio directorio donde tengamos un archivo con la extension \".java\" que deseamos ejecutar.",
        "\n",
        "4. Para ejecutar un codigo \"Java\" en la terminal, primero debemos compilar el archivo \".java\", que en este caso, se llama \"jpaz.java\", ejecutando el siguiente comando:",
        "\n\"javac jpaz.java\"",
        "\n",
        "A continuacion, se crea un archivo \"jpaz.class\", este es el codigo de jpaz.java compilado y listo para ser ejecutado.",
        "\n",
        "5. Para ejecutar el archivo \".class\" debemos ejecutar el siguiente comando:",
        "\n\"java jpaz\"",
        "\n",
        "6. Si todo salio bien, deberia salirte literalmente, este mismo mensaje. Bueno esto creo que es el concepto de la recursividad,",
        "pero lo importante es que aprendiste a como ejecutar un codigo de Java desde la terminal.",
        "\n",
    };
    public void saludo(){
        String barrita = "";
        for(int i = 0 ;i < saludoParrafo.length(); i++ ){
            barrita += "*";
        }
        System.out.println(barrita);
        System.out.println(saludoParrafo);
    }
    public void versionJava(){
        for(int i = 0; i < versionParrafo.length; i++){
            System.out.println(versionParrafo[i]);
        }
    }
    public void ejecutarComandos(){
        for(int i = 0; i < javaParrafo.length; i++){
            System.out.println(javaParrafo[i]);
        }
        String barrita = "";
        for(int i = 0 ;i < saludoParrafo.length(); i++ ){
            barrita += "*";
        }
        System.out.println(barrita);
    }
    public static void main(String[] args) {

        jpaz Jpaz = new jpaz();

        Jpaz.saludo();
        Jpaz.versionJava();
        Jpaz.ejecutarComandos();
    }
}