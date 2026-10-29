            package p000;

            import java.io.IOException;
            
            /* JADX INFO: renamed from: w */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2313w implements nh1 {
                protected int memoizedHashCode;

                /* JADX INFO: renamed from: b */
                public abstract int mo8615b(h72 h72Var);

                /* JADX INFO: renamed from: c */
                public final String m9358c(String str) {
/* 32 */            return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
                }

                /* JADX INFO: renamed from: d */
                public abstract oq0 mo8616d();

                /* JADX INFO: renamed from: e */
                public final byte[] m9359e() {
                    try {
/* 5 */                 int iMo8615b = ((sq0) this).mo8615b(null);
/* 9 */                 byte[] bArr = new byte[iMo8615b];
/* 13 */                C1808jw c1808jw = new C1808jw(bArr, iMo8615b);
/* 16 */                mo8617f(c1808jw);
/* 22 */                if (iMo8615b - c1808jw.f12516d == 0) {
/* 24 */                    return bArr;
                        }
/* 32 */                throw new IllegalStateException("Did not write as much data as expected.");
                    } catch (IOException e) {
/* 40 */                ds0.m3198o(m9358c("byte array"), e);
/* 43 */                return null;
                    }
                }

                /* JADX INFO: renamed from: f */
                public abstract void mo8617f(C1808jw c1808jw);
            }
