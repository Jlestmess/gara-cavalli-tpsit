/**Questa classe è il nostro primo thread e consentirà la simulazione
 * di un cavallo in corsa parallelamente con altri della stessa specie
 * @author studente
 * @version 1.0
 **/

public class Cavallo extends Thread{

    private final String name;
    private int lentezza;

    public Cavallo(String name){
        super();
        this.name = name;
    }

    /*override del metodo run */
    @Override
    public void run(){
        System.out.println("Cavallo " + name + " comincia il suo galoppo");
        System.out.println("Cavallo " + name + " priorità " + getPriority());
        for(int i = 1; i<=10; i++){

            try {
                sleep(lentezza);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(name + " cavalca - passo: " + i);
        }


    }
    //setter per il parametro di lentezza
    protected void setLentezza(int lentezza){
        this.lentezza = lentezza;
    }

    //getter per il parametro di lentezza
    protected int getLentezza(){
        return lentezza;
    }
}