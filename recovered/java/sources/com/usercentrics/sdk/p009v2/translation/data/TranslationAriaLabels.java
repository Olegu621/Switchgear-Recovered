            package com.usercentrics.sdk.p009v2.translation.data;

            import androidx.core.app.NotificationCompat;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import okio.Segment;
            import p000.AbstractC0886en;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class TranslationAriaLabels {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: A */
                public final String f6760A;

                /* JADX INFO: renamed from: a */
                public final String f6761a;

                /* JADX INFO: renamed from: b */
                public final String f6762b;

                /* JADX INFO: renamed from: c */
                public final String f6763c;

                /* JADX INFO: renamed from: d */
                public final String f6764d;

                /* JADX INFO: renamed from: e */
                public final String f6765e;

                /* JADX INFO: renamed from: f */
                public final String f6766f;

                /* JADX INFO: renamed from: g */
                public final String f6767g;

                /* JADX INFO: renamed from: h */
                public final String f6768h;

                /* JADX INFO: renamed from: i */
                public final String f6769i;

                /* JADX INFO: renamed from: j */
                public final String f6770j;

                /* JADX INFO: renamed from: k */
                public final String f6771k;

                /* JADX INFO: renamed from: l */
                public final String f6772l;

                /* JADX INFO: renamed from: m */
                public final String f6773m;

                /* JADX INFO: renamed from: n */
                public final String f6774n;

                /* JADX INFO: renamed from: o */
                public final String f6775o;

                /* JADX INFO: renamed from: p */
                public final String f6776p;

                /* JADX INFO: renamed from: q */
                public final String f6777q;

                /* JADX INFO: renamed from: r */
                public final String f6778r;

                /* JADX INFO: renamed from: s */
                public final String f6779s;

                /* JADX INFO: renamed from: t */
                public final String f6780t;

                /* JADX INFO: renamed from: u */
                public final String f6781u;

                /* JADX INFO: renamed from: v */
                public final String f6782v;

                /* JADX INFO: renamed from: w */
                public final String f6783w;

                /* JADX INFO: renamed from: x */
                public final String f6784x;

                /* JADX INFO: renamed from: y */
                public final String f6785y;

                /* JADX INFO: renamed from: z */
                public final String f6786z;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return TranslationAriaLabels$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ TranslationAriaLabels(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27) {
                    if ((i & 1) == 0) {
                        this.f6761a = null;
                    } else {
                        this.f6761a = str;
                    }
                    if ((i & 2) == 0) {
                        this.f6762b = null;
                    } else {
                        this.f6762b = str2;
                    }
                    if ((i & 4) == 0) {
                        this.f6763c = null;
                    } else {
                        this.f6763c = str3;
                    }
                    if ((i & 8) == 0) {
                        this.f6764d = null;
                    } else {
                        this.f6764d = str4;
                    }
                    if ((i & 16) == 0) {
                        this.f6765e = null;
                    } else {
                        this.f6765e = str5;
                    }
                    if ((i & 32) == 0) {
                        this.f6766f = null;
                    } else {
                        this.f6766f = str6;
                    }
                    if ((i & 64) == 0) {
                        this.f6767g = null;
                    } else {
                        this.f6767g = str7;
                    }
                    if ((i & 128) == 0) {
                        this.f6768h = null;
                    } else {
                        this.f6768h = str8;
                    }
                    if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                        this.f6769i = null;
                    } else {
                        this.f6769i = str9;
                    }
                    if ((i & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
                        this.f6770j = null;
                    } else {
                        this.f6770j = str10;
                    }
                    if ((i & Segment.SHARE_MINIMUM) == 0) {
                        this.f6771k = null;
                    } else {
                        this.f6771k = str11;
                    }
                    if ((i & 2048) == 0) {
                        this.f6772l = null;
                    } else {
                        this.f6772l = str12;
                    }
                    if ((i & 4096) == 0) {
                        this.f6773m = null;
                    } else {
                        this.f6773m = str13;
                    }
                    if ((i & Segment.SIZE) == 0) {
                        this.f6774n = null;
                    } else {
                        this.f6774n = str14;
                    }
                    if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        this.f6775o = null;
                    } else {
                        this.f6775o = str15;
                    }
                    if ((32768 & i) == 0) {
                        this.f6776p = null;
                    } else {
                        this.f6776p = str16;
                    }
                    if ((65536 & i) == 0) {
                        this.f6777q = null;
                    } else {
                        this.f6777q = str17;
                    }
                    if ((131072 & i) == 0) {
                        this.f6778r = null;
                    } else {
                        this.f6778r = str18;
                    }
                    if ((262144 & i) == 0) {
                        this.f6779s = null;
                    } else {
                        this.f6779s = str19;
                    }
                    if ((524288 & i) == 0) {
                        this.f6780t = null;
                    } else {
                        this.f6780t = str20;
                    }
                    if ((1048576 & i) == 0) {
                        this.f6781u = null;
                    } else {
                        this.f6781u = str21;
                    }
                    if ((2097152 & i) == 0) {
                        this.f6782v = null;
                    } else {
                        this.f6782v = str22;
                    }
                    if ((4194304 & i) == 0) {
                        this.f6783w = null;
                    } else {
                        this.f6783w = str23;
                    }
                    if ((8388608 & i) == 0) {
                        this.f6784x = null;
                    } else {
                        this.f6784x = str24;
                    }
                    if ((16777216 & i) == 0) {
                        this.f6785y = null;
                    } else {
                        this.f6785y = str25;
                    }
                    if ((33554432 & i) == 0) {
                        this.f6786z = null;
                    } else {
                        this.f6786z = str26;
                    }
                    if ((i & 67108864) == 0) {
                        this.f6760A = null;
                    } else {
                        this.f6760A = str27;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TranslationAriaLabels)) {
/* 7 */                 return false;
                    }
