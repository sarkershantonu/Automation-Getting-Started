package org.automation.config;

/**
 * Created by SSarker on 8/5/2018.
 */
public interface HTTP_HEADERS_VALUES {
    String HSTS = "Strict-Transport-Security";

    String XXSSPROTECTION = "X-XSS-Protection";
    String XXSSPROTECTION_VALUE = "1; mode=block";
    String XFRAMEOPTIONS = "X-Frame-Options";
    String SAMEORIGIN = "SAMEORIGIN";
    String DENY = "DENY";

    String ACESSCONTROLALLOWORIGIN = "Access-Control-Allow-Origin";
    String XCONTENTTYPEOPTIONS = "X-Content-Type-Options";
    String NOSNIFF = "nosniff";
    String RC4 = "RC4";
    String DATE = "Date";
    String ECDHE_CIPHER = "ECDHE";
    String DHE_CIPHER = "DHE";
    String XSSPOLICY = "Cross-Site-Scripting";
    String SQLINJPOLICY = "sql-injection";
    String TRANSFER_ENCODING = "Transfer-Encoding";
    String TRANSFER_ENCODING_CHUNKED = "chunked";
    String CONTENT_LEN = "Content-Length";
    String CONTENT_TYPE = "Content-Type";
    String CONTENT_TYPE_VALUES = "application/json;charset=UTF-8";
    String CONTENT_ENCODING = "Content-Encoding";
    String EXPIRES = "Expires";
    String CACHECONTROL = "Cache-Control";
    String CACHECONTROL_VALUE = "no-cache, no-store, max-age=0, must-revalidate";
    String AGE = "Age";
    String CLEAR_SITE_DATA = "Clear-Site-Data";
    String PRAGMA = "Pragma";
    String WARNING = "Warning";

    String WWW_AUTHENTICATE = "WWW-Authenticate";
    String PROXY_AUTHENTICATE = "Proxy-Authenticate";
    String AUTHERIZATION = "Authorization";
    String PROXY_AUTHERIZATION = "Proxy-Authorization";
    String LAST_MODIFIED = "Last-Modified";
    String ETAG = "ETag";
    String KEEP_ALIEVE = "Keep-Alive";
    String CONNECTION = "Connection";

    String ACCEPT="Accept";
    String ACCEPT_CHARSET="Accept-Charset";
    String ACCEPT_ENCODING="Accept-Encoding";
    String ACCEPT_LANGUAGE="Accept-Language";

    String EXPECT="Expect";
    String COOKIE="Cookie";
    String COOKIE2="Cookie2";
    String SET_COOKIE="Set-Cookie";
    String SET_COOKIE2="Set-Cookie2";
}
