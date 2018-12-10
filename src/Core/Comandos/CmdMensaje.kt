package Core.Comandos

import Core.Interfaces.ISolicitud
import Core.Solicitudes.SolicitudMensaje

class CmdMensaje:ComandoAbstract {
    var solicitudMensaje : SolicitudMensaje ?= null

    constructor(solicitud : ISolicitud) : super(solicitud){
        solicitudMensaje = solicitud as SolicitudMensaje
    }
}