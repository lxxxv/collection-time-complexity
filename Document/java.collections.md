
```
Collections
├─ Deque
│  ├─ ArrayDeque
├─ Dictionary
│  ├─ Hashtable : {"키와 값이 1:1", "null (X)", "elements (O)", "iterator (O)"}
├─ Iterator
│  ├─ ListIterator
├─ List
│  ├─ AbstractList
│  │  ├─ AbstractSequentialList
│  │  │  ├─ LinkedList : {}
│  │  ├─ ArrayList : {}
│  │  ├─ Vector : {}
│  ├─ CopyOnWriteArrayList : {"List를 읽기 위해 어딘가에 전달할 때 복사본을 만들어서 전달", "데이터 수정이나 삭제 등의 다른 용도로 쓰일 경우에는 속도가 느려지기 때문에 수정할 일은 거의 없으며 주로 순회가 일어나는 용도로 사용하는 것이 적합하다."}
├─ Map
│  ├─ AbstractMap
│  │  ├─ EnumMap : {}
│  │  ├─ HashMap : {"키와 값이 1:1", "null (O)", "elements (X)", "iterator (O)", "HashMap은 보조해시를 사용하기 때문에 HashTable에 비해서 해시 충돌(Hash Collision)이 덜 발생"}
│  │  │  ├─ LinkedHashMap : {}
│  │  ├─ IdentityHashMap : {}
│  │  ├─ WeakHashMap : {}
│  ├─ ConcurrentMap
│  │  ├─ ConcurrentHashMap : {" + HashMap"}
│  ├─ SortedMap
│  │  ├─ NavigableMap
│  │  │  ├─ ConcurrentNavigableMap
│  │  │  │  ├─ ConcurrentSkipListMap : {}
│  │  │  ├─ TreeMap : {}
├─ Queue
│  ├─ AbstractQueue
│  │  ├─ ConcurrentLinkedQueue
│  │  ├─ PriorityQueue
│  ├─ BlockingQueue
│  │  ├─ ArrayBlockingQueue
│  │  ├─ DelayQueue
│  │  ├─ LinkedBlockingQueue
│  │  ├─ SynchronousQueue
│  │  ├─ TransferQueue
│  │  │  ├─ LinkedTransferQueue
│  │  ├─ PriorityBlockingQueue
├─ Set
│  ├─ AbstractSet
│  │  ├─ CopyOnWriteArraySet
│  │  ├─ EnumSet
│  │  │  ├─ JumboEnumSet
│  │  │  ├─ RegularEnumSet
│  │  ├─ HashSet
│  │  │  ├─ LinkedHashSet
│  ├─ SortedSet
│  │  ├─ NavigableSet
│  │  │  ├─ ConcurrentSkipListSet
│  │  │  ├─ TreeSet



Table
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

