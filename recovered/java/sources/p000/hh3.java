            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class hh3 implements jh3 {

                /* JADX INFO: renamed from: a */
                public static final fh3 f9085a = new fh3();

                /* JADX INFO: renamed from: a */
                public abstract String mo3764a();

                /* JADX INFO: renamed from: b */
                public abstract String mo3765b();

                /* JADX INFO: renamed from: c */
                public abstract int mo3766c();

                /* JADX INFO: renamed from: d */
                public abstract String mo3767d();

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("LogSite{ class=");
/* 12 */            sb.append(mo3764a());
/* 17 */            sb.append(", method=");
/* 24 */            sb.append(mo3765b());
/* 29 */            sb.append(", line=");
/* 36 */            sb.append(mo3766c());
/* 43 */            if (mo3767d() != null) {
/* 47 */                sb.append(", file=");
/* 54 */                sb.append(mo3767d());
                    }
/* 59 */            sb.append(" }");
/* 62 */            return sb.toString();
                }
            }
