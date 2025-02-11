fun main() {
    val departamento = Departamento()
    val empleado1 = EmpleadoPorHora(1234)
    val empleado2 = EmpleadoFijo(2234)
    departamento.agregarEmpleados(listOf(empleado1, empleado2))
    println(departamento.calcularSalarioTotal())
}