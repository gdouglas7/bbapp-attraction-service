package bbapp.atracao.service.domain

import bbapp.atracao.service.application.model.BumbaMeuBoiDTO

interface BumbaMeuBoiService {
    fun getBumbaMeuBoiById(bumbaMeuBoiId: String): BumbaMeuBoiDTO
}
