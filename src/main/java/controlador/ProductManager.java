package controlador;

import controlador.excepciones.UsuarioNoExisteException;

import modelo.*;

import java.util.List;

public interface ProductManager {



    //public void listaProductosOrdAscPrecio();

     boolean realizarPedido(String nombreUsuario, List<Producto> listaProducto, List<CantidadesProducto> listaCantidades) throws UsuarioNoExisteException;

    //public void servirPedido(modelo.Pedido pedido);

    //public void listaProductosOrdDescVentas();


}
