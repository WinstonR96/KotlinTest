package Core.Comandos

import Core.Entorno
import Core.Interfaces.ISolicitud
import Core.Solicitudes.SolicitudMensaje
import Entity.Usuario

class CmdMensaje:ComandoAbstract {
    var solicitudMensaje : SolicitudMensaje ?= null

    constructor(solicitud : ISolicitud) : super(solicitud){
        solicitudMensaje = solicitud as SolicitudMensaje
    }

    override fun Ejecutar() {
        Entorno.getInstance().Vista?.MostrarMensaje()
        val winston = Usuario("Winston",22)
        Entorno.getInstance().Vista!!.usuario.user = Usuario("Winston",22)
        Entorno.getInstance().Vista!!.usuario.Edad()
    }
}