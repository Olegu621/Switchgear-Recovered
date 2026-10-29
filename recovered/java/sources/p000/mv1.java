            package p000;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 26 */    public final class mv1 {

                /* JADX INFO: renamed from: a */
                public final String f14032a;

                /* JADX INFO: renamed from: b */
                public final vv1 f14033b;

                /* JADX INFO: renamed from: c */
                public final List f14034c;

                /* JADX INFO: renamed from: d */
                public final String f14035d;

                /* JADX INFO: renamed from: e */
                public final List f14036e;

                /* JADX INFO: renamed from: f */
                public final mu1 f14037f;

                /* JADX INFO: renamed from: g */
                public final List f14038g;

                /* JADX INFO: renamed from: h */
                public final List f14039h;

                /* JADX INFO: renamed from: i */
                public final String f14040i;

                /* JADX INFO: renamed from: j */
                public final hv1 f14041j;

                /* JADX INFO: renamed from: k */
                public final String f14042k;

                /* JADX INFO: renamed from: l */
                public final List f14043l;

                /* JADX INFO: renamed from: m */
                public final aw1 f14044m;

                /* JADX INFO: renamed from: n */
                public final String f14045n;

                /* JADX INFO: renamed from: o */
                public final kv1 f14046o;

                /* JADX INFO: renamed from: p */
                public final lv1 f14047p;

                /* JADX INFO: renamed from: q */
                public final q90 f14048q;

                /* JADX INFO: renamed from: r */
                public final List f14049r;

                /* JADX INFO: renamed from: s */
                public final boolean f14050s;

                public mv1(String str, vv1 vv1Var, ArrayList arrayList, String str2, List list, mu1 mu1Var, List list2, List list3, String str3, hv1 hv1Var, String str4, List list4, aw1 aw1Var, String str5, kv1 kv1Var, lv1 lv1Var, q90 q90Var, List list5, boolean z, int i) {
                    vv1 vv1Var2 = (i & 2) != 0 ? null : vv1Var;
                    ArrayList arrayList2 = (i & 4) != 0 ? null : arrayList;
                    int i2 = i & 8;
/* 1 */             String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 1 */             String str7 = i2 != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
/* 2 */             List list6 = (i & 16) != 0 ? nd0.f14189a : list;
                    mu1 mu1Var2 = (i & 32) != 0 ? null : mu1Var;
/* 3 */             List list7 = (i & 64) != 0 ? nd0.f14189a : list2;
/* 4 */             List list8 = (i & 128) != 0 ? nd0.f14189a : list3;
/* 1 */             String str8 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
                    hv1 hv1Var2 = (i & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? null : hv1Var;
/* 1 */             String str9 = (i & Segment.SHARE_MINIMUM) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
/* 5 */             List list9 = (i & 2048) != 0 ? nd0.f14189a : list4;
                    aw1 aw1Var2 = (i & 4096) != 0 ? null : aw1Var;
                    str6 = (i & Segment.SIZE) == 0 ? str5 : str6;
                    kv1 kv1Var2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : kv1Var;
                    lv1 lv1Var2 = (i & 32768) != 0 ? null : lv1Var;
                    q90 q90Var2 = (i & 65536) != 0 ? null : q90Var;
/* 6 */             List list10 = (i & 131072) != 0 ? nd0.f14189a : list5;
                    boolean z2 = (i & 262144) != 0 ? false : z;
/* 7 */             str.getClass();
                    str7.getClass();
                    list6.getClass();
                    list7.getClass();
                    list8.getClass();
                    str8.getClass();
                    str9.getClass();
                    list9.getClass();
                    list10.getClass();
/* 9 */             this.f14032a = str;
/* 10 */            this.f14033b = vv1Var2;
/* 11 */            this.f14034c = arrayList2;
/* 12 */            this.f14035d = str7;
/* 13 */            this.f14036e = list6;
/* 14 */            this.f14037f = mu1Var2;
/* 15 */            this.f14038g = list7;
/* 16 */            this.f14039h = list8;
/* 17 */            this.f14040i = str8;
/* 18 */            this.f14041j = hv1Var2;
/* 19 */            this.f14042k = str9;
/* 20 */            this.f14043l = list9;
/* 21 */            this.f14044m = aw1Var2;
/* 22 */            this.f14045n = str6;
/* 23 */            this.f14046o = kv1Var2;
/* 24 */            this.f14047p = lv1Var2;
/* 25 */            this.f14048q = q90Var2;
/* 26 */            this.f14049r = list10;
/* 27 */            this.f14050s = z2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof mv1)) {
/* 7 */                 return false;
                    }
/* 11 */            mv1 mv1Var = (mv1) obj;
                    return Intrinsics.m6216a(this.f14032a, mv1Var.f14032a) && Intrinsics.m6216a(this.f14033b, mv1Var.f14033b) && Intrinsics.m6216a(this.f14034c, mv1Var.f14034c) && Intrinsics.m6216a(this.f14035d, mv1Var.f14035d) && Intrinsics.m6216a(this.f14036e, mv1Var.f14036e) && Intrinsics.m6216a(this.f14037f, mv1Var.f14037f) && Intrinsics.m6216a(this.f14038g, mv1Var.f14038g) && Intrinsics.m6216a(this.f14039h, mv1Var.f14039h) && Intrinsics.m6216a(this.f14040i, mv1Var.f14040i) && Intrinsics.m6216a(this.f14041j, mv1Var.f14041j) && Intrinsics.m6216a(this.f14042k, mv1Var.f14042k) && Intrinsics.m6216a(this.f14043l, mv1Var.f14043l) && Intrinsics.m6216a(this.f14044m, mv1Var.f14044m) && Intrinsics.m6216a(this.f14045n, mv1Var.f14045n) && Intrinsics.m6216a(this.f14046o, mv1Var.f14046o) && Intrinsics.m6216a(this.f14047p, mv1Var.f14047p) && this.f14048q == mv1Var.f14048q && Intrinsics.m6216a(this.f14049r, mv1Var.f14049r) && this.f14050s == mv1Var.f14050s;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.f14032a.hashCode() * 31;
/* 11 */            vv1 vv1Var = this.f14033b;
/* 22 */            int iHashCode2 = (iHashCode + (vv1Var == null ? 0 : vv1Var.hashCode())) * 31;
/* 23 */            List list = this.f14034c;
/* 43 */            int iM1861b = AbstractC0298j.m1861b(pm2.m7485h((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f14035d), 31, this.f14036e);
/* 47 */            mu1 mu1Var = this.f14037f;
/* 73 */            int iM7485h = pm2.m7485h(AbstractC0298j.m1861b(AbstractC0298j.m1861b((iM1861b + (mu1Var == null ? 0 : mu1Var.hashCode())) * 31, 31, this.f14038g), 31, this.f14039h), 31, this.f14040i);
/* 77 */            hv1 hv1Var = this.f14041j;
/* 97 */            int iM1861b2 = AbstractC0298j.m1861b(pm2.m7485h((iM7485h + (hv1Var == null ? 0 : hv1Var.hashCode())) * 31, 31, this.f14042k), 31, this.f14043l);
/* 101 */           aw1 aw1Var = this.f14044m;
/* 115 */           int iM7485h2 = pm2.m7485h((iM1861b2 + (aw1Var == null ? 0 : aw1Var.hashCode())) * 31, 31, this.f14045n);
/* 119 */           kv1 kv1Var = this.f14046o;
/* 130 */           int iHashCode3 = (iM7485h2 + (kv1Var == null ? 0 : kv1Var.hashCode())) * 31;
/* 131 */           lv1 lv1Var = this.f14047p;
/* 142 */           int iHashCode4 = (iHashCode3 + (lv1Var == null ? 0 : lv1Var.hashCode())) * 31;
/* 143 */           q90 q90Var = this.f14048q;
/* 166 */           return Boolean.hashCode(this.f14050s) + AbstractC0298j.m1861b((iHashCode4 + (q90Var != null ? q90Var.hashCode() : 0)) * 31, 31, this.f14049r);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("PredefinedUIServiceDetails(id=");
/* 10 */            sb.append(this.f14032a);
/* 15 */            sb.append(", mainSwitchSettings=");
/* 20 */            sb.append(this.f14033b);
/* 25 */            sb.append(", serviceContentSection=");
/* 30 */            sb.append(this.f14034c);
/* 35 */            sb.append(", name=");
/* 40 */            sb.append(this.f14035d);
/* 45 */            sb.append(", dataCollected=");
/* 50 */            sb.append(this.f14036e);
/* 55 */            sb.append(", dataDistribution=");
/* 60 */            sb.append(this.f14037f);
/* 65 */            sb.append(", dataPurposes=");
/* 70 */            sb.append(this.f14038g);
/* 75 */            sb.append(", dataRecipients=");
/* 80 */            sb.append(this.f14039h);
/* 85 */            sb.append(", serviceDescription=");
/* 90 */            sb.append(this.f14040i);
/* 95 */            sb.append(", processingCompany=");
/* 100 */           sb.append(this.f14041j);
/* 105 */           sb.append(", retentionPeriodDescription=");
/* 110 */           sb.append(this.f14042k);
/* 115 */           sb.append(", technologiesUsed=");
/* 120 */           sb.append(this.f14043l);
/* 125 */           sb.append(", urls=");
/* 130 */           sb.append(this.f14044m);
/* 135 */           sb.append(", categoryLabel=");
/* 140 */           sb.append(this.f14045n);
/* 145 */           sb.append(", consent=");
/* 150 */           sb.append(this.f14046o);
/* 155 */           sb.append(", storageInformationContentSection=");
/* 160 */           sb.append(this.f14047p);
/* 165 */           sb.append(", dpsDisplayFormat=");
/* 170 */           sb.append(this.f14048q);
/* 175 */           sb.append(", _legalBasis=");
/* 180 */           sb.append(this.f14049r);
/* 185 */           sb.append(", disableLegalBasis=");
/* 192 */           return AbstractC0886en.m3511o(sb, this.f14050s, ")");
                }

/* 27 */        public mv1(m61 m61Var, lv1 lv1Var, boolean z, q90 q90Var, kv1 kv1Var, int i) {
/* 33 */            this(m61Var, (i & 4) != 0 ? false : z ? null : new vv1(m61Var.f13591q, m61Var.f13590p.f9466b), (i & 2) != 0 ? null : lv1Var, q90Var, kv1Var);
                }

/* 33 */        public mv1(m61 m61Var, vv1 vv1Var, lv1 lv1Var, q90 q90Var, kv1 kv1Var) {
/* 48 */            this(ya2.Companion.m2779id(m61Var), vv1Var, null, m61Var.f13582h, m61Var.f13575a, m61Var.f13576b, m61Var.f13577c, m61Var.f13578d, m61Var.f13579e, m61Var.f13583i, m61Var.f13584j, m61Var.f13585k, m61Var.f13586l, m61Var.f13589o, kv1Var, lv1Var, q90Var, m61Var.f13581g, m61Var.f13592r, 4);
                }
            }
