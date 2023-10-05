```
[info] welcome to sbt 1.9.6 (Eclipse Adoptium Java 17.0.3)
[info] loading global plugins from /Users/tim/.sbt/1.0/plugins
[info] loading project definition from /Users/tim/code/personal/scala3_jooq_bug_overriding/project
[info] loading settings for project scala3_jooq_bug_overriding from build.sbt ...
[info] set current project to scala3_jooq_bug_overriding (in build file:/Users/tim/code/personal/scala3_jooq_bug_overriding/)
[info] sbt server started at local:///Users/tim/.sbt/1.0/server/59d823637ec2d9b011d3/sock
[info] started sbt server
sbt:scala3_jooq_bug_overriding> + compile
[info] Setting Scala version to 2.12.18 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala3_jooq_bug_overriding (in build file:/Users/tim/code/personal/scala3_jooq_bug_overriding/)
[info] compiling 1 Scala source to /Users/tim/code/personal/scala3_jooq_bug_overriding/target/scala-2.12/classes ...
[success] Total time: 1 s, completed Oct 5, 2023, 2:11:57 PM
[info] Setting Scala version to 2.13.10 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala3_jooq_bug_overriding (in build file:/Users/tim/code/personal/scala3_jooq_bug_overriding/)
[success] Total time: 0 s, completed Oct 5, 2023, 2:11:57 PM
[info] Setting Scala version to 3.3.1 on 1 projects.
[info] Reapplying settings...
[info] set current project to scala3_jooq_bug_overriding (in build file:/Users/tim/code/personal/scala3_jooq_bug_overriding/)
[info] compiling 1 Scala source and 1 Java source to /Users/tim/code/personal/scala3_jooq_bug_overriding/target/scala-3.3.1/classes ...
[error] -- [E164] Declaration Error: /Users/tim/code/personal/scala3_jooq_bug_overriding/src/main/scala/com/example/ExampleRecordScala.scala:7:6
[error] 7 |class ExampleRecordScala extends TableRecordImpl[ExampleRecordScala] with Record {
[error]   |      ^
[error]   |error overriding method with in trait TableRecord of type [T](x$0: org.jooq.Field[T], x$1: T): com.example.ExampleRecordScala;
[error]   |  method with in class AbstractRecord of type [T](x$0: org.jooq.Field[T], x$1: T): org.jooq.Record has incompatible type
[error]   |
[error]   | longer explanation available when compiling with `-explain`
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 1 s, completed Oct 5, 2023, 2:11:58 PM
```