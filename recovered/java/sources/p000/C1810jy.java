            package p000;

            import io.flutter.embedding.android.KeyboardMap;
            
            /* JADX INFO: renamed from: jy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1810jy extends zr3 {

                /* JADX INFO: renamed from: e */
                public final boolean f12536e;

                public C1810jy(C1954n7 c1954n7, boolean z) {
/* 1 */             super(c1954n7);
/* 4 */             this.f12536e = z;
                }

                @Override // p000.zr3
                /* JADX INFO: renamed from: m */
                public final void mo5924m(byte b) {
/* 3 */             if (this.f12536e) {
/* 5 */                 ss2 ss2Var = ts2.f17251b;
/* 13 */                m10438u(String.valueOf(b & 255));
                    } else {
/* 17 */                ss2 ss2Var2 = ts2.f17251b;
/* 21 */                String strValueOf = String.valueOf(b & 255);
/* 25 */                strValueOf.getClass();
/* 32 */                ((C1954n7) this.f20312c).m6910p(strValueOf);
                    }
                }

                @Override // p000.zr3
                /* JADX INFO: renamed from: r */
                public final void mo5925r(int i) {
/* 10 */            if (this.f12536e) {
/* 12 */                lw2 lw2Var = mw2.f14054b;
/* 21 */                m10438u(Long.toString(((long) i) & KeyboardMap.kValueMask, 10));
                    } else {
/* 25 */                lw2 lw2Var2 = mw2.f14054b;
/* 30 */                String string = Long.toString(((long) i) & KeyboardMap.kValueMask, 10);
/* 34 */                string.getClass();
/* 41 */                ((C1954n7) this.f20312c).m6910p(string);
                    }
                }

                @Override // p000.zr3
                /* JADX INFO: renamed from: s */
                public final void mo5926s(long j) {
/* 3 */             int i = 63;
/* 11 */            String str = "0";
/* 18 */            if (this.f12536e) {
/* 20 */                rw2 rw2Var = sw2.f16829b;
/* 24 */                if (j != 0) {
/* 27 */                    if (j > 0) {
/* 29 */                        str = Long.toString(j, 10);
                            } else {
/* 34 */                        char[] cArr = new char[64];
/* 38 */                        long j2 = (j >>> 1) / 5;
/* 47 */                        cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
/* 51 */                        while (j2 > 0) {
/* 53 */                            i--;
/* 62 */                            cArr[i] = Character.forDigit((int) (j2 % 10), 10);
/* 64 */                            j2 /= 10;
                                }
/* 70 */                        str = new String(cArr, i, 64 - i);
                            }
                        }
/* 73 */                m10438u(str);
/* 76 */                return;
                    }
/* 77 */            rw2 rw2Var2 = sw2.f16829b;
/* 81 */            if (j != 0) {
/* 84 */                if (j > 0) {
/* 86 */                    str = Long.toString(j, 10);
                        } else {
/* 91 */                    char[] cArr2 = new char[64];
/* 95 */                    long j3 = (j >>> 1) / 5;
/* 104 */                   cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
/* 108 */                   while (j3 > 0) {
/* 110 */                       i--;
/* 119 */                       cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
/* 121 */                       j3 /= 10;
                            }
/* 127 */                   str = new String(cArr2, i, 64 - i);
                        }
                    }
/* 130 */           str.getClass();
/* 137 */           ((C1954n7) this.f20312c).m6910p(str);
                }

                @Override // p000.zr3
                /* JADX INFO: renamed from: t */
                public final void mo5927t(short s) {
/* 6 */             if (this.f12536e) {
/* 8 */                 zw2 zw2Var = ax2.f2137b;
/* 15 */                m10438u(String.valueOf(s & 65535));
                    } else {
/* 19 */                zw2 zw2Var2 = ax2.f2137b;
/* 22 */                String strValueOf = String.valueOf(s & 65535);
/* 26 */                strValueOf.getClass();
/* 33 */                ((C1954n7) this.f20312c).m6910p(strValueOf);
                    }
                }
            }
