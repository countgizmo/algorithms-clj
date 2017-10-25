(ns algorithms.warmup.time-conversion
 (:require [clojure.string :as str]))

(defn extract-daytime [time-str] (subs time-str 8 10))

(defn time-str->map [time-str] (str/split time-str #"(:|PM|AM)"))

(defn deserialize-time
 [time-str]
 (let [dt (extract-daytime time-str)
       [hh mm ss] (time-str->map time-str)]
   {:hour hh :minute mm :second ss :daytime dt}))

(defn midnight?
 [time]
 (and
  (= (:hour time) "12")
  (= (:daytime time) "AM")))

(defn noon?
 [time]
 (and
  (= (:hour time) "12")
  (= (:daytime time) "PM")))

(defn convert-hour
 [hour dt]
 (let [h (Integer/parseInt hour)
       new-h (if (= dt "PM") (+ 12 h) h)]
  (str (format "%02d" new-h))))

(defn determine-hour
 [time]
 (if (midnight? time) "00"
   (if (noon? time) "12"
     (convert-hour (:hour time) (:daytime time)))))

(defn convert-time
 [time-str]
 (let [t (deserialize-time time-str)
       hour (determine-hour t)]
  (str hour ":" (:minute t) ":" (:second t))))
