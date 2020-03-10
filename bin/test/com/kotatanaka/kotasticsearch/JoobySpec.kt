package com.kotatanaka.kotasticsearch

import org.jetbrains.spek.api.dsl.SpecBody
import org.jooby.Jooby

fun SpecBody.jooby(app: Jooby, body: SpecBody.() -> Unit) {
  beforeGroup {
    app.start("server.join=false")
  }

  body()

  afterGroup {
    app.stop()
  }
}
