            package p000;

            import android.net.Uri;
            import java.util.EnumSet;
            import java.util.Map;
            import okhttp3.CookieJar;
            import okhttp3.OkHttpClient;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sm1 implements InterfaceC2273uy {

                /* JADX INFO: renamed from: a */
                public sm1 f16700a;

                /* JADX INFO: renamed from: b */
                public final String f16701b;

                /* JADX INFO: renamed from: c */
                public final int f16702c;

                /* JADX INFO: renamed from: d */
                public final int f16703d;

                /* JADX INFO: renamed from: e */
                public String f16704e;

                /* JADX INFO: renamed from: f */
                public Map f16705f;

                public sm1(String str, int i) {
/* 1 */             str.getClass();
/* 5 */             if (i == 0 || i == 0) {
/* 72 */                throw null;
                    }
/* 12 */            this.f16702c = i;
/* 18 */            String scheme = Uri.parse(str).getScheme();
/* 25 */            if (scheme == null) {
/* 27 */                this.f16703d = 2;
/* 33 */                this.f16701b = "https://".concat(str);
                    } else if (scheme.equals("https")) {
/* 44 */                this.f16703d = 2;
/* 46 */                this.f16701b = str;
                    } else if (scheme.equals("http")) {
/* 58 */                this.f16703d = 1;
/* 60 */                this.f16701b = str;
                    } else {
/* 63 */                this.f16703d = 2;
/* 69 */                this.f16701b = "https://".concat(str);
                    }
                }

                /* JADX INFO: renamed from: a */
                public final String m8574a() {
/* 1 */             String str = this.f16704e;
/* 3 */             if (str != null) {
/* 16 */                return str;
                    }
/* 5 */             sm1 sm1Var = this.f16700a;
/* 7 */             if (sm1Var != null) {
/* 9 */                 return sm1Var.m8574a();
                    }
/* 14 */            return null;
                }

                /* JADX INFO: renamed from: b */
                public final String m8575b() {
/* 1 */             String str = this.f16701b;
/* 3 */             if (str != null) {
/* 16 */                return str;
                    }
/* 5 */             sm1 sm1Var = this.f16700a;
/* 7 */             if (sm1Var != null) {
/* 9 */                 return sm1Var.m8575b();
                    }
/* 14 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public final int m8576c() {
/* 1 */             int i = this.f16702c;
/* 3 */             if (i != 0) {
/* 21 */                return i;
                    }
/* 5 */             sm1 sm1Var = this.f16700a;
/* 14 */            int iM8576c = sm1Var != null ? sm1Var.m8576c() : 0;
/* 15 */            if (iM8576c != 0) {
/* 20 */                return iM8576c;
                    }
/* 17 */            EnumSet enumSet = mc0.f13681a;
/* 19 */            return 2;
                }

                /* JADX INFO: renamed from: d */
                public final um1 m8577d() {
/* 1 */             sm1 sm1Var = this.f16700a;
/* 3 */             if (sm1Var != null) {
/* 5 */                 return sm1Var.m8577d();
                    }
/* 10 */            return null;
                }

                /* JADX INFO: renamed from: e */
                public final OkHttpClient m8578e() {
/* 1 */             sm1 sm1Var = this.f16700a;
/* 3 */             if (sm1Var != null) {
/* 5 */                 return sm1Var.m8578e();
                    }
/* 10 */            return null;
                }

                /* JADX INFO: renamed from: f */
                public final CookieJar m8579f() {
/* 1 */             sm1 sm1Var = this.f16700a;
/* 3 */             if (sm1Var != null) {
/* 5 */                 return sm1Var.m8579f();
                    }
/* 10 */            return null;
                }

                /* JADX INFO: renamed from: g */
                public final int m8580g() {
/* 1 */             int i = this.f16703d;
/* 3 */             if (i != 0) {
/* 21 */                return i;
                    }
/* 5 */             sm1 sm1Var = this.f16700a;
/* 14 */            int iM8580g = sm1Var != null ? sm1Var.m8580g() : 0;
/* 15 */            if (iM8580g != 0) {
/* 20 */                return iM8580g;
                    }
/* 17 */            EnumSet enumSet = mc0.f13681a;
/* 19 */            return 2;
                }

                /* JADX INFO: renamed from: h */
                public final Map m8581h() {
/* 1 */             Map map = this.f16705f;
/* 3 */             if (map != null) {
/* 16 */                return map;
                    }
/* 5 */             sm1 sm1Var = this.f16700a;
/* 7 */             if (sm1Var != null) {
/* 9 */                 return sm1Var.m8581h();
                    }
/* 14 */            return null;
                }

                /* JADX INFO: renamed from: i */
                public final Integer m8582i() {
/* 1 */             sm1 sm1Var = this.f16700a;
/* 10 */            Integer numM8582i = sm1Var != null ? sm1Var.m8582i() : null;
/* 11 */            if (numM8582i != null) {
/* 21 */                return numM8582i;
                    }
/* 13 */            EnumSet enumSet = mc0.f13681a;
/* 17 */            return Integer.valueOf(mc0.f13687g);
                }
            }
