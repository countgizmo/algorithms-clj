(ns algorithms.warmup.birthday-cake-candles)

(defn count-max
  [col num]
  (if (> num (:max col))
    (do
      (assoc col :max num :count 1))
    (if (= num (:max col))
      (update-in col [:count] inc)
      col)))

(defn calculate
  [col]
  (:count (reduce count-max {:max 0 :count 0} col)))
