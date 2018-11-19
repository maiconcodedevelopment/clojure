(ns appclojur.core
  (:gen-class))

(def life 6)
(defn notstart [] (print "Not Start up !") )
(defn start [] (print "Start up Parou"))

(defn letters-missing [words hits]
  (remove (fn [letters] (contains? hits (str letters) ) ) words )
)

(defn hits-words? [words hits] 
   (empty? (letters-missing words hits))
)

(defn le-letters! )

(defn startApp [lifes words hits]
    (if (= lifes 0)
       (notstart)
       (if  (hits-words? words hits)
           (start)

       )
    )
)

(defn -main
    ""
    [& args]
    (print "Start App."))