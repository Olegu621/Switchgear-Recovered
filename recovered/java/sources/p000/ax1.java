            package p000;

            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.MessageDigest;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ax1 implements wa1 {

                /* JADX INFO: renamed from: a */
                public final yw1 f2135a;

                /* JADX INFO: renamed from: b */
                public final int f2136b;

                public ax1(yw1 yw1Var, int i) throws InvalidAlgorithmParameterException {
/* 4 */             this.f2135a = yw1Var;
/* 6 */             this.f2136b = i;
/* 10 */            if (i < 10) {
/* 26 */                throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
                    }
/* 15 */            yw1Var.mo172a(new byte[0], i);
                }

                @Override // p000.wa1
                /* JADX INFO: renamed from: a */
                public final void mo1178a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 9 */             if (MessageDigest.isEqual(mo1179b(bArr2), bArr)) {
/* 11 */                return;
                    }
/* 14 */            ds0.m3203t("invalid MAC");
                }

                @Override // p000.wa1
                /* JADX INFO: renamed from: b */
                public final byte[] mo1179b(byte[] bArr) {
/* 5 */             return this.f2135a.mo172a(bArr, this.f2136b);
                }
            }
