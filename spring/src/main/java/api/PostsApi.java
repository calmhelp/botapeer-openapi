/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package api;

import model.CreatePostFormData;
import model.ErrorResponse;
import model.PostResponse;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-23T12:58:42.929602Z[Etc/UTC]")
@Validated
@Tag(name = "Post", description = "the Post API")
public interface PostsApi {

    /**
     * POST /posts/{postId}/users/{userId}/likes
     * 投稿記事のLike作成
     *
     * @param postId 投稿ID (required)
     * @param userId ユーザーID (required)
     * @return ok (status code 200)
     *         or 401(Unauthorized) (status code 401)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "createLikeToPost",
        description = "投稿記事のLike作成",
        tags = { "Post" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PostResponse.class))
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
        value = "/posts/{postId}/users/{userId}/likes",
        produces = { "application/json" }
    )
    ResponseEntity<PostResponse> createLikeToPost(
        @Parameter(name = "postId", description = "投稿ID", required = true, in = ParameterIn.PATH) @PathVariable("postId") String postId,
        @Parameter(name = "userId", description = "ユーザーID", required = true, in = ParameterIn.PATH) @PathVariable("userId") String userId
    );


    /**
     * POST /posts/plant_records/{plantRecordId}
     * 投稿作成
     *
     * @param plantRecordId 生育記録ID (required)
     * @param image  (required)
     * @param formData  (optional)
     * @return ok (status code 200)
     *         or 401(Unauthorized) (status code 401)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "createPost",
        description = "投稿作成",
        tags = { "Post" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PostResponse.class))
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
        value = "/posts/plant_records/{plantRecordId}",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    ResponseEntity<PostResponse> createPost(
        @Parameter(name = "plantRecordId", description = "生育記録ID", required = true, in = ParameterIn.PATH) @PathVariable("plantRecordId") String plantRecordId,
        @Parameter(name = "image", description = "", required = true) @RequestPart(value = "image", required = true) MultipartFile image,
        @Parameter(name = "formData", description = "") @Valid @RequestPart(value = "formData", required = false) CreatePostFormData formData
    );


    /**
     * DELETE /posts/{postId}/users/{userId}/likes
     * 投稿記事のLike削除
     *
     * @param postId 投稿ID (required)
     * @param userId ユーザーID (required)
     * @return ok (status code 200)
     *         or 401(Unauthorized) (status code 401)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "deleteLikeToPost",
        description = "投稿記事のLike削除",
        tags = { "Post" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PostResponse.class))
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
        value = "/posts/{postId}/users/{userId}/likes",
        produces = { "application/json" }
    )
    ResponseEntity<PostResponse> deleteLikeToPost(
        @Parameter(name = "postId", description = "投稿ID", required = true, in = ParameterIn.PATH) @PathVariable("postId") String postId,
        @Parameter(name = "userId", description = "ユーザーID", required = true, in = ParameterIn.PATH) @PathVariable("userId") String userId
    );


    /**
     * DELETE /posts/{postId}
     * 任意の投稿をpostIdから削除
     *
     * @param postId 投稿ID (required)
     * @return ok (status code 200)
     *         or 404(Post Not Found) (status code 404)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "deletePost",
        description = "任意の投稿をpostIdから削除",
        tags = { "Post" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok"),
            @ApiResponse(responseCode = "404", description = "404(Post Not Found)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
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
        value = "/posts/{postId}",
        produces = { "application/json" }
    )
    ResponseEntity<Void> deletePost(
        @Parameter(name = "postId", description = "投稿ID", required = true, in = ParameterIn.PATH) @PathVariable("postId") String postId
    );


    /**
     * GET /posts/{postId}
     * 任意の投稿をpostIdから取得
     *
     * @param postId 投稿ID (required)
     * @return ok (status code 200)
     *         or 404(User Not Found) (status code 404)
     *         or 405(Validation exception) (status code 405)
     */
    @Operation(
        operationId = "getPostById",
        description = "任意の投稿をpostIdから取得",
        tags = { "Post" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PostResponse.class))
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
        value = "/posts/{postId}",
        produces = { "application/json" }
    )
    ResponseEntity<PostResponse> getPostById(
        @Parameter(name = "postId", description = "投稿ID", required = true, in = ParameterIn.PATH) @PathVariable("postId") String postId
    );

}
