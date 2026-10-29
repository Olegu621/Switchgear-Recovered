            package p000;

            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.security.GeneralSecurityException;
            
            /* JADX INFO: renamed from: hw */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1006hw {

                /* JADX INFO: renamed from: a */
                public int f9336a;

                /* JADX INFO: renamed from: b */
                public Object f9337b;

                /* JADX INFO: renamed from: d */
                public static int m4384d(int i) {
/* 6 */             return (-(i & 1)) ^ (i >>> 1);
                }

                /* JADX INFO: renamed from: e */
                public static long m4385e(long j) {
/* 8 */             return (-(j & 1)) ^ (j >>> 1);
                }

                /* JADX INFO: renamed from: h */
                public static C0858dw m4386h(byte[] bArr, int i, int i2, boolean z) {
/* 3 */             C0858dw c0858dw = new C0858dw(bArr, i, i2, z);
                    try {
/* 6 */                 c0858dw.mo3259l(i2);
/* 9 */                 return c0858dw;
                    } catch (pz0 e) {
/* 11 */                C1951n4.m6863n(e);
/* 14 */                return null;
                    }
                }

                /* JADX INFO: renamed from: A */
                public abstract String mo3244A();

                /* JADX INFO: renamed from: B */
                public abstract String mo3245B();

                /* JADX INFO: renamed from: C */
                public abstract int mo3246C();

                /* JADX INFO: renamed from: D */
                public abstract int mo3247D();

                /* JADX INFO: renamed from: E */
                public abstract long mo3248E();

                /* JADX INFO: renamed from: F */
                public abstract boolean mo3603F(int i);

                /* JADX INFO: renamed from: G */
                public void m4387G() throws qz0 {
                    boolean zMo3603F;
/* 28 */            do {
/* 1 */                 int iMo3246C = mo3246C();
/* 5 */                 if (iMo3246C == 0) {
/* 30 */                    return;
                        }
/* 8 */                 int i = this.f9336a;
/* 12 */                if (i >= 100) {
/* 38 */                    throw new qz0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        }
/* 16 */                this.f9336a = i + 1;
/* 18 */                zMo3603F = mo3603F(iMo3246C);
/* 26 */                this.f9336a--;
/* 28 */            } while (zMo3603F);
                }

                /* JADX INFO: renamed from: a */
                public ByteBuffer m4388a(byte[] bArr, int i) {
/* 5 */             int[] iArrMo4389c = mo4389c(AbstractC1768is.m5550c(bArr), i);
/* 13 */            int[] iArr = (int[]) iArrMo4389c.clone();
/* 15 */            AbstractC1768is.m5549b(iArr);
/* 21 */            for (int i2 = 0; i2 < iArrMo4389c.length; i2++) {
/* 28 */                iArrMo4389c[i2] = iArrMo4389c[i2] + iArr[i2];
                    }
/* 41 */            ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
/* 51 */            byteBufferOrder.asIntBuffer().put(iArrMo4389c, 0, 16);
/* 54 */            return byteBufferOrder;
                }

                /* JADX INFO: renamed from: b */
                public abstract void mo3255b(int i);

                /* JADX INFO: renamed from: c */
                public abstract int[] mo4389c(int[] iArr, int i);

                /* JADX INFO: renamed from: f */
                public abstract int mo3256f();

                /* JADX INFO: renamed from: g */
                public abstract boolean mo3257g();

                /* JADX INFO: renamed from: i */
                public abstract int mo4390i();

                /* JADX INFO: renamed from: j */
                public abstract void mo3258j(int i);

                /* JADX INFO: renamed from: k */
                public void m4391k(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
/* 6 */             if (bArr.length != mo4390i()) {
/* 66 */                throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo4390i());
                    }
/* 8 */             int iRemaining = byteBuffer2.remaining();
/* 12 */            int i = iRemaining / 64;
/* 14 */            int i2 = i + 1;
/* 17 */            for (int i3 = 0; i3 < i2; i3++) {
/* 22 */                ByteBuffer byteBufferM4388a = m4388a(bArr, this.f9336a + i3);
/* 28 */                if (i3 == i) {
/* 32 */                    k50.m5960N(byteBuffer, byteBuffer2, byteBufferM4388a, iRemaining % 64);
                        } else {
/* 36 */                    k50.m5960N(byteBuffer, byteBuffer2, byteBufferM4388a, 64);
                        }
                    }
                }

                /* JADX INFO: renamed from: l */
                public abstract int mo3259l(int i);

                /* JADX INFO: renamed from: m */
                public abstract boolean mo3260m();

                /* JADX INFO: renamed from: n */
                public abstract C2222tl mo3261n();

                /* JADX INFO: renamed from: o */
                public abstract C2259ul mo3611o();

                /* JADX INFO: renamed from: p */
                public abstract double mo3262p();

                /* JADX INFO: renamed from: q */
                public abstract int mo3263q();

                /* JADX INFO: renamed from: r */
                public abstract int mo3264r();

                /* JADX INFO: renamed from: s */
                public abstract long mo3265s();

                /* JADX INFO: renamed from: t */
                public abstract float mo3266t();

                /* JADX INFO: renamed from: u */
                public abstract int mo3267u();

                /* JADX INFO: renamed from: v */
                public abstract long mo3268v();

                /* JADX INFO: renamed from: w */
                public abstract int mo3269w();

                /* JADX INFO: renamed from: x */
                public abstract long mo3270x();

                /* JADX INFO: renamed from: y */
                public abstract int mo3271y();

                /* JADX INFO: renamed from: z */
                public abstract long mo3272z();
            }
