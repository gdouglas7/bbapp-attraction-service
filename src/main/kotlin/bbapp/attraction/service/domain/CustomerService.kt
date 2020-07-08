package bbapp.attraction.service.domain

import bbapp.attraction.service.application.model.CustomerDto

interface CustomerService {
    fun getCustomerById(customerId: String): CustomerDto
}
