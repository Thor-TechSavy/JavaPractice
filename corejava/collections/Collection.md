[Map Interface]              [Collection Interface] ---extends---> [Iterable Interface]
    ||                        |     |             |
 collection of                |     |             |
 k-v pairs                    |     |  [List Interface] => ordered DS, allows Positional/index based search, iterator
 Set<Key>, Collection<Values> |     |                   => ArrayList, LinkedList, Vector, CopyOnWriteArrayList
 values - duplicates          |     |
 keys -don't have duplicates  [Set interface] => doesn't main order, no duplicates, at most 1 null element, no positional search
                                    |
                                    |
                                    |
                                 [queue inte rface] => FIFO approach, elements gets added from front, and removed from rear

