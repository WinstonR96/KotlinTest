package Core.Comandos

import Core.Enums.Triggers
import Core.Interfaces.IComando
import Core.Interfaces.ISolicitud

class CreadorComando {
    companion object {
        fun GetComando(solicitud : ISolicitud) : IComando {
            var comando : IComando ?= null
            when(solicitud.Trigger){
                Triggers.Mensaje -> {
                    comando = CmdMensaje(solicitud)
                }
            }
            return comando!!
        }
    }
}