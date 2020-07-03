package bbapp.atracao.service.application.model

import java.util.UUID

data class CustomerDTO(
        val id: String = UUID.randomUUID().toString(),
        val name: String
)