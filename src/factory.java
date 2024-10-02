interface Transport {
    void deliver();
}
class Truck implements Transport {
    public void deliver() {
        System.out.println("Delivering by land in a truck.");
    }
}
class Ship implements Transport {
    public void deliver() {
        System.out.println("Delivering by sea in a ship.");
    }
}
class Drone implements Transport {
    public void deliver() {
        System.out.println("Delivering by air in a drone.");
    }
}

abstract class TransportFactory {
    abstract Transport createTransport();
}

class LandTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Ship();
    }
}

class AirTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Drone();
    }
}

public class factory {
    public static void main(String[] args) {
        TransportFactory factory = new LandTransportFactory();
        Transport transport = factory.createTransport();
        transport.deliver();

        factory = new SeaTransportFactory();
        transport = factory.createTransport();
        transport.deliver();

        factory = new AirTransportFactory();
        transport = factory.createTransport();
        transport.deliver();
    }
}
