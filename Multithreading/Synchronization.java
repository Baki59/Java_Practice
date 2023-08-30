/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *1. Resource sharing
 *2. Critical Section
 *3. Mutual Exclusion
 *4. Locking/Mutex------> 1,0
 *5. Semaphore----------> wait(),signal()
 *6. Monitor------------>In Java used for synchronization---> read(),write()
 *7. Race Condition
 *8. Inter-Thread Communication
 * 1,2,3 er karone mainly synchronization er drkr hoi...4-8 holo solution...
 * 4,5,6 third party keu dara solve kora hoi...r 7,8 threadra nijera nijder moddhe
 * somojhota kore smssar smadhan kore felai...
 * Mutex: mutex 0/1 kore resource manage kore..prothome ekta thread dekhe jodi dekhe 0 tr mane keu use korteche na..
 * then se preparation nei use er...erpre use kora shuru korle mutex k 1 kore dei...
 * jodi ei preparation er moddhe onno keu ese dekhe j 0 e ache ekhono taile se bujhbe j resource free so ami use kori...
 * ekta vul bujhabujhi toiri hbe...eki bathroom duijon use korr example....
 * 
 * ei smssa dur korte amra kajta OS k diye debo..tr mane third person keu daraia thakbe ebong guide korbe j use kora jabe naki na...
 * r seta e holo semaphore...wait(), signal() e dui method ebong separate ekta block queue jeta semaphore maintain kore tar maddhome OS e kajta kore....
 *
 */
public class Synchronization {
    
}
