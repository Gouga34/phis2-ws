//******************************************************************************
//                              ConcernItemDTO.java 
// SILEX-PHIS
// Copyright © INRA 2017
// Creation date: March 2017
// Contact: arnaud.charleroy@inra.fr, morgane.vidal@inra.fr, anne.tireau@inra.fr, 
//          pascal.neveu@inra.fr
//******************************************************************************
package opensilex.service.resources.dto;

import io.swagger.annotations.ApiModelProperty;
import opensilex.service.documentation.DocumentationAnnotation;
import opensilex.service.resources.validation.interfaces.Required;
import opensilex.service.resources.dto.manager.AbstractVerifiedClass;
import opensilex.service.model.ConcernedItem;
import opensilex.service.resources.validation.interfaces.URL;

/**
 * Corresponds to the submitted JSON for the objects concerned (by an annotation for example)
 * @author Morgane Vidal <morgane.vidal@inra.fr>
 */
public class ConcernedItemDTO extends AbstractVerifiedClass {
    protected String uri;
    protected String typeURI;

    @Override
    public ConcernedItem createObjectFromDTO() {
        ConcernedItem concernedItem = new ConcernedItem();
        concernedItem.setRdfType(typeURI);
        concernedItem.setUri(uri);
        
        return concernedItem;
    }
    
    @URL
    @Required
    @ApiModelProperty(example = DocumentationAnnotation.EXAMPLE_EXPERIMENT_URI)
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @URL
    @Required
    @ApiModelProperty(example = DocumentationAnnotation.EXAMPLE_DOCUMENT_CONCERNED_ITEM_TYPE_URI)
    public String getTypeURI() {
        return typeURI;
    }

    public void setTypeURI(String typeURI) {
        this.typeURI = typeURI;
    }
}
