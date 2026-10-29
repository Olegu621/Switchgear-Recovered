            package com.usercentrics.sdk.p009v2.settings.data;

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
            public final class CustomizationColor {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6405a;

                /* JADX INFO: renamed from: b */
                public final String f6406b;

                /* JADX INFO: renamed from: c */
                public final String f6407c;

                /* JADX INFO: renamed from: d */
                public final String f6408d;

                /* JADX INFO: renamed from: e */
                public final String f6409e;

                /* JADX INFO: renamed from: f */
                public final String f6410f;

                /* JADX INFO: renamed from: g */
                public final String f6411g;

                /* JADX INFO: renamed from: h */
                public final String f6412h;

                /* JADX INFO: renamed from: i */
                public final String f6413i;

                /* JADX INFO: renamed from: j */
                public final String f6414j;

                /* JADX INFO: renamed from: k */
                public final String f6415k;

                /* JADX INFO: renamed from: l */
                public final String f6416l;

                /* JADX INFO: renamed from: m */
                public final String f6417m;

                /* JADX INFO: renamed from: n */
                public final String f6418n;

                /* JADX INFO: renamed from: o */
                public final String f6419o;

                /* JADX INFO: renamed from: p */
                public final String f6420p;

                /* JADX INFO: renamed from: q */
                public final String f6421q;

                /* JADX INFO: renamed from: r */
                public final String f6422r;

                /* JADX INFO: renamed from: s */
                public final String f6423s;

                /* JADX INFO: renamed from: t */
                public final String f6424t;

                /* JADX INFO: renamed from: u */
                public final String f6425u;

                /* JADX INFO: renamed from: v */
                public final String f6426v;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return CustomizationColor$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ CustomizationColor(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
                    if ((i & 1) == 0) {
                        this.f6405a = null;
                    } else {
                        this.f6405a = str;
                    }
                    if ((i & 2) == 0) {
                        this.f6406b = null;
                    } else {
                        this.f6406b = str2;
                    }
                    if ((i & 4) == 0) {
                        this.f6407c = null;
                    } else {
                        this.f6407c = str3;
                    }
                    if ((i & 8) == 0) {
                        this.f6408d = null;
                    } else {
                        this.f6408d = str4;
                    }
                    if ((i & 16) == 0) {
                        this.f6409e = null;
                    } else {
                        this.f6409e = str5;
                    }
                    if ((i & 32) == 0) {
                        this.f6410f = null;
                    } else {
                        this.f6410f = str6;
                    }
                    if ((i & 64) == 0) {
                        this.f6411g = null;
                    } else {
                        this.f6411g = str7;
                    }
                    if ((i & 128) == 0) {
                        this.f6412h = null;
                    } else {
                        this.f6412h = str8;
                    }
                    if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                        this.f6413i = null;
                    } else {
                        this.f6413i = str9;
                    }
                    if ((i & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
                        this.f6414j = null;
                    } else {
                        this.f6414j = str10;
                    }
                    if ((i & Segment.SHARE_MINIMUM) == 0) {
                        this.f6415k = null;
                    } else {
                        this.f6415k = str11;
                    }
                    if ((i & 2048) == 0) {
                        this.f6416l = null;
                    } else {
                        this.f6416l = str12;
                    }
                    if ((i & 4096) == 0) {
                        this.f6417m = null;
                    } else {
                        this.f6417m = str13;
                    }
                    if ((i & Segment.SIZE) == 0) {
                        this.f6418n = null;
                    } else {
                        this.f6418n = str14;
                    }
                    if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        this.f6419o = null;
                    } else {
                        this.f6419o = str15;
                    }
                    if ((32768 & i) == 0) {
                        this.f6420p = null;
                    } else {
                        this.f6420p = str16;
                    }
                    if ((65536 & i) == 0) {
                        this.f6421q = null;
                    } else {
                        this.f6421q = str17;
                    }
                    if ((131072 & i) == 0) {
                        this.f6422r = null;
                    } else {
                        this.f6422r = str18;
                    }
                    if ((262144 & i) == 0) {
                        this.f6423s = null;
                    } else {
                        this.f6423s = str19;
                    }
                    if ((524288 & i) == 0) {
                        this.f6424t = null;
                    } else {
                        this.f6424t = str20;
                    }
                    if ((1048576 & i) == 0) {
                        this.f6425u = null;
                    } else {
                        this.f6425u = str21;
                    }
                    if ((i & 2097152) == 0) {
                        this.f6426v = null;
                    } else {
                        this.f6426v = str22;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof CustomizationColor)) {
/* 7 */                 return false;
                    }
