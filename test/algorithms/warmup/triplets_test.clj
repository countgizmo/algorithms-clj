(ns algorithms.warmup.triplets-test
  (:require [clojure.test :refer :all]
            [algorithms.warmup.triplets :refer :all]))

(deftest a-is-winner
 (testing "All A numbers are bigger than B's"
   (is (= "3 0" (compare-triplets [1 2 3] [0 0 0])))))

(deftest b-is-winner
 (testing "All B numbers are bigger than A's"
   (is (= "0 3" (compare-triplets [0 0 0] [1 2 3])))))

(deftest it-is-a-tie
 (testing "The score is tie"
   (is (= "1 1" (compare-triplets [1 2 3] [3 2 1])))))
