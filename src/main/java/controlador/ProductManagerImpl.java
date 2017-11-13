package controlador;
import controlador.excepciones.UsuarioNoExisteException;
import modelo.*;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductManagerImpl implements ProductManager {



    final static Logger log = Logger.getLogger(ProductManagerImpl.class.getName());


    private static ProductManagerImpl instance;
    private Map< String, Usuario> mapUser;
    private Map <String, Producto> mapProd;

    private ProductManagerImpl(){
        this.mapProd = new HashMap();
        this.mapUser = new HashMap();
    }

    public static ProductManagerImpl getInstance(){
        if(instance == null) {
            instance = new ProductManagerImpl();
            log.info("Se ha instanciado controlador.controlador.ProductManagerImpl por primera vez.");
        }
        return  instance;
    }



    //public void listaProductosOrdAscPrecio(){ }

    public boolean realizarPedido(String nombreUsuario, List<Producto> listaProducto, List<CantidadesProducto> listaCantidades) throws UsuarioNoExisteException{

        //Usuario user = getUser(nombreUsuario);


        Pedido pedido1 = new Pedido(nombreUsuario, listaProducto, listaCantidades);

        return true;
    }

   // public void servirPedido(modelo.Pedido pedido){ }

    //public void listaProductosOrdDescVentas(){ }


    public boolean crearUsuario(Usuario user) throws UsuarioNoExisteException {

        log.info("Inicio crearUsuario: " + user.getNombreUsuario());
        isUser(user.getNombreUsuario());          // lanza excepcion si isUser== true (lo contiene)
        mapUser.put(user.getNombreUsuario(), user);

        log.info("Fin crearUsuario: " + user.getNombreUsuario() + " con éxito.");
        return true;                                                        // return true ya que operacion ok
    }

    private Usuario getUser(String nombre) throws UsuarioNoExisteException {

        if (!mapUser.containsKey(nombre)) throw new UsuarioNoExisteException();
        return mapUser.get(nombre);
    }

    private void isUser (String nombreUsuario) throws UsuarioNoExisteException{
        if(!mapUser.containsKey(nombreUsuario)) throw new UsuarioNoExisteException();
         }



}
