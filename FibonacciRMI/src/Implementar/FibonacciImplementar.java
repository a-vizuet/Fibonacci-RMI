
package Implementar;

import Interface.FibonacciInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FibonacciImplementar extends UnicastRemoteObject implements FibonacciInterface{

    public FibonacciImplementar() throws RemoteException {
        
    }
    
    @Override
    public long[] fibonacci(int n) throws RemoteException {
        long[] fibonacci = new long[n+1];
        
        if(n == 0){
            fibonacci[0] = n;
            return fibonacci;
        }else if(n == 1){
            fibonacci[0] = 0; 
            fibonacci[1] = n;
            return fibonacci;
        }else
            fibonacci[0] = 0; 
            fibonacci[1] = 1;
            
            for (int i = 2; i <= n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

        return fibonacci;
    }
    
}
