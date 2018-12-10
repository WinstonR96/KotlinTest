import Core.Entorno
import Main.Model.ModelVista

/*
package Main

class main {
}*/
fun main(args: Array<String>){
    Entorno.getInstance().Vista = ModelVista()
    println("Hello, World!")
}
