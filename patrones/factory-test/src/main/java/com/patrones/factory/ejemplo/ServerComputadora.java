package com.patrones.factory.ejemplo;

import com.patrones.factory.anotaciones.MiComponente;

@MiComponente(name="server", singleton = true)
public class ServerComputadora implements Computadora {

}
