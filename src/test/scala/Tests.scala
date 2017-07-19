/**
  * Created by Administrator on 18/07/2017.
  */
import Main.createString
import org.scalatest.FunSuite
class Tests extends FunSuite {

  test("createString: Negative Number, longscale") {
    assert(createString("-1234567891111", "long",0) === "Negative")
  }

  test("createString: Exactly 0 , longscale") {
    assert(createString("0", "long",0) === "0 ")
  }

  test("createString: Positive Number hundreds, shortscale") {
    assert(createString("123", "short", 0) === "123 ")
  }
//
  test("createString: Positive Number thousands, shortscale") {
    assert(createString("123456", "short", 0) === "123 Thousand 456 ")
  }

  test("createString: Positive Number millions, shortscale") {
    assert(createString("123456789", "short", 0) === "123 Million 456 Thousand 789 ")
  }

  test("createString: Positive Number billions, shortscale") {
    assert(createString("123456789111", "short", 0) === "123 Billion 456 Million 789 Thousand 111 ")
  }

  test("createString: Positive Number trillions, shortscale") {
    assert(createString("123456789111111", "short", 0) === "123 Trillion 456 Billion 789 Million 111 Thousand 111 ")
  }

  test("createString: Positive Number quadrillion, shortscale") {
    assert(createString("123456789111111111", "short", 0) === "123 Quadrillion 456 Trillion 789 Billion 111 Million 111 Thousand 111 ")
  }

  test("createString: Positive Number quintillion, shortscale") {
    assert(createString("1234567891111111111", "short", 0) === "1 Quintillion 234 Quadrillion 567 Trillion 891 Billion 111 Million 111 Thousand 111 ")
  }

  test("createString: Positive Number, longscale") {
    assert(createString("1234567891111", "long", 0) === "1 Billion 234 Milliard 567 Million 891 Thousand 111 ")
  }



}