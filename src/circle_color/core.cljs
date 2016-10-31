(ns circle-color.core
  (:require [object-assign]
            [Circle]))

(js/console.log (js/object-assign #js {:foo 0} #js {:bar 1}))
(js/console.log (js/Circle))
