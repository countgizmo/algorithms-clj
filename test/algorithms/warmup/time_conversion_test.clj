(ns algorithms.warmup.time-conversion-test
  (:require [clojure.test :refer :all]
            [algorithms.warmup.time-conversion :refer :all]))

(deftest example-from-hackerrank-1
 (testing "Algorithm works according to HackerRank test 1"
   (is (= "19:05:45" (convert-time "07:05:45PM")))))

(deftest example-from-hackerrank-2
 (testing "Algorithm works according to HackerRank test 2"
   (is (= "06:40:03" (convert-time "06:40:03AM")))))

(deftest midnight-is-zero
 (testing "Midnight should be 00 hours"
   (is (= "00:00:00" (convert-time "12:00:00AM")))))

(deftest noon-is-noon
 (testing "Noon should be the same in both versions"
   (is (= "12:00:00" (convert-time "12:00:00PM")))))
