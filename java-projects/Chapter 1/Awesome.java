
ODA

    Share
    File
    Edit
    Examples
    Help
    Contact Us!

Find Bytes
Address 	Section

    Disassembly
    Graph
    Hex
    Sections
    File Info

    ┏ 
V `D=W
:00407de0
7512
jne loc_00407df4 	      
      
.text
:0040803e
0000
add %al,(%eax)	      
      
.text
:00408040
0000
add %al,(%eax)	      
      
.text
:00408042
0000
add %al,(%eax)	      
      
.text
:00408044
0000
add %al,(%eax)	      
      
.text
:00408046
0000
add %al,(%eax)	      
      
.text
:00408048
42
inc %edx	      
      
.text
:00408049
2811
sub %dl,(%ecx)	      
      
.text
:0040804b
0000
add %al,(%eax)	      
      
.text
:0040804d
06
push %es	      
      
.text
:0040804e
280f
sub %cl,(%edi)	      
      
.text
:00408050
0000
add %al,(%eax)	      
      
.text
:00408052
06
push %es	      
      
.text
:00408053
2802
sub %al,(%edx)	      
      
.text
:00408055
0000
add %al,(%eax)	      
      
.text
:00408057
06
push %es	      
      
.text
:00408058
2a00
sub (%eax),%al	      
      
.text
:0040805a
0000
add %al,(%eax)	      
      
.text
:0040805c
1330
adc (%eax),%esi	      
      
.text
:0040805e
06
push %es	      
      
.text
:0040805f
00fa
add %bh,%dl	      
      
.text
:00408061
0200
add (%eax),%al	      
      
.text
:00408063
0007
add %al,(%edi)	      
      
.text
:00408065
0000
add %al,(%eax)	      
      
.text
:00408067
11d0
adc %edx,%eax	      
      
.text
:00408069
0100
add %eax,(%eax)	      
      
.text
:0040806b
0002
add %al,(%edx)	      
      
.text
:0040806d
2839
sub %bh,(%ecx)	      
      
.text
:0040806f
0000
add %al,(%eax)	      
      
.text
:00408071
0a6f3a
or 0x3a(%edi),%ch	      
      
.text
:00408074
0000
add %al,(%eax)	      
      
.text
:00408076
0a0a
or (%edx),%cl	      
      
.text
:00408078
06
push %es	      
      
.text
:00408079
6f
outsl %ds:(%esi),(%dx)	      
      
.text
:0040807a
3c00
cmp $0x0,%al	      
      
.text
:0040807c
000a
add %cl,(%edx)	      
      
.text
:0040807e
0b07
or (%edi),%eax	      
      
.text
:00408080
6f
outsl %ds:(%esi),(%dx)	      
      
.text
:00408081
40
inc %eax	      
      
.text
:00408082
0000
add %al,(%eax)	      
      
.text
:00408084
0a16
or (%esi),%dl	      
      
.text
:00408086
310d07166f3d
xor %ecx,0x3d6f1607	      
      
.text
:0040808c
0000
add %al,(%eax)	      
      
.text
:0040808e
0a1f
or (%edi),%bl	      
      
.text
:00408090
3cfe
cmp $0xfe,%al	      
      
.text
:00408092
012b
add %ebp,(%ebx)	      
      
.text
:00408094
0116
add %edx,(%esi)	      
      
.text
:00408096
0c06
or $0x6,%al	      
      
.text
:00408098
283b
sub %bh,(%ebx)	      
      
.text
:0040809a
0000
add %al,(%eax)	      
      
.text
:0040809c
0a28
or (%eax),%ch	      
      
.text
:0040809e
2d00000a0d
sub $0xd0a0000,%eax	      
    ┃ 
.text
:004080a3
0909
or %ecx,(%ecx)	      
    ┃ 
.text
:004080a5
1f
pop %ds	      
    ┃ 
.text
:004080a6
3cd3
cmp $0xd3,%al	      
    ┃ 
.text
:004080a8
58
pop %eax	      
    ┃ 
.text
:004080a9
4b
dec %ebx	      
    ┃ 
.text
:004080aa
58
pop %eax	      
    ┃ 
.text
:004080ab
130411
adc (%ecx,%edx,1),%eax	      
    ┃ 
.text
:004080ae
041c
add $0x1c,%al	      
    ┃ 
.text
:004080b0
d35849
rcrl %cl,0x49(%eax)	      
    ┃ 
.text
:004080b3
130511041f14
adc 0x141f0411,%eax	      
    ┃ 
.text
:004080b9
d35849
rcrl %cl,0x49(%eax)	      
    ┃ 
.text
:004080bc
1306
adc (%esi),%eax	      
    ┃ 
.text
:004080be
16
push %ss	      
    ┃ 
.text
:004080bf
e013
loopne 0x004080d4	      
    ┃ 
.text
:004080c1
07
pop %es	      
    ┃ 
.text
:004080c2
16
push %ss	      
    ┃ 
.text
:004080c3
1308
adc (%eax),%ecx	      
    ┃ 
.text
:004080c5
11041f
adc %eax,(%edi,%ebx,1)	      
    ┃ 
.text
:004080c8
18d3
sbb %dl,%bl	      
    ┃ 
.text
:004080ca
58
pop %eax	      
    ┃ 
.text
:004080cb
1106
adc %eax,(%esi)	      
    ┃ 
.text
:004080cd
58
pop %eax	      
    ┃ 
.text
:004080ce
1309
adc (%ecx),%ecx	      
    ┃ 
.text
:004080d0
2000
and %al,(%eax)	      
    ┃ 
.text
:004080d2
9b
fwait	      
    ┃ 
.text
:004080d3
43
inc %ebx	      
    ┃ 
.text
:004080d4
2813
sub %dl,(%ebx)	      
    ┃ 
.text
:004080d6
0a20
or (%eax),%ah	      
    ┃ 
.text
:004080d8
0e
push %cs	      
    ┃ 
.text
:004080d9
34ae
xor $0xae,%al	      
    ┃ 
.text
:004080db
35130b2097
xor $0x97200b13,%eax	      
    ┃ 
.text
:004080e0
dbbbc6130c20
fstpt 0x200c13c6(%ebx)	      
    ┗ 
.text
:004080e6
75b9
jne loc_004080a1 	      
      
.text
:004080e8
d5ca
aad $0xca	      
      
.text
:004080ea
130d16130e38
adc 0x380e1316,%ecx	      
      
.text
:004080f0
b200
mov $0x0,%dl	      
      
.text
:004080f2
0000
add %al,(%eax)	      
      
.text
:004080f4
1109
adc %ecx,(%ecx)	      
      
.text
:004080f6
251ad35813
and $0x1358d31a,%eax	      
      
.text
:004080fb
094b11
or %ecx,0x11(%ebx)	      
      
.text
:004080fe
09251ad35813
or %esp,0x1358d31a	      
      
.text
:00408104
094b5a
or %ecx,0x5a(%ebx)	      
      
.text
:00408107
130f
adc (%edi),%ecx	      
      
.text
:00408109
110f
adc %ecx,(%edi)	      
      
.text
:0040810b
204038
and %al,0x38(%eax)	      
      
.text
:0040810e
f5
cmc 	      
      
.text
:0040810f
a3332a0908
mov %eax,0x8092a33	      
      
.text
:00408114
2d0811091a
sub $0x1a091108,%eax	      
      
.text
:00408119
d3584b
rcrl %cl,0x4b(%eax)	      
      
.text
:0040811c
2b07
sub (%edi),%eax	      
      
.text
:0040811e
1109
adc %ecx,(%ecx)	      
      
.text
:00408120
1f
pop %ds	      
      
.text
:00408121
0cd3
or $0xd3,%al	      
      
.text
:00408123
58
pop %eax	      
      
.text
:00408124
4b
dec %ebx	      
      
.text
:00408125
58
pop %eax	      
      
.text
:00408126
1307
adc (%edi),%eax	      
      
.text
:00408128
082d0511094b
or %ch,0x4b091105	      
      
.text
:0040812e
2b06
sub (%esi),%eax	      
      
.text
:00408130
1109
adc %ecx,(%ecx)	      
      
.text
:00408132
1e
push %ds	      
      
.text
:00408133
d3584b
rcrl %cl,0x4b(%eax)	      
      
.text
:00408136
18641308
sbb %ah,0x8(%ebx,%edx,1)	      
      
.text
:0040813a
2b5c110f
sub 0xf(%ecx,%edx,1),%ebx	      
      
.text
:0040813e
2c58
sub $0x58,%al	      
      
.text
:00408140
0908
or %ecx,(%eax)	      
      
.text
:00408142
2d0811091a
sub $0x1a091108,%eax	      
      
.text
:00408147
d3584b
rcrl %cl,0x4b(%eax)	      
      
.text
:0040814a
2b07
sub (%edi),%eax	      
      
.text
:0040814c
1109
adc %ecx,(%ecx)	      
      
.text
:0040814e
1f
pop %ds	      
      
.text
:0040814f
0cd3
or $0xd3,%al	      
      
.text
:00408151
58
pop %eax	      
      
.text
:00408152
4b
dec %ebx	      
      
.text
:00408153
58
pop %eax	      
      
.text
:00408154
1310
adc (%eax),%edx	      
      
.text
:00408156
1109
adc %ecx,(%ecx)	      
      
.text
:00408158
1e
push %ds	      
      
.text
:00408159
d3584b
rcrl %cl,0x4b(%eax)	      
      
.text
:0040815c
18641311
sbb %ah,0x11(%ebx,%edx,1)	      
      
.text
:00408160
16
push %ss	      
      
.text
:00408161
1312
adc (%edx),%edx	      
      
.text
:00408163
2b2d110a1110
sub 0x10110a11,%ebp	      
      
.text
:00408169
251ad35813
and $0x1358d31a,%eax	      
      
.text
:0040816e
104b61
adc %cl,0x61(%ebx)	      
      
.text
:00408171
110b
adc %ecx,(%ebx)	      
      
.text
:00408173
58
pop %eax	      
      
.text
:00408174
110c11
adc %ecx,(%ecx,%edx,1)	      
      
.text
:00408177
0d5a581313
or $0x1313585a,%eax	      
      
.text
:0040817c
110b
adc %ecx,(%ebx)	      
      
.text
:0040817e
130a
adc (%edx),%ecx	      
      
.text
:00408180
110c13
adc %ecx,(%ebx,%edx,1)	      
      
.text
:00408183
0b11
or (%ecx),%edx	      
      
.text
:00408185
0d130b1113
or $0x13110b13,%eax	      
      
.text
:0040818a
130d11121758
adc 0x58171211,%ecx	      
      
.text
:00408190
1312
adc (%edx),%edx	      
      
.text
:00408192
1112
adc %edx,(%edx)	      
      
.text
:00408194
1111
adc %edx,(%ecx)	      
      
.text
:00408196
37
aaa 	      
      
.text
:00408197
cd11
int $0x11	      
      
.text
:00408199
091f
or %ebx,(%edi)	      
      
.text
:0040819b
20d3
and %dl,%bl	      
      
.text
:0040819d
58
pop %eax	      

