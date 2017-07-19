package gov.samhsa.c2s.provideruiapi.service;

import gov.samhsa.c2s.provideruiapi.infrastructure.TryPolicyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class TryPolicyServiceImpl implements TryPolicyService {

    @Autowired
    private TryPolicyClient tryPolicyClient;

    @Override
    public Object getSampleDocuments() {
        return tryPolicyClient.getSampleDocuments();
    }

    @Override
    public Object tryPolicyXHTMLWithSampleDoc(String patientId, String consentId, String purposeOfUseCode, String indexOfDocuments, Locale locale) {
        return tryPolicyClient.tryPolicyXHTMLWithSampleDoc(patientId, consentId, purposeOfUseCode, indexOfDocuments, locale);
    }
}