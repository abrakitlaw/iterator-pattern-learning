# Iterator & Composite Pattern
## Iterator Pattern
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

An aggregate object such as a list should give us a way to access its elements without exposing its internal structure. Moreover, we might want to traverse the list in different ways, depending on what you need to accomplish. But we probably don't want to bloat the list interface with operations for different traversals, even if you could anticipate the ones you'll require. 

The Iterator pattern lets you do all this. The key idea is to take the responsibility for access and traversal out of the aggregate object and put it into an iterator object that defines a standard traversal protocol.

## Composite Pattern
Allows us to compose objects into tree structures and then work with these structures as if they were individual objects.

Using the Composite Pattern makes sense only when the core model of your app can be represented as tree. The greatest benefit of this approach is that you don't need to care about concrete classes of objects that compose a tree
