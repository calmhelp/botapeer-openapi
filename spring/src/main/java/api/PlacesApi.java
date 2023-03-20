/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package api;

import model.PlaceResponse;
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
@Tag(name = "Place", description = "the Place API")
public interface PlacesApi {

    /**
     * GET /places
     * 置き場所取得
     *
     * @return ok (status code 200)
     */
    @Operation(
        operationId = "getPlaces",
        description = "置き場所取得",
        tags = { "Place" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PlaceResponse.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/places",
        produces = { "application/json" }
    )
    ResponseEntity<List<PlaceResponse>> getPlaces(
        
    );

}
