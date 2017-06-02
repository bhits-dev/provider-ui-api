package gov.samhsa.c2s.provideruiapi.web;

import gov.samhsa.c2s.provideruiapi.service.UmsLookupService;
import gov.samhsa.c2s.provideruiapi.service.dto.UserCreationLookupDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ums")
public class UmsLookupRestController {

    @Autowired
    private UmsLookupService umsLookupService;

    @GetMapping("/userCreationLookupInfo")
    public UserCreationLookupDto getUserCreationLookupInfo() {
        return umsLookupService.getUserCreationLookupInfo();
    }
}
