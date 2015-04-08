(ns rdfjson.core
  (:import (org.openrdf.rio Rio
                            RDFFormat)
           (org.openrdf.rio.turtle TurtleWriter)
           (java.io File)))

(defn convert-rdf-to-json
  [input output format]
  (let [parser (Rio/createParser RDFFormat/RDFXML)
        rdffile (File. input)]
    (with-open [r (clojure.java.io/reader rdffile)
                w (clojure.java.io/writer output)]
      (let [outwriter  (Rio/createWriter (RDFFormat/valueOf format) w)]
        (.setRDFHandler parser outwriter)
        (.parse parser r (.toString  (.toURI rdffile)))))))


