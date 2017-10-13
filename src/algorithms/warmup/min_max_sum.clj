(ns algorithms.warmup.min-max-sum
 (:require [proto-repl.saved-values]))

(def LIMIT 5)

(defn candidates [col ignore-ind]
  (concat
   (take ignore-ind col)
   (nthrest col (inc ignore-ind))))

(defn sum-ignore [col ignore]
 (reduce + (candidates col ignore)))

(defn min-max
  [col]
  [(apply min col)
   (apply max col)])

(defn add-sum
 [col ind acc]
 (conj acc (sum-ignore col ind)))

(defn calculate [col]
 (loop [ind 0
        acc []]
  (if (= ind LIMIT)
   (min-max acc)
   (recur (inc ind) (add-sum col ind acc)))))
