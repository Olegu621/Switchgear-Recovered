            package p000;

            import android.os.Build;
            import android.text.TextUtils;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x91 {

                /* JADX INFO: renamed from: a */
                public final String f18997a;

                public x91(String str) {
/* 8 */             if (TextUtils.isEmpty(str)) {
/* 24 */                C1951n4.m6859j("id cannot be empty");
/* 28 */                throw null;
                    }
/* 10 */            this.f18997a = str;
/* 16 */            if (Build.VERSION.SDK_INT >= 29) {
/* 18 */                w91.m9486a(str);
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || x91.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 20 */            String str = ((x91) obj).f18997a;
/* 22 */            String str2 = this.f18997a;
/* 24 */            if (str2 == null) {
                        return str == null;
                    }
/* 30 */            return str2.equals(str);
                }

                public final int hashCode() {
/* 1 */             String str = this.f18997a;
/* 13 */            return 31 + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("LocusIdCompat[");
/* 31 */            sb.append(this.f18997a.length() + "_chars");
/* 36 */            sb.append("]");
/* 39 */            return sb.toString();
                }
            }
