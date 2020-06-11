package Observer;

import java.util.ArrayList;

/**
 *
 * @author Richardson Laínez - 11711075
 */
public class HeadHunter implements Subject{
    public ArrayList<String> jobs;
    private ArrayList<Observer> userList;
    
    public HeadHunter(){
        jobs = new ArrayList<>();
        userList = new ArrayList();
    }

    @Override
    public void registerObserver(Observer obs) {
        userList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        userList.remove(obs);
    }

    @Override
    public void notifyAllObserver() {
        for(Observer obs: userList){
            obs.update(this);
        }
    }
    
    public void addJob(String job){
        jobs.add(job);
    }
    
    public ArrayList<String> getJobs(){
        return jobs;
    }

    @Override
    public String toString() {
        return jobs+""; 
    }
}
