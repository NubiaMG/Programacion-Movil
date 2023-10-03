data class Punto(val a: Double, val b: Double)

fun calcularPendiente(punto1: Punto, punto2: Punto): Double {
    return (punto2.b - punto1.b) / (punto2.a - punto1.a)
}

fun main() {
    val punto1 = Punto()
    val punto2 = Punto()

    val pendiente = calcularPendiente(punto1, punto2)
    println("La pendiente es: $pendiente")
}

fun Punto(): Punto {

}
