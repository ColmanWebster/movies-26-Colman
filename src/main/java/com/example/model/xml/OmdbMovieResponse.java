package com.example.model.xml;

// package com.example.model.xml;

import jakarta.xml.bind.annotation.*; // For JAXB
// import com.fasterxml.jackson.data.format.xml.annotation.*; // For Jackson

import java.util.List;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD) // Tells JAXB to use fields directly
public class OmdbMovieResponse {

    @XmlElement(name = "result")
    private List<MovieSearchResult> searchResults;

    @XmlAttribute(name = "totalResults")
    private int totalResults;

    @XmlAttribute(name = "response")
    private String response;

    public List<MovieSearchResult> getSearchResults() {
        return searchResults;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public String getResponse() {
        return response;
    }
}
