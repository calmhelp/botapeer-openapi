/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package api;

import model.CreateUserRequest;
import model.ErrorResponse;
import model.JwtAuthenticationResponse;
import model.SignInRequest;
import model.UserResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-20T08:35:26.228503Z[Etc/UTC]")
@Validated
@Tag(name = "Auth", description = "the Auth API")
public interface AuthApi {

    /**
     * POST /auth/signup
     * サインアップ
     *
     * @param createUserRequest  (required)
     * @return ok (status code 200)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "createUser",
        description = "サインアップ",
        tags = { "Auth" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponse.class))
            }),
            @ApiResponse(responseCode = "405", description = "405(Validation exception)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/auth/signup",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<UserResponse> createUser(
        @Parameter(name = "CreateUserRequest", description = "", required = true) @Valid @RequestBody CreateUserRequest createUserRequest
    );


    /**
     * POST /auth/signin
     * サインイン
     *
     * @param signInRequest  (required)
     * @return ok (status code 200)
     *         or 404(User Not Found) (status code 404)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "signin",
        description = "サインイン",
        tags = { "Auth" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = JwtAuthenticationResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "404(User Not Found)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "405", description = "405(Validation exception)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/auth/signin",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<JwtAuthenticationResponse> signin(
        @Parameter(name = "SignInRequest", description = "", required = true) @Valid @RequestBody SignInRequest signInRequest
    );

}
