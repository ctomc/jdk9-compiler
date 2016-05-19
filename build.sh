$JAVA_HOME/bin/javac -d out -classpath processor/target/processor-1.0-SNAPSHOT.jar; -source 8 -target 8 code/src/main/java/ClassWithAnnotation.java
$JAVA_HOME/bin/javac -d out -classpath processor/target/processor-1.0-SNAPSHOT.jar; -release 8 code/src/main/java/ClassWithAnnotation.java
$JAVA_HOME/bin/javac -d out -classpath processor/target/processor-1.0-SNAPSHOT.jar; -addmods java.annotations.common code/src/main/java/ClassWithAnnotation.java
$JAVA_HOME/bin/javac -d out -classpath processor/target/processor-1.0-SNAPSHOT.jar; -addmods java.annotations.common -J-addmods -Jjava.annotations.common code/src/main/java/ClassWithAnnotation.java
