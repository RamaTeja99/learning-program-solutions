package Code;
public class Main {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .graphicsCard("NVIDIA RTX 4080")
                .storage("2TB SSD")
                .operatingSystem("Windows 11")
                .build();
        Computer workstation = new Computer.Builder("AMD Ryzen 9", "64GB")
                .storage("4TB NVMe")
                .graphicsCard("Quadro RTX 6000")
                .operatingSystem("Linux Ubuntu")
                .build();

        System.out.println(basicComputer);
        System.out.println(gamingComputer);
        System.out.println(workstation);
    }
}
