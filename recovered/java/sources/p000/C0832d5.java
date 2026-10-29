            package p000;

            import android.text.TextUtils;
            
            /* JADX INFO: renamed from: d5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final class C0832d5 implements dd0 {

                /* JADX INFO: renamed from: U */
                public static final C0832d5 f6981U;

                /* JADX INFO: renamed from: V */
                public static final C0832d5 f6982V;

                /* JADX INFO: renamed from: W */
                public static final C0832d5 f6983W;

                /* JADX INFO: renamed from: X */
                public static final C0832d5 f6984X;

                /* JADX INFO: renamed from: Y */
                public static final C0832d5 f6985Y;

                /* JADX INFO: renamed from: Z */
                public static final C0832d5 f6986Z;

                /* JADX INFO: renamed from: c */
                public static final C0832d5 f6987c;

                /* JADX INFO: renamed from: d */
                public static final C0832d5 f6988d;

                /* JADX INFO: renamed from: e */
                public static final C0832d5 f6989e;

                /* JADX INFO: renamed from: f */
                public static final C0832d5 f6990f;

                /* JADX INFO: renamed from: i */
                public static final C0832d5 f6991i;

                /* JADX INFO: renamed from: v */
                public static final C0832d5 f6992v;

                /* JADX INFO: renamed from: w */
                public static final C0832d5 f6993w;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f6994a;

                /* JADX INFO: renamed from: b */
                public String f6995b;

                static {
/* 5 */             int i = 0;
/* 9 */             f6987c = new C0832d5("TINK", i);
/* 18 */            f6988d = new C0832d5("CRUNCHY", i);
/* 27 */            f6989e = new C0832d5("NO_PREFIX", i);
/* 33 */            int i2 = 1;
/* 37 */            f6990f = new C0832d5("TINK", i2);
/* 46 */            f6991i = new C0832d5("CRUNCHY", i2);
/* 55 */            f6992v = new C0832d5("NO_PREFIX", i2);
/* 61 */            int i3 = 2;
/* 65 */            f6993w = new C0832d5("VERTICAL", i3);
/* 74 */            f6981U = new C0832d5("HORIZONTAL", i3);
/* 80 */            int i4 = 3;
/* 84 */            f6982V = new C0832d5("SHA1", i4);
/* 93 */            f6983W = new C0832d5("SHA224", i4);
/* 102 */           f6984X = new C0832d5("SHA256", i4);
/* 111 */           f6985Y = new C0832d5("SHA384", i4);
/* 120 */           f6986Z = new C0832d5("SHA512", i4);
                }

                public /* synthetic */ C0832d5(String str, int i) {
/* 1 */             this.f6994a = i;
/* 3 */             this.f6995b = str;
                }

                @Override // p000.dd0
                /* JADX INFO: renamed from: b */
                public Object mo2925b() {
/* 1 */             return this;
                }

                @Override // p000.dd0
                /* JADX INFO: renamed from: c */
                public boolean mo2926c(CharSequence charSequence, int i, int i2, qs2 qs2Var) {
/* 11 */            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f6995b)) {
/* 23 */                return true;
                    }
/* 19 */            qs2Var.f15734c = (qs2Var.f15734c & 3) | 4;
/* 21 */            return false;
                }

                public String toString() {
                    switch (this.f6994a) {
                        case 0:
/* 20 */                    return this.f6995b;
                        case 1:
/* 17 */                    return this.f6995b;
                        case 2:
/* 14 */                    return this.f6995b;
                        case 3:
/* 11 */                    return this.f6995b;
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
