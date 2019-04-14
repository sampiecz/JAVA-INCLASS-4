JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class: ; $(JC) $(JFLAGS) $*.java

CLASSES = \
Finder.java\
Monitor.java\
Main.java

default: classes

classes: $(CLASSES:.java=.class)

clean: ; $(RM) *.class
