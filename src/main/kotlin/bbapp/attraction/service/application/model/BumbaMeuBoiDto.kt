package bbapp.attraction.service.application.model

import java.util.UUID

data class BumbaMeuBoiDto(
        val id: String = UUID.randomUUID().toString(),
        val name: String,
        val accent: Accent
)

enum class Accent {
    ORQUESTRA, MATRACA, BAIXADA, COSTA_DE_MAO, ZABUMBA
}