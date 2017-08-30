(ns algorithms.warmup.very-big-sum-test
 (:require [clojure.test :refer :all]
           [algorithms.warmup.very-big-sum :refer :all]
           [clojure.test.check.clojure-test :refer [defspec]]
           [clojure.test.check :as tc]
           [clojure.test.check.generators :as gen]
           [clojure.test.check.properties :as prop]))

(deftest valid-small-sum
 (testing "A sum of small numbers should be calculated ok"
   (is (= 10 (calculate-big-sum [1 2 3 4])))))

(deftest empty-input-zero-output
 (testing "When input is empty result should be 0"
   (is (= 0 (calculate-big-sum [])))))

(defspec should-be-able-to-combine-big-nums
 100
 (prop/for-all [v (gen/not-empty (gen/vector (gen/large-integer* {:min 1000000001, :max 1000000006})))]
               (is (> (calculate-big-sum v) 0))))
