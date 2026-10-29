            package p000;

            import java.util.Objects;
            import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class j63 implements WebMessagePayloadBoundaryInterface {

                /* JADX INFO: renamed from: a */
                public final int f12102a;

                /* JADX INFO: renamed from: b */
                public final String f12103b;

                /* JADX INFO: renamed from: c */
                public final byte[] f12104c;

                public j63(String str) {
/* 5 */             this.f12102a = 0;
/* 7 */             this.f12103b = str;
/* 10 */            this.f12104c = null;
                }

                /* JADX INFO: renamed from: a */
                public final void m5722a(int i) {
/* 1 */             int i2 = this.f12102a;
/* 3 */             if (i2 == i) {
/* 5 */                 return;
                    }
/* 14 */            f42.m3656l(AbstractC0886en.m3506j("Expected ", i, i2, ", but type is "));
                }

                @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
                public final byte[] getAsArrayBuffer() {
/* 2 */             m5722a(1);
/* 5 */             byte[] bArr = this.f12104c;
/* 7 */             Objects.requireNonNull(bArr);
/* 10 */            return bArr;
                }

                @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
                public final String getAsString() {
/* 2 */             m5722a(0);
/* 5 */             return this.f12103b;
                }

                @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
                public final String[] getSupportedFeatures() {
/* 2 */             return new String[0];
                }

                @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
                public final int getType() {
/* 1 */             return this.f12102a;
                }

/* 12 */        public j63(byte[] bArr) {
/* 14 */            this.f12102a = 1;
/* 15 */            this.f12103b = null;
/* 16 */            this.f12104c = bArr;
                }
            }
