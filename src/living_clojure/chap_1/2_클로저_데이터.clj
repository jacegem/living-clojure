(ns living-clojure.chap-1.2-클로저-데이터)

'(1 2 "jam" :marmalade-jar)
;=> (1 2 "jam" :marmalade-jar)

'(1, 2, "jam", :bee)
;=> (1 2 "jam" :bee)

(first '(:rabbit :pocket-watch :marmalade :door))
;=> rabbit

(rest '(:rabbit :pocket-watch :marmalade :door))
;=> (:pocket-watch :marmalade :door)

(first
 (rest '(:rabbit :pocket-watch :marmalade :door)))
;=> :pocket-watch

(first
 (rest (rest (rest '(:rabbit :pocket-watch :marmalade :door)))))
;=> :door

(first
 (rest (rest (rest (rest (rest '(:rabbit :pocket-watch :marmalade :door)))))))
;=> nil

(cons 5 '())
;=> (5)

;; nil로 리스트 만들기
(cons 5 nil)
;=> (5)

(cons 3 (cons 4 (cons 5 nil)))
;=> (3 4 5)

(cons 2
      (cons 3 (cons 4 (cons 5 nil))))
;=> (2 3 4 5)

'(1 2 3 4 5)
;=> (1 2 3 4 5)


