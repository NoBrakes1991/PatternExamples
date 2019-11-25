
import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float preassure;

    public WeatherData(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float preassure){
        this.humidity=humidity;
        this.preassure=preassure;
        this.temperature=temperature;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPreassure() {
        return preassure;
    }
}
