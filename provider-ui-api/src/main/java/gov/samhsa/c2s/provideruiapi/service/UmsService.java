package gov.samhsa.c2s.provideruiapi.service;

import gov.samhsa.c2s.provideruiapi.infrastructure.dto.PageableDto;
import gov.samhsa.c2s.provideruiapi.service.dto.UserDto;

import java.util.List;

public interface UmsService {
    PageableDto<UserDto> getAllUsers(Integer page, Integer size);

    void registerUser(UserDto userDto);

    List<UserDto> searchUsersByFirstNameAndORLastName(String term);

    UserDto getUser(Long userId);

    void updateUser(Long userId, UserDto userDto);

    Object initiateUserActivation(Long userId, String xForwardedProto, String xForwardedHost, int xForwardedPort);

    Object getCurrentUserCreationInfo(Long userId);

    void disableUser(Long userId);

    void enableUser(Long userId);
}