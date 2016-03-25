(ns reload-ns.core)

(defmacro reload-ns [name & references]
  (let [path (-> name
                 (clojure.string/replace #"\." "/")
                 (clojure.string/replace #"-" "_"))]
    `(do
       (doseq [s# (keys (ns-interns (quote ~name)))] (ns-unmap (quote ~name) s#))
       (load ~path)
       (ns ~name ~@references))))
