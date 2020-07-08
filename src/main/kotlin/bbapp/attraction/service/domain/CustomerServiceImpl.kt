package bbapp.attraction.service.domain

import bbapp.attraction.service.application.model.CustomerDto
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl : CustomerService {
    override fun getCustomerById(customerId: String): CustomerDto {
        return CustomerDto(id = customerId, name = "Andrezinho")
    }
}