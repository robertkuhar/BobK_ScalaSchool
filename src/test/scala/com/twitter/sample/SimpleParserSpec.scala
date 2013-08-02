package com.twitter.sample

import org.specs2.mutable._
import org.specs2.matcher._

object SimpleParserSpec extends Specification with ThrownExpectations {
  "SimpleParser" should {
    val parser = new SimpleParser()
    "work with basic tweet" in {
      val tweet = """{"id":1,"text":"foo"}"""
      parser.parse(tweet) match {
        case Some(parsed) => {
          parsed.text must be_==("foo")
          parsed.id must be_==(1)
        }
        case _ => failure("didn't parse tweet")
      }
    }
  }
}
