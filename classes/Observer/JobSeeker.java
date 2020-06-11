package Observer;
/**
 *
 * @author Richardson Laínez - 11711075
 */
public class JobSeeker implements Observer{
    private String name = "";
    
    public JobSeeker(String name){
        this.name = name;
    }
    
    @Override
    public void update(Subject subj) {
        System.out.println("Usuario: " + this.name + " ha recibido una notificación de " + subj);
    }
    
}
