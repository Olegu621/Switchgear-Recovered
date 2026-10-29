            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: r7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2134r7 {

                /* JADX INFO: renamed from: a */
                public final C2183sj f15887a;

                /* JADX INFO: renamed from: c */
                public final int f15889c;

                /* JADX INFO: renamed from: d */
                public final int f15890d;

                /* JADX INFO: renamed from: e */
                public final int f15891e;

                /* JADX INFO: renamed from: f */
                public final int f15892f;

                /* JADX INFO: renamed from: g */
                public final float f15893g;

                /* JADX INFO: renamed from: b */
                public final ArrayList f15888b = new ArrayList(5);

                /* JADX INFO: renamed from: h */
                public final int[] f15894h = new int[3];

                public C2134r7(C2183sj c2183sj, int i, int i2, int i3, int i4, float f) {
/* 4 */             this.f15887a = c2183sj;
/* 14 */            this.f15889c = i;
/* 16 */            this.f15890d = i2;
/* 18 */            this.f15891e = i3;
/* 20 */            this.f15892f = i4;
/* 22 */            this.f15893g = f;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m8076a(int[] iArr) {
/* 3 */             float f = this.f15893g;
/* 5 */             float f2 = f / 2.0f;
/* 10 */            for (int i = 0; i < 3; i++) {
/* 23 */                if (Math.abs(f - iArr[i]) >= f2) {
/* 7 */                     return false;
                        }
                    }
/* 29 */            return true;
                }

                /* JADX INFO: renamed from: b */
                public final C2097q7 m8077b(int i, int i2, int[] iArr) {
/* 2 */             int i3 = iArr[0];
/* 5 */             int i4 = iArr[1];
/* 9 */             int i5 = iArr[2];
/* 11 */            int i6 = i3 + i4 + i5;
/* 19 */            float f = (i2 - i5) - (i4 / 2.0f);
/* 20 */            int i7 = (int) f;
/* 21 */            int i8 = i4 * 2;
/* 22 */            C2183sj c2183sj = this.f15887a;
/* 24 */            int i9 = c2183sj.f16652b;
/* 26 */            int[] iArr2 = this.f15894h;
/* 28 */            iArr2[0] = 0;
/* 30 */            iArr2[1] = 0;
/* 32 */            iArr2[2] = 0;
/* 34 */            int i10 = i;
/* 35 */            while (i10 >= 0 && c2183sj.m8516b(i7, i10)) {
/* 43 */                int i11 = iArr2[1];
/* 45 */                if (i11 > i8) {
                            break;
                        }
/* 49 */                iArr2[1] = i11 + 1;
/* 51 */                i10--;
                    }
/* 54 */            float f2 = Float.NaN;
/* 56 */            if (i10 >= 0 && iArr2[1] <= i8) {
/* 64 */                while (i10 >= 0 && !c2183sj.m8516b(i7, i10)) {
/* 72 */                    int i12 = iArr2[0];
/* 74 */                    if (i12 > i8) {
                                break;
                            }
/* 78 */                    iArr2[0] = i12 + 1;
/* 80 */                    i10--;
                        }
/* 85 */                if (iArr2[0] <= i8) {
/* 88 */                    int i13 = i + 1;
/* 90 */                    while (i13 < i9 && c2183sj.m8516b(i7, i13)) {
/* 98 */                        int i14 = iArr2[1];
/* 100 */                       if (i14 > i8) {
                                    break;
                                }
/* 104 */                       iArr2[1] = i14 + 1;
/* 106 */                       i13++;
                            }
/* 109 */                   if (i13 != i9 && iArr2[1] <= i8) {
/* 116 */                       while (i13 < i9 && !c2183sj.m8516b(i7, i13)) {
/* 124 */                           int i15 = iArr2[2];
/* 126 */                           if (i15 > i8) {
                                        break;
                                    }
/* 130 */                           iArr2[2] = i15 + 1;
/* 132 */                           i13++;
                                }
/* 135 */                       int i16 = iArr2[2];
/* 137 */                       if (i16 <= i8 && Math.abs(((iArr2[0] + iArr2[1]) + i16) - i6) * 5 < i6 * 2 && m8076a(iArr2)) {
/* 171 */                           f2 = (i13 - iArr2[2]) - (iArr2[1] / 2.0f);
                                }
                            }
                        }
                    }
/* 177 */           if (Float.isNaN(f2)) {
/* 273 */               return null;
                    }
/* 190 */           float f3 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
/* 191 */           ArrayList<C2097q7> arrayList = this.f15888b;
/* 201 */           for (C2097q7 c2097q7 : arrayList) {
/* 209 */               float f4 = c2097q7.f15429c;
/* 211 */               float f5 = c2097q7.f16425a;
/* 213 */               float f6 = c2097q7.f16426b;
/* 223 */               if (Math.abs(f2 - f6) <= f3 && Math.abs(f - f5) <= f3) {
/* 237 */                   float fAbs = Math.abs(f3 - f4);
/* 245 */                   if (fAbs <= 1.0f || fAbs <= f4) {
/* 261 */                       return new C2097q7((f5 + f) / 2.0f, (f6 + f2) / 2.0f, (c2097q7.f15429c + f3) / 2.0f);
                            }
                        }
                    }
/* 270 */           arrayList.add(new C2097q7(f, f2, f3));
/* 273 */           return null;
                }
            }
