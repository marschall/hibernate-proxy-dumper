

https://youtrack.jetbrains.com/issue/IDEA-175638/Please-release-fernflower-decompiler-as-a-standalone-jar

```
mvn dependency:get \
  -DrepoUrl=https://www.jetbrains.com/intellij-repository/releases/ \
  -Dartifact=com.jetbrains.intellij.java:java-decompiler-engine:LATEST \
  -Ddest=.
```