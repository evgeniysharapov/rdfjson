# rdfjson

Conversion  between various RDF formats using Clojure and Sesame (former RDF4J)

## Usage

Typically one would call this 


    (use 'rdfjson.core)
    (convert-rdf-to-json "resources/wine.rdf" "resources/wine.json" "RDF/JSON")


to convert file from RDF XML into RDF JSON format.

Other format strings are available: 

* RDFa
* JSON-LD
* N-Quads
* TriG
* TriX
* N3
* Turtle
* N-Triples
* BinaryRDF
* RDF/XML 

Copyright (c) 2015 Evgeniy Sharapov

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
