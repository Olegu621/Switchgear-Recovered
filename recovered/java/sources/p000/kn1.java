            package p000;

            import com.appsflyer.internal.AbstractC0298j;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kn1 {

                /* JADX INFO: renamed from: a */
                public final UsercentricsSettings f12892a;

                /* JADX INFO: renamed from: b */
                public final List f12893b;

                /* JADX INFO: renamed from: c */
                public final int f12894c;

                public kn1(UsercentricsSettings usercentricsSettings, List list, int i) {
/* 1 */             usercentricsSettings.getClass();
/* 4 */             list.getClass();
/* 10 */            this.f12892a = usercentricsSettings;
/* 12 */            this.f12893b = list;
/* 14 */            this.f12894c = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof kn1)) {
/* 7 */                 return false;
                    }
/* 11 */            kn1 kn1Var = (kn1) obj;
                    return Intrinsics.m6216a(this.f12892a, kn1Var.f12892a) && Intrinsics.m6216a(this.f12893b, kn1Var.f12893b) && this.f12894c == kn1Var.f12894c;
                }

                public final int hashCode() {
/* 22 */            return Integer.hashCode(this.f12894c) + AbstractC0298j.m1861b(this.f12892a.hashCode() * 31, 31, this.f12893b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("NewSettingsData(data=");
/* 10 */            sb.append(this.f12892a);
/* 15 */            sb.append(", services=");
/* 20 */            sb.append(this.f12893b);
/* 25 */            sb.append(", servicesCount=");
/* 32 */            return fm0.m3786l(sb, this.f12894c, ")");
                }
            }
