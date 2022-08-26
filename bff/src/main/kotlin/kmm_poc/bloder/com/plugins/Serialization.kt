package kmm_poc.bloder.com.plugins

import br.com.zup.beagle.serialization.jackson.BeagleModule
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.serialization.jackson.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.application.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
            registerModule(BeagleModule())
            setSerializationInclusion(JsonInclude.Include.NON_NULL)
        }
    }
}
