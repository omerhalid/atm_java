import javax.xml.stream.Location;
import java.util.spi.LocaleNameProvider;

public class Atm {
    String location;
    boolean cash_available;
    int atmId;

    Atm(String location, boolean cash_available, int atmId){
        this.location = location;
        this.cash_available = cash_available;
        this.atmId = atmId;
    }

    public String getLocation(){
        return this.location;
    }

    public boolean isCashAvailable(){
        return this.cash_available;
    }
}

