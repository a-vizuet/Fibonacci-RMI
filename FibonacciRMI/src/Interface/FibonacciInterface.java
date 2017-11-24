
package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FibonacciInterface extends Remote {
    public long[] fibonacci(int n) throws RemoteException;
}
