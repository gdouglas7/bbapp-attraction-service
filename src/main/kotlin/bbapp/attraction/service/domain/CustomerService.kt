package bbapp.attraction.service.domain

import bbapp.attraction.service.application.model.CustomerDTO

interface CustomerService {
    fun getCustomerById(customerId: String): CustomerDTO
}
