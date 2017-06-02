package gov.samhsa.c2s.provideruiapi.service.mapping.customconverter;

import gov.samhsa.c2s.provideruiapi.infrastructure.dto.TelecomDto;
import gov.samhsa.c2s.provideruiapi.service.dto.UserDto;
import gov.samhsa.c2s.provideruiapi.service.mapping.Use;
import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;
import gov.samhsa.c2s.provideruiapi.service.mapping.System;

import java.util.Arrays;
import java.util.List;

@Component
public class EmailPhoneToTelecomsConverter extends AbstractConverter<UserDto, List<TelecomDto>> {
    //Todo: Will support multiple Telecoms
    @Override
    protected List<TelecomDto> convert(UserDto source) {
        TelecomDto homeEmailTelecomDto = TelecomDto.builder()
                .system(System.EMAIL.toString())
                .value(source.getHomeEmail())
                .use(Use.HOME.toString())
                .build();
        if (source.getHomePhone() != null) {
            TelecomDto homePhoneTelecomDto = TelecomDto.builder()
                    .system(System.PHONE.toString())
                    .value(source.getHomePhone())
                    .use(Use.HOME.toString())
                    .build();
            return Arrays.asList(homeEmailTelecomDto, homePhoneTelecomDto);
        } else {
            return Arrays.asList(homeEmailTelecomDto);
        }
    }
}
