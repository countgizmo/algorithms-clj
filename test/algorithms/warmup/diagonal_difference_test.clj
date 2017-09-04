(ns algorithms.warmup.diagonal-difference-test
  (:require [algorithms.warmup.diagonal-difference :refer :all]
            [clojure.test :refer :all]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check :as tc]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]))

(deftest empty-input-returns-zero
 (testing "When input is empty the result should be 0"
   (is (= 0 (calculate '())))))

(deftest simple-sum-example
 (testing "Checking that the calculation is correct"
   (is (= 15 (calculate '((11 2 4) (4 5 6) (10 8 -12)))))))

(defspec positive-response
 100
 (prop/for-all [v (gen/vector (gen/vector gen/nat 3) 3)]
               (is (> (calculate v) -1))))
