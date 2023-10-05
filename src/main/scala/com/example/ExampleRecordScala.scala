package com.example

import org.jooq.Record
import org.jooq.impl.TableRecordImpl

// Works in Scala 2.12 and Scala 2.13 but is broken in Scala 3
class ExampleRecordScala extends TableRecordImpl[ExampleRecordScala] with Record {

}