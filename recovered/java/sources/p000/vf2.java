            package p000;

            import android.content.res.ColorStateList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vf2 implements Cloneable {

                /* JADX INFO: renamed from: d */
                public static final Object f18039d = new Object();

                /* JADX INFO: renamed from: a */
                public int[] f18040a;

                /* JADX INFO: renamed from: b */
                public Object[] f18041b;

                /* JADX INFO: renamed from: c */
                public int f18042c;

                public vf2() {
                    int i;
/* 5 */             int i2 = 4;
                    while (true) {
/* 8 */                 i = 40;
/* 10 */                if (i2 >= 32) {
                            break;
                        }
/* 14 */                int i3 = (1 << i2) - 12;
/* 16 */                if (40 <= i3) {
/* 18 */                    i = i3;
                            break;
                        }
/* 20 */                i2++;
                    }
/* 23 */            int i4 = i / 4;
/* 26 */            this.f18040a = new int[i4];
/* 30 */            this.f18041b = new Object[i4];
                }

                /* JADX INFO: renamed from: a */
                public final void m9264a(int i, ColorStateList colorStateList) {
/* 1 */             int i2 = this.f18042c;
/* 3 */             if (i2 != 0 && i <= this.f18040a[i2 - 1]) {
/* 13 */                m9266c(i, colorStateList);
/* 16 */                return;
                    }
/* 21 */            if (i2 >= this.f18040a.length) {
/* 26 */                int i3 = (i2 + 1) * 4;
/* 30 */                for (int i4 = 4; i4 < 32; i4++) {
/* 34 */                    int i5 = (1 << i4) - 12;
/* 36 */                    if (i3 <= i5) {
/* 38 */                        i3 = i5;
                                break;
                            }
                        }
/* 43 */                int i6 = i3 / 4;
/* 44 */                int[] iArr = new int[i6];
/* 46 */                Object[] objArr = new Object[i6];
/* 48 */                int[] iArr2 = this.f18040a;
/* 52 */                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
/* 55 */                Object[] objArr2 = this.f18041b;
/* 58 */                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
/* 61 */                this.f18040a = iArr;
/* 63 */                this.f18041b = objArr;
                    }
/* 67 */            this.f18040a[i2] = i;
/* 71 */            this.f18041b[i2] = colorStateList;
/* 74 */            this.f18042c = i2 + 1;
                }

                /* JADX INFO: renamed from: b */
                public final Object m9265b(int i) {
                    Object obj;
/* 5 */             int iM7586I = py0.m7586I(this.f18042c, i, this.f18040a);
/* 9 */             if (iM7586I < 0 || (obj = this.f18041b[iM7586I]) == f18039d) {
/* 21 */                return null;
                    }
/* 20 */            return obj;
                }

                /* JADX INFO: renamed from: c */
                public final void m9266c(int i, Object obj) {
/* 5 */             int iM7586I = py0.m7586I(this.f18042c, i, this.f18040a);
/* 9 */             if (iM7586I >= 0) {
/* 13 */                this.f18041b[iM7586I] = obj;
/* 15 */                return;
                    }
/* 16 */            int i2 = ~iM7586I;
/* 17 */            int i3 = this.f18042c;
/* 19 */            if (i2 < i3) {
/* 21 */                Object[] objArr = this.f18041b;
/* 27 */                if (objArr[i2] == f18039d) {
/* 31 */                    this.f18040a[i2] = i;
/* 33 */                    objArr[i2] = obj;
/* 35 */                    return;
                        }
                    }
/* 40 */            if (i3 >= this.f18040a.length) {
/* 44 */                int i4 = (i3 + 1) * 4;
/* 48 */                for (int i5 = 4; i5 < 32; i5++) {
/* 52 */                    int i6 = (1 << i5) - 12;
/* 54 */                    if (i4 <= i6) {
/* 56 */                        i4 = i6;
                                break;
                            }
                        }
/* 61 */                int i7 = i4 / 4;
/* 62 */                int[] iArr = new int[i7];
/* 64 */                Object[] objArr2 = new Object[i7];
/* 66 */                int[] iArr2 = this.f18040a;
/* 70 */                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
/* 73 */                Object[] objArr3 = this.f18041b;
/* 76 */                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
/* 79 */                this.f18040a = iArr;
/* 81 */                this.f18041b = objArr2;
                    }
/* 85 */            int i8 = this.f18042c - i2;
/* 86 */            if (i8 != 0) {
/* 88 */                int[] iArr3 = this.f18040a;
/* 90 */                int i9 = i2 + 1;
/* 92 */                System.arraycopy(iArr3, i2, iArr3, i9, i8);
/* 95 */                Object[] objArr4 = this.f18041b;
/* 100 */               System.arraycopy(objArr4, i2, objArr4, i9, this.f18042c - i2);
                    }
/* 105 */           this.f18040a[i2] = i;
/* 109 */           this.f18041b[i2] = obj;
/* 114 */           this.f18042c++;
                }

                public final Object clone() {
                    try {
/* 5 */                 vf2 vf2Var = (vf2) super.clone();
/* 15 */                vf2Var.f18040a = (int[]) this.f18040a.clone();
/* 25 */                vf2Var.f18041b = (Object[]) this.f18041b.clone();
/* 27 */                return vf2Var;
                    } catch (CloneNotSupportedException e) {
/* 29 */                C1951n4.m6856g(e);
/* 32 */                return null;
                    }
                }

                public final String toString() {
/* 1 */             int i = this.f18042c;
/* 3 */             if (i <= 0) {
/* 5 */                 return "{}";
                    }
/* 12 */            StringBuilder sb = new StringBuilder(i * 28);
/* 17 */            sb.append('{');
/* 23 */            for (int i2 = 0; i2 < this.f18042c; i2++) {
/* 25 */                if (i2 > 0) {
/* 29 */                    sb.append(", ");
                        }
/* 36 */                sb.append(this.f18040a[i2]);
/* 41 */                sb.append('=');
/* 46 */                Object obj = this.f18041b[i2];
/* 48 */                if (obj != this) {
/* 50 */                    sb.append(obj);
                        } else {
/* 56 */                    sb.append("(this Map)");
                        }
                    }
/* 64 */            sb.append('}');
/* 67 */            return sb.toString();
                }
            }
