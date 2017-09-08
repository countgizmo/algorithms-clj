(ns algorithms.warmup.plus-minus-test
  (:require [clojure.test :refer :all]
            [algorithms.warmup.plus-minus :refer :all]))

(deftest checking-valid-example
 (testing "An example from HackerRank"
   (is
    (=
     '("0.500000" "0.333333" "0.166667")
     (calculate-fractions [-4 3 -9 0 4 1])))))
