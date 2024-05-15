### common methods between map and collection interface is isEmpty() and size() methods

    [SortedMap Interface]----extends------>[MAP Interface] ---impl--> HashMap - non synchronised, allows atmost one null key and multiple null values
           |  enteries in sorted                           ---impl--> HashTable - synchronised, niether allows null key or value
           |  ascending key order     
       [TreeMap]
           |implicitly implement the red black tree,
           |no null keys[Map Interface.md](Map%20Interface.md)