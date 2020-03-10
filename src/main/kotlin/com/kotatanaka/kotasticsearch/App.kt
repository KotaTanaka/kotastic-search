package com.kotatanaka.kotasticsearch

import org.jooby.Jooby.*
import org.jooby.Kooby

class App : Kooby({
  get { "Hello, World!" }
})

fun main(args: Array<String>) {
  run(::App, args)
}
