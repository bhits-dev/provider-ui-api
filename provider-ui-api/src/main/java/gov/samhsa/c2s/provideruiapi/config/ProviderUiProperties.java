package gov.samhsa.c2s.provideruiapi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Component
@ConfigurationProperties(prefix = "c2s.provider-ui")
@Data
public class ProviderUiProperties {

    @NotNull
    @Valid
    private ProviderPermissions providerPermissions;

    @Data
    public static class ProviderPermissions {
        private boolean consentSignEnabled = false;
        private boolean consentRevokeEnabled = false;
        private boolean userActivationEnabled = true;
        private boolean segmentationEnabled = true;
        private boolean patientListCardEnabled;
        @NotNull
        @Valid
        private Registration registration;
        @NotNull
        @Valid
        private PatientSearch patientSearch;
    }

    @Data
    public static class Registration {
        private boolean duplicateCheckEnabled = false;
    }

    @Data
    public static class PatientSearch {
        @NotNull
        private boolean firstNameRequired;
        @NotNull
        private boolean lastNameRequired;
        @NotNull
        private boolean genderRequired;
        @NotNull
        private boolean dateOfBirthRequired;
        @NotNull
        private boolean patientIdRequired;
    }
}