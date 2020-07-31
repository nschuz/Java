package ejemplo;

public class MAIN {
    public static void main(String[] args) {
        Planta planta = new Planta();
        //SerVivo ser = new  SerVivo(); no lo puedo instaciar porqu es abstracta
        planta.alimntarse();
        AnimalCarnivoro animalcarnivor = new AnimalCarnivoro();
        animalcarnivor.alimntarse();
    }
}
