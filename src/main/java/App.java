import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class App {
    public static int PRETTY_PRINT_IDENT_FACTOR = 4;

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor();
        v1.setNombre("Juan");
        v1.setApellido("Perez");
        v1.setEdad(10);

        Cliente c1 = new Cliente();
        c1.setNombre("HIVYMAR");
        c1.setDireccion("Victor Emilio Estrada 204");
        c1.setTelefono("5020800");
        Cliente c2 = new Cliente();
        c2.setNombre("PROMESA");
        c2.setDireccion("Via. Daule KM 5.5");
        c2.setTelefono("5013604");
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2);

        //Objeto JSON
        JSONObject objVendedor = new JSONObject(v1);
        JSONArray objClientes = new JSONArray();
        try {
            for (Cliente cliente : clientes) {
                JSONObject objCliente = new JSONObject();
                objCliente.put("nombre", cliente.getNombre());
                objCliente.put("direccion", cliente.getDireccion());
                objCliente.put("telefono", cliente.getTelefono());
                objClientes.put(objCliente);
            }
            JSONObject objVendedorClientes = new JSONObject();
            objVendedorClientes.put("vendedor", objVendedor);
            objVendedorClientes.put("clientes", objClientes);
            System.out.println(objVendedorClientes.toString(PRETTY_PRINT_IDENT_FACTOR));
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Literal d

        List<Vendedor> vendedores = new ArrayList<Vendedor>();
        
        Vendedor v2 = new Vendedor();
        v2.setNombre("Jumbo");
        v2.setApellido("Sas");
        v2.setEdad(50);

        List<Cliente> clientesVendedor2 = new ArrayList<Cliente>();
        
        Cliente c3 = new Cliente();
        c3.setNombre("Peranito");
        c3.setDireccion("Cra 76");
        c3.setTelefono("5412512");
        Cliente c4 = new Cliente();
        c2.setNombre("Sultanito");
        c2.setDireccion("Av Ferrocarril");
        c2.setTelefono("6981241");
        
        clientesVendedor2.add(c3);
        clientesVendedor2.add(c4);

        JSONObject objVendedor2 = new JSONObject(v1);
        JSONArray objClientesV2 = new JSONArray();
        try {
            for (Cliente cliente : clientesVendedor2) {
                JSONObject objCliente = new JSONObject();
                objCliente.put("nombre", cliente.getNombre());
                objCliente.put("direccion", cliente.getDireccion());
                objCliente.put("telefono", cliente.getTelefono());
                objClientesV2.put(objCliente);
            }
            JSONObject objVendedorClientes = new JSONObject();
            objVendedorClientes.put("vendedor", objVendedor2);
            objVendedorClientes.put("clientes", objClientesV2);
            System.out.println(objVendedorClientes.toString(PRETTY_PRINT_IDENT_FACTOR));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Vendedor v3 = new Vendedor();
        v3.setNombre("Exito");
        v3.setApellido("Ltda");
        v3.setEdad(60);

        List<Cliente> clientesVendedor3 = new ArrayList<Cliente>();
        Cliente c5 = new Cliente();
        c5.setNombre("Pepito");
        c5.setDireccion("Cll. Colombia");
        c5.setTelefono("2723454");
        
        Cliente c6 = new Cliente();
        c6.setNombre("Julano");
        c6.setDireccion("Av 33");
        c6.setTelefono("5986030");
        
        clientesVendedor3.add(c5);
        clientesVendedor3.add(c6);

        vendedores.add(v1);
        vendedores.add(v2);
        vendedores.add(v3);

        JSONArray objVendedores = new JSONArray();
        try {
            for (Vendedor vendedor : vendedores) {
                JSONObject _objVendedor = new JSONObject();
                _objVendedor.put("nombre", vendedor.getNombre());
                _objVendedor.put("apellido", vendedor.getApellido());
                _objVendedor.put("edad", vendedor.getEdad());
                objVendedores.put(_objVendedor);
            }

            System.out.println(objVendedores.toString(PRETTY_PRINT_IDENT_FACTOR));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        /* List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(c1);
        clientes.add(c2); */
    }
}
