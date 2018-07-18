(ns house-of-cards.server
  (:require
    [fulcro.easy-server :refer [make-fulcro-server]]
    ; MUST require these, or you won't get them installed.
    [house-of-cards.api.read]
    [house-of-cards.api.mutations]))

(defn build-server
  [{:keys [config] :or {config "config/dev.edn"}}]
  (make-fulcro-server
    :parser-injections #{:config}
    :config-path config))



