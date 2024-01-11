package solidPrinciples.dependencyInversionPrinciple;

public class Car {

    private Engine engine;

    public Car(Engine e){
        this.engine = e;
    }

    public void start(){
        engine.start();
    }

}


