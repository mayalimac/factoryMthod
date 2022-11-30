public interface Computador {
    String getDescription();
    
}

public class Computers {

    public static void main(String[] args) {
        PC pc = new PC("PC","8", "1GB", "3.2");
        System.out.println(pc);

        Server server = new Server("Server","8", "1GB", "3.2");
        System.out.println(server);

    }
}
public class Factory {

    public static Computer createComputer(String type) {
        if (type == "PC") {
            return new PC();
        } else if (type == "Server") {
            return new Server();
        }
        return null;
    }
}

public class PC implements Computer {

    private String type;
    private String RAM;
    private String HDD;
    private String CPU;

    public PC () {}

    public PC (String type, String RAM, String HDD, String CPU) {
        this.type = type;
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    public String getType() {
        return type;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public String getDescription() {
        return type;
    }

    public String toString() {
        return "[Type: " + type + " | " + " RAM: " + RAM + " GB" + " | " + " HD: " + HDD + " GB" + " | " + " CPU: " + CPU + " GHz" + "]";
    }
}


public class Server implements Computer {


    private String type;
    private String RAM;
    private String HDD;
    private String CPU;

    public Server () {}

    public Server (String type, String RAM, String HDD, String CPU) {
        this.type = type;
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

  