test: MakrdownParse.java MarkdownParseTest.java
	javac MarkdownParse.java
	javac -cp .:libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar MarkdownParseTest.java
	java -cp .:libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParseTest.class
	javac -cp .:libs/junit-4.13.2.jar:libs/hamcrest-core-1.3.jar MarkdownParseTest.java

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java