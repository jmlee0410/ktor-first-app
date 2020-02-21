package com.example.routing

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*



fun Routing.root() {

    val log = application.log

    get("/") {
        //val log = call.application.log
        //call.application.environment.log.debug("testtest")
        log.debug("testtest123456")
        call.respondText("Hellow World!~~~~~~")

    }


}