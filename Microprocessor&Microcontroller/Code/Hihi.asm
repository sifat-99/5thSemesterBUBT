
.MODEL SMALL
.STACK 100H
.DATA  
       MESSAGE DB  "Hello world$"
.CODE
MAIN PROC
    
    MOV AX,@DATA
    MOV DS,AX
    
    MOV AH,9
    LEA DX,MESSAGE
    INT 21H
    
    MAIN ENDP
END MAIN
    

