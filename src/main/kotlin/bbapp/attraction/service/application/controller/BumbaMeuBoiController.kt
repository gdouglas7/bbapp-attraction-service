package bbapp.attraction.service.application.controller

import bbapp.attraction.service.application.model.BumbaMeuBoiDTO
import bbapp.attraction.service.domain.BumbaMeuBoiService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1/bumba-meu-boi")
@RestController
class BumbaMeuBoiController(private val bumbaMeuBoiService : BumbaMeuBoiService) {

    @GetMapping("/{bumbaMeuBoiId}")
    fun getBumbaMeuBoi(@PathVariable("bumbaMeuBoiId") bumbaMeuBoiId: String): BumbaMeuBoiDTO {
        return bumbaMeuBoiService.getBumbaMeuBoiById(bumbaMeuBoiId)
    }

}