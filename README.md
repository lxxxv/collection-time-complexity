# collection-time-complexity

Benchmark                          Mode  Cnt       Score      Error   Units
ListAdd.addArrayList               avgt    5   89474.958 ± 1889.671   ns/op  
ListAdd.addLinkedList              avgt    5   93483.185 ± 3681.777   ns/op  
ListAdd.addVector                  avgt    5   88474.700 ± 1466.605   ns/op  1
ListDel.delArrayList               avgt    5  117014.769 ± 3684.453   ns/op  
ListDel.delLinkedList              avgt    5   92197.743 ± 2078.125   ns/op  1
ListDel.delVector                  avgt    5  116604.719 ± 2960.501   ns/op  
ListGet.getArrayList               avgt    5    2599.798 ±  172.588   ns/op  1
ListGet.getLinkedList              avgt    5  228334.761 ± 7148.929   ns/op  
ListGet.getVector                  avgt    5   32048.057 ±  748.671   ns/op  
ListSort.sortArrayList             avgt    5    3963.908 ±  228.438   ns/op  
ListSort.sortLinkedList            avgt    5    7967.612 ± 1560.629   ns/op  
ListSort.sortVector                avgt    5    3634.448 ±  335.651   ns/op  1
MapAdd.addHashMap         	       avgt    5  137703.560 ± 10105.354  ns/op  
MapAdd.addIdentityHashMap 	       avgt    5  184678.810 ±  9353.248  ns/op  
MapAdd.addLinkedHashMap   	       avgt    5  140105.258 ± 10546.649  ns/op  
MapAdd.addTreeMap         	       avgt    5  193797.765 ±  6651.060  ns/op  
MapAdd.addWeakHashMap     	       avgt    5  132256.607 ± 21179.865  ns/op  1
MapDel.delHashMap         	       avgt    5  154792.532 ±  3328.533  ns/op
MapDel.delIdentityHashMap 	       avgt    5  213729.165 ± 13410.559  ns/op
MapDel.delLinkedHashMap   	       avgt    5  153554.703 ± 25466.117  ns/op
MapDel.delTreeMap         	       avgt    5  253287.567 ± 12280.640  ns/op
MapDel.delWeakHashMap     	       avgt    5  151895.987 ±  9672.607  ns/op  1
MapGet.getHashMap         	       avgt    5   10325.962 ± 1693.874   ns/op
MapGet.getIdentityHashMap 	       avgt    5   14633.439 ± 1135.180   ns/op
MapGet.getLinkedHashMap   	       avgt    5    8541.034 ± 1172.468   ns/op  1
MapGet.getTreeMap         	       avgt    5  113767.639 ± 9503.215   ns/op
MapGet.getWeakHashMap     	       avgt    5   11748.130 ±  613.794   ns/op
QueueAdd.addArrayBlockingQueue     avgt    5  101908.691 ± 9265.226   ns/op
QueueAdd.addConcurrentLinkedQueue  avgt    5  113380.321 ± 6851.603   ns/op
QueueAdd.addLinkedBlockingQueue    avgt    5  110296.138 ± 8812.672   ns/op  1
QueueAdd.addLinkedTransferQueue    avgt    5  120649.222 ± 7731.749   ns/op
QueueAdd.addPriorityBlockingQueue  avgt    5  114509.500 ± 9300.943   ns/op
QueueAdd.addPriorityQueue          avgt    5  110348.074 ± 5915.827   ns/op