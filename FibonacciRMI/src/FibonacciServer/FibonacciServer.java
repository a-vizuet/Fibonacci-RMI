
package FibonacciServer;

import Implementar.FibonacciImplementar;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FibonacciServer {

    public static void main(String[] args) throws RemoteException {
        Registry reg = LocateRegistry.createRegistry(8080);
        FibonacciImplementar fiboint = new FibonacciImplementar();
        reg.rebind("fibonacci", fiboint);
        
        System.out.println("Servidor inicializado!");
    }
    
}
