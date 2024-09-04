package com.dev.identity_service.mapper;

import com.dev.identity_service.dto.request.PermissionRequest;
import com.dev.identity_service.dto.request.UserCreationRequest;
import com.dev.identity_service.dto.request.UserUpdateRequest;
import com.dev.identity_service.dto.response.PermissionResponse;
import com.dev.identity_service.dto.response.UserResponse;
import com.dev.identity_service.entity.Permission;
import com.dev.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
