            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ph3 {

                /* JADX INFO: renamed from: a */
                public final String f15131a;

                /* JADX INFO: renamed from: b */
                public final Class f15132b;

                /* JADX INFO: renamed from: c */
                public final boolean f15133c;

                /* JADX INFO: renamed from: d */
                public final boolean f15134d;

                /* JADX INFO: renamed from: e */
                public final long f15135e;

                public ph3(String str, Class cls, boolean z, boolean z2) {
/* 9 */             if (str.isEmpty()) {
/* 120 */               C1951n4.m6859j("identifier must not be empty");
/* 123 */               throw null;
                    }
/* 12 */            char cCharAt = str.charAt(0);
/* 24 */            if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
/* 114 */               C1951n4.m6859j("identifier must start with an ASCII letter: ".concat(str));
/* 117 */               throw null;
                    }
/* 37 */            for (int i = 1; i < str.length(); i++) {
/* 39 */                char cCharAt2 = str.charAt(i);
/* 43 */                if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
/* 73 */                    C1951n4.m6859j("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
/* 76 */                    throw null;
                        }
                    }
/* 77 */            this.f15131a = str;
/* 79 */            this.f15132b = cls;
/* 81 */            this.f15133c = z;
/* 83 */            this.f15134d = z2;
/* 85 */            int iIdentityHashCode = System.identityHashCode(this);
/* 89 */            long j = 0;
/* 92 */            for (int i2 = 0; i2 < 5; i2++) {
/* 99 */                j |= 1 << (iIdentityHashCode & 63);
/* 100 */               iIdentityHashCode >>>= 6;
                    }
/* 105 */           this.f15135e = j;
                }

                /* JADX INFO: renamed from: a */
                public void mo1655a(Iterator it, ii3 ii3Var) {
/* 5 */             while (it.hasNext()) {
/* 11 */                mo1656b(it.next(), ii3Var);
                    }
                }

                /* JADX INFO: renamed from: b */
                public void mo1656b(Object obj, ii3 ii3Var) {
/* 3 */             ii3Var.m4549a(this.f15131a, obj);
                }

                /* JADX INFO: renamed from: c */
                public final void m7452c(Iterator it, ii3 ii3Var) {
/* 3 */             if (!this.f15133c) {
/* 46 */                f42.m3656l("non repeating key");
                    } else if (!this.f15134d || ((xk3) xk3.f19242b.get()).f19243a <= 20) {
/* 40 */                mo1655a(it, ii3Var);
                    } else {
/* 27 */                while (it.hasNext()) {
/* 35 */                    ii3Var.m4549a(this.f15131a, it.next());
                        }
                    }
                }

                public final String toString() {
/* 5 */             String name = getClass().getName();
/* 11 */            String name2 = this.f15132b.getName();
/* 15 */            int length = name.length();
/* 19 */            String str = this.f15131a;
/* 39 */            StringBuilder sb = new StringBuilder(length + 1 + str.length() + 1 + name2.length() + 1);
/* 46 */            fm0.m3796v(sb, name, "/", str, "[");
/* 51 */            return fm0.m3789o(sb, name2, "]");
                }
            }
