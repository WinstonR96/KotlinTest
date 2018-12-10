package Core.Comandos

import Core.Interfaces.IComando
import Core.Interfaces.ISolicitud

abstract class ComandoAbstract : IComando {
    constructor(solicitud: ISolicitud)

    override fun Ejecutar() {

    }
}