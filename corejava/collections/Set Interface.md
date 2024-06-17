        [SortedSet Interface] ---- extends ----> [===========Set Interface============]
         | used comparable for                      |                         |
         | natural ordering by                      |                         |
         | default or comparator                    |                         |
     [Tree Set]                              [Hash Set]                [Linked HashSet]
impl of sortedSet,                     implicitly implement         ordered version of hashSet,
It uses self-balancing               HashTable, only unique       underneath doubly linkedList
binary tree to store element         element, no order,
(red-black tree). This DS            at most 1 null element.
ensures it always store elements    Inherently not thread safe
in sorted order providing
efficient performances for
operations like, add, remove,
search