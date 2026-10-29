            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e13 {

                /* JADX INFO: renamed from: a */
                public final String f7475a;

                /* JADX INFO: renamed from: b */
                public final String f7476b;

                /* JADX INFO: renamed from: c */
                public final String f7477c;

                /* JADX INFO: renamed from: d */
                public final String f7478d;

                /* JADX INFO: renamed from: e */
                public final String f7479e;

                /* JADX INFO: renamed from: f */
                public final String f7480f;

                /* JADX INFO: renamed from: g */
                public final boolean f7481g;

                public e13(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
/* 1 */             str2.getClass();
/* 4 */             str3.getClass();
/* 7 */             str4.getClass();
/* 13 */            this.f7475a = str;
/* 15 */            this.f7476b = str2;
/* 17 */            this.f7477c = str3;
/* 19 */            this.f7478d = str4;
/* 21 */            this.f7479e = str5;
/* 23 */            this.f7480f = str6;
/* 25 */            this.f7481g = z;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 85 */                return true;
                    }
/* 6 */             if (!(obj instanceof e13)) {
/* 83 */                return false;
                    }
/* 9 */             e13 e13Var = (e13) obj;
                    return this.f7475a.equals(e13Var.f7475a) && Intrinsics.m6216a(this.f7476b, e13Var.f7476b) && Intrinsics.m6216a(this.f7477c, e13Var.f7477c) && Intrinsics.m6216a(this.f7478d, e13Var.f7478d) && this.f7479e.equals(e13Var.f7479e) && this.f7480f.equals(e13Var.f7480f) && this.f7481g == e13Var.f7481g;
                }

                public final int hashCode() {
/* 53 */            return Boolean.hashCode(this.f7481g) + pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h((((this.f7476b.hashCode() + (this.f7475a.hashCode() * 31)) * 31) + 1475480516) * 31, 31, this.f7477c), 31, this.f7478d), 31, this.f7479e), 31, this.f7480f);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("UsercentricsUserAgentInfo(platform=", this.f7475a, ", osVersion=", this.f7476b, ", sdkVersion=2.24.4, appID=");
/* 23 */            fm0.m3796v(sbM3514r, this.f7477c, ", predefinedUIVariant=", this.f7478d, ", appVersion=");
/* 34 */            fm0.m3796v(sbM3514r, this.f7479e, ", sdkType=", this.f7480f, ", consentMediation=");
/* 41 */            return AbstractC0886en.m3511o(sbM3514r, this.f7481g, ")");
                }
            }
