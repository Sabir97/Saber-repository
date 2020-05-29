(print "HelloWorld")
(setq x 3)
(setf (* 3 2))
(defun add-four (x) (+ x 4))
(add-four 5) -> 9
--------------------------------
(defun factoriel(n) "calculer le factoriel de N :" 
    (if(= n 1) 1 (* n (factoriel(- n 1)))))

(defun sum(x y) (+ x y))

--------------------------------
reverse list :

(defun rev (l)
  (cond
    ((null l) '())
    (T (append (rev (cdr l)) (list (car l)))))) 

append list : 

(defun append2 (l1 l2)
  (if (null l1)
      l2
      (cons (first l1)
            (append (rest l1)
                    l2))))
------------------------------------
decimal to binary :

(defun binary-list (n)
  (cond ((= n 0) (list 0))
        ((= n 1) (list 1))
        (t (nconc (binary-list (truncate n 2)) (list (mod n 2))))))

(defun binary-list2 (n)
  (cond ((= n 0) (list 0))
        ((= n 1) (list 1))
        (t (rev (append2  (list (mod n 2)) (binary-list (truncate n 2)))))))


(DEFUN DEC-BIN(N)
(IF (> N 0)
(APPEND (DEC-BIN (/ N 2))(APPEND (REM N 2) NIL))
NIL))