            package p000;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import com.usercentrics.sdk.p009v2.settings.data.CCPASettings;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 123 */   public final class k61 {

                /* JADX INFO: renamed from: a */
                public final List f12610a;

                /* JADX INFO: renamed from: b */
                public final List f12611b;

                /* JADX INFO: renamed from: c */
                public final gp0 f12612c;

                /* JADX INFO: renamed from: d */
                public final CCPASettings f12613d;

                /* JADX INFO: renamed from: e */
                public String f12614e;

                /* JADX INFO: renamed from: f */
                public final String f12615f;

                /* JADX INFO: renamed from: g */
                public final boolean f12616g;

                /* JADX INFO: renamed from: h */
                public final List f12617h;

                /* JADX INFO: renamed from: i */
                public final C1029ij f12618i;

                /* JADX INFO: renamed from: j */
                public final C0875ec f12619j;

                /* JADX INFO: renamed from: k */
                public final String f12620k;

                /* JADX INFO: renamed from: l */
                public final String f12621l;

                /* JADX INFO: renamed from: m */
                public final Long f12622m;

                public k61(List list, List list2, gp0 gp0Var, CCPASettings cCPASettings, String str, String str2, boolean z, ArrayList arrayList, C1029ij c1029ij, C0875ec c0875ec, String str3, String str4, Long l, int i) {
/* 121 */           this((i & 1) != 0 ? nd0.f14189a : list, (i & 2) != 0 ? nd0.f14189a : list2, (i & 4) != 0 ? null : gp0Var, (i & 8) != 0 ? null : cCPASettings, (i & 16) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i & 32) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? nd0.f14189a : arrayList, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : c1029ij, (i & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? null : c0875ec, (i & Segment.SHARE_MINIMUM) == 0 ? str3 : HttpUrl.FRAGMENT_ENCODE_SET, (i & 2048) != 0 ? null : str4, (i & Segment.SIZE) != 0 ? null : l);
                }

                /* JADX INFO: renamed from: a */
                public static k61 m5996a(k61 k61Var, List list, String str, int i) {
/* 1 */             List list2 = k61Var.f12610a;
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 list = k61Var.f12611b;
                    }
/* 9 */             List list3 = list;
/* 10 */            gp0 gp0Var = k61Var.f12612c;
/* 12 */            CCPASettings cCPASettings = k61Var.f12613d;
/* 22 */            String str2 = (i & 16) != 0 ? k61Var.f12614e : str;
/* 24 */            String str3 = k61Var.f12615f;
/* 26 */            boolean z = k61Var.f12616g;
/* 28 */            List list4 = k61Var.f12617h;
/* 30 */            C1029ij c1029ij = k61Var.f12618i;
/* 32 */            C0875ec c0875ec = k61Var.f12619j;
/* 34 */            String str4 = k61Var.f12620k;
/* 36 */            String str5 = k61Var.f12621l;
/* 38 */            k61Var.getClass();
/* 41 */            Long l = k61Var.f12622m;
/* 43 */            k61Var.getClass();
/* 46 */            list2.getClass();
/* 49 */            list3.getClass();
/* 52 */            str2.getClass();
/* 55 */            str3.getClass();
/* 58 */            list4.getClass();
/* 61 */            str4.getClass();
/* 66 */            return new k61(list2, list3, gp0Var, cCPASettings, str2, str3, z, list4, c1029ij, c0875ec, str4, str5, l);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 156 */               return true;
                    }
/* 7 */             if (!(obj instanceof k61)) {
/* 154 */               return false;
                    }
