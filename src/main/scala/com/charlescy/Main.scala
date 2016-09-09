package com.charlescy

import java.io.{FileNotFoundException, IOException}
import java.util
import java.util.Properties
import scala.collection.JavaConversions

import org.apache.kafka.clients.consumer.{ConsumerRecord, ConsumerRecords, KafkaConsumer}

object Main extends App {
  val consumerProps = loadProperties("consumer.properties")
  println(consumerProps)
  val consumer = new KafkaConsumer[String, String](consumerProps)
  consumer.subscribe(util.Arrays.asList("test3"))

  while (true) {
    val records = consumer.poll(100)
    val it = JavaConversions.asScalaIterator[ConsumerRecord[String, String]](records.iterator())
    for (r <- it)
      println(r)

    consumer.commitSync
  }


  @throws(classOf[IOException])
  def loadProperties(path: String): Properties = {
    val prop = new Properties
    val stream = getClass.getClassLoader.getResourceAsStream(path)
    if (stream != null) {
      prop load stream
      prop
    } else {
      throw new FileNotFoundException(s"property file $path was not found in class path")
    }
  }
}
