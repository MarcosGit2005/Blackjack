package es.ieslavereda;

public class Main {
    public static void main(String[] args) {
        System.out.println(Palo.HEART);

        for (Palo palo:Palo.values()){
            System.out.print(palo);
        }

        System.out.println();

        Carta asCorazones = new Carta(Palo.HEART,Numero.AS);

        System.out.println(asCorazones);
    }
}