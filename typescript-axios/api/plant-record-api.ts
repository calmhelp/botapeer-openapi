/* tslint:disable */
/* eslint-disable */
/**
 * Botapeer API
 * Botapeer API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import type { Configuration } from '../configuration';
import type { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import globalAxios from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { CreatePlantRecordRequest } from '../model';
// @ts-ignore
import { ErrorResponse } from '../model';
// @ts-ignore
import { PlantRecordResponse } from '../model';
/**
 * PlantRecordApi - axios parameter creator
 * @export
 */
export const PlantRecordApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 生育記録作成
         * @param {CreatePlantRecordRequest} createPlantRecordRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createPlantRecord: async (createPlantRecordRequest: CreatePlantRecordRequest, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'createPlantRecordRequest' is not null or undefined
            assertParamExists('createPlantRecord', 'createPlantRecordRequest', createPlantRecordRequest)
            const localVarPath = `/plant_records`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearerAuth required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            localVarRequestOptions.data = serializeDataIfNeeded(createPlantRecordRequest, localVarRequestOptions, configuration)

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 任意の生育記録をplantRecordIdから取得
         * @param {string} plantRecordId 生育記録ID
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlantRecordById: async (plantRecordId: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'plantRecordId' is not null or undefined
            assertParamExists('getPlantRecordById', 'plantRecordId', plantRecordId)
            const localVarPath = `/plant_records/{plantRecordId}`
                .replace(`{${"plantRecordId"}}`, encodeURIComponent(String(plantRecordId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 任意の生育記録をuserIdから取得
         * @param {string} userId ユーザーID
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlantRecordByUserId: async (userId: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'userId' is not null or undefined
            assertParamExists('getPlantRecordByUserId', 'userId', userId)
            const localVarPath = `/plant_records/users/{userId}`
                .replace(`{${"userId"}}`, encodeURIComponent(String(userId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * PlantRecordApi - functional programming interface
 * @export
 */
export const PlantRecordApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = PlantRecordApiAxiosParamCreator(configuration)
    return {
        /**
         * 生育記録作成
         * @param {CreatePlantRecordRequest} createPlantRecordRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createPlantRecord(createPlantRecordRequest: CreatePlantRecordRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PlantRecordResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.createPlantRecord(createPlantRecordRequest, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 任意の生育記録をplantRecordIdから取得
         * @param {string} plantRecordId 生育記録ID
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getPlantRecordById(plantRecordId: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PlantRecordResponse>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getPlantRecordById(plantRecordId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 任意の生育記録をuserIdから取得
         * @param {string} userId ユーザーID
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getPlantRecordByUserId(userId: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<PlantRecordResponse>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getPlantRecordByUserId(userId, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * PlantRecordApi - factory interface
 * @export
 */
export const PlantRecordApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = PlantRecordApiFp(configuration)
    return {
        /**
         * 生育記録作成
         * @param {CreatePlantRecordRequest} createPlantRecordRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createPlantRecord(createPlantRecordRequest: CreatePlantRecordRequest, options?: any): AxiosPromise<PlantRecordResponse> {
            return localVarFp.createPlantRecord(createPlantRecordRequest, options).then((request) => request(axios, basePath));
        },
        /**
         * 任意の生育記録をplantRecordIdから取得
         * @param {string} plantRecordId 生育記録ID
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlantRecordById(plantRecordId: string, options?: any): AxiosPromise<PlantRecordResponse> {
            return localVarFp.getPlantRecordById(plantRecordId, options).then((request) => request(axios, basePath));
        },
        /**
         * 任意の生育記録をuserIdから取得
         * @param {string} userId ユーザーID
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlantRecordByUserId(userId: string, options?: any): AxiosPromise<Array<PlantRecordResponse>> {
            return localVarFp.getPlantRecordByUserId(userId, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * PlantRecordApi - object-oriented interface
 * @export
 * @class PlantRecordApi
 * @extends {BaseAPI}
 */
export class PlantRecordApi extends BaseAPI {
    /**
     * 生育記録作成
     * @param {CreatePlantRecordRequest} createPlantRecordRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlantRecordApi
     */
    public createPlantRecord(createPlantRecordRequest: CreatePlantRecordRequest, options?: AxiosRequestConfig) {
        return PlantRecordApiFp(this.configuration).createPlantRecord(createPlantRecordRequest, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 任意の生育記録をplantRecordIdから取得
     * @param {string} plantRecordId 生育記録ID
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlantRecordApi
     */
    public getPlantRecordById(plantRecordId: string, options?: AxiosRequestConfig) {
        return PlantRecordApiFp(this.configuration).getPlantRecordById(plantRecordId, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 任意の生育記録をuserIdから取得
     * @param {string} userId ユーザーID
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlantRecordApi
     */
    public getPlantRecordByUserId(userId: string, options?: AxiosRequestConfig) {
        return PlantRecordApiFp(this.configuration).getPlantRecordByUserId(userId, options).then((request) => request(this.axios, this.basePath));
    }
}
