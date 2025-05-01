JAVAC = javac
JAVA = java

EX = Main

SOURCE = app/Main.java layout/*.java logic/*.java

all:
		$(JAVAC) $(SOURCE)	
		$(JAVA) $(EX)	

clean:
		@rm -fr *.class
		@echo 🔥 🔥 Deleting class files 🗑️ 🗑️

ex:
		$(JAVA) $(EX)

re: clean all

.PHONY: all clean fclean re ex