.MODEL SMALL
.STACK 100H
.DATA
.CODE

MAIN PROC  
    
    MOV BH,5
    
    CMP BH,0  
    JG POSITIVE 
    JL NEGATIVE  
    JE ZERO      
    
    POSITIVE:
    MOV AH,2
    MOV DL,'P'                     
    INT 21H 
    JMP EXIT
    
    NEGATIVE:
    MOV AH,2
    MOV DL,'N'
    INT 21H 
    JMP EXIT            
    
    ZERO:
    MOV AH,2
    MOV DL,'0'
    INT 21H  
    
    EXIT:
    
    MAIN ENDP
END MAIN