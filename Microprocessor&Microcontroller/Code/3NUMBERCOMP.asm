.MODEL SMALL
.STACK 100H
.DATA  
   INPUT1 DB "Enter 1st number:$" 
   INPUT2 DB "Enter 2nd number:$"    
   INPUT3 DB "Enter 3rd number:$"
.CODE    

MAIN PROC
    MOV AX,@DATA
    MOV DS,AX     
    
    MOV AH,9
    LEA DX,INPUT1
    INT 21H   
    
    MOV AH,1
    INT 21H
    
    MOV BL,AL
     
    MOV AH,2
    MOV DL,13
    INT 21H
    MOV DL,10
    INT 21H 
     
    MOV AH,9
    LEA DX,INPUT2
    INT 21H   
    
    MOV AH,1
    INT 21H   
    
    MOV CL,AL 
              
              
      MOV AH,2
    MOV DL,13
    INT 21H
    MOV DL,10
    INT 21H          
    MOV AH,9
    LEA DX,INPUT3
    INT 21H 
   
    
    MOV AH,1
    INT 21H    
           
    
    
    MOV BH,AL
    CMP BL,CL                      
    JL  LABEL1                     
    JMP LABEL3
    LABEL1: CMP BL,BH
    JL LABEL2  
    JMP LABEL5 
    JMP EXIT 
    
    
    
    LABEL2: 
    MOV AH,2
    MOV DL,BL
    INT 21H
    JMP EXIT  
    
    LABEL3: CMP CL,BH
    JL LABEL4
    JMP LABEL5
    
    LABEL4: 
    MOV AH,2
    MOV DL,CL
    INT 21H 
    JMP EXIT
    
    LABEL5:
    MOV AH,2
    MOV DL,BH
    INT 21H
    
    EXIT:
    
    MAIN ENDP
        END MAIN