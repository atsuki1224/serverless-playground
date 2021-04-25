package hello

import scala.beans.BeanProperty

case class Response(@BeanProperty body: String, @BeanProperty headers: Map[String, String], @BeanProperty statusCode: Int)
object Response {
  val contentJson = "Content-Type" -> "application/json"
  def apply(body: Map[String, Any], headers: Map[String, String] = Map(contentJson), statusCode: Int = 200) = {
    new Response("<!DOCTYPE html><html><head><meta charset='UTF-8'></head><body><h1>Hello World</h1></body></html>", headers, statusCode)
  }
}
