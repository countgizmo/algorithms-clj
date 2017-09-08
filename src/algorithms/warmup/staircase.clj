(ns algorithms.warmup.staircase)

(defn step-str
 [sym len n]
 (apply str
  (apply str (repeat (- len n) " "))
  (repeat n sym)))

(defn staircase [n]
 (let [end (inc n)
       step (partial step-str "#" n)]
   (map #(step %) (range 1 end))))

(defn print-result [f arg]
 (doseq [item (f arg)]
  (println item)))
