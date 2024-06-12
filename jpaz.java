public class jpaz {

    private String saludoParrafo = "Hola a todos, bienvenidos a Coffe & Java. \nEsto es un tutorial de como usar java desde la terminal!\n";
    private String[] versionParrafo = {
        "1_ Primero debemos comprobar tener instalado java en nuestro ordenados",
        "Para ver que  version de Java tenemos instalado, ejecutamos el siguiente comando:",
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
        "2_ Si no lo tenes instalado, no podes seguir el tutorial :(",
        "Ya que es un tutorial para ejecutar un codigo de Java y no de como instalar Java :(",
        "Igual si queres quedate, porque para ejecutar un codigo de Java, tenemos que seguir unos pasos nuevos.",
        "\n",
        "3_ Abrimos nuestra terminal favorita, en mi caso voy a usar \"Powershell\", y dirigirme al directorio donde se encuentra mi archivo \".java\" que quiero ejecutar.",
        "\n",
        "4_ Ejecutamos el comando \"javac <nombre_del_archivo>.java\", por ejemplo el nombre de este archivo es \"jpaz.java\", reemplazamoss <nombre_del_archivo> por ese mismo:",
        "\n\"javac jpaz.java\"",
        "\n",
        "A continuacion, se crea un archivo \"jpaz.class\", este es el codigo de jpaz.java compilado y listo para ser ejecutado.",
        "\n",
        "5_ Para ejecutar el archivo \".class\" debemos ejecutar el siguiente comando:",
        "\n\"java jpaz\"",
        "6_ Si todo salio bien, deberia salirte literalmente, este mismo mensaje. Bueno esto creo que es el concepto de la recursividad, pero lo importante es que aprendiste a como ejecutar un codigo de Java desde la terminal"
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