package bbapp.atracao.service.application.controller

import bbapp.atracao.service.application.model.BumbaMeuBoiDTO
import bbapp.atracao.service.domain.BumbaMeuBoiService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController("/api/v1/bumba-meu-boi")
class BumbaMeuBoiController(private val bumbaMeuBoiService : BumbaMeuBoiService) {

    @GetMapping("/{bumbaMeuBoiId}")
    fun getBumbaMeuBoi(@PathVariable("bumbaMeuBoiId") bumbaMeuBoiId: String): BumbaMeuBoiDTO{
        return bumbaMeuBoiService.getBumbaMeuBoiById(bumbaMeuBoiId)
    }

}