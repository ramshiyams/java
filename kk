package MODULE1;

import java.util.Scanner;

public class CPU {
    double price;
    
    public class Processor {
        double cores;
        String manufacturer;
        
        double getCache(double f) {
            return f;
        }
    }
    
    static class RAM {
        double memory;
        String manufacturer;
        
        double getClockspeed(double r) {
            return r;
        }
    }
    
    // Constructor for CPU class
    public CPU() {
    }

    public static void main(String[] args) {
        double p, m;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the cache of the processor: ");
        p = s.nextDouble();
        
        System.out.print("Enter the clock speed: ");
        m = s.nextDouble();
        
        CPU cpu = new CPU();
        
        // Creating instances of Processor and RAM
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = new CPU.RAM();
        
        System.out.println("Processor cache = " + processor.getCache(p));
        System.out.println("RAM clock speed = " + ram.getClockspeed(m));
        
        s.close(); // Close the scanner to avoid resource leak
    }
}
