package tutorial.controller
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstController{

    @GetMapping
    @RequestMapping("hi",produces = arrayOf("application/json"))
    fun getHello():String{
        return "{'ji':'hello'}"
    }
}