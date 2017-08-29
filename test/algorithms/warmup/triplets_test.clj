(ns algorithms.warmup.triplets-test
  (:require [clojure.test :refer :all]
            [algorithms.warmup.triplets :refer :all]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check :as tc]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]))

(deftest a-is-winner
 (testing "All A numbers are bigger than B's"
   (is (= "3 0" (compare-triplets [1 2 3] [0 0 0])))))

(deftest b-is-winner
 (testing "All B numbers are bigger than A's"
   (is (= "0 3" (compare-triplets [0 0 0] [1 2 3])))))

(deftest it-is-a-tie
 (testing "The score is tie"
   (is (= "1 1" (compare-triplets [1 2 3] [3 2 1])))))

(defspec expect-to-get-not-empty-string
  100
  (prop/for-all [a (gen/not-empty (gen/vector gen/nat 3))
                 b (gen/not-empty (gen/vector gen/nat 3))]
    (do (is (string? (compare-triplets a b)))
        (is (not (empty? (compare-triplets a b)))))))
