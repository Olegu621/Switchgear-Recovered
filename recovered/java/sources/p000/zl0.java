            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zl0 {

                /* JADX INFO: renamed from: c */
                public static final int[][] f20233c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

                /* JADX INFO: renamed from: a */
                public final int f20234a;

                /* JADX INFO: renamed from: b */
                public final byte f20235b;

                public zl0(int i) {
/* 6 */             int i2 = (i >> 3) & 3;
/* 8 */             if (i2 >= 0) {
/* 10 */                int[] iArr = AbstractC0886en.f7804b;
/* 13 */                if (i2 < 4) {
/* 17 */                    this.f20234a = iArr[i2];
/* 22 */                    this.f20235b = (byte) (i & 7);
/* 24 */                    return;
                        }
                    }
/* 25 */            f42.m3649e();
/* 29 */            throw null;
                }

                /* JADX INFO: renamed from: a */
                public static zl0 m10401a(int i, int i2) {
                    int iBitCount;
/* 1 */             int i3 = AbstractC0208c9.API_PRIORITY_OTHER;
/* 6 */             int i4 = 0;
/* 9 */             for (int i5 = 0; i5 < 32; i5++) {
/* 13 */                int[] iArr = f20233c[i5];
/* 15 */                int i6 = iArr[0];
/* 18 */                if (i6 == i || i6 == i2) {
/* 54 */                    return new zl0(iArr[1]);
                        }
/* 25 */                int iBitCount2 = Integer.bitCount(i ^ i6);
/* 29 */                if (iBitCount2 < i3) {
/* 31 */                    i4 = iArr[1];
/* 33 */                    i3 = iBitCount2;
                        }
/* 34 */                if (i != i2 && (iBitCount = Integer.bitCount(i6 ^ i2)) < i3) {
/* 43 */                    i4 = iArr[1];
/* 46 */                    i3 = iBitCount;
                        }
                    }
/* 59 */            if (i3 <= 3) {
/* 63 */                return new zl0(i4);
                    }
/* 67 */            return null;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof zl0)) {
/* 22 */                return false;
                    }
/* 6 */             zl0 zl0Var = (zl0) obj;
                    return this.f20234a == zl0Var.f20234a && this.f20235b == zl0Var.f20235b;
                }

                public final int hashCode() {
/* 11 */            return this.f20235b | (AbstractC0886en.m3520y(this.f20234a) << 3);
                }
            }
