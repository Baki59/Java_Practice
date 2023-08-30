/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionframework;

/**
 *Built in Data Structure in Java mainly...Which is known as 
 * Collection in java...
 * So for collecting a list of data a very common or basic data structure is Array....
 * But Array has some major drawbacks...
 * For them is that array size is not changeable frequently...for changing an array size 
 * we need to declare another array bla bla....it's tiresome work....so to solve this problem java has provided some built in solution
 * who can change their size by thyself...
 * 1. ArrayList
 * 2. LinkedList
 * Which requirement i need, depend on, that array give us some built in data structure...
 * 1. Variable size collection--> ArrayList, LinkedList
 * 2. Distinct Collection---> Set
 * 3. Sorted Collection-----> SortedSet
 * 4. Insert-----> 
 * 5. Delete----->
 * 6. Search-----> Linear Search,Binary Search--They will be built-in.....
 * Hashing(Key,Value)--allow us to arrange the data with key and value pair....
 * 
 */
public class CollectionFramework {

    /**
     * Collection:
     * In screenshot from the Abdul Bari's Lecture the Oval shaped nodes are interface and the rectangular shaped nodes are class..
     * Arrow defines that from which interface the class is implemented?
     * ---Collection means a group of element similar or different...homogeneous or heterogeneous also.....
     */
    /*
    List: Ordered list of elements...
    --elements are grouped by indexing...
    --can be accessed by index...
    --can have duplicate elements
    
    Classes that implemented the List interface...
    -- ArrayList
    --LinkedList
    --Vector
    --Stack
    */
    /*
    Set:
    --not allowed duplicate (Distinct Elements)
    --not ordered (Unordered)
    
    Interface that implements Set interface: SortedSet<---TreeSet(class that implements SortedSet interface.)
    
    Classes that implements Set:
    --HashSet(Hashcode)
    --LinkedHashSet
    */
    /*
    Queue:
    FIFO mechanism
    
    Interface that implements Queue interface: 
    -Dequeue <--- ArrayDeque(Class that implements Dequeue interface.)
    
    Classes that implements Queue interface: 
    -PriorityQueue
    */
    
    /*
    Map: this is not collection type data type...It stores data by (key,value) pair...
    Interface that implements Map: sortedMap <---- TreeMap(class that implements Map interface.)
    Classes that implements Map:
    -HashMap
    -LinkedHashMap
    -HashTable
    */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
