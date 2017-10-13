(ns algorithms.warmup.min-max-sum-test
  (:require [clojure.test :refer :all]
            [algorithms.warmup.min-max-sum :refer :all]))

(deftest example-from-hackerrank
 (testing "Our algorithm works according to HackerRank"
   (is (= [10 14] (calculate [1 2 3 4 5])))))


(deftest example-alternative
 (testing "Our algorithm works according to my brain"
   (is (= [16 23] (calculate [5 3 7 1 8])))))
