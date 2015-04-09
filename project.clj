(def sesame-version "2.8.0-beta2")
(def jackson-version "2.4.1")
(defproject rdfjson "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.apache.jena/apache-jena-libs "2.12.1" :extension "pom"]
                 [com.fasterxml.jackson.core/jackson-core ~jackson-version]
                 [com.fasterxml.jackson.core/jackson-databind ~jackson-version]
                 [org.openrdf.sesame/sesame-rio-rdfjson ~sesame-version]
                 [org.openrdf.sesame/sesame-rio-rdfxml ~sesame-version]
                 [org.openrdf.sesame/sesame-rio-jsonld ~sesame-version]
                 [org.openrdf.sesame/sesame-rio-turtle ~sesame-version]
                 [org.openrdf.sesame/sesame-rio-trig ~sesame-version]
                 [org.openrdf.sesame/sesame-rio-ntriples ~sesame-version]
                 ;; [org.openrdf.sesame/sesame-rio "2.7.14" :extension "pom"]
                 ])


