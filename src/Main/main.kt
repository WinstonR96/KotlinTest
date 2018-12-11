import Core.Entorno
import Core.Enums.Triggers
import Core.Reactor
import Core.Solicitudes.SolicitudMensaje
import Main.Model.ModelVista

/*
package Main

class main {
}*/
fun main(args: Array<String>){
    //Entorno.getInstance().Vista = ModelVista.getInstance()
    val solicitudMensaje : SolicitudMensaje = SolicitudMensaje(Triggers.Mensaje)
    Reactor.getInstance().ProcesarSolicitud( solicitudMensaje)
    //println("Hello, World!")
}
