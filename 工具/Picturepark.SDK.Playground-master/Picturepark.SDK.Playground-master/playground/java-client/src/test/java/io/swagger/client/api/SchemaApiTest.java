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
import io.swagger.client.model.BusinessProcess;
import io.swagger.client.model.ExistsResponse;
import io.swagger.client.model.PictureparkException;
import io.swagger.client.model.SchemaCreateRequest;
import io.swagger.client.model.SchemaDetail;
import io.swagger.client.model.SchemaSearchRequest;
import io.swagger.client.model.SchemaSearchResult;
import io.swagger.client.model.SchemaUpdateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchemaApi
 */
@Ignore
public class SchemaApiTest {

    private final SchemaApi api = new SchemaApi();

    
    /**
     * Create Single
     *
     * The creation of a single schema is executed asynchronous. To keep track of the creation progress a business process is returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schemaCreateTest() throws ApiException {
        SchemaCreateRequest schema = null;
        BusinessProcess response = api.schemaCreate(schema);

        // TODO: test validations
    }
    
    /**
     * Delete Single
     *
     * The deletion of a single schema is executed asynchronous. To keep track of the deletion progress a business process is returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schemaDeleteTest() throws ApiException {
        String schemaId = null;
        BusinessProcess response = api.schemaDelete(schemaId);

        // TODO: test validations
    }
    
    /**
     * Exists
     *
     * Checks if the schema or optionally the schema&#39;s field already exists.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schemaExistsTest() throws ApiException {
        String schemaId = null;
        String fieldId = null;
        ExistsResponse response = api.schemaExists(schemaId, fieldId);

        // TODO: test validations
    }
    
    /**
     * Get Single
     *
     * Gets the schema detail information by the schema id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schemaGetTest() throws ApiException {
        String schemaId = null;
        SchemaDetail response = api.schemaGet(schemaId);

        // TODO: test validations
    }
    
    /**
     * Get Many
     *
     * Gets the schema detail informations by given schema ids.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schemaGetAllTest() throws ApiException {
        List<String> ids = null;
        List<SchemaDetail> response = api.schemaGetAll(ids);

        // TODO: test validations
    }
    
    /**
     * Search
     *
     * Searches schemas as specified in the search request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schemaSearchTest() throws ApiException {
        SchemaSearchRequest schemaSearchRequest = null;
        SchemaSearchResult response = api.schemaSearch(schemaSearchRequest);

        // TODO: test validations
    }
    
    /**
     * Update Single
     *
     * The update of a single schema is executed asynchronous. To keep track of the update progress a business process is returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void schemaUpdateTest() throws ApiException {
        String schemaId = null;
        SchemaUpdateRequest schema = null;
        BusinessProcess response = api.schemaUpdate(schemaId, schema);

        // TODO: test validations
    }
    
}
