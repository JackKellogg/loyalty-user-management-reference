/*
 * User Account Management
 * API interface to enroll users and accounts
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: Loyalty_Technology_Solutions_Scrum_Vulcans@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mastercard_loyalty_enrollment_client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * List object containing type of errors
 */
@ApiModel(description = "List object containing type of errors")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-11T17:56:47.857+05:30[Asia/Kolkata]")
public class ErrorList {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private List<Error> error = new ArrayList<Error>();


  public ErrorList error(List<Error> error) {
    
    this.error = error;
    return this;
  }

  public ErrorList addErrorItem(Error errorItem) {
    this.error.add(errorItem);
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Error> getError() {
    return error;
  }


  public void setError(List<Error> error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorList errorList = (ErrorList) o;
    return Objects.equals(this.error, errorList.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorList {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

