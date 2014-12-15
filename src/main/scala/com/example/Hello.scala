package com.example

import com.example.html.hello_world

object Hello extends App {

  val context = Context("Hello", args)
  println(hello_world(context))

}
