; Observed generated ARM64 instructions. Addresses apply to this process only.

; shared dispatcher
0x79cc4e34f000: sub sp, sp, #0x10
0x79cc4e34f004: stp q30, q31, [sp, #-0x20]!
0x79cc4e34f008: stp q28, q29, [sp, #-0x20]!
0x79cc4e34f00c: stp q26, q27, [sp, #-0x20]!
0x79cc4e34f010: stp q24, q25, [sp, #-0x20]!
0x79cc4e34f014: stp q22, q23, [sp, #-0x20]!
0x79cc4e34f018: stp q20, q21, [sp, #-0x20]!
0x79cc4e34f01c: stp q18, q19, [sp, #-0x20]!
0x79cc4e34f020: stp q16, q17, [sp, #-0x20]!
0x79cc4e34f024: stp q14, q15, [sp, #-0x20]!
0x79cc4e34f028: stp q12, q13, [sp, #-0x20]!
0x79cc4e34f02c: stp q10, q11, [sp, #-0x20]!
0x79cc4e34f030: stp q8, q9, [sp, #-0x20]!
0x79cc4e34f034: stp q6, q7, [sp, #-0x20]!
0x79cc4e34f038: stp q4, q5, [sp, #-0x20]!
0x79cc4e34f03c: stp q2, q3, [sp, #-0x20]!
0x79cc4e34f040: stp q0, q1, [sp, #-0x20]!
0x79cc4e34f044: stp x29, x30, [sp, #-0x10]!
0x79cc4e34f048: stp x27, x28, [sp, #-0x10]!
0x79cc4e34f04c: stp x25, x26, [sp, #-0x10]!
0x79cc4e34f050: stp x23, x24, [sp, #-0x10]!
0x79cc4e34f054: stp x21, x22, [sp, #-0x10]!
0x79cc4e34f058: stp x19, x20, [sp, #-0x10]!
0x79cc4e34f05c: stp x17, x18, [sp, #-0x10]!
0x79cc4e34f060: stp x15, x16, [sp, #-0x10]!
0x79cc4e34f064: stp x13, x14, [sp, #-0x10]!
0x79cc4e34f068: stp x11, x12, [sp, #-0x10]!
0x79cc4e34f06c: stp x9, x10, [sp, #-0x10]!
0x79cc4e34f070: stp x7, x8, [sp, #-0x10]!
0x79cc4e34f074: stp x5, x6, [sp, #-0x10]!
0x79cc4e34f078: stp x3, x4, [sp, #-0x10]!
0x79cc4e34f07c: stp x1, x2, [sp, #-0x10]!
0x79cc4e34f080: mrs x1, nzcv
0x79cc4e34f084: stp x1, x0, [sp, #-0x10]!
0x79cc4e34f088: add x0, sp, #0x310
0x79cc4e34f08c: stp xzr, x0, [sp, #-0x10]!
0x79cc4e34f090: str x30, [sp, #0x318]
0x79cc4e34f094: str x29, [sp, #0x310]
0x79cc4e34f098: add x29, sp, #0x310
0x79cc4e34f09c: mov x1, sp
0x79cc4e34f0a0: add x2, sp, #0x108
0x79cc4e34f0a4: add x3, sp, #0x310
0x79cc4e34f0a8: mov x0, x17
0x79cc4e34f0ac: ldr x4, #0x79cc4e34f144
0x79cc4e34f0b0: blr x4
0x79cc4e34f0b4: add sp, sp, #0x10
0x79cc4e34f0b8: ldp x1, x0, [sp], #0x10
0x79cc4e34f0bc: msr nzcv, x1
0x79cc4e34f0c0: ldp x1, x2, [sp], #0x10
0x79cc4e34f0c4: ldp x3, x4, [sp], #0x10
0x79cc4e34f0c8: ldp x5, x6, [sp], #0x10
0x79cc4e34f0cc: ldp x7, x8, [sp], #0x10
0x79cc4e34f0d0: ldp x9, x10, [sp], #0x10
0x79cc4e34f0d4: ldp x11, x12, [sp], #0x10
0x79cc4e34f0d8: ldp x13, x14, [sp], #0x10
0x79cc4e34f0dc: ldp x15, x16, [sp], #0x10
0x79cc4e34f0e0: ldp x17, x18, [sp], #0x10
0x79cc4e34f0e4: ldp x19, x20, [sp], #0x10
0x79cc4e34f0e8: ldp x21, x22, [sp], #0x10
0x79cc4e34f0ec: ldp x23, x24, [sp], #0x10
0x79cc4e34f0f0: ldp x25, x26, [sp], #0x10
0x79cc4e34f0f4: ldp x27, x28, [sp], #0x10
0x79cc4e34f0f8: ldp x29, x30, [sp], #0x10
0x79cc4e34f0fc: ldp q0, q1, [sp], #0x20
0x79cc4e34f100: ldp q2, q3, [sp], #0x20
0x79cc4e34f104: ldp q4, q5, [sp], #0x20
0x79cc4e34f108: ldp q6, q7, [sp], #0x20
0x79cc4e34f10c: ldp q8, q9, [sp], #0x20
0x79cc4e34f110: ldp q10, q11, [sp], #0x20
0x79cc4e34f114: ldp q12, q13, [sp], #0x20
0x79cc4e34f118: ldp q14, q15, [sp], #0x20
0x79cc4e34f11c: ldp q16, q17, [sp], #0x20
0x79cc4e34f120: ldp q18, q19, [sp], #0x20
0x79cc4e34f124: ldp q20, q21, [sp], #0x20
0x79cc4e34f128: ldp q22, q23, [sp], #0x20
0x79cc4e34f12c: ldp q24, q25, [sp], #0x20
0x79cc4e34f130: ldp q26, q27, [sp], #0x20
0x79cc4e34f134: ldp q28, q29, [sp], #0x20
0x79cc4e34f138: ldp q30, q31, [sp], #0x20
0x79cc4e34f13c: ldp x16, x17, [sp], #0x10
0x79cc4e34f140: ret x16
; 0x79cc4e34f144: pointer 0x77e3e64 (libFUSION.so+0x437e64)

; shared dispatcher
0x79cc4e34f14c: sub sp, sp, #0x10
0x79cc4e34f150: stp q30, q31, [sp, #-0x20]!
0x79cc4e34f154: stp q28, q29, [sp, #-0x20]!
0x79cc4e34f158: stp q26, q27, [sp, #-0x20]!
0x79cc4e34f15c: stp q24, q25, [sp, #-0x20]!
0x79cc4e34f160: stp q22, q23, [sp, #-0x20]!
0x79cc4e34f164: stp q20, q21, [sp, #-0x20]!
0x79cc4e34f168: stp q18, q19, [sp, #-0x20]!
0x79cc4e34f16c: stp q16, q17, [sp, #-0x20]!
0x79cc4e34f170: stp q14, q15, [sp, #-0x20]!
0x79cc4e34f174: stp q12, q13, [sp, #-0x20]!
0x79cc4e34f178: stp q10, q11, [sp, #-0x20]!
0x79cc4e34f17c: stp q8, q9, [sp, #-0x20]!
0x79cc4e34f180: stp q6, q7, [sp, #-0x20]!
0x79cc4e34f184: stp q4, q5, [sp, #-0x20]!
0x79cc4e34f188: stp q2, q3, [sp, #-0x20]!
0x79cc4e34f18c: stp q0, q1, [sp, #-0x20]!
0x79cc4e34f190: stp x29, x30, [sp, #-0x10]!
0x79cc4e34f194: stp x27, x28, [sp, #-0x10]!
0x79cc4e34f198: stp x25, x26, [sp, #-0x10]!
0x79cc4e34f19c: stp x23, x24, [sp, #-0x10]!
0x79cc4e34f1a0: stp x21, x22, [sp, #-0x10]!
0x79cc4e34f1a4: stp x19, x20, [sp, #-0x10]!
0x79cc4e34f1a8: stp x17, x18, [sp, #-0x10]!
0x79cc4e34f1ac: stp x15, x16, [sp, #-0x10]!
0x79cc4e34f1b0: stp x13, x14, [sp, #-0x10]!
0x79cc4e34f1b4: stp x11, x12, [sp, #-0x10]!
0x79cc4e34f1b8: stp x9, x10, [sp, #-0x10]!
0x79cc4e34f1bc: stp x7, x8, [sp, #-0x10]!
0x79cc4e34f1c0: stp x5, x6, [sp, #-0x10]!
0x79cc4e34f1c4: stp x3, x4, [sp, #-0x10]!
0x79cc4e34f1c8: stp x1, x2, [sp, #-0x10]!
0x79cc4e34f1cc: mrs x1, nzcv
0x79cc4e34f1d0: stp x1, x0, [sp, #-0x10]!
0x79cc4e34f1d4: add x0, sp, #0x310
0x79cc4e34f1d8: stp xzr, x0, [sp, #-0x10]!
0x79cc4e34f1dc: str x30, [sp, #0x318]
0x79cc4e34f1e0: str x29, [sp, #0x310]
0x79cc4e34f1e4: add x29, sp, #0x310
0x79cc4e34f1e8: mov x1, sp
0x79cc4e34f1ec: add x2, sp, #0x310
0x79cc4e34f1f0: mov x0, x17
0x79cc4e34f1f4: ldr x3, #0x79cc4e34f28c
0x79cc4e34f1f8: blr x3
0x79cc4e34f1fc: add sp, sp, #0x10
0x79cc4e34f200: ldp x1, x0, [sp], #0x10
0x79cc4e34f204: msr nzcv, x1
0x79cc4e34f208: ldp x1, x2, [sp], #0x10
0x79cc4e34f20c: ldp x3, x4, [sp], #0x10
0x79cc4e34f210: ldp x5, x6, [sp], #0x10
0x79cc4e34f214: ldp x7, x8, [sp], #0x10
0x79cc4e34f218: ldp x9, x10, [sp], #0x10
0x79cc4e34f21c: ldp x11, x12, [sp], #0x10
0x79cc4e34f220: ldp x13, x14, [sp], #0x10
0x79cc4e34f224: ldp x15, x16, [sp], #0x10
0x79cc4e34f228: ldp x17, x18, [sp], #0x10
0x79cc4e34f22c: ldp x19, x20, [sp], #0x10
0x79cc4e34f230: ldp x21, x22, [sp], #0x10
0x79cc4e34f234: ldp x23, x24, [sp], #0x10
0x79cc4e34f238: ldp x25, x26, [sp], #0x10
0x79cc4e34f23c: ldp x27, x28, [sp], #0x10
0x79cc4e34f240: ldp x29, x30, [sp], #0x10
0x79cc4e34f244: ldp q0, q1, [sp], #0x20
0x79cc4e34f248: ldp q2, q3, [sp], #0x20
0x79cc4e34f24c: ldp q4, q5, [sp], #0x20
0x79cc4e34f250: ldp q6, q7, [sp], #0x20
0x79cc4e34f254: ldp q8, q9, [sp], #0x20
0x79cc4e34f258: ldp q10, q11, [sp], #0x20
0x79cc4e34f25c: ldp q12, q13, [sp], #0x20
0x79cc4e34f260: ldp q14, q15, [sp], #0x20
0x79cc4e34f264: ldp q16, q17, [sp], #0x20
0x79cc4e34f268: ldp q18, q19, [sp], #0x20
0x79cc4e34f26c: ldp q20, q21, [sp], #0x20
0x79cc4e34f270: ldp q22, q23, [sp], #0x20
0x79cc4e34f274: ldp q24, q25, [sp], #0x20
0x79cc4e34f278: ldp q26, q27, [sp], #0x20
0x79cc4e34f27c: ldp q28, q29, [sp], #0x20
0x79cc4e34f280: ldp q30, q31, [sp], #0x20
0x79cc4e34f284: ldp x16, x17, [sp], #0x10
0x79cc4e34f288: ret x16
; 0x79cc4e34f28c: pointer 0x77d9c4c (libFUSION.so+0x42dc4c)

; relocated game instructions at RVA 0x71dc6c
0x113b5a30: stp x29, x30, [sp, #-0x20]!
0x113b5a34: stp x20, x19, [sp, #0x10]
0x113b5a38: mov x29, sp
0x113b5a3c: ldr x20, #0x113b5a48
0x113b5a40: ldr x16, #0x113b5a50
0x113b5a44: br x16
; 0x113b5a48: pointer 0x46a1000 (libg.so+0x12f5000)
; 0x113b5a50: pointer 0x3ac9c7c (libg.so+0x71dc7c)

; relocated game instructions at RVA 0x71dcb8
0x113b5930: stp x29, x30, [sp, #-0x20]!
0x113b5934: stp x20, x19, [sp, #0x10]
0x113b5938: mov x29, sp
0x113b593c: ldr x20, #0x113b5948
0x113b5940: ldr x16, #0x113b5950
0x113b5944: br x16
; 0x113b5948: pointer 0x46a1000 (libg.so+0x12f5000)
; 0x113b5950: pointer 0x3ac9cc8 (libg.so+0x71dcc8)

; relocated game instructions at RVA 0x756bc0
0x113b5830: sub sp, sp, #0x1f0
0x113b5834: stp x29, x30, [sp, #0x190]
0x113b5838: stp x28, x27, [sp, #0x1a0]
0x113b583c: stp x26, x25, [sp, #0x1b0]
0x113b5840: ldr x16, #0x113b5848
0x113b5844: br x16
; 0x113b5848: pointer 0x3b02bd0 (libg.so+0x756bd0)

; relocated game instructions at RVA 0x75b2a4
0x113b5330: sub sp, sp, #0x70
0x113b5334: stp d9, d8, [sp, #0x30]
0x113b5338: stp x29, x30, [sp, #0x40]
0x113b533c: stp x22, x21, [sp, #0x50]
0x113b5340: ldr x16, #0x113b5348
0x113b5344: br x16
; 0x113b5348: pointer 0x3b072b4 (libg.so+0x75b2b4)

; relocated game instructions at RVA 0x7c88bc
0x113b7d30: ldr x8, [x24, #8]
0x113b7d34: ldr d0, [x24, #0x10]
0x113b7d38: str d0, [x8, #0x280]
0x113b7d3c: ldr x16, #0x113b7d44
0x113b7d40: br x16
; 0x113b7d44: pointer 0x3b74788 (libg.so+0x7c8788)

; relocated game instructions at RVA 0x800a50
0x113b7c30: ldr x10, [x8, #8]
0x113b7c34: ldr d1, [x8, #0x18]
0x113b7c38: add x8, x8, #0x20
0x113b7c3c: cmp x8, x9
0x113b7c40: ldr x16, #0x113b7c48
0x113b7c44: br x16
; 0x113b7c48: pointer 0x3baca60 (libg.so+0x800a60)

; relocated game instructions at RVA 0x8239a8
0x113b6d30: sub sp, sp, #0xb0
0x113b6d34: stp x29, x30, [sp, #0x50]
0x113b6d38: stp x28, x27, [sp, #0x60]
0x113b6d3c: stp x26, x25, [sp, #0x70]
0x113b6d40: ldr x16, #0x113b6d48
0x113b6d44: br x16
; 0x113b6d48: pointer 0x3bcf9b8 (libg.so+0x8239b8)

; relocated game instructions at RVA 0x8263d8
0x113b6f30: sub sp, sp, #0x1e0
0x113b6f34: str d10, [sp, #0x160]
0x113b6f38: stp d9, d8, [sp, #0x170]
0x113b6f3c: stp x29, x30, [sp, #0x180]
0x113b6f40: ldr x16, #0x113b6f48
0x113b6f44: br x16
; 0x113b6f48: pointer 0x3bd23e8 (libg.so+0x8263e8)

; relocated game instructions at RVA 0x82cbd0
0x113b6e30: sub sp, sp, #0xa0
0x113b6e34: stp d9, d8, [sp, #0x40]
0x113b6e38: stp x29, x30, [sp, #0x50]
0x113b6e3c: str x25, [sp, #0x60]
0x113b6e40: ldr x16, #0x113b6e48
0x113b6e44: br x16
; 0x113b6e48: pointer 0x3bd8be0 (libg.so+0x82cbe0)

; relocated game instructions at RVA 0x845c38
0x113b7a30: sub sp, sp, #0x170
0x113b7a34: stp d11, d10, [sp, #0xf0]
0x113b7a38: stp d9, d8, [sp, #0x100]
0x113b7a3c: stp x29, x30, [sp, #0x110]
0x113b7a40: ldr x16, #0x113b7a48
0x113b7a44: br x16
; 0x113b7a48: pointer 0x3bf1c48 (libg.so+0x845c48)

; relocated game instructions at RVA 0x882740
0x113b5730: stp x29, x30, [sp, #-0x30]!
0x113b5734: stp x22, x21, [sp, #0x10]
0x113b5738: stp x20, x19, [sp, #0x20]
0x113b573c: mov x29, sp
0x113b5740: ldr x16, #0x113b5748
0x113b5744: br x16
; 0x113b5748: pointer 0x3c2e750 (libg.so+0x882750)

; relocated game instructions at RVA 0x883260
0x113b8130: sub sp, sp, #0x70
0x113b8134: stp x29, x30, [sp, #0x20]
0x113b8138: stp x26, x25, [sp, #0x30]
0x113b813c: stp x24, x23, [sp, #0x40]
0x113b8140: ldr x16, #0x113b8148
0x113b8144: br x16
; 0x113b8148: pointer 0x3c2f270 (libg.so+0x883270)

; relocated game instructions at RVA 0x88360c
0x113b8230: sub sp, sp, #0x70
0x113b8234: str d8, [sp, #0x20]
0x113b8238: stp x29, x30, [sp, #0x28]
0x113b823c: str x25, [sp, #0x38]
0x113b8240: ldr x16, #0x113b8248
0x113b8244: br x16
; 0x113b8248: pointer 0x3c2f61c (libg.so+0x88361c)

; relocated game instructions at RVA 0x888218
0x113b5b30: stp x29, x30, [sp, #-0x20]!
0x113b5b34: str x19, [sp, #0x10]
0x113b5b38: mov x29, sp
0x113b5b3c: ldr x1, [x0, #0x218]
0x113b5b40: ldr x16, #0x113b5b48
0x113b5b44: br x16
; 0x113b5b48: pointer 0x3c34228 (libg.so+0x888228)

; relocated game instructions at RVA 0x905ac8
0x113b6830: cmp w2, #2
0x113b6834: b.eq #0x113b683c
0x113b6838: b #0x113b6844

; relocated game instructions at RVA 0x90a3fc
0x113b7b30: sub sp, sp, #0x70
0x113b7b34: str d8, [sp, #0x40]
0x113b7b38: stp x29, x30, [sp, #0x50]
0x113b7b3c: stp x20, x19, [sp, #0x60]
0x113b7b40: ldr x16, #0x113b7b48
0x113b7b44: br x16
; 0x113b7b48: pointer 0x3cb640c (libg.so+0x90a40c)

; relocated game instructions at RVA 0x9f052c
0x113b6430: stp x29, x30, [sp, #-0x60]!
0x113b6434: stp x28, x27, [sp, #0x10]
0x113b6438: stp x26, x25, [sp, #0x20]
0x113b643c: stp x24, x23, [sp, #0x30]
0x113b6440: ldr x16, #0x113b6448
0x113b6444: br x16
; 0x113b6448: pointer 0x3d9c53c (libg.so+0x9f053c)

; relocated game instructions at RVA 0x9f072c
0x113b6330: sub sp, sp, #0x60
0x113b6334: stp x29, x30, [sp, #0x30]
0x113b6338: str x21, [sp, #0x40]
0x113b633c: stp x20, x19, [sp, #0x50]
0x113b6340: ldr x16, #0x113b6348
0x113b6344: br x16
; 0x113b6348: pointer 0x3d9c73c (libg.so+0x9f073c)

; relocated game instructions at RVA 0x9f10c0
0x113b6530: stp x29, x30, [sp, #-0x20]!
0x113b6534: str x19, [sp, #0x10]
0x113b6538: mov x29, sp
0x113b653c: ldr x1, [x0, #0x158]
0x113b6540: ldr x16, #0x113b6548
0x113b6544: br x16
; 0x113b6548: pointer 0x3d9d0d0 (libg.so+0x9f10d0)

; relocated game instructions at RVA 0xa64818
0x113b7630: sub sp, sp, #0x130
0x113b7634: stp x29, x30, [sp, #0xd0]
0x113b7638: stp x28, x27, [sp, #0xe0]
0x113b763c: stp x26, x25, [sp, #0xf0]
0x113b7640: ldr x16, #0x113b7648
0x113b7644: br x16
; 0x113b7648: pointer 0x3e10828 (libg.so+0xa64828)

; relocated game instructions at RVA 0xb018a0
0x113b7130: sub sp, sp, #0x1b0
0x113b7134: str d8, [sp, #0x140]
0x113b7138: stp x29, x30, [sp, #0x150]
0x113b713c: stp x28, x27, [sp, #0x160]
0x113b7140: ldr x16, #0x113b7148
0x113b7144: br x16
; 0x113b7148: pointer 0x3ead8b0 (libg.so+0xb018b0)

; relocated game instructions at RVA 0xb11970
0x113b5e30: ldrb w8, [x0, #0x40]
0x113b5e34: cbz w8, #0x113b5e3c
0x113b5e38: b #0x113b5e44

; relocated game instructions at RVA 0xb35608
0x113b5630: sub sp, sp, #0x1b0
0x113b5634: str d8, [sp, #0x140]
0x113b5638: stp x29, x30, [sp, #0x150]
0x113b563c: stp x28, x27, [sp, #0x160]
0x113b5640: ldr x16, #0x113b5648
0x113b5644: br x16
; 0x113b5648: pointer 0x3ee1618 (libg.so+0xb35618)

; relocated game instructions at RVA 0xb4071c
0x113b8330: stp d15, d14, [sp, #-0xa0]!
0x113b8334: stp d13, d12, [sp, #0x10]
0x113b8338: stp d11, d10, [sp, #0x20]
0x113b833c: stp d9, d8, [sp, #0x30]
0x113b8340: ldr x16, #0x113b8348
0x113b8344: br x16
; 0x113b8348: pointer 0x3eec72c (libg.so+0xb4072c)

; relocated game instructions at RVA 0xb444a0
0x113b5530: stp d15, d14, [sp, #-0xa0]!
0x113b5534: stp d13, d12, [sp, #0x10]
0x113b5538: stp d11, d10, [sp, #0x20]
0x113b553c: stp d9, d8, [sp, #0x30]
0x113b5540: ldr x16, #0x113b5548
0x113b5544: br x16
; 0x113b5548: pointer 0x3ef04b0 (libg.so+0xb444b0)

; relocated game instructions at RVA 0xb4caec
0x113b8030: sub sp, sp, #0x130
0x113b8034: str d8, [sp, #0xd0]
0x113b8038: stp x29, x30, [sp, #0xd8]
0x113b803c: str x28, [sp, #0xe8]
0x113b8040: ldr x16, #0x113b8048
0x113b8044: br x16
; 0x113b8048: pointer 0x3ef8afc (libg.so+0xb4cafc)

; relocated game instructions at RVA 0xb50fdc
0x113b6230: ldr x8, #0x113b6240
0x113b6234: add x8, x8, #0x434
0x113b6238: ldar w0, [x8]
0x113b623c: ret 
; 0x113b6240: pointer 0x46b2000 (libg.so+0x1306000)

; relocated game instructions at RVA 0xb588d8
0x113b5230: sub sp, sp, #0x90
0x113b5234: str d8, [sp, #0x40]
0x113b5238: stp x29, x30, [sp, #0x48]
0x113b523c: str x25, [sp, #0x58]
0x113b5240: ldr x16, #0x113b5248
0x113b5244: br x16
; 0x113b5248: pointer 0x3f048e8 (libg.so+0xb588e8)

; relocated game instructions at RVA 0xb9b538
0x113b7730: stp x29, x30, [sp, #-0x10]!
0x113b7734: mov x29, sp
0x113b7738: ldr x0, #0x113b7748
0x113b773c: add x0, x0, #0x7c7
0x113b7740: ldr x16, #0x113b7750
0x113b7744: br x16
; 0x113b7748: pointer 0x3590000 (libg.so+0x1e4000)
; 0x113b7750: pointer 0x3f47548 (libg.so+0xb9b548)

; relocated game instructions at RVA 0xbfbf84
0x113b6630: str d8, [sp, #-0x30]!
0x113b6634: stp x29, x30, [sp, #0x10]
0x113b6638: stp x20, x19, [sp, #0x20]
0x113b663c: add x29, sp, #0x10
0x113b6640: ldr x16, #0x113b6648
0x113b6644: br x16
; 0x113b6648: pointer 0x3fa7f94 (libg.so+0xbfbf94)

; relocated game instructions at RVA 0xcce878
0x113b7930: sub sp, sp, #0x90
0x113b7934: stp x29, x30, [sp, #0x50]
0x113b7938: stp x24, x23, [sp, #0x60]
0x113b793c: stp x22, x21, [sp, #0x70]
0x113b7940: ldr x16, #0x113b7948
0x113b7944: br x16
; 0x113b7948: pointer 0x407a888 (libg.so+0xcce888)

; relocated game instructions at RVA 0xccf3dc
0x113b7830: sub sp, sp, #0xf0
0x113b7834: stp x29, x30, [sp, #0xc0]
0x113b7838: stp x22, x21, [sp, #0xd0]
0x113b783c: stp x20, x19, [sp, #0xe0]
0x113b7840: ldr x16, #0x113b7848
0x113b7844: br x16
; 0x113b7848: pointer 0x407b3ec (libg.so+0xccf3ec)

; relocated game instructions at RVA 0xce1e60
0x113b6130: sub sp, sp, #0x130
0x113b6134: stp x29, x30, [sp, #0xd0]
0x113b6138: str x28, [sp, #0xe0]
0x113b613c: stp x26, x25, [sp, #0xf0]
0x113b6140: ldr x16, #0x113b6148
0x113b6144: br x16
; 0x113b6148: pointer 0x408de70 (libg.so+0xce1e70)

; relocated game instructions at RVA 0xcfef08
0x113b5f30: stp x29, x30, [sp, #-0x20]!
0x113b5f34: stp x20, x19, [sp, #0x10]
0x113b5f38: mov x29, sp
0x113b5f3c: mov w19, w0
0x113b5f40: ldr x16, #0x113b5f48
0x113b5f44: br x16
; 0x113b5f48: pointer 0x40aaf18 (libg.so+0xcfef18)

; relocated game instructions at RVA 0xd01dc0
0x113b5c30: sub sp, sp, #0x40
0x113b5c34: stp x29, x30, [sp, #0x10]
0x113b5c38: stp x22, x21, [sp, #0x20]
0x113b5c3c: stp x20, x19, [sp, #0x30]
0x113b5c40: ldr x16, #0x113b5c48
0x113b5c44: br x16
; 0x113b5c48: pointer 0x40addd0 (libg.so+0xd01dd0)

; relocated game instructions at RVA 0xd44958
0x113b6930: stp x29, x30, [sp, #-0x20]!
0x113b6934: str x19, [sp, #0x10]
0x113b6938: mov x29, sp
0x113b693c: mov x19, x0
0x113b6940: ldr x16, #0x113b6948
0x113b6944: br x16
; 0x113b6948: pointer 0x40f0968 (libg.so+0xd44968)

; relocated game instructions at RVA 0xe45f28
0x113b7e30: ldr x8, #0x113b7e44
0x113b7e34: ldr x0, [x0, #8]
0x113b7e38: ldr w1, [x8, #0x690]
0x113b7e3c: ldr x16, #0x113b7e4c
0x113b7e40: br x16
; 0x113b7e44: pointer 0x45f0000 (libg.so+0x1244000)
; 0x113b7e4c: pointer 0x38dfeb0 (libg.so+0x533eb0)

; relocated game instructions at RVA 0xe75224
0x113b6b30: stp x29, x30, [sp, #-0x40]!
0x113b6b34: stp x24, x23, [sp, #0x10]
0x113b6b38: stp x22, x21, [sp, #0x20]
0x113b6b3c: stp x20, x19, [sp, #0x30]
0x113b6b40: ldr x16, #0x113b6b48
0x113b6b44: br x16
; 0x113b6b48: pointer 0x4221234 (libg.so+0xe75234)

; relocated game instructions at RVA 0xeb2ccc
0x113b7330: sub sp, sp, #0x120
0x113b7334: stp x29, x30, [sp, #0xc0]
0x113b7338: stp x28, x27, [sp, #0xd0]
0x113b733c: stp x26, x25, [sp, #0xe0]
0x113b7340: ldr x16, #0x113b7348
0x113b7344: br x16
; 0x113b7348: pointer 0x425ecdc (libg.so+0xeb2cdc)

; relocated game instructions at RVA 0xebf9bc
0x113b6c30: stp x29, x30, [sp, #-0x30]!
0x113b6c34: str x21, [sp, #0x10]
0x113b6c38: stp x20, x19, [sp, #0x20]
0x113b6c3c: mov x29, sp
0x113b6c40: ldr x16, #0x113b6c48
0x113b6c44: br x16
; 0x113b6c48: pointer 0x426b9cc (libg.so+0xebf9cc)

; relocated game instructions at RVA 0xec3b88
0x113b6a30: stp x29, x30, [sp, #-0x30]!
0x113b6a34: stp x22, x21, [sp, #0x10]
0x113b6a38: stp x20, x19, [sp, #0x20]
0x113b6a3c: mov x29, sp
0x113b6a40: ldr x16, #0x113b6a48
0x113b6a44: br x16
; 0x113b6a48: pointer 0x426fb98 (libg.so+0xec3b98)

; relocated game instructions at RVA 0xf36fa4
0x113b7530: stp x29, x30, [sp, #-0x40]!
0x113b7534: str x23, [sp, #0x10]
0x113b7538: stp x22, x21, [sp, #0x20]
0x113b753c: stp x20, x19, [sp, #0x30]
0x113b7540: ldr x16, #0x113b7548
0x113b7544: br x16
; 0x113b7548: pointer 0x42e2fb4 (libg.so+0xf36fb4)

; relocated game instructions at RVA 0xf49934
0x113b7430: stp x29, x30, [sp, #-0x40]!
0x113b7434: str x23, [sp, #0x10]
0x113b7438: stp x22, x21, [sp, #0x20]
0x113b743c: stp x20, x19, [sp, #0x30]
0x113b7440: ldr x16, #0x113b7448
0x113b7444: br x16
; 0x113b7448: pointer 0x42f5944 (libg.so+0xf49944)

; relocated game instructions at RVA 0xf56cb0
0x113b5d30: ldr w8, [x0, #0x9c]
0x113b5d34: cmp w8, #1
0x113b5d38: b.lt #0x113b5d40
0x113b5d3c: b #0x113b5d48

; relocated game instructions at RVA 0xf6b060
0x113b6730: stp x29, x30, [sp, #-0x20]!
0x113b6734: str x19, [sp, #0x10]
0x113b6738: mov x29, sp
0x113b673c: mov x19, x0
0x113b6740: ldr x16, #0x113b6748
0x113b6744: br x16
; 0x113b6748: pointer 0x4317070 (libg.so+0xf6b070)

; relocated game instructions at RVA 0xf83db0
0x113b5430: stp x29, x30, [sp, #-0x20]!
0x113b5434: str x19, [sp, #0x10]
0x113b5438: mov x29, sp
0x113b543c: mov x19, x0
0x113b5440: ldr x16, #0x113b5448
0x113b5444: br x16
; 0x113b5448: pointer 0x432fdc0 (libg.so+0xf83dc0)

; relocated game instructions at RVA 0xfa7db8
0x113b7230: stp x29, x30, [sp, #-0x50]!
0x113b7234: str x25, [sp, #0x10]
0x113b7238: stp x24, x23, [sp, #0x20]
0x113b723c: stp x22, x21, [sp, #0x30]
0x113b7240: ldr x16, #0x113b7248
0x113b7244: br x16
; 0x113b7248: pointer 0x4353dc8 (libg.so+0xfa7dc8)
