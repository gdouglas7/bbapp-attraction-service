package bbapp.attraction.service.domain

import bbapp.attraction.service.application.model.BumbaMeuBoiDto

interface BumbaMeuBoiService {
    fun getBumbaMeuBoiById(bumbaMeuBoiId: String): BumbaMeuBoiDto
    fun saveNewBumbaMeuBoi(bumbaMeuBoiDto: BumbaMeuBoiDto): BumbaMeuBoiDto
    fun update(bumbaMeuBoiId: String, bumbaMeuBoiDto: BumbaMeuBoiDto)
    fun deleteById(bumbaMeuBoiId: String)
}
