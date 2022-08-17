package kmm_poc.bloder.com

import io.ktor.http.*
import io.ktor.client.request.*
import kotlin.test.*
import io.ktor.server.testing.*
import kmm_poc.bloder.com.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        application {
            configureRouting()
        }
        client.get("/home").apply {
            assertEquals(HttpStatusCode.OK, status)
        }
    }
}