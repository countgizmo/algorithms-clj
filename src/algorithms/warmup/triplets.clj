(ns algorithms.warmup.triplets)

(defn face-of [a b]
 (map #(- %1 %2) a b))

(defn calc [r d]
  (reduce
   #(if (< 0 %2) (update-in %1 [:a] inc)
      (if (> 0 %2) (update-in %1 [:b] inc)
        %1))
    r d))

(defn prn-result [m]
 (str (:a m) " " (:b m)))

(defn compare-triplets
 [a b]
 (let [s (face-of a b)]
   (prn-result (calc {:a 0 :b 0} s))))
