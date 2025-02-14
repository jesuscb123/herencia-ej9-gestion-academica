class Estudiante(nombre: String, edad: Int, id: String, val curso: String, val calificacionPromedio: Double) : Persona(nombre,edad,id)  {


    fun mostrarCalificacion(){
        println("Calificacion promedio: $calificacionPromedio")
    }
    override fun mostrarRol() {
        println("Rol: Estudiante")
    }
}