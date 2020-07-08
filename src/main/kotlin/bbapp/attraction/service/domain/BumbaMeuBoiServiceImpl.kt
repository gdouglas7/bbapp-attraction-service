package bbapp.attraction.service.domain

import bbapp.attraction.service.application.model.Accent
import bbapp.attraction.service.application.model.BumbaMeuBoiDto
import org.springframework.stereotype.Service

@Service
class BumbaMeuBoiServiceImpl : BumbaMeuBoiService {

    override fun getBumbaMeuBoiById(bumbaMeuBoiId: String): BumbaMeuBoiDto {
        return BumbaMeuBoiDto(id = bumbaMeuBoiId, name = "Boi de Santa Fé", accent = Accent.BAIXADA)
    }

    override fun saveNewBumbaMeuBoi(bumbaMeuBoiDto: BumbaMeuBoiDto): BumbaMeuBoiDto {
        return bumbaMeuBoiDto
    }

    override fun update(bumbaMeuBoiId: String, bumbaMeuBoiDto: BumbaMeuBoiDto) {

    }

    override fun deleteById(bumbaMeuBoiId: String) {

    }
}