            package com.usercentrics.sdk.p009v2.settings.data;

            import androidx.core.app.NotificationCompat;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import okhttp3.internal.http2.Http2Connection;
            import okio.Segment;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UsercentricsStyles {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final Integer f6727a;

                /* JADX INFO: renamed from: b */
                public final Integer f6728b;

                /* JADX INFO: renamed from: c */
                public final Integer f6729c;

                /* JADX INFO: renamed from: d */
                public final Integer f6730d;

                /* JADX INFO: renamed from: e */
                public final Integer f6731e;

                /* JADX INFO: renamed from: f */
                public final String f6732f;

                /* JADX INFO: renamed from: g */
                public final String f6733g;

                /* JADX INFO: renamed from: h */
                public final String f6734h;

                /* JADX INFO: renamed from: i */
                public final String f6735i;

                /* JADX INFO: renamed from: j */
                public final String f6736j;

                /* JADX INFO: renamed from: k */
                public final String f6737k;

                /* JADX INFO: renamed from: l */
                public final String f6738l;

                /* JADX INFO: renamed from: m */
                public final String f6739m;

                /* JADX INFO: renamed from: n */
                public final String f6740n;

                /* JADX INFO: renamed from: o */
                public final String f6741o;

                /* JADX INFO: renamed from: p */
                public final String f6742p;

                /* JADX INFO: renamed from: q */
                public final String f6743q;

                /* JADX INFO: renamed from: r */
                public final String f6744r;

                /* JADX INFO: renamed from: s */
                public final String f6745s;

                /* JADX INFO: renamed from: t */
                public final String f6746t;

                /* JADX INFO: renamed from: u */
                public final String f6747u;

                /* JADX INFO: renamed from: v */
                public final String f6748v;

                /* JADX INFO: renamed from: w */
                public final String f6749w;

                /* JADX INFO: renamed from: x */
                public final String f6750x;

                /* JADX INFO: renamed from: y */
                public final String f6751y;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsStyles$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UsercentricsStyles(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
                    if ((i & 1) == 0) {
                        this.f6727a = null;
                    } else {
                        this.f6727a = num;
                    }
                    if ((i & 2) == 0) {
                        this.f6728b = null;
                    } else {
                        this.f6728b = num2;
                    }
                    if ((i & 4) == 0) {
                        this.f6729c = null;
                    } else {
                        this.f6729c = num3;
                    }
                    if ((i & 8) == 0) {
                        this.f6730d = null;
                    } else {
                        this.f6730d = num4;
                    }
                    if ((i & 16) == 0) {
                        this.f6731e = null;
                    } else {
                        this.f6731e = num5;
                    }
                    if ((i & 32) == 0) {
                        this.f6732f = null;
                    } else {
                        this.f6732f = str;
                    }
                    if ((i & 64) == 0) {
                        this.f6733g = null;
                    } else {
                        this.f6733g = str2;
                    }
                    if ((i & 128) == 0) {
                        this.f6734h = null;
                    } else {
                        this.f6734h = str3;
                    }
                    if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                        this.f6735i = null;
                    } else {
                        this.f6735i = str4;
                    }
                    if ((i & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
                        this.f6736j = null;
                    } else {
                        this.f6736j = str5;
                    }
                    if ((i & Segment.SHARE_MINIMUM) == 0) {
                        this.f6737k = null;
                    } else {
                        this.f6737k = str6;
                    }
                    if ((i & 2048) == 0) {
                        this.f6738l = null;
                    } else {
                        this.f6738l = str7;
                    }
                    if ((i & 4096) == 0) {
                        this.f6739m = null;
                    } else {
                        this.f6739m = str8;
                    }
                    if ((i & Segment.SIZE) == 0) {
                        this.f6740n = null;
                    } else {
                        this.f6740n = str9;
                    }
                    if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        this.f6741o = null;
                    } else {
                        this.f6741o = str10;
                    }
                    if ((32768 & i) == 0) {
                        this.f6742p = null;
                    } else {
                        this.f6742p = str11;
                    }
                    if ((65536 & i) == 0) {
                        this.f6743q = null;
                    } else {
                        this.f6743q = str12;
                    }
                    if ((131072 & i) == 0) {
                        this.f6744r = null;
                    } else {
                        this.f6744r = str13;
                    }
                    if ((262144 & i) == 0) {
                        this.f6745s = null;
                    } else {
                        this.f6745s = str14;
                    }
                    if ((524288 & i) == 0) {
                        this.f6746t = null;
                    } else {
                        this.f6746t = str15;
                    }
                    if ((1048576 & i) == 0) {
                        this.f6747u = null;
                    } else {
                        this.f6747u = str16;
                    }
                    if ((2097152 & i) == 0) {
                        this.f6748v = null;
                    } else {
                        this.f6748v = str17;
                    }
                    if ((4194304 & i) == 0) {
                        this.f6749w = null;
                    } else {
                        this.f6749w = str18;
                    }
                    if ((8388608 & i) == 0) {
                        this.f6750x = null;
                    } else {
                        this.f6750x = str19;
                    }
                    if ((i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0) {
                        this.f6751y = null;
                    } else {
                        this.f6751y = str20;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UsercentricsStyles)) {
/* 7 */                 return false;
                    }
/* 11 */            UsercentricsStyles usercentricsStyles = (UsercentricsStyles) obj;
                    return Intrinsics.m6216a(this.f6727a, usercentricsStyles.f6727a) && Intrinsics.m6216a(this.f6728b, usercentricsStyles.f6728b) && Intrinsics.m6216a(this.f6729c, usercentricsStyles.f6729c) && Intrinsics.m6216a(this.f6730d, usercentricsStyles.f6730d) && Intrinsics.m6216a(this.f6731e, usercentricsStyles.f6731e) && Intrinsics.m6216a(this.f6732f, usercentricsStyles.f6732f) && Intrinsics.m6216a(this.f6733g, usercentricsStyles.f6733g) && Intrinsics.m6216a(this.f6734h, usercentricsStyles.f6734h) && Intrinsics.m6216a(this.f6735i, usercentricsStyles.f6735i) && Intrinsics.m6216a(this.f6736j, usercentricsStyles.f6736j) && Intrinsics.m6216a(this.f6737k, usercentricsStyles.f6737k) && Intrinsics.m6216a(this.f6738l, usercentricsStyles.f6738l) && Intrinsics.m6216a(this.f6739m, usercentricsStyles.f6739m) && Intrinsics.m6216a(this.f6740n, usercentricsStyles.f6740n) && Intrinsics.m6216a(this.f6741o, usercentricsStyles.f6741o) && Intrinsics.m6216a(this.f6742p, usercentricsStyles.f6742p) && Intrinsics.m6216a(this.f6743q, usercentricsStyles.f6743q) && Intrinsics.m6216a(this.f6744r, usercentricsStyles.f6744r) && Intrinsics.m6216a(this.f6745s, usercentricsStyles.f6745s) && Intrinsics.m6216a(this.f6746t, usercentricsStyles.f6746t) && Intrinsics.m6216a(this.f6747u, usercentricsStyles.f6747u) && Intrinsics.m6216a(this.f6748v, usercentricsStyles.f6748v) && Intrinsics.m6216a(this.f6749w, usercentricsStyles.f6749w) && Intrinsics.m6216a(this.f6750x, usercentricsStyles.f6750x) && Intrinsics.m6216a(this.f6751y, usercentricsStyles.f6751y);
                }

                public final int hashCode() {
/* 2 */             Integer num = this.f6727a;
/* 12 */            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
/* 14 */            Integer num2 = this.f6728b;
/* 25 */            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
/* 27 */            Integer num3 = this.f6729c;
/* 38 */            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
/* 40 */            Integer num4 = this.f6730d;
/* 51 */            int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
/* 53 */            Integer num5 = this.f6731e;
/* 64 */            int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
/* 66 */            String str = this.f6732f;
/* 77 */            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
/* 79 */            String str2 = this.f6733g;
/* 90 */            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 92 */            String str3 = this.f6734h;
/* 103 */           int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 105 */           String str4 = this.f6735i;
/* 116 */           int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
/* 118 */           String str5 = this.f6736j;
/* 129 */           int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
/* 131 */           String str6 = this.f6737k;
/* 142 */           int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
/* 144 */           String str7 = this.f6738l;
/* 155 */           int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
/* 157 */           String str8 = this.f6739m;
/* 168 */           int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
/* 170 */           String str9 = this.f6740n;
/* 181 */           int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
/* 183 */           String str10 = this.f6741o;
/* 194 */           int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
/* 196 */           String str11 = this.f6742p;
/* 207 */           int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
/* 209 */           String str12 = this.f6743q;
/* 220 */           int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
/* 222 */           String str13 = this.f6744r;
/* 233 */           int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
/* 235 */           String str14 = this.f6745s;
/* 246 */           int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
/* 248 */           String str15 = this.f6746t;
/* 259 */           int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
/* 261 */           String str16 = this.f6747u;
/* 272 */           int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
/* 274 */           String str17 = this.f6748v;
/* 285 */           int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
/* 287 */           String str18 = this.f6749w;
/* 298 */           int iHashCode23 = (iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
/* 300 */           String str19 = this.f6750x;
/* 311 */           int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
/* 313 */           String str20 = this.f6751y;
/* 322 */           return iHashCode24 + (str20 != null ? str20.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UsercentricsStyles(btnPrivacyButtonInactiveSize=");
/* 10 */            sb.append(this.f6727a);
/* 15 */            sb.append(", historyDateFormat=");
/* 20 */            sb.append(this.f6728b);
/* 25 */            sb.append(", btnPrivacyButtonActiveSize=");
/* 30 */            sb.append(this.f6729c);
/* 35 */            sb.append(", txtOptInMsgFontSize=");
/* 40 */            sb.append(this.f6730d);
/* 45 */            sb.append(", btnPrivacyButtonTransparency=");
/* 50 */            sb.append(this.f6731e);
/* 55 */            sb.append(", btnPrivacyButtonBgColor=");
/* 60 */            sb.append(this.f6732f);
/* 65 */            sb.append(", btnAcceptTextColor=");
/* 76 */            fm0.m3796v(sb, this.f6733g, ", btnDenyTextColor=", this.f6734h, ", txtOptInMsgColor=");
/* 87 */            fm0.m3796v(sb, this.f6735i, ", btnMoreInfoBgColor=", this.f6736j, ", btnMoreInfoTextColor=");
/* 98 */            fm0.m3796v(sb, this.f6737k, ", btnAcceptBgColor=", this.f6738l, ", btnDenyBgColor=");
/* 109 */           fm0.m3796v(sb, this.f6739m, ", linkColor=", this.f6740n, ", cornerModalHeaderBgColor=");
/* 120 */           fm0.m3796v(sb, this.f6741o, ", cornerModalHeaderTextColor=", this.f6742p, ", privacyModalHeaderBgColor=");
/* 131 */           fm0.m3796v(sb, this.f6743q, ", privacyModalHeaderTextColor=", this.f6744r, ", bannerBgColor=");
/* 142 */           fm0.m3796v(sb, this.f6745s, ", bannerTextColor=", this.f6746t, ", btnPrivacyButtonTextColor=");
/* 153 */           fm0.m3796v(sb, this.f6747u, ", modalSaveTextColor=", this.f6748v, ", modalSaveBgColor=");
/* 164 */           fm0.m3796v(sb, this.f6749w, ", chipTextColor=", this.f6750x, ", chipBgColor=");
/* 171 */           return fm0.m3789o(sb, this.f6751y, ")");
                }
            }
