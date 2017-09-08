(ns algorithms.warmup.plus-minus)

(defn format-fraction [fraction]
 (format "%.6f" (float fraction)))

(defn count-nums [v]
  (reduce
   #(if (< 0 %2) (update-in %1 [0] inc)
      (if (> 0 %2) (update-in %1 [1] inc)
        (if (zero? %2) (update-in %1 [2] inc)
          %1)))
   [0 0 0]
   v))

(defn calculate-fractions [v]
 (let [len (count v)
       nums (count-nums v)]
  (map #(format-fraction (/ % len)) nums)))
