#Makefile for Assignment2
#Lindani Khuzwayo
#014 April 2021


JAVAC=/usr/bin/javac
.SUFFIXES: .java .class

SRCDIR=src
BINDIR=bin


$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
        
CLASSES= BinaryTreeNode.class BTQueueNode.class BTQueue.class BinaryTree.class AVLTree.class AVLTreeTest.class Students.class AccessAVLApp.class 
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)
 

default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class

runavl: $(CLASS_FILES)
	java -cp $(BINDIR) AccessAVLApp



