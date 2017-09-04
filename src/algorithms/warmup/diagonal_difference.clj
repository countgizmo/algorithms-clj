(ns algorithms.warmup.diagonal-difference)

(defn calculate [c]
  (let [len (count c)]
    (loop [d1 0 d2 0 step 0]
     (if (= step len)
       (Math/abs (- d1 d2))
       (recur (+ d1 (nth (nth c step) step))
              (+ d2 (nth (nth c step) (- (dec len) step)))
              (inc step))))))
