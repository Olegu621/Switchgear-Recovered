            package p000;

            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class tm3 {
                protected int zzb;

                /* JADX INFO: renamed from: a */
                public final byte[] m8813a() {
                    try {
/* 2 */                 eo3 eo3Var = (eo3) this;
/* 4 */                 int iM3542d = eo3Var.m3542d();
/* 8 */                 byte[] bArr = new byte[iM3542d];
/* 12 */                kn3 kn3Var = new kn3(bArr, iM3542d);
/* 15 */                eo3Var.m3543j(kn3Var);
/* 21 */                if (iM3542d - kn3Var.f12900d == 0) {
/* 23 */                    return bArr;
                        }
/* 31 */                throw new IllegalStateException("Did not write as much data as expected.");
                    } catch (IOException e) {
/* 37 */                String name = getClass().getName();
/* 60 */                ds0.m3198o(fm0.m3790p(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
/* 63 */                return null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public abstract int mo3540b(bq3 bq3Var);
            }
