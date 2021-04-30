package hello

import scala.beans.BeanProperty
import model.Test

case class Response(@BeanProperty body: String, @BeanProperty headers: Map[String, String], @BeanProperty statusCode: Int)
object Response {
  val contentJson = "Content-Type" -> "text/html"
  val test = Test("name test")
  def apply(body: Map[String, Any], headers: Map[String, String] = Map(contentJson), statusCode: Int = 200) = {
    new Response(test.value, headers, statusCode)
  }
}