/* 11 */            k61 k61Var = (k61) obj;
                    return Intrinsics.m6216a(this.f12610a, k61Var.f12610a) && Intrinsics.m6216a(this.f12611b, k61Var.f12611b) && Intrinsics.m6216a(this.f12612c, k61Var.f12612c) && Intrinsics.m6216a(this.f12613d, k61Var.f12613d) && Intrinsics.m6216a(this.f12614e, k61Var.f12614e) && Intrinsics.m6216a(this.f12615f, k61Var.f12615f) && this.f12616g == k61Var.f12616g && Intrinsics.m6216a(this.f12617h, k61Var.f12617h) && Intrinsics.m6216a(this.f12618i, k61Var.f12618i) && Intrinsics.m6216a(this.f12619j, k61Var.f12619j) && Intrinsics.m6216a(this.f12620k, k61Var.f12620k) && Intrinsics.m6216a(this.f12621l, k61Var.f12621l) && Intrinsics.m6216a(this.f12622m, k61Var.f12622m);
                }

                public final int hashCode() {
/* 12 */            int iM1861b = AbstractC0298j.m1861b(this.f12610a.hashCode() * 31, 31, this.f12611b);
/* 17 */            gp0 gp0Var = this.f12612c;
/* 28 */            int iHashCode = (iM1861b + (gp0Var == null ? 0 : gp0Var.hashCode())) * 31;
/* 29 */            CCPASettings cCPASettings = this.f12613d;
/* 61 */            int iM1861b2 = AbstractC0298j.m1861b(AbstractC0886en.m3504h(pm2.m7485h(pm2.m7485h((iHashCode + (cCPASettings == null ? 0 : cCPASettings.hashCode())) * 31, 31, this.f12614e), 31, this.f12615f), 31, this.f12616g), 31, this.f12617h);
/* 65 */            C1029ij c1029ij = this.f12618i;
/* 76 */            int iHashCode2 = (iM1861b2 + (c1029ij == null ? 0 : c1029ij.hashCode())) * 31;
/* 77 */            C0875ec c0875ec = this.f12619j;
/* 91 */            int iM7485h = pm2.m7485h((iHashCode2 + (c0875ec == null ? 0 : c0875ec.hashCode())) * 31, 31, this.f12620k);
/* 95 */            String str = this.f12621l;
/* 106 */           int iHashCode3 = (iM7485h + (str == null ? 0 : str.hashCode())) * 961;
/* 108 */           Long l = this.f12622m;
/* 117 */           return iHashCode3 + (l != null ? l.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = this.f12614e;
/* 7 */             StringBuilder sb = new StringBuilder("LegacyExtendedSettings(categories=");
/* 12 */            sb.append(this.f12610a);
/* 17 */            sb.append(", services=");
/* 22 */            sb.append(this.f12611b);
/* 27 */            sb.append(", gdpr=");
/* 32 */            sb.append(this.f12612c);
/* 37 */            sb.append(", ccpa=");
/* 42 */            sb.append(this.f12613d);
/* 47 */            sb.append(", controllerId=");
/* 56 */            fm0.m3796v(sb, str, ", id=", this.f12615f, ", isTcfEnabled=");
/* 61 */            sb.append(this.f12616g);
/* 66 */            sb.append(", showFirstLayerOnVersionChange=");
/* 71 */            sb.append(this.f12617h);
/* 76 */            sb.append(", tcfui=");
/* 81 */            sb.append(this.f12618i);
/* 86 */            sb.append(", ui=");
/* 91 */            sb.append(this.f12619j);
/* 96 */            sb.append(", version=");
/* 107 */           fm0.m3796v(sb, this.f12620k, ", framework=", this.f12621l, ", restoredSessionLastInteractionTimestamp=null, renewConsentsTimestampInSeconds=");
/* 112 */           sb.append(this.f12622m);
/* 117 */           sb.append(")");
/* 120 */           return sb.toString();
                }

/* 124 */       public k61(List list, List list2, gp0 gp0Var, CCPASettings cCPASettings, String str, String str2, boolean z, List list3, C1029ij c1029ij, C0875ec c0875ec, String str3, String str4, Long l) {
                    list.getClass();
                    list2.getClass();
                    str.getClass();
                    str2.getClass();
                    list3.getClass();
                    str3.getClass();
/* 126 */           this.f12610a = list;
/* 127 */           this.f12611b = list2;
/* 128 */           this.f12612c = gp0Var;
/* 129 */           this.f12613d = cCPASettings;
/* 130 */           this.f12614e = str;
/* 131 */           this.f12615f = str2;
/* 132 */           this.f12616g = z;
/* 133 */           this.f12617h = list3;
/* 134 */           this.f12618i = c1029ij;
/* 135 */           this.f12619j = c0875ec;
/* 136 */           this.f12620k = str3;
/* 137 */           this.f12621l = str4;
/* 138 */           this.f12622m = l;
                }
            }
