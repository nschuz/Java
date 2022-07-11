package org.chuz.appfacturas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {


    //Atributos
    private int folio;
    private String description;
    private Date fecha;


    //Relacion con otras clases
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;

    //constante
    public static final int MAX_ITEMS =10;

    //atributo de la clase
    private static int ultimoFolio;



    public Factura(String description, Cliente cliente) {
        this.description = description;
        this.cliente = cliente;
        //inicialiamos nuestro arreglo
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        //cuando se crea el obejto factura se crea con al fecha actual
        this.fecha = new Date();
    }


    //Setters and getetrs


    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    //etodo para agegar itemfactura
    //este metodo lo podemos llamar multiples veces
    public Factura addItemFactura (ItemFactura item){

        if (indiceItems < MAX_ITEMS){
            //debemos incializar nuestro arreglo porque si no obtendremos nullPoonterExceptio
            this.items[indiceItems++] = item;
        }
        return this;
    }


    public float calcularTotal (){
        float total = 0.0f;

        for (ItemFactura item : this.items){

            //El arreglo es fijo entonces puede que tengamos
            //3 compras pero el arreglo es de 12 etonces vamos a tner problemas  porque es null

            //verifciamos que si es instcia
            // es lo mismo item == null || !(item instanceof ItemFactura)
            if (!(item instanceof ItemFactura)){
                continue;
            }


            total += item.calcularImporte();
        }

        return total;
    }


    public String generarDetalle (){

        //vamosa  concatenar la mejor opcion es utilizar un stringBUilder
        StringBuilder sb = new StringBuilder("Factura N: ");
        sb.append(this.folio).append("\nCliente: ").append(this.cliente.getNombre())
                .append("\t NIF: ").append(this.cliente.getNif())
                .append("\nDescripcion: ").append(this.description)
                .append("\n")
                .append("\n#\tNOmbre\t$\tCant.\tTotal\n");


        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMM, yyy");
        sb.append("Fecha Emision: ").append(df.format(this.fecha)).append("\n");


        for (ItemFactura item: this.items){
            if (item == null){
                continue;
            }
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");

        }

        sb.append("\nGran Total: ").append(calcularTotal());


        return sb.toString();


    }


}
