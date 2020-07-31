public  abstract  class Animal {
    // no es uncepto es claro puede ser una vae

    private String nombre;
    public Animal(){}

    public void comer(){
        System.out.println("El "+nombre+" esta comiendo");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    //lac clases abstrctas tienene metodos abtsctas es que puedene dejar metodos
    //para implemnetar es un metodo vacio
    public abstract  void moverse();
    //un metod abstrcato necesita ser  implmentado cuando un clase herede de esta
    //osea una clase abtscta se hereda

}
