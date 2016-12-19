/**
 * GetUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.javaguys.webservices.getUserServices;

public class GetUserResponse  implements java.io.Serializable {
    private com.blog.javaguys.user.User userDetails;

    public GetUserResponse() {
    }

    public GetUserResponse(
           com.blog.javaguys.user.User userDetails) {
           this.userDetails = userDetails;
    }


    /**
     * Gets the userDetails value for this GetUserResponse.
     * 
     * @return userDetails
     */
    public com.blog.javaguys.user.User getUserDetails() {
        return userDetails;
    }


    /**
     * Sets the userDetails value for this GetUserResponse.
     * 
     * @param userDetails
     */
    public void setUserDetails(com.blog.javaguys.user.User userDetails) {
        this.userDetails = userDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserResponse)) return false;
        GetUserResponse other = (GetUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userDetails==null && other.getUserDetails()==null) || 
             (this.userDetails!=null &&
              this.userDetails.equals(other.getUserDetails())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUserDetails() != null) {
            _hashCode += getUserDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com/javaguys/webservices/getUserServices", ">GetUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com/javaguys/webservices/getUserServices", "userDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://user.javaguys.blog.com", "User"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
