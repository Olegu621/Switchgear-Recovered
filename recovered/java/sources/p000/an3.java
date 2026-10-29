            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class an3 extends cn3 {

                /* JADX INFO: renamed from: c */
                public final byte[] f344c;

                public an3(byte[] bArr) {
/* 5 */             this.f3020a = 0;
/* 7 */             bArr.getClass();
/* 10 */            this.f344c = bArr;
                }

                @Override // p000.cn3
                /* JADX INFO: renamed from: a */
                public byte mo318a(int i) {
/* 3 */             return this.f344c[i];
                }

                @Override // p000.cn3
                /* JADX INFO: renamed from: b */
                public byte mo319b(int i) {
/* 3 */             return this.f344c[i];
                }

                @Override // p000.cn3
                /* JADX INFO: renamed from: c */
                public int mo320c() {
/* 3 */             return this.f344c.length;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 83 */                return true;
                    }
/* 7 */             if ((obj instanceof cn3) && mo320c() == ((cn3) obj).mo320c()) {
/* 28 */                if (mo320c() == 0) {
/* 83 */                    return true;
                        }
/* 33 */                if (!(obj instanceof an3)) {
/* 139 */                   return obj.equals(this);
                        }
/* 35 */                an3 an3Var = (an3) obj;
/* 37 */                int i = this.f3020a;
/* 39 */                int i2 = an3Var.f3020a;
/* 41 */                if (i == 0 || i2 == 0 || i == i2) {
/* 47 */                    int iMo320c = mo320c();
/* 55 */                    if (iMo320c > an3Var.mo320c()) {
/* 112 */                       int iMo320c2 = mo320c();
/* 135 */                       pk3.m7474j(String.valueOf(iMo320c).length() + 18 + String.valueOf(iMo320c2).length(), iMo320c, iMo320c2);
/* 6 */                         return false;
                            }
/* 61 */                    if (iMo320c > an3Var.mo320c()) {
/* 85 */                        int iMo320c3 = an3Var.mo320c();
/* 108 */                       pk3.m7467c(String.valueOf(iMo320c).length() + 27 + String.valueOf(iMo320c3).length(), iMo320c, iMo320c3);
/* 6 */                         return false;
                            }
/* 63 */                    byte[] bArr = an3Var.f344c;
/* 65 */                    int i3 = 0;
/* 66 */                    int i4 = 0;
/* 67 */                    while (i3 < iMo320c) {
/* 75 */                        if (this.f344c[i3] == bArr[i4]) {
/* 78 */                            i3++;
/* 80 */                            i4++;
                                }
                            }
/* 83 */                    return true;
                        }
                    }
/* 6 */             return false;
                }
            }
