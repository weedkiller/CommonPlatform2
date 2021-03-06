/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DocumentHistory;
import io.swagger.client.model.DocumentHistoryDifference;
import io.swagger.client.model.DocumentHistorySearchRequest;
import io.swagger.client.model.DocumentHistorySearchResult;
import io.swagger.client.model.PictureparkException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentHistoryApi
 */
@Ignore
public class DocumentHistoryApiTest {

    private final DocumentHistoryApi api = new DocumentHistoryApi();

    
    /**
     * Gets a document history
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void documentHistoryGetTest() throws ApiException {
        String id = null;
        DocumentHistory response = api.documentHistoryGet(id);

        // TODO: test validations
    }
    
    /**
     * Get the difference between tho document history
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void documentHistoryGetDifferenceTest() throws ApiException {
        String id = null;
        Long oldVersion = null;
        Long newVersion = null;
        DocumentHistoryDifference response = api.documentHistoryGetDifference(id, oldVersion, newVersion);

        // TODO: test validations
    }
    
    /**
     * Get latest difference of document history
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void documentHistoryGetDifferenceLatestTest() throws ApiException {
        String id = null;
        Long oldVersion = null;
        DocumentHistoryDifference response = api.documentHistoryGetDifferenceLatest(id, oldVersion);

        // TODO: test validations
    }
    
    /**
     * Get document history version
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void documentHistoryGetVersionTest() throws ApiException {
        String id = null;
        String version = null;
        DocumentHistory response = api.documentHistoryGetVersion(id, version);

        // TODO: test validations
    }
    
    /**
     * Search for document history
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void documentHistorySearchTest() throws ApiException {
        DocumentHistorySearchRequest documentHistorySearchRequest = null;
        DocumentHistorySearchResult response = api.documentHistorySearch(documentHistorySearchRequest);

        // TODO: test validations
    }
    
}
