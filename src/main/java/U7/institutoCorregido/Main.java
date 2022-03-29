package U7.institutoCorregido;
//Queremos desarrollar una aplicación para la gestión de las distintas unidades y alumnos que componen un Instituto del que queremos guardar también su nombre.
//
//Cuando nos referimos a unidades nos referimos a la unión de un curso más la letra. Por ejemplo "4ºA". Por lo tanto, debemos crear una clase Unidad para guardar el nombre de la unidad y además de eso la lista los alumnos que componen dicha unidad.
//
//De los alumnos guardaremos los siguientes datos:
//
//- El nombre del alumnos
//- Los apellidos
//- El dni
//- Un id que deberá ser consecutivo para todos y cada uno de los alumnos que creemos.
//- La `Unidad` en la que está matriculado.
//La organización de un Instituto es compleja y para ser ágil debo de ser capaz de acceder de manera directa a todos los alumnos que componen una unidad una vez conozco el nombre de la misma. Debemos tener esto en consideración y determinar cuál es la "estructura" más adecuada para este propósito. Además de eso debemos de tener los siguiente métodos en la clase Instituto:
//
//Un método mostrarTodosAlumnosOrdenados() que muestre todos los alumnos del instituto ordenador por apellido.
//
//El método obtenerUnidadAlumno() que recibe un id del alumno y nos devuelve en qué unidad está matriculado.
//
//El método mostrarAlumnosUnidad() que recibe como parámetro el nombre de la unidad y nos muestra la lista de alumnos de esa unidad ordenados por el DNI.
//
//El método addAlumnoUnidad() que recibe un alumno y el nombre una unidad y los añade a la unidad determinada. En caso de no haber antes ningún alumno en esa unidad creará la estructura de datos adecuada.
//
//No todas las matriculaciones del instituto se realizan el mismo día sí que debemos también de tener dos métodos en la clase:
//
//cargarAlumnos() que leerá todos los alumnos desde el fichero binario "alumnos.dat" y los colocará en la unidad determinada.
//guardarAlumnos() que escribirá todos los alumnos del IES en el fichero alumnos.dat.
//Usar dicha clase y todos sus métodos en la la clase Main. Deberéis tener, al menos, 3 unidades y 10 alumnos.
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //
        Instituto alixar = new Instituto("Alixar");
        Unidad u1 = new Unidad("DAW1Tarde");
        Alumno a1 = new Alumno("Aitor", "Tilla", "877623D", u1);
        Alumno a2 = new Alumno("Paco", "Mer", "356353T", u1);
        Alumno a3 = new Alumno("Rigoberta", "Bandini", "53456J", u1);

        alixar.addAlumnoUnidad(a1, "DAW1Tarde");
        alixar.addAlumnoUnidad(a2, "DAW1Mañana");
        alixar.addAlumnoUnidad(a3, "DAW1Tarde");

        List<Alumno> lista = alixar.mostrarAlumnosUnidad("DAW1Tarde");
        System.out.println(lista);
        Unidad resultado = alixar.obtenerUnidadAlumno(1);
        System.out.println(resultado);
        alixar.mostrarTodosAlumnosOrdenados();
        alixar.guardarAlumnos();
        alixar.cargarAlumnos();
    }
}