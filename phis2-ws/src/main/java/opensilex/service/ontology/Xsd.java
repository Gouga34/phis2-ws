//******************************************************************************
//                                  Xsd.java
// SILEX-PHIS
// Copyright © INRA 2018
// Creation date: 8 Jan. 2018
// Contact: andreas.garcia@inra.fr, anne.tireau@inra.fr, pascal.neveu@inra.fr
//******************************************************************************
package opensilex.service.ontology;

/**
 * Elements of the Xsd ontology used in the ws
 * @author Andréas Garcia <andreas.garcia@inra.fr>
 */
public enum Xsd {
    NAMESPACE {
        @Override
        public String toString() {
            return "http://www.w3.org/2001/XMLSchema#";
        }
    }, 
    
    FUNCTION_DATETIME {
        @Override
        public String toString() {
            return NAMESPACE.toString() + "dateTime";
        }
    }
}