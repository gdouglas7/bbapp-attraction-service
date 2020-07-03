package bbapp.attraction.service.domain

import bbapp.attraction.service.application.model.CustomerDTO
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl : CustomerService {
    override fun getCustomerById(customerId: String): CustomerDTO {
        return CustomerDTO(id = customerId, name = "Andrezinho")
    }
}