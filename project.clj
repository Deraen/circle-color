(defproject circle-color "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.295" :exclusions [org.clojure/data.json]]
                 [com.google.javascript/closure-compiler-unshaded "1.0-SNAPSHOT"]
                 [org.clojure/data.json "0.2.6" :classifier "aot"]
                 [cljsjs.npm/object-assign "4.1.0"]
                 [cljsjs.npm/react "15.3.2" :exclusions [#_cljsjs.npm/core-js]]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target")
