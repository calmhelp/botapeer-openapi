/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package api;

import model.CreatePlantRecordRequest;
import model.ErrorResponse;
import model.PlantRecordResponse;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-20T08:41:54.051854Z[Etc/UTC]")
@Validated
@Tag(name = "PlantRecord", description = "the PlantRecord API")
public interface PlantRecordsApi {

    /**
     * POST /plant_records
     * 生育記録作成
     *
     * @param createPlantRecordRequest  (required)
     * @return ok (status code 200)
     *         or 401(Unauthorized) (status code 401)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "createPlantRecord",
        description = "生育記録作成",
        tags = { "PlantRecord" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PlantRecordResponse.class))
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
        method = RequestMethod.POST,
        value = "/plant_records",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<PlantRecordResponse> createPlantRecord(
        @Parameter(name = "CreatePlantRecordRequest", description = "", required = true) @Valid @RequestBody CreatePlantRecordRequest createPlantRecordRequest
    );


    /**
     * GET /plant_records/{plantRecordId}
     * 任意の生育記録をplantRecordIdから取得
     *
     * @param plantRecordId 生育記録ID (required)
     * @return ok (status code 200)
     *         or 404(PlantRecord Not Found) (status code 404)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "getPlantRecordById",
        description = "任意の生育記録をplantRecordIdから取得",
        tags = { "PlantRecord" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PlantRecordResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "404(PlantRecord Not Found)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "405", description = "405(Validation exception)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/plant_records/{plantRecordId}",
        produces = { "application/json" }
    )
    ResponseEntity<PlantRecordResponse> getPlantRecordById(
        @Parameter(name = "plantRecordId", description = "生育記録ID", required = true, in = ParameterIn.PATH) @PathVariable("plantRecordId") String plantRecordId
    );


    /**
     * GET /plant_records/users/{userId}
     * 任意の生育記録をuserIdから取得
     *
     * @param userId ユーザーID (required)
     * @return ok (status code 200)
     *         or 404(PlantRecord Not Found) (status code 404)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "getPlantRecordByUserId",
        description = "任意の生育記録をuserIdから取得",
        tags = { "PlantRecord" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PlantRecordResponse.class)))
            }),
            @ApiResponse(responseCode = "404", description = "404(PlantRecord Not Found)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "405", description = "405(Validation exception)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/plant_records/users/{userId}",
        produces = { "application/json" }
    )
    ResponseEntity<List<PlantRecordResponse>> getPlantRecordByUserId(
        @Parameter(name = "userId", description = "ユーザーID", required = true, in = ParameterIn.PATH) @PathVariable("userId") String userId
    );

}
