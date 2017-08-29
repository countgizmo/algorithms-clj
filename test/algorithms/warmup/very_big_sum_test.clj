(ns algorithms.warmup.very-big-sum-test
 (:require [clojure.test :refer :all]
           [algorithms.warmup.very-big-sum :refer :all]))

(deftest valid-small-sum
 (testing "A sum of small numbers should be calculated ok"
   (is (= 10 (calculate-big-sum 4 [1 2 3 4])))))

(deftest empty-input-zero-output
 (testing "When input is empty result should be 0"
   (is (= 0 (calculate-big-sum 0 [])))))
