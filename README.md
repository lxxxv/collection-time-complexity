# collection-time-complexity

JAVA
```
+------------+------------------------+-----------+------------------------------------+-----------+--------------+-------------+
|   group    |          name          |   type    |             inherited              | Cloneable | Serializable | thread safe |
+------------+------------------------+-----------+------------------------------------+-----------+--------------+-------------+
| List       | LinkedList             | class     | AbstractSequentialList,List,Deque  | O         | O            | X           |
| List       | ArrayList              | class     | AbstractList,List,RandomAccess     | O         | O            | X           |
| List       | Vector                 | class     | AbstractList,List,RandomAccess     | O         | O            | O           |
| List       | CopyOnWriteArrayList   | class     | List,RandomAccess                  | O         | O            | O           |
| Map        | Hashtable              | class     | Dictionary,Map                     | O         | O            | O           |
| Map        | EnumMap                | class     | AbstractMap                        | O         | O            | X           |
| Map        | HashMap                | class     | AbstractMap,Map                    | O         | O            | X           |
| Map        | LinkedHashMap          | class     | HashMap,Map                        | X         | X            | X           |
| Map        | IdentityHashMap        | class     | AbstractMap,Map                    | O         | O            | X           |
| Map        | WeakHashMap            | class     | AbstractMap,Map                    | X         | X            | X           |
| Map        | ConcurrentHashMap      | class     | AbstractMap,ConcurrentMap          | X         | O            | O           |
| Map        | ConcurrentSkipListMap  | class     | AbstractMap,ConcurrentNavigableMap | O         | O            | X           |
| Map        | TreeMap                | class     | AbstractMap,NavigableMap           | O         | O            | X           |
| Queue      | ConcurrentLinkedQueue  | class     | AbstractQueue,Queue                | X         | O            | X           |
| Queue      | PriorityQueue          | class     | AbstractQueue                      | X         | O            | X           |
| Queue      | ArrayBlockingQueue     | class     | AbstractQueue,BlockingQueue        | X         | O            | X           |
| Queue      | DelayQueue             | class     | AbstractQueue,BlockingQueue        | X         | X            | X           |
| Queue      | LinkedBlockingQueue    | class     | AbstractQueue,BlockingQueue        | X         | O            | X           |
| Queue      | SynchronousQueue       | class     | AbstractQueue,BlockingQueue        | X         | O            | X           |
| Queue      | LinkedTransferQueue    | class     | AbstractQueue,TransferQueue        | X         | O            | X           |
| Queue      | PriorityBlockingQueue  | class     | AbstractQueue,BlockingQueue        | X         | O            | X           |
| Queue      | ArrayDeque             | class     | AbstractCollection,Deque           | O         | O            | X           |
| Set        | CopyOnWriteArraySet    | class     | AbstractSet                        | X         | O            | X           |
| Set        | JumboEnumSet           | class     | EnumSet                            | X         | X            | X           |
| Set        | RegularEnumSet         | class     | EnumSet                            | X         | X            | X           |
| Set        | HashSet                | class     | AbstractSet,Set                    | O         | O            | X           |
| Set        | LinkedHashSet          | class     | HashSet,Set                        | O         | O            | X           |
| Set        | ConcurrentSkipListSet  | class     | AbstractSet,NavigableSet           | O         | O            | X           |
| Set        | TreeSet                | class     | AbstractSet,NavigableSet           | O         | O            | X           |
| List       | List                   | interface |                                    |           |              |             |
| List       | AbstractList           | interface | AbstractCollection,List            |           |              |             |
| List       | AbstractSequentialList | abstract  | AbstractList                       |           |              |             |
| Map        | Map                    | interface |                                    |           |              |             |
| Map        | ConcurrentMap          | interface | Map                                |           |              |             |
| Map        | SortedMap              | interface | Map                                |           |              |             |
| Map        | NavigableMap           | interface | SortedMap                          |           |              |             |
| Map        | ConcurrentNavigableMap | interface | ConcurrentMap,NavigableMap         |           |              |             |
| Map        | AbstractMap            | abstract  | Map                                |           |              |             |
| Queue      | Queue                  | interface | Collection                         |           |              |             |
| Queue      | BlockingQueue          | interface | Queue                              |           |              |             |
| Queue      | TransferQueue          | interface | BlockingQueue                      |           |              |             |
| Queue      | Deque                  | interface | Queue                              |           |              |             |
| Queue      | AbstractQueue          | abstract  | AbstractCollection,Queue           |           |              |             |
| Set        | Set                    | interface | Collection                         |           |              |             |
| Set        | SortedSet              | interface | Set                                |           |              |             |
| Set        | NavigableSet           | interface | SortedSet                          |           |              |             |
| Set        | AbstractSet            | abstract  | AbstractCollection,Set             |           |              |             |
| Set        | EnumSet                | abstract  | AbstractSet                        | O         | O            |             |
| Dictionary | Dictionary             | interface |                                    |           |              |             |
| Iterator   | Iterator               | interface |                                    |           |              |             |
| Iterator   | ListIterator           | interface | Iterator                           |           |              |             |
+------------+------------------------+-----------+------------------------------------+-----------+--------------+-------------+
```



