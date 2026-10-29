            package p000;

            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hu1 {
                public static final gu1 Companion = new gu1();

                /* JADX INFO: renamed from: A */
                public final String f9297A;

                /* JADX INFO: renamed from: B */
                public final String f9298B;

                /* JADX INFO: renamed from: C */
                public final String f9299C;

                /* JADX INFO: renamed from: D */
                public final String f9300D;

                /* JADX INFO: renamed from: E */
                public final String f9301E;

                /* JADX INFO: renamed from: F */
                public final String f9302F;

                /* JADX INFO: renamed from: a */
                public final String f9303a;

                /* JADX INFO: renamed from: b */
                public final String f9304b;

                /* JADX INFO: renamed from: c */
                public final String f9305c;

                /* JADX INFO: renamed from: d */
                public final String f9306d;

                /* JADX INFO: renamed from: e */
                public final String f9307e;

                /* JADX INFO: renamed from: f */
                public final String f9308f;

                /* JADX INFO: renamed from: g */
                public final String f9309g;

                /* JADX INFO: renamed from: h */
                public final String f9310h;

                /* JADX INFO: renamed from: i */
                public final String f9311i;

                /* JADX INFO: renamed from: j */
                public final String f9312j;

                /* JADX INFO: renamed from: k */
                public final String f9313k;

                /* JADX INFO: renamed from: l */
                public final String f9314l;

                /* JADX INFO: renamed from: m */
                public final String f9315m;

                /* JADX INFO: renamed from: n */
                public final String f9316n;

                /* JADX INFO: renamed from: o */
                public final String f9317o;

                /* JADX INFO: renamed from: p */
                public final String f9318p;

                /* JADX INFO: renamed from: q */
                public final String f9319q;

                /* JADX INFO: renamed from: r */
                public final String f9320r;

                /* JADX INFO: renamed from: s */
                public final String f9321s;

                /* JADX INFO: renamed from: t */
                public final String f9322t;

                /* JADX INFO: renamed from: u */
                public final String f9323u;

                /* JADX INFO: renamed from: v */
                public final String f9324v;

                /* JADX INFO: renamed from: w */
                public final String f9325w;

                /* JADX INFO: renamed from: x */
                public final String f9326x;

                /* JADX INFO: renamed from: y */
                public final String f9327y;

                /* JADX INFO: renamed from: z */
                public final String f9328z;

                public hu1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    str4.getClass();
                    str5.getClass();
                    str6.getClass();
                    str7.getClass();
                    str8.getClass();
                    str9.getClass();
                    str10.getClass();
                    str11.getClass();
                    str12.getClass();
                    str13.getClass();
                    str14.getClass();
                    str15.getClass();
                    str16.getClass();
                    str17.getClass();
                    str18.getClass();
                    str19.getClass();
                    str20.getClass();
                    str21.getClass();
                    str22.getClass();
                    str23.getClass();
                    str24.getClass();
                    str25.getClass();
                    str26.getClass();
                    str27.getClass();
                    str28.getClass();
                    str29.getClass();
                    str30.getClass();
                    str31.getClass();
                    str32.getClass();
/* 2 */             this.f9303a = str;
/* 3 */             this.f9304b = str2;
/* 4 */             this.f9305c = str3;
/* 5 */             this.f9306d = str4;
/* 6 */             this.f9307e = str5;
/* 7 */             this.f9308f = str6;
/* 8 */             this.f9309g = str7;
/* 9 */             this.f9310h = str8;
/* 10 */            this.f9311i = str9;
/* 11 */            this.f9312j = str10;
/* 12 */            this.f9313k = str11;
/* 13 */            this.f9314l = str12;
/* 14 */            this.f9315m = str13;
/* 15 */            this.f9316n = str14;
/* 16 */            this.f9317o = str15;
/* 17 */            this.f9318p = str16;
/* 18 */            this.f9319q = str17;
/* 19 */            this.f9320r = str18;
/* 20 */            this.f9321s = str19;
/* 21 */            this.f9322t = str20;
/* 22 */            this.f9323u = str21;
/* 23 */            this.f9324v = str22;
/* 24 */            this.f9325w = str23;
/* 25 */            this.f9326x = str24;
/* 26 */            this.f9327y = str25;
/* 27 */            this.f9328z = str26;
/* 28 */            this.f9297A = str27;
/* 29 */            this.f9298B = str28;
/* 30 */            this.f9299C = str29;
/* 31 */            this.f9300D = str30;
/* 32 */            this.f9301E = str31;
/* 33 */            this.f9302F = str32;
                }

                /* JADX INFO: renamed from: b */
                public static String m4379b(double d, double d2, String str, String str2) {
/* 6 */             int iFloor = (int) Math.floor(d / d2);
/* 7 */             if (iFloor <= 0) {
/* 9 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 13 */            if (iFloor <= 1) {
/* 16 */                str = str2;
                    }
/* 33 */            return iFloor + " " + str;
                }

                /* JADX INFO: renamed from: a */
                public final String m4380a(double d) {
                    String str;
/* 7 */             if (d <= 0.0d) {
/* 9 */                 return this.f9323u;
                    }
/* 22 */            if (d >= 86400.0d) {
/* 44 */                double d2 = d % 3.1536E7d;
/* 82 */                return C2103qd.m7775j(null, 63, hu0.m4316I(m4379b(d, 3.1536E7d, this.f9297A, this.f9328z), m4379b(d2, 2628000.0d, this.f9317o, this.f9316n), m4379b(d2 % 2628000.0d, 86400.0d, this.f9305c, this.f9304b)));
                    }
/* 98 */            String strM4379b = m4379b(d, 3600.0d, this.f9310h, this.f9309g);
/* 107 */           double d3 = d % 3600.0d;
/* 115 */           String strM4379b2 = m4379b(d3, 60.0d, this.f9315m, this.f9314l);
/* 119 */           double d4 = d3 % 60.0d;
/* 122 */           if (d4 > 0.0d) {
/* 124 */               int i = (int) d4;
/* 149 */               str = i + " " + (i > 1 ? this.f9322t : this.f9321s);
                    } else {
/* 154 */               str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 164 */           return C2103qd.m7775j(null, 63, hu0.m4316I(strM4379b, strM4379b2, str));
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof hu1)) {
/* 7 */                 return false;
                    }
/* 11 */            hu1 hu1Var = (hu1) obj;
                    return Intrinsics.m6216a(this.f9303a, hu1Var.f9303a) && Intrinsics.m6216a(this.f9304b, hu1Var.f9304b) && Intrinsics.m6216a(this.f9305c, hu1Var.f9305c) && Intrinsics.m6216a(this.f9306d, hu1Var.f9306d) && Intrinsics.m6216a(this.f9307e, hu1Var.f9307e) && Intrinsics.m6216a(this.f9308f, hu1Var.f9308f) && Intrinsics.m6216a(this.f9309g, hu1Var.f9309g) && Intrinsics.m6216a(this.f9310h, hu1Var.f9310h) && Intrinsics.m6216a(this.f9311i, hu1Var.f9311i) && Intrinsics.m6216a(this.f9312j, hu1Var.f9312j) && Intrinsics.m6216a(this.f9313k, hu1Var.f9313k) && Intrinsics.m6216a(this.f9314l, hu1Var.f9314l) && Intrinsics.m6216a(this.f9315m, hu1Var.f9315m) && Intrinsics.m6216a(this.f9316n, hu1Var.f9316n) && Intrinsics.m6216a(this.f9317o, hu1Var.f9317o) && Intrinsics.m6216a(this.f9318p, hu1Var.f9318p) && Intrinsics.m6216a(this.f9319q, hu1Var.f9319q) && Intrinsics.m6216a(this.f9320r, hu1Var.f9320r) && Intrinsics.m6216a(this.f9321s, hu1Var.f9321s) && Intrinsics.m6216a(this.f9322t, hu1Var.f9322t) && Intrinsics.m6216a(this.f9323u, hu1Var.f9323u) && Intrinsics.m6216a(this.f9324v, hu1Var.f9324v) && Intrinsics.m6216a(this.f9325w, hu1Var.f9325w) && Intrinsics.m6216a(this.f9326x, hu1Var.f9326x) && Intrinsics.m6216a(this.f9327y, hu1Var.f9327y) && Intrinsics.m6216a(this.f9328z, hu1Var.f9328z) && Intrinsics.m6216a(this.f9297A, hu1Var.f9297A) && Intrinsics.m6216a(this.f9298B, hu1Var.f9298B) && Intrinsics.m6216a(this.f9299C, hu1Var.f9299C) && Intrinsics.m6216a(this.f9300D, hu1Var.f9300D) && Intrinsics.m6216a(this.f9301E, hu1Var.f9301E) && Intrinsics.m6216a(this.f9302F, hu1Var.f9302F);
                }

                public final int hashCode() {
/* 196 */           return this.f9302F.hashCode() + pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(this.f9303a.hashCode() * 31, 31, this.f9304b), 31, this.f9305c), 31, this.f9306d), 31, this.f9307e), 31, this.f9308f), 31, this.f9309g), 31, this.f9310h), 31, this.f9311i), 31, this.f9312j), 31, this.f9313k), 31, this.f9314l), 31, this.f9315m), 31, this.f9316n), 31, this.f9317o), 31, this.f9318p), 31, this.f9319q), 31, this.f9320r), 31, this.f9321s), 31, this.f9322t), 31, this.f9323u), 31, this.f9324v), 31, this.f9325w), 31, this.f9326x), 31, this.f9327y), 31, this.f9328z), 31, this.f9297A), 31, this.f9298B), 31, this.f9299C), 31, this.f9300D), 31, this.f9301E);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("PredefinedUICookieInformationLabels(anyDomain=", this.f9303a, ", day=", this.f9304b, ", days=");
/* 23 */            fm0.m3796v(sbM3514r, this.f9305c, ", domain=", this.f9306d, ", duration=");
/* 34 */            fm0.m3796v(sbM3514r, this.f9307e, ", error=", this.f9308f, ", hour=");
/* 45 */            fm0.m3796v(sbM3514r, this.f9309g, ", hours=", this.f9310h, ", identifier=");
/* 56 */            fm0.m3796v(sbM3514r, this.f9311i, ", loading=", this.f9312j, ", maximumAge=");
/* 67 */            fm0.m3796v(sbM3514r, this.f9313k, ", minute=", this.f9314l, ", minutes=");
/* 78 */            fm0.m3796v(sbM3514r, this.f9315m, ", month=", this.f9316n, ", months=");
/* 89 */            fm0.m3796v(sbM3514r, this.f9317o, ", multipleDomains=", this.f9318p, ", no=");
/* 100 */           fm0.m3796v(sbM3514r, this.f9319q, ", nonCookieStorage=", this.f9320r, ", second=");
/* 111 */           fm0.m3796v(sbM3514r, this.f9321s, ", seconds=", this.f9322t, ", session=");
/* 122 */           fm0.m3796v(sbM3514r, this.f9323u, ", title=", this.f9324v, ", titleDetailed=");
/* 133 */           fm0.m3796v(sbM3514r, this.f9325w, ", tryAgain=", this.f9326x, ", type=");
/* 144 */           fm0.m3796v(sbM3514r, this.f9327y, ", year=", this.f9328z, ", years=");
/* 155 */           fm0.m3796v(sbM3514r, this.f9297A, ", yes=", this.f9298B, ", storageInformationDescription=");
/* 166 */           fm0.m3796v(sbM3514r, this.f9299C, ", cookieStorage=", this.f9300D, ", cookieRefresh=");
/* 177 */           return fm0.m3791q(sbM3514r, this.f9301E, ", purposes=", this.f9302F, ")");
                }
            }
