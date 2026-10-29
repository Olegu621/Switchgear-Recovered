            package p000;

            import java.security.GeneralSecurityException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class iy0 extends AbstractC2211ta {

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f11962c;

                public iy0(byte[] bArr, int i) throws GeneralSecurityException {
/* 1 */             this.f11962c = i;
/* 11 */            if (!pm2.m7478a(1)) {
/* 29 */                ds0.m3203t("Can not use ChaCha20Poly1305 in FIPS-mode.");
/* 33 */                throw null;
                    }
/* 17 */            this.f17000a = mo5626m(bArr, 1);
/* 24 */            this.f17001b = mo5626m(bArr, 0);
                }

                @Override // p000.AbstractC2211ta
                /* JADX INFO: renamed from: m */
                public final AbstractC1006hw mo5626m(byte[] bArr, int i) {
                    switch (this.f11962c) {
                        case 0:
/* 16 */                    return new hy0(bArr, i, 0);
                        default:
/* 9 */                     return new hy0(bArr, i, 1);
                    }
                }
            }
