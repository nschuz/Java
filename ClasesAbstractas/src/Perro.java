public class Perro extends  Animal
{

    @Override
    public void moverse() {
        System.out.println("El perro esta moviendose");
    }
    //Cotructor
    public  Perro(){
        super();
        setNombre("Perro");
    }

}
