package kmm_poc.bloder.com.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import kmm_poc.bloder.com.routes.homeRouting

fun Application.configureRouting() {

    routing {
        homeRouting()
    }
}
