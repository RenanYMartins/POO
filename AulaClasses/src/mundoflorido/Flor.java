package mundoflorido;

public class Flor {
//    Petala p1;;
//    Petala p2;
//    Petala p3;

    private Petala[] petalas = new Petala[3];

    private int index = 0;

    public void adicionarPetala(Petala p) {
        petalas[index] = p;
        index++;
    }

    public Flor() {
    }

    public Flor(Petala p1, Petala p2, Petala p3) {
//        this.p1 = p1; 
//        this.p2 = p2; 
//        this.p3 = p3;
        adicionarPetala(p1);
        adicionarPetala(p2);
        adicionarPetala(p3);
    }
//    
//    public void setP1(Petala p){
//        this.p1 = p;
//    }
//    
//    public Petala getP1(){
//        return p1;
//    }
//    
//    public void setP2(Petala p){
//        this.p2 = p;
//    }
//    
//    public Petala getP2(){
//        return p2;
//    }
//    
//    public void setP3(Petala p){
//        this.p3 = p;
//    }
//    
//    public Petala getP3(){
//        return p3;
//    }

    public void mostrarPetala() {
        for (int i = 0; i < index; i++) {
            System.out.println(petalas[i].getCor());
        }
//        System.out.println(p1.getCor());
//        System.out.println(p2.getCor());
//        System.out.println(p3.getCor());
    }
}
