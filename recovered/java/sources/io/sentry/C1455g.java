            package io.sentry;

            import java.util.Iterator;
            import p000.C1951n4;
            import p000.f42;
            
            /* JADX INFO: renamed from: io.sentry.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1455g implements Iterator {

                /* JADX INFO: renamed from: a */
                public int f10946a;

                /* JADX INFO: renamed from: b */
                public int f10947b = -1;

                /* JADX INFO: renamed from: c */
                public boolean f10948c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C1464h f10949d;

                public C1455g(C1464h c1464h) {
/* 4 */             this.f10949d = c1464h;
/* 8 */             this.f10946a = c1464h.f10966b;
/* 15 */            this.f10948c = c1464h.f10968d;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f10948c || this.f10946a != this.f10949d.f10967c;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 31 */                C1951n4.m6864o();
/* 34 */                return null;
                    }
/* 8 */             this.f10948c = false;
/* 10 */            int i = this.f10946a;
/* 12 */            this.f10947b = i;
/* 14 */            int i2 = i + 1;
/* 16 */            C1464h c1464h = this.f10949d;
/* 24 */            this.f10946a = i2 < c1464h.f10969e ? i2 : 0;
/* 28 */            return c1464h.f10965a[i];
                }

                @Override // java.util.Iterator
                public final void remove() {
                    int i;
/* 1 */             C1464h c1464h = this.f10949d;
/* 3 */             int i2 = c1464h.f10969e;
/* 5 */             int i3 = this.f10947b;
/* 8 */             if (i3 == -1) {
/* 95 */                f42.m3664t();
/* 98 */                return;
                    }
/* 10 */            int i4 = c1464h.f10966b;
/* 12 */            if (i3 == i4) {
/* 14 */                c1464h.remove();
/* 17 */                this.f10947b = -1;
/* 19 */                return;
                    }
/* 20 */            int i5 = i3 + 1;
/* 23 */            if (i4 >= i3 || i5 >= (i = c1464h.f10967c)) {
/* 38 */                while (i5 != c1464h.f10967c) {
/* 40 */                    Object[] objArr = c1464h.f10965a;
/* 42 */                    if (i5 >= i2) {
/* 48 */                        objArr[i5 - 1] = objArr[0];
                            } else {
/* 52 */                        int i6 = i5 - 1;
/* 54 */                        if (i6 < 0) {
/* 56 */                            i6 = i2 - 1;
                                }
/* 60 */                        objArr[i6] = objArr[i5];
/* 62 */                        i5++;
/* 64 */                        if (i5 >= i2) {
                                }
                            }
/* 50 */                    i5 = 0;
                        }
                    } else {
/* 29 */                Object[] objArr2 = c1464h.f10965a;
/* 32 */                System.arraycopy(objArr2, i5, objArr2, i3, i - i5);
                    }
/* 67 */            this.f10947b = -1;
/* 71 */            int i7 = c1464h.f10967c - 1;
/* 72 */            if (i7 < 0) {
/* 74 */                i7 = i2 - 1;
                    }
/* 76 */            c1464h.f10967c = i7;
/* 81 */            c1464h.f10965a[i7] = null;
/* 83 */            c1464h.f10968d = false;
/* 87 */            int i8 = this.f10946a - 1;
/* 88 */            if (i8 < 0) {
/* 90 */                i8 = i2 - 1;
                    }
/* 92 */            this.f10946a = i8;
                }
            }