Benchmark                          Mode  Cnt       Score      Error   Units
ListAdd.addArrayList               avgt    5   89474.958 ± 1889.671   ns/op   <br/>
ListAdd.addLinkedList              avgt    5   93483.185 ± 3681.777   ns/op   <br/>
ListAdd.addVector                  avgt    5   88474.700 ± 1466.605   ns/op  1 <br/>
ListDel.delArrayList               avgt    5  117014.769 ± 3684.453   ns/op   <br/>
ListDel.delLinkedList              avgt    5   92197.743 ± 2078.125   ns/op  1 <br/>
ListDel.delVector                  avgt    5  116604.719 ± 2960.501   ns/op   <br/>
ListGet.getArrayList               avgt    5    2599.798 ±  172.588   ns/op  1 <br/>
ListGet.getLinkedList              avgt    5  228334.761 ± 7148.929   ns/op   <br/>
ListGet.getVector                  avgt    5   32048.057 ±  748.671   ns/op   <br/>
ListSort.sortArrayList             avgt    5    3963.908 ±  228.438   ns/op   <br/>
ListSort.sortLinkedList            avgt    5    7967.612 ± 1560.629   ns/op   <br/>
ListSort.sortVector                avgt    5    3634.448 ±  335.651   ns/op  1 <br/>
MapAdd.addHashMap         	       avgt    5  137703.560 ± 10105.354  ns/op   <br/>
MapAdd.addIdentityHashMap 	       avgt    5  184678.810 ±  9353.248  ns/op   <br/>
MapAdd.addLinkedHashMap   	       avgt    5  140105.258 ± 10546.649  ns/op   <br/>
MapAdd.addTreeMap         	       avgt    5  193797.765 ±  6651.060  ns/op   <br/>
MapAdd.addWeakHashMap     	       avgt    5  132256.607 ± 21179.865  ns/op  1 <br/>
MapDel.delHashMap         	       avgt    5  154792.532 ±  3328.533  ns/op <br/>
MapDel.delIdentityHashMap 	       avgt    5  213729.165 ± 13410.559  ns/op <br/>
MapDel.delLinkedHashMap   	       avgt    5  153554.703 ± 25466.117  ns/op <br/>
MapDel.delTreeMap         	       avgt    5  253287.567 ± 12280.640  ns/op <br/>
MapDel.delWeakHashMap     	       avgt    5  151895.987 ±  9672.607  ns/op  1 <br/>
MapGet.getHashMap         	       avgt    5   10325.962 ± 1693.874   ns/op <br/>
MapGet.getIdentityHashMap 	       avgt    5   14633.439 ± 1135.180   ns/op <br/>
MapGet.getLinkedHashMap   	       avgt    5    8541.034 ± 1172.468   ns/op  1 <br/>
MapGet.getTreeMap         	       avgt    5  113767.639 ± 9503.215   ns/op <br/>
MapGet.getWeakHashMap     	       avgt    5   11748.130 ±  613.794   ns/op <br/>
QueueAdd.addArrayBlockingQueue     avgt    5  101908.691 ± 9265.226   ns/op <br/>
QueueAdd.addConcurrentLinkedQueue  avgt    5  113380.321 ± 6851.603   ns/op <br/>
QueueAdd.addLinkedBlockingQueue    avgt    5  110296.138 ± 8812.672   ns/op  1 <br/>
QueueAdd.addLinkedTransferQueue    avgt    5  120649.222 ± 7731.749   ns/op <br/>
QueueAdd.addPriorityBlockingQueue  avgt    5  114509.500 ± 9300.943   ns/op <br/>
QueueAdd.addPriorityQueue          avgt    5  110348.074 ± 5915.827   ns/op <br/> 
 <br/>
quick benchmark <br/>
 <br/>
ListAdd ArrayList score      : 154670 <br/>
ListAdd LinkedList score     : 41372 <br/>
ListAdd Vector score         : 243787 <br/>
ListDel ArrayList score      : 2720500 <br/>
ListDel LinkedList score     : 18656 <br/>
ListDel Vector score         : 2622030 <br/>
ListGet ArrayList score      : 9391 <br/>
ListGet LinkedList score     : 121229914 <br/>
ListGet Vector score         : 7161 <br/>
ListSort ArrayList score     : 144208 <br/>
ListSort LinkedList score    : 139568 <br/>
ListSort Vector score        : 115030 <br/>
MapAdd HashMap score         : 73149 <br/>
MapAdd TreeMap score         : 232605 <br/>
MapAdd LinkedHashMap score   : 69813 <br/>
MapAdd IdentityHashMap score : 323306 <br/>
MapAdd WeakHashMap score     : 75707 <br/>
MapDel HashMap score         : 67729 <br/>
MapDel TreeMap score         : 122498 <br/>
MapDel LinkedHashMap score   : 44828 <br/>
MapDel IdentityHashMap score : 43816 <br/>
MapDel WeakHashMap score     : 63005 <br/>
MapGet HashMap score         : 44597 <br/>
MapGet TreeMap score         : 96463 <br/>
MapGet LinkedHashMap score   : 26520 <br/>
MapGet IdentityHashMap score : 32189 <br/>
MapGet WeakHashMap score     : 44869 <br/>