/* 11 */            CustomizationColor customizationColor = (CustomizationColor) obj;
                    return Intrinsics.m6216a(this.f6405a, customizationColor.f6405a) && Intrinsics.m6216a(this.f6406b, customizationColor.f6406b) && Intrinsics.m6216a(this.f6407c, customizationColor.f6407c) && Intrinsics.m6216a(this.f6408d, customizationColor.f6408d) && Intrinsics.m6216a(this.f6409e, customizationColor.f6409e) && Intrinsics.m6216a(this.f6410f, customizationColor.f6410f) && Intrinsics.m6216a(this.f6411g, customizationColor.f6411g) && Intrinsics.m6216a(this.f6412h, customizationColor.f6412h) && Intrinsics.m6216a(this.f6413i, customizationColor.f6413i) && Intrinsics.m6216a(this.f6414j, customizationColor.f6414j) && Intrinsics.m6216a(this.f6415k, customizationColor.f6415k) && Intrinsics.m6216a(this.f6416l, customizationColor.f6416l) && Intrinsics.m6216a(this.f6417m, customizationColor.f6417m) && Intrinsics.m6216a(this.f6418n, customizationColor.f6418n) && Intrinsics.m6216a(this.f6419o, customizationColor.f6419o) && Intrinsics.m6216a(this.f6420p, customizationColor.f6420p) && Intrinsics.m6216a(this.f6421q, customizationColor.f6421q) && Intrinsics.m6216a(this.f6422r, customizationColor.f6422r) && Intrinsics.m6216a(this.f6423s, customizationColor.f6423s) && Intrinsics.m6216a(this.f6424t, customizationColor.f6424t) && Intrinsics.m6216a(this.f6425u, customizationColor.f6425u) && Intrinsics.m6216a(this.f6426v, customizationColor.f6426v);
                }

                public final int hashCode() {
/* 2 */             String str = this.f6405a;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            String str2 = this.f6406b;
/* 25 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 27 */            String str3 = this.f6407c;
/* 38 */            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 40 */            String str4 = this.f6408d;
/* 51 */            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
/* 53 */            String str5 = this.f6409e;
/* 64 */            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
/* 66 */            String str6 = this.f6410f;
/* 77 */            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
/* 79 */            String str7 = this.f6411g;
/* 90 */            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
/* 92 */            String str8 = this.f6412h;
/* 103 */           int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
/* 105 */           String str9 = this.f6413i;
/* 116 */           int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
/* 118 */           String str10 = this.f6414j;
/* 129 */           int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
/* 131 */           String str11 = this.f6415k;
/* 142 */           int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
/* 144 */           String str12 = this.f6416l;
/* 155 */           int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
/* 157 */           String str13 = this.f6417m;
/* 168 */           int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
/* 170 */           String str14 = this.f6418n;
/* 181 */           int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
/* 183 */           String str15 = this.f6419o;
/* 194 */           int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
/* 196 */           String str16 = this.f6420p;
/* 207 */           int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
/* 209 */           String str17 = this.f6421q;
/* 220 */           int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
/* 222 */           String str18 = this.f6422r;
/* 233 */           int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
/* 235 */           String str19 = this.f6423s;
/* 246 */           int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
/* 248 */           String str20 = this.f6424t;
/* 259 */           int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
/* 261 */           String str21 = this.f6425u;
/* 272 */           int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
/* 274 */           String str22 = this.f6426v;
/* 283 */           return iHashCode21 + (str22 != null ? str22.hashCode() : 0);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("CustomizationColor(primary=", this.f6405a, ", acceptBtnText=", this.f6406b, ", acceptBtnBackground=");
/* 23 */            fm0.m3796v(sbM3514r, this.f6407c, ", denyBtnText=", this.f6408d, ", denyBtnBackground=");
/* 34 */            fm0.m3796v(sbM3514r, this.f6409e, ", saveBtnText=", this.f6410f, ", saveBtnBackground=");
/* 45 */            fm0.m3796v(sbM3514r, this.f6411g, ", linkIcon=", this.f6412h, ", linkFont=");
/* 56 */            fm0.m3796v(sbM3514r, this.f6413i, ", text=", this.f6414j, ", layerBackground=");
/* 67 */            fm0.m3796v(sbM3514r, this.f6415k, ", overlay=", this.f6416l, ", toggleInactiveBackground=");
/* 78 */            fm0.m3796v(sbM3514r, this.f6417m, ", toggleInactiveIcon=", this.f6418n, ", toggleActiveBackground=");
/* 89 */            fm0.m3796v(sbM3514r, this.f6419o, ", toggleActiveIcon=", this.f6420p, ", toggleDisabledBackground=");
/* 100 */           fm0.m3796v(sbM3514r, this.f6421q, ", toggleDisabledIcon=", this.f6422r, ", secondLayerTab=");
/* 111 */           fm0.m3796v(sbM3514r, this.f6423s, ", tabsBorderColor=", this.f6424t, ", ccpaButtonColor=");
/* 122 */           return fm0.m3791q(sbM3514r, this.f6425u, ", ccpaButtonTextColor=", this.f6426v, ")");
                }
            }
