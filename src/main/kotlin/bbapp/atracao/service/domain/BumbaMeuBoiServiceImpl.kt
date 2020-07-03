package bbapp.atracao.service.domain

import bbapp.atracao.service.application.model.BumbaMeuBoiDTO
import org.springframework.stereotype.Service

@Service
class BumbaMeuBoiServiceImpl : BumbaMeuBoiService {
    override fun getBumbaMeuBoiById(bumbaMeuBoiId: String): BumbaMeuBoiDTO {
        return BumbaMeuBoiDTO(id = bumbaMeuBoiId, nome = "Boi de Santa Fé", sotaque = "Baixada")
    }
}