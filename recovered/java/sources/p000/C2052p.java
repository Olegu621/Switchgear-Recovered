            package p000;

            import io.flutter.embedding.android.KeyboardMap;
            
            /* JADX INFO: renamed from: p */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2052p extends py0 {

                /* JADX INFO: renamed from: k */
                public final C0168b5 f14934k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ c21 f14935l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ String f14936m;

                public C2052p(c21 c21Var, String str) {
/* 2 */             super(4);
/* 5 */             this.f14935l = c21Var;
/* 7 */             this.f14936m = str;
/* 13 */            this.f14934k = c21Var.f2658b.f2163b;
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: B */
                public final void mo1485B(long j) {
                    String str;
/* 1 */             rw2 rw2Var = sw2.f16829b;
/* 7 */             if (j == 0) {
/* 9 */                 str = "0";
                    } else if (j > 0) {
/* 16 */                str = Long.toString(j, 10);
                    } else {
/* 23 */                char[] cArr = new char[64];
/* 30 */                long j2 = (j >>> 1) / 5;
/* 41 */                int i = 63;
/* 43 */                cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
/* 47 */                while (j2 > 0) {
/* 49 */                    i--;
/* 58 */                    cArr[i] = Character.forDigit((int) (j2 % 10), 10);
/* 60 */                    j2 /= 10;
                        }
/* 66 */                str = new String(cArr, i, 64 - i);
                    }
/* 69 */            m7255y0(str);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: a */
                public final C0168b5 mo1497a() {
/* 1 */             return this.f14934k;
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: h */
                public final void mo1504h(short s) {
/* 1 */             zw2 zw2Var = ax2.f2137b;
/* 11 */            m7255y0(String.valueOf(s & 65535));
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: j */
                public final void mo1506j(byte b) {
/* 1 */             ss2 ss2Var = ts2.f17251b;
/* 9 */             m7255y0(String.valueOf(b & 255));
                }

                @Override // p000.py0, kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: y */
                public final void mo1521y(int i) {
/* 1 */             lw2 lw2Var = mw2.f14054b;
/* 16 */            m7255y0(Long.toString(((long) i) & KeyboardMap.kValueMask, 10));
                }

                /* JADX INFO: renamed from: y0 */
                public final void m7255y0(String str) {
/* 1 */             str.getClass();
/* 14 */            this.f14935l.mo1496M(this.f14936m, new s11(str, false));
                }
            }
