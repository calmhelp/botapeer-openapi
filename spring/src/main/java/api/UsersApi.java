/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.4.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package api;

import model.ErrorResponse;
import model.UpdateUserFormData;
import model.User;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-19T01:33:16.026807Z[Etc/UTC]")
@Validated
@Tag(name = "User", description = "the User API")
public interface UsersApi {

    /**
     * DELETE /users/{userId}
     * 任意のUserを削除
     *
     * @param userId ユーザーID (required)
     * @return ok (status code 200)
     *         or 401(Unauthorized) (status code 401)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "deleteUser",
        description = "任意のUserを削除",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "401", description = "401(Unauthorized)"),
            @ApiResponse(responseCode = "405", description = "405(Validation exception)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/users/{userId}",
        produces = { "application/json" }
    )
    ResponseEntity<User> deleteUser(
        @Parameter(name = "userId", description = "ユーザーID", required = true, in = ParameterIn.PATH) @PathVariable("userId") String userId
    );


    /**
     * GET /users/{userId}
     * 任意のUserを取得
     *
     * @param userId ユーザーID (required)
     * @return ok (status code 200)
     *         or 404(User Not Found) (status code 404)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "findUserById",
        description = "任意のUserを取得",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
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
        method = RequestMethod.GET,
        value = "/users/{userId}",
        produces = { "application/json" }
    )
    ResponseEntity<User> findUserById(
        @Parameter(name = "userId", description = "ユーザーID", required = true, in = ParameterIn.PATH) @PathVariable("userId") String userId
    );


    /**
     * GET /users/plant_records/{plantRecordId}
     * 任意のUserをPlantRecordIdから取得
     *
     * @param plantRecordId 生育記録ID (required)
     * @return ok (status code 200)
     *         or 404(User Not Found) (status code 404)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "findUserByPlantRecordId",
        description = "任意のUserをPlantRecordIdから取得",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
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
        method = RequestMethod.GET,
        value = "/users/plant_records/{plantRecordId}",
        produces = { "application/json" }
    )
    ResponseEntity<User> findUserByPlantRecordId(
        @Parameter(name = "plantRecordId", description = "生育記録ID", required = true, in = ParameterIn.PATH) @PathVariable("plantRecordId") String plantRecordId
    );


    /**
     * GET /users
     * User一覧もしくは名前からユーザーを取得
     *
     * @param username ユーザー名 (optional)
     * @return ok (status code 200)
     *         or 404(User Not Found) (status code 404)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "getUsersOrGetUserByName",
        description = "User一覧もしくは名前からユーザーを取得",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = User.class)))
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
        method = RequestMethod.GET,
        value = "/users",
        produces = { "application/json" }
    )
    ResponseEntity<List<User>> getUsersOrGetUserByName(
        @Parameter(name = "username", description = "ユーザー名", in = ParameterIn.QUERY) @Valid @RequestParam(value = "username", required = false) String username
    );


    /**
     * PATCH /users/{userId}
     * 任意のUserを更新
     *
     * @param userId ユーザーID (required)
     * @param formData  (optional)
     * @param profileImage  (optional)
     * @param coverImage  (optional)
     * @return ok (status code 200)
     *         or 401(Unauthorized) (status code 401)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "updateUser",
        description = "任意のUserを更新",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "401", description = "401(Unauthorized)"),
            @ApiResponse(responseCode = "405", description = "405(Validation exception)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/users/{userId}",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    ResponseEntity<User> updateUser(
        @Parameter(name = "userId", description = "ユーザーID", required = true, in = ParameterIn.PATH) @PathVariable("userId") String userId,
        @Parameter(name = "formData", description = "") @Valid @RequestPart(value = "formData", required = false) UpdateUserFormData formData,
        @Parameter(name = "profileImage", description = "") @RequestPart(value = "profileImage", required = false) MultipartFile profileImage,
        @Parameter(name = "coverImage", description = "") @RequestPart(value = "coverImage", required = false) MultipartFile coverImage
    );

}
