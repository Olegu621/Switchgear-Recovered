            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u63 {

                /* JADX INFO: renamed from: a */
                public final boolean f17381a;

                /* JADX INFO: renamed from: b */
                public final String f17382b;

                /* JADX INFO: renamed from: c */
                public final String f17383c;

                /* JADX INFO: renamed from: d */
                public final t63 f17384d;

                public u63(String str, String str2, boolean z, t63 t63Var) {
/* 9 */             if (str2.isEmpty() || str2.charAt(0) != '/') {
/* 45 */                C1951n4.m6859j("Path should start with a slash '/'.");
/* 48 */                throw null;
                    }
/* 26 */            if (!str2.endsWith("/")) {
/* 39 */                C1951n4.m6859j("Path should end with a slash '/'");
/* 42 */                throw null;
                    }
/* 28 */            this.f17382b = str;
/* 30 */            this.f17383c = str2;
/* 32 */            this.f17381a = z;
/* 34 */            this.f17384d = t63Var;
                }
            }
