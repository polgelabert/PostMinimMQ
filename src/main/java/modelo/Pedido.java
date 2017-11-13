package modelo;

import java.util.List;

public class Pedido {


    List<Producto> listaProductos;
    List<CantidadesProducto> listaCantidades;
    String nombreUsuario;


    public Pedido(){}

    public Pedido (String nombreUsuario, List<Producto> listaProductos, List<CantidadesProducto> listaCantidades ){
        this.nombreUsuario = nombreUsuario;
        this.listaProductos = listaProductos;
        this.listaCantidades = listaCantidades;
    }


    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<CantidadesProducto> getListaCantidades() {
        return listaCantidades;
    }

    public void setListaCantidades(List<CantidadesProducto> listaCantidades) {
        this.listaCantidades = listaCantidades;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
