compile ds:
    javac datastructures/{{ds}}/*.java

ll:
    just compile linkedlist
    java datastructures.linkedlist.Main

stack:
    just compile stack
    java datastructures.stack.Main

queue:
    just compile queue
    java datastructures.queue.Main
    
tree:
    just compile binarysearchtree 
    java datastructures.binarysearchtree.Main

graph:
    just compile graph
    java datastructures.graph.Main

hash:
    just compile hashtable
    java datastructures.hashtable.Main
