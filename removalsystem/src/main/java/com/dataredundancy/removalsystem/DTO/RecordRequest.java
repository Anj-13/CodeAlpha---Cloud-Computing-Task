// This is input DTO for API request
package com.dataredundancy.removalsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RecordRequest {

    @NotBlank(message = "First and last name")
    @Size(max = 120)
    private String fullname;

    @NotBlank(message = "Email needed")
    @Size(max = 150)
    @Email(message = "Invalid emailformat")
    private String email;

    @NotBlank(message = "Phone Needed")
    @Size(min = 7, max = 20, message = "Must be between 7 and 20")
    private String phone;

    @Size(max = 255)
    private String address;

    public String getFullName() { return fullname; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    
    public void setFullName(String fullname) { this.fullname = fullname; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
}
