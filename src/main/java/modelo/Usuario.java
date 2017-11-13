package modelo;

import java.util.List;

public class Usuario {


    String nombreUsuario;
    List<Pedido> listaPedidosUsuario;



    public Usuario(){}

    public Usuario (String nombreUsuario, List<Pedido> listaPedidosUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.listaPedidosUsuario = listaPedidosUsuario;
    }

    public Usuario (String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public List<Pedido> getListaPedidosUsuario() {
        return listaPedidosUsuario;
    }

    public void setListaPedidosUsuario(List<Pedido> listaPedidosUsuario) {
        this.listaPedidosUsuario = listaPedidosUsuario;
    }
}