/* 11 */            TranslationAriaLabels translationAriaLabels = (TranslationAriaLabels) obj;
                    return Intrinsics.m6216a(this.f6761a, translationAriaLabels.f6761a) && Intrinsics.m6216a(this.f6762b, translationAriaLabels.f6762b) && Intrinsics.m6216a(this.f6763c, translationAriaLabels.f6763c) && Intrinsics.m6216a(this.f6764d, translationAriaLabels.f6764d) && Intrinsics.m6216a(this.f6765e, translationAriaLabels.f6765e) && Intrinsics.m6216a(this.f6766f, translationAriaLabels.f6766f) && Intrinsics.m6216a(this.f6767g, translationAriaLabels.f6767g) && Intrinsics.m6216a(this.f6768h, translationAriaLabels.f6768h) && Intrinsics.m6216a(this.f6769i, translationAriaLabels.f6769i) && Intrinsics.m6216a(this.f6770j, translationAriaLabels.f6770j) && Intrinsics.m6216a(this.f6771k, translationAriaLabels.f6771k) && Intrinsics.m6216a(this.f6772l, translationAriaLabels.f6772l) && Intrinsics.m6216a(this.f6773m, translationAriaLabels.f6773m) && Intrinsics.m6216a(this.f6774n, translationAriaLabels.f6774n) && Intrinsics.m6216a(this.f6775o, translationAriaLabels.f6775o) && Intrinsics.m6216a(this.f6776p, translationAriaLabels.f6776p) && Intrinsics.m6216a(this.f6777q, translationAriaLabels.f6777q) && Intrinsics.m6216a(this.f6778r, translationAriaLabels.f6778r) && Intrinsics.m6216a(this.f6779s, translationAriaLabels.f6779s) && Intrinsics.m6216a(this.f6780t, translationAriaLabels.f6780t) && Intrinsics.m6216a(this.f6781u, translationAriaLabels.f6781u) && Intrinsics.m6216a(this.f6782v, translationAriaLabels.f6782v) && Intrinsics.m6216a(this.f6783w, translationAriaLabels.f6783w) && Intrinsics.m6216a(this.f6784x, translationAriaLabels.f6784x) && Intrinsics.m6216a(this.f6785y, translationAriaLabels.f6785y) && Intrinsics.m6216a(this.f6786z, translationAriaLabels.f6786z) && Intrinsics.m6216a(this.f6760A, translationAriaLabels.f6760A);
                }

                public final int hashCode() {
/* 2 */             String str = this.f6761a;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            String str2 = this.f6762b;
/* 25 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 27 */            String str3 = this.f6763c;
/* 38 */            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 40 */            String str4 = this.f6764d;
/* 51 */            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
/* 53 */            String str5 = this.f6765e;
/* 64 */            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
/* 66 */            String str6 = this.f6766f;
/* 77 */            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
/* 79 */            String str7 = this.f6767g;
/* 90 */            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
/* 92 */            String str8 = this.f6768h;
/* 103 */           int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
/* 105 */           String str9 = this.f6769i;
/* 116 */           int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
/* 118 */           String str10 = this.f6770j;
/* 129 */           int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
/* 131 */           String str11 = this.f6771k;
/* 142 */           int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
/* 144 */           String str12 = this.f6772l;
/* 155 */           int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
/* 157 */           String str13 = this.f6773m;
/* 168 */           int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
/* 170 */           String str14 = this.f6774n;
/* 181 */           int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
/* 183 */           String str15 = this.f6775o;
/* 194 */           int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
/* 196 */           String str16 = this.f6776p;
/* 207 */           int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
/* 209 */           String str17 = this.f6777q;
/* 220 */           int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
/* 222 */           String str18 = this.f6778r;
/* 233 */           int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
/* 235 */           String str19 = this.f6779s;
/* 246 */           int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
/* 248 */           String str20 = this.f6780t;
/* 259 */           int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
/* 261 */           String str21 = this.f6781u;
/* 272 */           int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
/* 274 */           String str22 = this.f6782v;
/* 285 */           int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
/* 287 */           String str23 = this.f6783w;
/* 298 */           int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
/* 300 */           String str24 = this.f6784x;
/* 311 */           int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
/* 313 */           String str25 = this.f6785y;
/* 324 */           int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
/* 326 */           String str26 = this.f6786z;
/* 337 */           int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
/* 339 */           String str27 = this.f6760A;
/* 348 */           return iHashCode26 + (str27 != null ? str27.hashCode() : 0);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("TranslationAriaLabels(acceptAllButton=", this.f6761a, ", ccpaButton=", this.f6762b, ", ccpaMoreInformation=");
/* 23 */            fm0.m3796v(sbM3514r, this.f6763c, ", closeButton=", this.f6764d, ", collapse=");
/* 34 */            fm0.m3796v(sbM3514r, this.f6765e, ", cookiePolicyButton=", this.f6766f, ", copyControllerId=");
/* 45 */            fm0.m3796v(sbM3514r, this.f6767g, ", denyAllButton=", this.f6768h, ", expand=");
/* 56 */            fm0.m3796v(sbM3514r, this.f6769i, ", fullscreenButton=", this.f6770j, ", imprintButton=");
/* 67 */            fm0.m3796v(sbM3514r, this.f6771k, ", languageSelector=", this.f6772l, ", privacyButton=");
/* 78 */            fm0.m3796v(sbM3514r, this.f6773m, ", privacyPolicyButton=", this.f6774n, ", saveButton=");
/* 89 */            fm0.m3796v(sbM3514r, this.f6775o, ", serviceInCategoryDetails=", this.f6776p, ", servicesInCategory=");
/* 100 */           fm0.m3796v(sbM3514r, this.f6777q, ", tabButton=", this.f6778r, ", usercentricsCMPButtons=");
/* 111 */           fm0.m3796v(sbM3514r, this.f6779s, ", usercentricsCMPContent=", this.f6780t, ", usercentricsCMPHeader=");
/* 122 */           fm0.m3796v(sbM3514r, this.f6781u, ", usercentricsCMPUI=", this.f6782v, ", usercentricsCard=");
/* 133 */           fm0.m3796v(sbM3514r, this.f6783w, ", usercentricsList=", this.f6784x, ", vendorConsentToggle=");
/* 144 */           fm0.m3796v(sbM3514r, this.f6785y, ", vendorDetailedStorageInformation=", this.f6786z, ", vendorLegIntToggle=");
/* 151 */           return fm0.m3789o(sbM3514r, this.f6760A, ")");
                }
            }
