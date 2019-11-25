import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float preassure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i< observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, preassure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float preassure){
        this.humidity=humidity;
        this.preassure=preassure;
        this.temperature=temperature;
        measurementsChanged();
    }
}
