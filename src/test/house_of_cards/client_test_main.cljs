(ns house-of-cards.client-test-main
  (:require house-of-cards.tests-to-run
            [fulcro-spec.selectors :as sel]
            [fulcro-spec.suite :as suite]))

(enable-console-print!)

(suite/def-test-suite client-tests {:ns-regex #"house-of-cards..*-spec"}
  {:default   #{::sel/none :focused}
   :available #{:focused}})

