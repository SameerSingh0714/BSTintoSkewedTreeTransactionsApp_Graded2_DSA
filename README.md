# BSTintoSkewedTreeTransactions_Graded2_DSA

Question ->
You are working in an MNC, which manages the Transactions, where only BST is used as a
Data Structure. The company stores all the data of transactions in BST such that the tree is
always a complete BST.
A new business requirement has arrived where the BST should not contain any left node.
You are required to modify the existing BST and display the node values present in ascending
order.

                                        10
					        40                      \
					     /      \                   30
					   30        60  -->>             \
					 /             \                  50
					10             55    */             \
                                              55
                                                \
                                                 60

Hint: ( Convert the Binary Search Tree into a Skewed Tree)

Output:
10 30 50 55 60

Instructions:
You can hardcode the tree as follows
Main tree = new Main();
tree.node = new Node(50);
tree.node.left = new Node(30);
tree.node.right = new Node(60);
tree.node.left.left = new Node(10);
tree.node.right.left= new Node(55)
                                                
