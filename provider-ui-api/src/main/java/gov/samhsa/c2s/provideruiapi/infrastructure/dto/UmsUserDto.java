package gov.samhsa.c2s.provideruiapi.infrastructure.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Data
public class UmsUserDto {
    private Long id;

    private String lastName;

    private String middleName;

    private String firstName;

    private LocalDate birthDate;

    private String genderCode;

    private String socialSecurityNumber;

    private List<UmsAddressDto> addresses;

    private List<TelecomDto> telecoms;

    private List<RoleDto> roles;

    private String locale;

    private boolean disabled;

    private String mrn;

    private Optional<List<IdentifierDto>> identifiers;

    private Optional<String> registrationPurposeEmail;

    private String createdBy;

    private String lastUpdatedBy;
}
