[=========================================List Interface===============================================]
  |                           |                           |                                  |
  |                           |                           |                                  |
[ArrayList]              [Linked List]                [Vectors]                     [copyOnWriteArrayList]
ordered, non             also implement Deque      thread safe version of            inherently thread safe,
synchronised,            maintains insertion       arraylist. Synchronised.          allows concurrent access,
dynamic resizing         order, no positional      order maintained,                 upon modification, copy the
(50% of original         access because the        Dynamic resizing (double)         underlying array. Not
storage),                storage underneath        the original storage              recommended for write heavy,
positional               is not done in                   ^                          good for read heavy operations
access (Index            contagious memory                |extends
based search)            location. Instead,            [Stack]
                         nodes contains the           based on LIFO
                         value and reference          elements are inserted
                         to the next node,            from rear and removed
                         Not Synchronised,            from rear
                         always traverse
                         even for get(index)
                         methods which are
                         normally slow
