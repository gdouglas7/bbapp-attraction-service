package bbapp.attraction.service.domain

import bbapp.attraction.service.application.model.BumbaMeuBoiDTO
import org.springframework.stereotype.Service

@Service
class BumbaMeuBoiServiceImpl : BumbaMeuBoiService {
    override fun getBumbaMeuBoiById(bumbaMeuBoiId: String): BumbaMeuBoiDTO {
        return BumbaMeuBoiDTO(id = bumbaMeuBoiId, name = "Boi de Santa Fé", accent = "Baixada")
    }
}