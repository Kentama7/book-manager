package book.manager.app

import book.manager.utilities.StringUtils
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/")
class HelloController {
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        val tokens = StringUtils.split(MessageUtils.getMessage())
        return StringUtils.join(tokens)
    }
}