/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.ComplexQuadrilateral;
import org.openapitools.client.model.SimpleQuadrilateral;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Quadrilateral extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Quadrilateral.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Quadrilateral.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Quadrilateral' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ComplexQuadrilateral> adapterComplexQuadrilateral = gson.getDelegateAdapter(this, TypeToken.get(ComplexQuadrilateral.class));
            final TypeAdapter<SimpleQuadrilateral> adapterSimpleQuadrilateral = gson.getDelegateAdapter(this, TypeToken.get(SimpleQuadrilateral.class));

            return (TypeAdapter<T>) new TypeAdapter<Quadrilateral>() {
                @Override
                public void write(JsonWriter out, Quadrilateral value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ComplexQuadrilateral`
                    if (value.getActualInstance() instanceof ComplexQuadrilateral) {
                        JsonObject obj = adapterComplexQuadrilateral.toJsonTree((ComplexQuadrilateral)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                    }

                    // check if the actual instance is of the type `SimpleQuadrilateral`
                    if (value.getActualInstance() instanceof SimpleQuadrilateral) {
                        JsonObject obj = adapterSimpleQuadrilateral.toJsonTree((SimpleQuadrilateral)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                    }

                    throw new IOException("Failed to deserialize as the type doesn't match oneOf schemas: ComplexQuadrilateral, SimpleQuadrilateral");
                }

                @Override
                public Quadrilateral read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;

                    // deserialize ComplexQuadrilateral
                    try {
                        deserialized = adapterComplexQuadrilateral.fromJsonTree(jsonObject);
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ComplexQuadrilateral'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ComplexQuadrilateral'", e);
                    }

                    // deserialize SimpleQuadrilateral
                    try {
                        deserialized = adapterSimpleQuadrilateral.fromJsonTree(jsonObject);
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SimpleQuadrilateral'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'SimpleQuadrilateral'", e);
                    }

                    if (match == 1) {
                        Quadrilateral ret = new Quadrilateral();
                        ret.setActualInstance(deserialized);
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Quadrilateral: %d classes match result, expected 1", match));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public Quadrilateral() {
        super("oneOf", Boolean.FALSE);
    }

    public Quadrilateral(ComplexQuadrilateral o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Quadrilateral(SimpleQuadrilateral o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ComplexQuadrilateral", new GenericType<ComplexQuadrilateral>() {
        });
        schemas.put("SimpleQuadrilateral", new GenericType<SimpleQuadrilateral>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Quadrilateral.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ComplexQuadrilateral, SimpleQuadrilateral
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ComplexQuadrilateral) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SimpleQuadrilateral) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ComplexQuadrilateral, SimpleQuadrilateral");
    }

    /**
     * Get the actual instance, which can be the following:
     * ComplexQuadrilateral, SimpleQuadrilateral
     *
     * @return The actual instance (ComplexQuadrilateral, SimpleQuadrilateral)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ComplexQuadrilateral`. If the actual instance is not `ComplexQuadrilateral`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ComplexQuadrilateral`
     * @throws ClassCastException if the instance is not `ComplexQuadrilateral`
     */
    public ComplexQuadrilateral getComplexQuadrilateral() throws ClassCastException {
        return (ComplexQuadrilateral)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SimpleQuadrilateral`. If the actual instance is not `SimpleQuadrilateral`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SimpleQuadrilateral`
     * @throws ClassCastException if the instance is not `SimpleQuadrilateral`
     */
    public SimpleQuadrilateral getSimpleQuadrilateral() throws ClassCastException {
        return (SimpleQuadrilateral)super.getActualInstance();
    }

}

