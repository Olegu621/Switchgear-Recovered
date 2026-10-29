            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sz0 extends va1 {

                /* JADX INFO: renamed from: c */
                public final cs1 f16878c;

                public sz0(cs1 cs1Var) {
/* 5 */             super(cs1Var.f17947a, cs1Var.f17948b);
/* 8 */             this.f16878c = cs1Var;
                }

                @Override // p000.va1
                /* JADX INFO: renamed from: a */
                public final byte[] mo2884a() {
/* 3 */             byte[] bArrMo2884a = this.f16878c.mo2884a();
/* 11 */            int i = this.f17947a * this.f17948b;
/* 12 */            byte[] bArr = new byte[i];
/* 15 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                bArr[i2] = (byte) (255 - (bArrMo2884a[i2] & 255));
                    }
/* 29 */            return bArr;
                }

                @Override // p000.va1
                /* JADX INFO: renamed from: b */
                public final byte[] mo2885b(byte[] bArr, int i) {
/* 3 */             byte[] bArrMo2885b = this.f16878c.mo2885b(bArr, i);
/* 10 */            for (int i2 = 0; i2 < this.f17947a; i2++) {
/* 19 */                bArrMo2885b[i2] = (byte) (255 - (bArrMo2885b[i2] & 255));
                    }
/* 24 */            return bArrMo2885b;
                }
            }
