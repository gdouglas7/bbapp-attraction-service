package bbapp.attraction.service.domain

import bbapp.attraction.service.application.model.BumbaMeuBoiDTO

interface BumbaMeuBoiService {
    fun getBumbaMeuBoiById(bumbaMeuBoiId: String): BumbaMeuBoiDTO
}
