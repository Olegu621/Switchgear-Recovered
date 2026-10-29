            package p000;

            import androidx.core.app.NotificationCompat;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wq0 {

                /* JADX INFO: renamed from: h */
                public static final wq0 f18732h;

                /* JADX INFO: renamed from: a */
                public final int[] f18733a;

                /* JADX INFO: renamed from: b */
                public final int[] f18734b;

                /* JADX INFO: renamed from: c */
                public final wc0 f18735c;

                /* JADX INFO: renamed from: d */
                public final wc0 f18736d;

                /* JADX INFO: renamed from: e */
                public final int f18737e;

                /* JADX INFO: renamed from: f */
                public final int f18738f;

                /* JADX INFO: renamed from: g */
                public final int f18739g;

                static {
/* 8 */             new wq0(4201, 4096, 1);
/* 17 */            new wq0(1033, Segment.SHARE_MINIMUM, 1);
/* 26 */            new wq0(67, 64, 1);
/* 35 */            new wq0(19, 16, 1);
/* 48 */            f18732h = new wq0(285, NotificationCompat.FLAG_LOCAL_ONLY, 0);
/* 54 */            new wq0(301, NotificationCompat.FLAG_LOCAL_ONLY, 1);
                }

                public wq0(int i, int i2, int i3) {
/* 4 */             this.f18738f = i;
/* 6 */             this.f18737e = i2;
/* 8 */             this.f18739g = i3;
/* 12 */            this.f18733a = new int[i2];
/* 16 */            this.f18734b = new int[i2];
/* 20 */            int i4 = 1;
/* 22 */            for (int i5 = 0; i5 < i2; i5++) {
/* 26 */                this.f18733a[i5] = i4;
/* 28 */                i4 <<= 1;
/* 29 */                if (i4 >= i2) {
/* 34 */                    i4 = (i4 ^ i) & (i2 - 1);
                        }
                    }
/* 41 */            for (int i6 = 0; i6 < i2 - 1; i6++) {
/* 49 */                this.f18734b[this.f18733a[i6]] = i6;
                    }
/* 63 */            this.f18735c = new wc0(this, new int[]{0});
/* 74 */            this.f18736d = new wc0(this, new int[]{1});
                }

                /* JADX INFO: renamed from: a */
                public final int m9599a(int i) {
/* 1 */             if (i == 0) {
/* 22 */                throw new ArithmeticException();
                    }
/* 14 */            return this.f18733a[(this.f18737e - this.f18734b[i]) - 1];
                }

                /* JADX INFO: renamed from: b */
                public final int m9600b(int i, int i2) {
/* 1 */             if (i == 0 || i2 == 0) {
/* 23 */                return 0;
                    }
/* 6 */             int[] iArr = this.f18734b;
/* 20 */            return this.f18733a[(iArr[i] + iArr[i2]) % (this.f18737e - 1)];
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("GF(0x");
/* 14 */            sb.append(Integer.toHexString(this.f18738f));
/* 19 */            sb.append(',');
/* 26 */            return AbstractC0886en.m3510n(sb, this.f18737e, ')');
                }
            }
