package bbapp.attraction.service.application.controller

import bbapp.attraction.service.application.model.CustomerDTO
import bbapp.attraction.service.domain.CustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1/customer")
@RestController
class CustomerController(private val customerService : CustomerService) {

    @GetMapping("/{customerId}")
    fun getCustomer(@PathVariable("customerId") customerId: String): CustomerDTO {
        return customerService.getCustomerById(customerId)
    }

}