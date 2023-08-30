/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * Thread er code er moddhe ekta critical section thake jekhane resource sharing er barparta hnadle kora hoi...
 * Mutex: etar jonne critical section e 4ta method call kora lage...
 * mutex er 4ta method holo: lock(),read(),write(),unlock().......here the two threads are responsible for achieving mutual exclusion....
 * semaphore er jnne: wait(),read(),write(),signal()....locking unlocking OS er maddhome kora hoi...here OS is responsible for mutual exclusion...
 * 
 * Monitor: etar khetre shared data object hisebe thake...tr moddhe e amar read write sb function thake...ami thread er moddhe sudhu methodgulo call kori r ki..
 * object nije mutual exclusion handle kore ...ekhane kono OS involvement nai....eta onkta ekta closed shop er moton r ki...
 * 
 */

public class JavaMonitor {
    
}
