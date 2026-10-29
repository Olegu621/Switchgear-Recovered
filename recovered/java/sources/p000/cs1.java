            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cs1 extends va1 {

                /* JADX INFO: renamed from: c */
                public final byte[] f6894c;

                /* JADX INFO: renamed from: d */
                public final int f6895d;

                /* JADX INFO: renamed from: e */
                public final int f6896e;

                /* JADX INFO: renamed from: f */
                public final int f6897f;

                /* JADX INFO: renamed from: g */
                public final int f6898g;

                public cs1(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
/* 1 */             super(i5, i6);
/* 5 */             if (i5 + i3 > i || i6 + i4 > i2) {
/* 23 */                C1951n4.m6859j("Crop rectangle does not fit within image data.");
/* 27 */                throw null;
                    }
/* 10 */            this.f6894c = bArr;
/* 12 */            this.f6895d = i;
/* 14 */            this.f6896e = i2;
/* 16 */            this.f6897f = i3;
/* 18 */            this.f6898g = i4;
                }

                @Override // p000.va1
                /* JADX INFO: renamed from: a */
                public final byte[] mo2884a() {
/* 1 */             byte[] bArr = this.f6894c;
/* 3 */             int i = this.f17947a;
/* 5 */             int i2 = this.f17948b;
/* 7 */             int i3 = this.f6895d;
/* 9 */             if (i == i3 && i2 == this.f6896e) {
/* 15 */                return bArr;
                    }
/* 16 */            int i4 = i * i2;
/* 18 */            byte[] bArr2 = new byte[i4];
/* 25 */            int i5 = (this.f6898g * i3) + this.f6897f;
/* 27 */            if (i == i3) {
/* 29 */                System.arraycopy(bArr, i5, bArr2, 0, i4);
/* 32 */                return bArr2;
                    }
/* 33 */            for (int i6 = 0; i6 < i2; i6++) {
/* 37 */                System.arraycopy(bArr, i5, bArr2, i6 * i, i);
/* 40 */                i5 += i3;
                    }
/* 44 */            return bArr2;
                }

                @Override // p000.va1
                /* JADX INFO: renamed from: b */
                public final byte[] mo2885b(byte[] bArr, int i) {
/* 1 */             if (i < 0 || i >= this.f17948b) {
/* 42 */                C1951n4.m6859j("Requested row is outside the image: ".concat(String.valueOf(i)));
/* 45 */                return null;
                    }
/* 7 */             int i2 = this.f17947a;
/* 9 */             if (bArr == null || bArr.length < i2) {
/* 14 */                bArr = new byte[i2];
                    }
/* 28 */            System.arraycopy(this.f6894c, ((i + this.f6898g) * this.f6895d) + this.f6897f, bArr, 0, i2);
/* 31 */            return bArr;
                }
            }
