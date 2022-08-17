package kmm_poc.bloder.com.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kmm_poc.bloder.com.screens.getHomeScreen

fun Route.homeRouting() {
    route("/home") {
        get {
            call.respond(getHomeScreen())
        }
    }
}