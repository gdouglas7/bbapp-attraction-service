package bbapp.attraction.service.application.controller

import bbapp.attraction.service.application.model.BumbaMeuBoiDto
import bbapp.attraction.service.domain.BumbaMeuBoiService
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus.*
import org.springframework.http.ResponseEntity
import org.springframework.util.LinkedMultiValueMap
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.ConstraintViolationException
import javax.validation.Valid

@RequestMapping("/api/v1/bumba-meu-boi")
@RestController
class BumbaMeuBoiController(private val bumbaMeuBoiService : BumbaMeuBoiService) {

    @GetMapping("/{bumbaMeuBoiId}")
    fun getBumbaMeuBoi(@PathVariable("bumbaMeuBoiId") bumbaMeuBoiId: String): BumbaMeuBoiDto {
        return bumbaMeuBoiService.getBumbaMeuBoiById(bumbaMeuBoiId)
    }

    @PostMapping
    fun saveNewBumbaMeuBoi(@RequestBody @Valid bumbaMeuBoiDto: BumbaMeuBoiDto): ResponseEntity<Any> {
        val savedBumbaMeuBoiDTO = bumbaMeuBoiService.saveNewBumbaMeuBoi(bumbaMeuBoiDto)

        val headers = HttpHeaders(
                LinkedMultiValueMap<String, String>().apply {
                    this.add("Location", "/api/v1/bumba-meu-boi/${savedBumbaMeuBoiDTO.id}")
                }
        )

        return ResponseEntity(headers, CREATED)
    }

    @PutMapping("/{bumbaMeuBoiId}")
    @ResponseStatus(NO_CONTENT)
    fun updateBumbaMeuBoi(
            @PathVariable("bumbaMeuBoiId") bumbaMeuBoiId: String,
            @RequestBody @Valid bumbaMeuBoiDto: BumbaMeuBoiDto
    ) {
        bumbaMeuBoiService.update(bumbaMeuBoiId, bumbaMeuBoiDto)
    }

    @DeleteMapping("/{bumbaMeuBoiId}")
    @ResponseStatus(NO_CONTENT)
    fun deleteBumbaMeuBoi(@PathVariable("bumbaMeuBoiId") bumbaMeuBoiId: String){
        bumbaMeuBoiService.deleteById(bumbaMeuBoiId)
    }
}