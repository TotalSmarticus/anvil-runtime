(defproject anvil-runtime "latest"
  :min-lein-version "2.8.1"
  :repositories {"anvil" "file:../maven_repository"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [compojure "1.6.1"]

                 ; Everything depends on different versions of Jackson. Force this one.
                 [com.fasterxml.jackson.core/jackson-core "2.11.0"]
                 [com.fasterxml.jackson.core/jackson-databind "2.11.0"]
                 [com.fasterxml.jackson.dataformat/jackson-dataformat-cbor "2.11.0"]
                 [com.fasterxml.jackson.dataformat/jackson-dataformat-smile "2.11.0"]

                 [ring/ring-core "1.8.0"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-devel "1.8.0"]
                 [ring/ring-json "0.5.0"]
                 [ring-cors "0.1.13"]
                 [bk/ring-gzip "0.3.0"]

                 [com.cemerick/friend "0.2.3"]

                 [clojusc/friend-oauth2 "0.2.0" :exclusions [ch.qos.logback/logback-classic]]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/data.xml "0.0.8"]
                 [org.clojure/data.zip "0.1.1"]
                 [org.senatehouse/http-kit "2.5.0-httpsfix-1.1"]
                 [crypto-random "1.1.0"]
                 [clj-yaml "0.4.0"]
                 [digest "1.4.4"]

                 [org.clojure/data.codec "0.1.0"]

                 [org.clojure/java.jdbc "0.7.10"]
                 [org.postgresql/postgresql "42.2.8"]

                 [javax.mail/mail "1.4.4"]

                 [com.stripe/stripe-java "22.5.0"]

                 [org.clojure/tools.logging "0.4.1"]
                 [org.slf4j/slf4j-reload4j "1.7.36"]
                 [ch.qos.reload4j/reload4j "1.2.19" :exclusions [javax.mail/mail javax.jms/jms com.sun.jdmk/jmxtools com.sun.jmx/jmxri]]
                 [clj-logging-config "1.9.12" :exclusions [log4j]]

                 [slingshot "0.12.2"]

                 [org.clojure/core.async "1.5.648"]
                 [org.clojure/core.cache "0.8.2"]

                 [org.senatehouse/expect-call "0.3.0"]

                 [nrepl "0.8.3"]

                 [org.mindrot/jbcrypt "0.4"]
                 [com.maxmind.geoip2/geoip2 "2.9.0"]
                 [com.draines/postal "2.0.2"]

                 [com.google.guava/guava "23.6-jre"]

                 [one-time "0.7.0"]
                 [me.grison/cljwebauthn "0.1.2"]
                 [com.webauthn4j/webauthn4j-core "0.11.1.RELEASE" :exclusions [org.slf4j/slf4j-api]]

                 [org.subethamail/subethasmtp "3.1.7"]
                 [org.apache.james.jdkim/apache-jdkim "0.2" :extension "pom" :exclusions [[org.apache.geronimo.javamail/geronimo-javamail_1.4_mail]]]

                 [org.bouncycastle/bcprov-jdk15on "1.65"]
                 [buddy/buddy-core "1.6.0" :exclusions [org.bouncycastle/bcprov-jdk15on]]
                 [buddy/buddy-sign "3.1.0"]

                 [io.prometheus/simpleclient_hotspot "0.6.0"]
                 [clj-commons/iapetos "0.1.9"]
                 [net.ttddyy/datasource-proxy "1.5.1"]
                 [com.mchange/c3p0 "0.9.5.2"]

                 [malabarba/lazy-map "1.3"]

                 [com.onelogin/java-saml "2.5.0" :exclusions [org.slf4j/slf4j-api]]
                 [medley "1.4.0"]

                 [io.opentelemetry/opentelemetry-sdk]]
  :bom {:import [[io.opentelemetry/opentelemetry-bom "1.7.0"]]}

  :plugins [[lein-aot-order "0.1.0"]
            [lein-bom "0.2.0-SNAPSHOT"]]
  :aot :order
  :auto-clean false
  :omit-source true
  :profiles {:provided {:dependencies [[org.bouncycastle/bcprov-jdk15on "1.65"]]}
             :uberjar {:exclusions [org.bouncycastle/bcprov-jdk15on]}}
  )
