/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.elasticsearch.thrift;


import org.apache.thrift.TEnum;

public enum Status implements TEnum {
    CONT(100),
    SWITCHING_PROTOCOLS(101),
    OK(200),
    CREATED(201),
    ACCEPTED(202),
    NON_AUTHORITATIVE_INFORMATION(203),
    NO_CONTENT(204),
    RESET_CONTENT(205),
    PARTIAL_CONTENT(206),
    MULTI_STATUS(207),
    MULTIPLE_CHOICES(300),
    MOVED_PERMANENTLY(301),
    FOUND(302),
    SEE_OTHER(303),
    NOT_MODIFIED(304),
    USE_PROXY(305),
    TEMPORARY_REDIRECT(307),
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    PAYMENT_REQUIRED(402),
    FORBIDDEN(403),
    NOT_FOUND(404),
    METHOD_NOT_ALLOWED(405),
    NOT_ACCEPTABLE(406),
    PROXY_AUTHENTICATION(407),
    REQUEST_TIMEOUT(408),
    CONFLICT(409),
    GONE(410),
    LENGTH_REQUIRED(411),
    PRECONDITION_FAILED(412),
    REQUEST_ENTITY_TOO_LARGE(413),
    REQUEST_URI_TOO_LONG(414),
    UNSUPPORTED_MEDIA_TYPE(415),
    REQUESTED_RANGE_NOT_SATISFIED(416),
    EXPECTATION_FAILED(417),
    UNPROCESSABLE_ENTITY(422),
    LOCKED(423),
    FAILED_DEPENDENCY(424),
    INTERNAL_SERVER_ERROR(500),
    NOT_IMPLEMENTED(501),
    BAD_GATEWAY(502),
    SERVICE_UNAVAILABLE(503),
    GATEWAY_TIMEOUT(504),
    INSUFFICIENT_STORAGE(506);

    private final int value;

    private Status(int value) {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     *
     * @return null if the value is not found.
     */
    public static Status findByValue(int value) {
        switch (value) {
            case 100:
                return CONT;
            case 101:
                return SWITCHING_PROTOCOLS;
            case 200:
                return OK;
            case 201:
                return CREATED;
            case 202:
                return ACCEPTED;
            case 203:
                return NON_AUTHORITATIVE_INFORMATION;
            case 204:
                return NO_CONTENT;
            case 205:
                return RESET_CONTENT;
            case 206:
                return PARTIAL_CONTENT;
            case 207:
                return MULTI_STATUS;
            case 300:
                return MULTIPLE_CHOICES;
            case 301:
                return MOVED_PERMANENTLY;
            case 302:
                return FOUND;
            case 303:
                return SEE_OTHER;
            case 304:
                return NOT_MODIFIED;
            case 305:
                return USE_PROXY;
            case 307:
                return TEMPORARY_REDIRECT;
            case 400:
                return BAD_REQUEST;
            case 401:
                return UNAUTHORIZED;
            case 402:
                return PAYMENT_REQUIRED;
            case 403:
                return FORBIDDEN;
            case 404:
                return NOT_FOUND;
            case 405:
                return METHOD_NOT_ALLOWED;
            case 406:
                return NOT_ACCEPTABLE;
            case 407:
                return PROXY_AUTHENTICATION;
            case 408:
                return REQUEST_TIMEOUT;
            case 409:
                return CONFLICT;
            case 410:
                return GONE;
            case 411:
                return LENGTH_REQUIRED;
            case 412:
                return PRECONDITION_FAILED;
            case 413:
                return REQUEST_ENTITY_TOO_LARGE;
            case 414:
                return REQUEST_URI_TOO_LONG;
            case 415:
                return UNSUPPORTED_MEDIA_TYPE;
            case 416:
                return REQUESTED_RANGE_NOT_SATISFIED;
            case 417:
                return EXPECTATION_FAILED;
            case 422:
                return UNPROCESSABLE_ENTITY;
            case 423:
                return LOCKED;
            case 424:
                return FAILED_DEPENDENCY;
            case 500:
                return INTERNAL_SERVER_ERROR;
            case 501:
                return NOT_IMPLEMENTED;
            case 502:
                return BAD_GATEWAY;
            case 503:
                return SERVICE_UNAVAILABLE;
            case 504:
                return GATEWAY_TIMEOUT;
            case 506:
                return INSUFFICIENT_STORAGE;
            default:
                return null;
        }
    }
}
