/**
 * Botapeer API
 * Botapeer API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class User {
    'id'?: number;
    'name': string;
    'email': string;
    'status'?: number;
    'description'?: string;
    'profileImage'?: string;
    'coverImage'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": "email"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "number",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "profileImage",
            "baseName": "profileImage",
            "type": "string",
            "format": ""
        },
        {
            "name": "coverImage",
            "baseName": "coverImage",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return User.attributeTypeMap;
    }

    public constructor() {
    }
}

