@PreAuthorize is a Spring Security annotation used to specify an expression that should be evaluated before a method is 
invoked to determine whether the caller is authorized to execute it.
    Based on role or the argument which is passed to the method

@PostAuthorize to specify that the method should only return data the caller is authorized to see.


If you use hasRole('ADMIN'), in your ADMIN Enum must be ROLE_ADMIN instead of ADMIN.
If you use hasAuthority('ADMIN'), your ADMIN Enum must be ADMIN.
In spring security, hasRole() is the same as hasAuthority(), but hasRole() function map with Authority without ROLE_ prefix.

1. @EnableMethodSecurity
2. Add @PreAuthorize("hasAuthority('USER')") to the controller method based on need#   S p r i n g - S e c u r i t y - H 2 - M e t h o d L e v e l  
 