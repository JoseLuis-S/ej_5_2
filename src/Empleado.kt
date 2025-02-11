abstract class Empleado(open val nombre: String, open val id: Int) {
    abstract fun calcularSalario(): Double
}