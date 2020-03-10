package com.kotatanaka.kotasticsearch

import org.jooby.Jooby.*
import org.jooby.Kooby

class App : Kooby({ 
  get {
    val name = param("name").value("Kotlin")
    "Hello $name!"
  }
})

fun main(args: Array<String>) { 
  run(::App, args)
}