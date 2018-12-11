package Core

import Core.Comandos.CreadorComando
import Core.Interfaces.IComando
import Core.Interfaces.ISolicitud

class Agente {

    companion object {
        @Volatile
        private var INSTANCE: Agente?= null
        fun getInstance() =
            INSTANCE ?: synchronized(this){
                INSTANCE ?: Agente()
            }


    }

    fun ProcesarComando(solicitud: ISolicitud){
        var comando : IComando = CreadorComando.GetComando(solicitud)
        comando.Ejecutar()
    }
}