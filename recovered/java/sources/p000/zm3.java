            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zm3 extends an3 {

                /* JADX INFO: renamed from: d */
                public final int f20266d;

                public zm3(byte[] bArr, int i) {
/* 1 */             super(bArr);
/* 6 */             cn3.m1732e(0, i, bArr.length);
/* 9 */             this.f20266d = i;
                }

                @Override // p000.an3, p000.cn3
                /* JADX INFO: renamed from: a */
                public final byte mo318a(int i) {
/* 3 */             int i2 = this.f20266d;
/* 8 */             if (((i2 - (i + 1)) | i) >= 0) {
/* 89 */                return this.f344c[i];
                    }
/* 12 */            if (i < 0) {
/* 38 */                throw new ArrayIndexOutOfBoundsException(fm0.m3788n(new StringBuilder(String.valueOf(i).length() + 11), "Index < 0: ", i));
                    }
/* 60 */            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
/* 65 */            sb.append("Index > length: ");
/* 68 */            sb.append(i);
/* 73 */            sb.append(", ");
/* 76 */            sb.append(i2);
/* 86 */            throw new ArrayIndexOutOfBoundsException(sb.toString());
                }

                @Override // p000.an3, p000.cn3
                /* JADX INFO: renamed from: b */
                public final byte mo319b(int i) {
/* 3 */             return this.f344c[i];
                }

                @Override // p000.an3, p000.cn3
                /* JADX INFO: renamed from: c */
                public final int mo320c() {
/* 1 */             return this.f20266d;
                }
            }
