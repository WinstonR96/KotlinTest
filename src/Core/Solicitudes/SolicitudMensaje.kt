package Core.Solicitudes

import Core.Enums.Triggers
import Core.Interfaces.ISolicitud

class SolicitudMensaje(override var Trigger: Triggers) : ISolicitud {
}