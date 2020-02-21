package com.example.routing

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*



fun Routing.root() {

    val log = application.log

    get("/") {

        log.debug("testtest123456")
        call.respondText("HELLO WORLD!")

    }


}