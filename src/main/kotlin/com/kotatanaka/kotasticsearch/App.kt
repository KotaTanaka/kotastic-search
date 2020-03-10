package com.kotatanaka.kotasticsearch

import org.jooby.Jooby.*
import org.jooby.Kooby

class App : Kooby({
  port(6060)

  get { "Hello, World!" }
})

fun main(args: Array<String>) {
  run(::App, args)
}
