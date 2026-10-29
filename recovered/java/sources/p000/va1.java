            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class va1 {

                /* JADX INFO: renamed from: a */
                public final int f17947a;

                /* JADX INFO: renamed from: b */
                public final int f17948b;

                public va1(int i, int i2) {
/* 4 */             this.f17947a = i;
/* 6 */             this.f17948b = i2;
                }

                /* JADX INFO: renamed from: a */
                public abstract byte[] mo2884a();

                /* JADX INFO: renamed from: b */
                public abstract byte[] mo2885b(byte[] bArr, int i);

                public final String toString() {
                    char c;
/* 1 */             int i = this.f17947a;
/* 3 */             byte[] bArrMo2885b = new byte[i];
/* 9 */             int i2 = this.f17948b;
/* 12 */            StringBuilder sb = new StringBuilder((i + 1) * i2);
/* 17 */            for (int i3 = 0; i3 < i2; i3++) {
/* 19 */                bArrMo2885b = mo2885b(bArrMo2885b, i3);
/* 24 */                for (int i4 = 0; i4 < i; i4++) {
/* 28 */                    int i5 = bArrMo2885b[i4] & 255;
/* 32 */                    if (i5 < 64) {
/* 34 */                        c = '#';
                            } else if (i5 < 128) {
/* 41 */                        c = '+';
                            } else {
/* 51 */                        c = i5 < 192 ? '.' : ' ';
                            }
/* 53 */                    sb.append(c);
                        }
/* 61 */                sb.append('\n');
                    }
/* 67 */            return sb.toString();
                }
            }
