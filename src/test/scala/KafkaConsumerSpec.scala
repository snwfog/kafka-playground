import com.charlescy._
import org.apache.kafka.clients.consumer._
import org.apache.kafka.clients.producer._
import org.specs2._
import org.specs2.specification.core.SpecStructure;

object KafkaConsumerSpec extends Specification {

  def is =
    s2"""
    Specification for KafkaConsumer

      Should create ping message $e1
      Should receive ping message and reply pong $e2
    """

  def e1 = {
    val pp = Main.loadProperties("producer.properties")
    val producer = new KafkaProducer[String, String](pp);
    producer.send(new ProducerRecord[String, String]("test3", null, "ping"));
  }

  def e2 {

  }
}
