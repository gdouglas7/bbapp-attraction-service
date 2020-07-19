package bbapp.attraction.service.application.model

import java.util.UUID
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class BumbaMeuBoiDto(
        val id: String = UUID.randomUUID().toString(),
        @get:NotBlank(message = "name is required")
        val name: String,
        val accent: Accent
)

enum class Accent {
    ORQUESTRA, MATRACA, BAIXADA, COSTA_DE_MAO, ZABUMBA
}