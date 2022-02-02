package U4.T2.entregableVideojuego;
// Necesitamos implementar las clases necesarias para modelar el funcionamiento de un Videojuego
// extremadamente simplificado. Todas las clases estarán en el mismo paquete.
//
// Los atributos de todas las clases sólo podrán ser accedidos desde la clase en la que se definen.
//
// El videojuego guardará un Personaje, un Escenario y la fecha y hora en la que se inicia la
// partida.
//
// Del Personaje queremos guardar lo siguiente:
//
//    Personaje concreto que queremos guardar. Únicamente se puede elegir entre la siguiente lista:
// Sonic, Tails o Knuckles.
//    Velocidad de movimiento expresado de manera decimal.
//    Puntos de daño en puñetazo
//    Puntos de daño en patada
//
// En caso de no especificar el Personaje, serán Sonic por defecto, con una velocidad de 100.0,
// puntos de daño en puñetazo a 100 y puntos de daño en patada a 200. Esta clase debe tener un
// método que nos muestre por pantalla el tipo del personaje y sus habilidades (Velocidad y ambos
// puntos de daño).
//
// Del Escenario, queremos guardar lo siguiente:
//
//    Tamaño de píxeles en altura
//    Tamaño de píxeles en longitud
//    Número de anillos que tiene
//    Número de gemas que tiene
//    Array de tipos de enemigos que tiene.
//    Array de Enemigos.
//
// Con el Escenario, en todo momento debemos:
//
//    Poder construir un Escenario pasándole únicamente el tipo de enemigos que contiene. Construirá
// el el escenario con una altura de 100, una longitud de 100, 500 anillos y 2 gemas.
//    Poder generar un Enemigo, dentro de la lista posible de los enemigos, y añadirlo al array de
// los Enemigos. Podrá haber un máximo de 10 enemigos en el escenario.
//    Poder eliminar un Enemigo de la lista posible de los enemigos. Para identificar a un Enemigo,
// lo haremos mediante el índice del array de enemigos.
//    Devolver una cadena con el tamaño en altura y longitud, así como los anillos y gemas que
// tiene, al igual que los tipos de enemigo que tiene y el array de enemigos que tiene.
//
// Del Enemigo, queremos guardar lo siguiente:
//
//    Tipo de Enemigo (será uno de los siguientes: BuzzBomber, CrabMeat, Coconuts, Chopper, MotoBug)
//    Puntos de vida
//    Puntos de daño
//
// Con el Enemigo, en todo momento debemos:
//
//    Poder construir un Enemigo pasándole únicamente el tipo de enemigo que será. Construirá el
// Enemigo con 100 puntos de vida y 70 puntos de daño.
//    Poder restar puntos de vida que se indiquen según el daño que inflinja el personaje. Nunca
// podrá tener una vida con valor negativo.
//    Devolver una cadena con el estado de puntos de vida y de daño, así como el tipo de enemigo que
// es.
//
// Del Videojuego nos interesa conocer en un momento determinado su estado, así que debería imprimir
// por pantalla la fecha de inicio de la partida, el estado del personaje y del escenario (con todo
// lo que tiene el escenario). Por defecto, el Videojuego crea a Sonic como personaje con un
// escenario con BuzzBomber y Coconuts como tipos de enemigos.
//
// El videojuego también guarda el momento en el que se inicia la partida. Para guardar el momento
// preciso de la creación de la partida, usad Calendar
// (http://www.w3api.com/wiki/Java:Calendar.getInstance())
//
// Todos los videojuegos tienen que ejecutarse en una IP concreta, por lo que la clase tiene que
// tener la forma de guardar la IP y métodos para poder acceder a ella y modificarla.
//
// Deberemos por tanto desde el programa principal, crear dos partidas, una con la partida por
// defecto. La otra con otro personaje y otro escenario diferentes, que tendrá 4 tipos de enemigos y
// generaremos 5 enemigos. De esta segunda partida, la imprimiremos antes y después de eliminar un
// enemigo de una posición central (no vale eliminar ni el primero ni el último). Seguidamente,
// imprimiremos el número de enemigos que hay en esta partida.
//
// Puedes crear los métodos que te sean necesarios en cada una de las clases, aunque en el enunciado
// no se digan explícitamente.
public class main {
  public static void main(String[] args) {
    Personaje p1 = new Personaje();
    p1.muestraInfoPersonaje();
    Personaje p2 = new Personaje(Personaje.EnumPersonaje.Knuckles);
    p2.muestraInfoPersonaje();
    Enemigo e1 = new Enemigo(Enemigo.tipoEnemigo.CrabMeat);
    e1.restarHp(20);
    e1.mostrarInfoEnemigo();
    e1.restarHp(90);
    e1.mostrarInfoEnemigo();
    Personaje p4 = new Personaje(Personaje.EnumPersonaje.Sonic);
    Escenario escenario1 = new Escenario(Enemigo.tipoEnemigo.values());
    escenario1.generarEnemigo(Enemigo.tipoEnemigo.Chopper);
    escenario1.generarEnemigo(Enemigo.tipoEnemigo.CrabMeat);
    escenario1.generarEnemigo(Enemigo.tipoEnemigo.CrabMeat);
    escenario1.generarEnemigo(Enemigo.tipoEnemigo.CrabMeat);
    escenario1.generarEnemigo(Enemigo.tipoEnemigo.CrabMeat);


    Videojuego v1 = new Videojuego(17.23f);

    v1.setIp(18.26f);
    v1.mostrarInfoPartida();

    escenario1.mostrarEscenario();
  }
}
