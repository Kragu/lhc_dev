package security;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import infrastructure.ExperimentScope;
import infrastructure.Workplace;
import security.events.RunExperimentFull;
import security.events.RunExperimentPartial;
import security.events.Subscriber;

import javax.naming.ldap.Control;
import java.util.ArrayList;

public enum ControlCenter {
    instance;
    private final String roomID;
    private EventBus eventBus;
    private ArrayList<Workplace> workplaceArrayList;

    ControlCenter(){
        roomID="C01";
        eventBus=new EventBus();
    }/*
    public void startExperiment(){

    }
    public void startExperiment(ExperimentScope scope){

    }*/
    public void addSubscriber(Subscriber subscriber){
        eventBus.register(subscriber);
    }
    public void runExperimentFull(int i){
        eventBus.post(new RunExperimentPartial(i));
    }
    public void runExperimentPartial(int i){
        eventBus.post(new RunExperimentPartial(i));
    }

}