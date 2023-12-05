package EX07;

public class Gato extends Animal {
    public String mia(){
        return "Eu sou " +getNome()+
                " da raca " +getRaca()+
                " e estou miando";
    }
}
