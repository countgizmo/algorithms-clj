(ns algorithms.warmup.staircase-test
  (:require [clojure.test :refer :all]
            [algorithms.warmup.staircase :refer :all]))

(deftest should-build-a-staircase
 (testing "Checking the example from HackerRank"
   (is (let [result (staircase 4)]
         (= "   #" (first result))
         (and (= "  ##" (second result))
           (and (= " ###" (nth result 2))
             (and (= "####" (last result)))))))))
