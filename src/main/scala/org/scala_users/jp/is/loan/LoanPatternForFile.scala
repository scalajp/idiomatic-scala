package org.scala_users.jp.is.loan

import java.io.File
import java.io.PrintWriter
import java.io.FileOutputStream
import java.io.OutputStreamWriter

object LoanPatternForFile {
  def using[A <: { def close(): Unit}, B](resource: A)(f: A => B): B = try {
    f(resource)
  } finally {
    resource.close()
  }
  
  def openWriter[A](file: File)(f: PrintWriter => A): A = {
    val writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"))
    using(writer)(f)
  }
  
  def main(args: Array[String]): Unit = {
    val Array(arg) = args
    openWriter(new File(arg)){writer =>
      writer.println("Hello, World!")
    }
  }
}