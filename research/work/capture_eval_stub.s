.text
.global capture
capture:
ldr x16, slotptr
stp x0,x1,[x16]
stp x2,x3,[x16,#16]
stp x4,x30,[x16,#32]
mov w17,#1
str w17,[x16,#48]
wait:
ldr w17,[x16,#48]
cbnz w17,wait
nop
nop
.balign 8
slotptr:
.quad 0
