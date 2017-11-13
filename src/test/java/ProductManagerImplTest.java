

import controlador.ProductManagerImpl;
import modelo.CantidadesProducto;
import modelo.Producto;
import modelo.Usuario;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;



public class ProductManagerImplTest {



    final static Logger log = Logger.getLogger(ProductManagerImplTest.class.getName());          // test2.class.getname indica el nombre de la clase.

    private ProductManagerImpl pm;

    String nombreProducto;
    Usuario user;

    List<Producto> listaProducto = new ArrayList<>();
    List<CantidadesProducto> listaCantidades = new ArrayList<>();

    @Before
    public void SetUp() {

        this.pm = ProductManagerImpl.getInstance();


        try {

            Producto p1 = new Producto("tomate",1);
            Producto p2 = new Producto("jamon",5);
            listaProducto.add(p1);
            listaProducto.add(p2);

            CantidadesProducto c1 = new CantidadesProducto(p1.nombreProducto, 2);
            CantidadesProducto c2 = new CantidadesProducto(p2.nombreProducto,3);
            listaCantidades.add(c1);
            listaCantidades.add(c2);

            user = new Usuario("pol");
            pm.crearUsuario(user);

        }
        catch (Exception e) {
            //log.fatal(e.getMessage() + e.getCause());
            //e.printStackTrace();
            throw e;
        }

    }



    @Test
    public void realizarPedidoTest(){



        Assertions.assertTrue(pm.realizarPedido(user.nombreUsuario, listaProducto, listaCantidades));


    }






}
