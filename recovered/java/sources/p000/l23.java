            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class l23 {

                /* JADX INFO: renamed from: a */
                public int f13084a;

                /* JADX INFO: renamed from: b */
                public int f13085b;

                /* JADX INFO: renamed from: c */
                public int f13086c;

                /* JADX INFO: renamed from: d */
                public int f13087d;

                /* JADX INFO: renamed from: e */
                public int f13088e;

                /* JADX INFO: renamed from: a */
                public final boolean m6332a() {
                    int i;
                    int i2;
                    int i3;
/* 1 */             int i4 = this.f13084a;
/* 5 */             int i5 = 2;
/* 8 */             if ((i4 & 7) != 0) {
/* 10 */                int i6 = this.f13087d;
/* 12 */                int i7 = this.f13085b;
/* 14 */                if (i6 > i7) {
/* 16 */                    i3 = 1;
                        } else {
/* 22 */                    i3 = i6 == i7 ? 2 : 4;
                        }
/* 24 */                if ((i3 & i4) == 0) {
/* 93 */                    return false;
                        }
                    }
/* 29 */            if ((i4 & 112) != 0) {
/* 31 */                int i8 = this.f13087d;
/* 33 */                int i9 = this.f13086c;
/* 35 */                if (i8 > i9) {
/* 37 */                    i2 = 1;
                        } else {
/* 43 */                    i2 = i8 == i9 ? 2 : 4;
                        }
/* 46 */                if (((i2 << 4) & i4) == 0) {
/* 93 */                    return false;
                        }
                    }
/* 51 */            if ((i4 & 1792) != 0) {
/* 53 */                int i10 = this.f13088e;
/* 55 */                int i11 = this.f13085b;
/* 57 */                if (i10 > i11) {
/* 59 */                    i = 1;
                        } else {
/* 65 */                    i = i10 == i11 ? 2 : 4;
                        }
/* 69 */                if (((i << 8) & i4) == 0) {
/* 93 */                    return false;
                        }
                    }
/* 74 */            if ((i4 & 28672) != 0) {
/* 76 */                int i12 = this.f13088e;
/* 78 */                int i13 = this.f13086c;
/* 80 */                if (i12 > i13) {
/* 82 */                    i5 = 1;
                        } else if (i12 != i13) {
/* 87 */                    i5 = 4;
                        }
/* 91 */                if (((i5 << 12) & i4) == 0) {
/* 93 */                    return false;
                        }
                    }
/* 7 */             return true;
                }
            }
