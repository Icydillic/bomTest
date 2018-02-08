import kantan.codecs.resource.bom._
import kantan.csv._
import kantan.csv.ops._

import scala.io.{Codec, Source}

object Main {
  final case class BomTestModel(header1: String)

  implicit val headerDecoder = HeaderDecoder.decoder("header1")(BomTestModel)

  def main(args: Array[String]): Unit = {
    val decoder = Codec.UTF8.decoder
    val rawData = Source.fromResource("bomTest.csv")(decoder).mkString
    rawData.asCsvReader[BomTestModel](rfc.withHeader).foreach(println(_))
  }
}
