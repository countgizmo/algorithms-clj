(ns algorithms.warmup.birthday-cake-candles-test
  (:require [clojure.test :refer :all]
            [algorithms.warmup.birthday-cake-candles :refer :all]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check :as tc]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]))

(deftest example-from-hackerrank
 (testing "Our algorithm works according to HackerRank"
   (is (= 2 (calculate [3 2 1 3])))))

(deftest should-return-0-when-empty-input
 (testing "When there is nothing to calculate return 0"
   (is (= 0 (calculate [])))))

(defspec positive-response
 100
 (prop/for-all [v (gen/vector gen/nat 5)]
               (is (> (calculate v) -1))))
