
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.intalio.innovelocity.ldaphelper;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://innovelocity.intalio.com/LdapHelper/".equals(namespaceURI) &&
                  "OperationAction".equals(typeName)){
                   
                            return  com.intalio.innovelocity.ldaphelper.OperationAction.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://innovelocity.intalio.com/LdapHelper/".equals(namespaceURI) &&
                  "Item".equals(typeName)){
                   
                            return  com.intalio.innovelocity.ldaphelper.Item.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://innovelocity.intalio.com/LdapHelper/".equals(namespaceURI) &&
                  "Operation".equals(typeName)){
                   
                            return  com.intalio.innovelocity.ldaphelper.Operation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://innovelocity.intalio.com/LdapHelper/".equals(namespaceURI) &&
                  "Data".equals(typeName)){
                   
                            return  com.intalio.innovelocity.ldaphelper.Data.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    