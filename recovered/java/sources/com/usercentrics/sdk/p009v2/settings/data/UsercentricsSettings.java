            package com.usercentrics.sdk.p009v2.settings.data;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.collections.C1839a;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import okio.Segment;
            import p000.AbstractC0886en;
            import p000.C0950gd;
            import p000.b40;
            import p000.fm0;
            import p000.nd0;
            import p000.oe0;
            import p000.pm2;
            import p000.q90;
            import p000.vh2;
            import p000.yw2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class UsercentricsSettings {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: I */
                public static final KSerializer[] f6692I;

                /* JADX INFO: renamed from: A */
                public final VariantsSettings f6693A;

                /* JADX INFO: renamed from: B */
                public final q90 f6694B;

                /* JADX INFO: renamed from: C */
                public final yw2 f6695C;

                /* JADX INFO: renamed from: D */
                public final List f6696D;

                /* JADX INFO: renamed from: E */
                public final Long f6697E;

                /* JADX INFO: renamed from: F */
                public final boolean f6698F;

                /* JADX INFO: renamed from: G */
                public final List f6699G;

                /* JADX INFO: renamed from: H */
                public final List f6700H;

                /* JADX INFO: renamed from: a */
                public final UsercentricsLabels f6701a;

                /* JADX INFO: renamed from: b */
                public final SecondLayer f6702b;

                /* JADX INFO: renamed from: c */
                public final String f6703c;

                /* JADX INFO: renamed from: d */
                public final String f6704d;

                /* JADX INFO: renamed from: e */
                public final String f6705e;

                /* JADX INFO: renamed from: f */
                public final String f6706f;

                /* JADX INFO: renamed from: g */
                public final String f6707g;

                /* JADX INFO: renamed from: h */
                public final String f6708h;

                /* JADX INFO: renamed from: i */
                public final String f6709i;

                /* JADX INFO: renamed from: j */
                public final String f6710j;

                /* JADX INFO: renamed from: k */
                public final boolean f6711k;

                /* JADX INFO: renamed from: l */
                public final boolean f6712l;

                /* JADX INFO: renamed from: m */
                public final boolean f6713m;

                /* JADX INFO: renamed from: n */
                public final boolean f6714n;

                /* JADX INFO: renamed from: o */
                public final Integer f6715o;

                /* JADX INFO: renamed from: p */
                public final List f6716p;

                /* JADX INFO: renamed from: q */
                public final List f6717q;

                /* JADX INFO: renamed from: r */
                public final List f6718r;

                /* JADX INFO: renamed from: s */
                public final CCPASettings f6719s;

                /* JADX INFO: renamed from: t */
                public final TCF2Settings f6720t;

                /* JADX INFO: renamed from: u */
                public final UsercentricsCustomization f6721u;

                /* JADX INFO: renamed from: v */
                public final FirstLayer f6722v;

                /* JADX INFO: renamed from: w */
                public final UsercentricsStyles f6723w;

                /* JADX INFO: renamed from: x */
                public final boolean f6724x;

                /* JADX INFO: renamed from: y */
                public final boolean f6725y;

                /* JADX INFO: renamed from: z */
                public final boolean f6726z;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", HttpUrl.FRAGMENT_ENCODE_SET, "defaultConsentAnalytics", "Z", "defaultXdevice", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsSettings$$serializer.INSTANCE;
                    }
                }

                static {
/* 10 */            vh2 vh2Var = vh2.f18183a;
/* 201 */           f6692I = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C0950gd(vh2Var, 0), new C0950gd(vh2Var, 0), new C0950gd(vh2Var, 0), null, null, null, null, null, null, null, null, null, new oe0("com.usercentrics.sdk.v2.settings.data.DpsDisplayFormat", q90.values()), new oe0("com.usercentrics.sdk.models.settings.USAFrameworks", yw2.values()), new C0950gd(PublishedApp$$serializer.INSTANCE, 0), null, null, new C0950gd(ServiceConsentTemplate$$serializer.INSTANCE, 0), new C0950gd(UsercentricsCategory$$serializer.INSTANCE, 0)};
                }

                public UsercentricsSettings(int i, int i2, UsercentricsLabels usercentricsLabels, SecondLayer secondLayer, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, Integer num, List list, List list2, List list3, CCPASettings cCPASettings, TCF2Settings tCF2Settings, UsercentricsCustomization usercentricsCustomization, FirstLayer firstLayer, UsercentricsStyles usercentricsStyles, boolean z5, boolean z6, boolean z7, VariantsSettings variantsSettings, q90 q90Var, yw2 yw2Var, List list4, Long l, boolean z8, List list5, List list6) {
                    if (3 != (i & 3)) {
                        b40.m1213D(new int[]{i, i2}, new int[]{3, 0}, UsercentricsSettings$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.f6701a = usercentricsLabels;
                    this.f6702b = secondLayer;
                    if ((i & 4) == 0) {
/* 3 */                 this.f6703c = "1.0.0";
                    } else {
                        this.f6703c = str;
                    }
                    if ((i & 8) == 0) {
                        this.f6704d = "en";
                    } else {
                        this.f6704d = str2;
                    }
                    if ((i & 16) == 0) {
                        this.f6705e = null;
                    } else {
                        this.f6705e = str3;
                    }
                    if ((i & 32) == 0) {
                        this.f6706f = null;
                    } else {
                        this.f6706f = str4;
                    }
                    if ((i & 64) == 0) {
                        this.f6707g = null;
                    } else {
                        this.f6707g = str5;
                    }
                    if ((i & 128) == 0) {
                        this.f6708h = null;
                    } else {
                        this.f6708h = str6;
                    }
                    if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                        this.f6709i = null;
                    } else {
                        this.f6709i = str7;
                    }
/* 5 */             this.f6710j = (i & NotificationCompat.FLAG_GROUP_SUMMARY) == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str8;
                    if ((i & Segment.SHARE_MINIMUM) == 0) {
                        this.f6711k = false;
                    } else {
                        this.f6711k = z;
                    }
                    this.f6712l = (i & 2048) == 0 ? true : z2;
                    if ((i & 4096) == 0) {
                        this.f6713m = false;
                    } else {
                        this.f6713m = z3;
                    }
                    if ((i & Segment.SIZE) == 0) {
                        this.f6714n = false;
                    } else {
                        this.f6714n = z4;
                    }
/* 7 */             this.f6715o = (i & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? 0 : num;
/* 9 */             this.f6716p = (32768 & i) == 0 ? C1839a.m6210b("en") : list;
/* 11 */            this.f6717q = (65536 & i) == 0 ? C1839a.m6210b("en") : list2;
/* 13 */            this.f6718r = (131072 & i) == 0 ? nd0.f14189a : list3;
                    if ((262144 & i) == 0) {
                        this.f6719s = null;
                    } else {
                        this.f6719s = cCPASettings;
                    }
                    if ((524288 & i) == 0) {
                        this.f6720t = null;
                    } else {
                        this.f6720t = tCF2Settings;
                    }
                    if ((1048576 & i) == 0) {
                        this.f6721u = null;
                    } else {
                        this.f6721u = usercentricsCustomization;
                    }
                    if ((2097152 & i) == 0) {
                        this.f6722v = null;
                    } else {
                        this.f6722v = firstLayer;
                    }
                    if ((4194304 & i) == 0) {
                        this.f6723w = null;
                    } else {
                        this.f6723w = usercentricsStyles;
                    }
                    if ((8388608 & i) == 0) {
                        this.f6724x = false;
                    } else {
                        this.f6724x = z5;
                    }
                    if ((16777216 & i) == 0) {
                        this.f6725y = false;
                    } else {
                        this.f6725y = z6;
                    }
                    if ((33554432 & i) == 0) {
                        this.f6726z = false;
                    } else {
                        this.f6726z = z7;
                    }
                    if ((67108864 & i) == 0) {
                        this.f6693A = null;
                    } else {
                        this.f6693A = variantsSettings;
                    }
                    if ((134217728 & i) == 0) {
                        this.f6694B = null;
                    } else {
                        this.f6694B = q90Var;
                    }
                    if ((268435456 & i) == 0) {
                        this.f6695C = null;
                    } else {
                        this.f6695C = yw2Var;
                    }
                    if ((536870912 & i) == 0) {
                        this.f6696D = null;
                    } else {
                        this.f6696D = list4;
                    }
                    if ((1073741824 & i) == 0) {
                        this.f6697E = null;
                    } else {
                        this.f6697E = l;
                    }
                    if ((i & Integer.MIN_VALUE) == 0) {
                        this.f6698F = false;
                    } else {
                        this.f6698F = z8;
                    }
/* 15 */            this.f6699G = (i2 & 1) == 0 ? nd0.f14189a : list5;
                    if ((i2 & 2) == 0) {
                        this.f6700H = null;
                    } else {
                        this.f6700H = list6;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UsercentricsSettings)) {
/* 7 */                 return false;
                    }
/* 11 */            UsercentricsSettings usercentricsSettings = (UsercentricsSettings) obj;
                    return Intrinsics.m6216a(this.f6701a, usercentricsSettings.f6701a) && Intrinsics.m6216a(this.f6702b, usercentricsSettings.f6702b) && Intrinsics.m6216a(this.f6703c, usercentricsSettings.f6703c) && Intrinsics.m6216a(this.f6704d, usercentricsSettings.f6704d) && Intrinsics.m6216a(this.f6705e, usercentricsSettings.f6705e) && Intrinsics.m6216a(this.f6706f, usercentricsSettings.f6706f) && Intrinsics.m6216a(this.f6707g, usercentricsSettings.f6707g) && Intrinsics.m6216a(this.f6708h, usercentricsSettings.f6708h) && Intrinsics.m6216a(this.f6709i, usercentricsSettings.f6709i) && Intrinsics.m6216a(this.f6710j, usercentricsSettings.f6710j) && this.f6711k == usercentricsSettings.f6711k && this.f6712l == usercentricsSettings.f6712l && this.f6713m == usercentricsSettings.f6713m && this.f6714n == usercentricsSettings.f6714n && Intrinsics.m6216a(this.f6715o, usercentricsSettings.f6715o) && Intrinsics.m6216a(this.f6716p, usercentricsSettings.f6716p) && Intrinsics.m6216a(this.f6717q, usercentricsSettings.f6717q) && Intrinsics.m6216a(this.f6718r, usercentricsSettings.f6718r) && Intrinsics.m6216a(this.f6719s, usercentricsSettings.f6719s) && Intrinsics.m6216a(this.f6720t, usercentricsSettings.f6720t) && Intrinsics.m6216a(this.f6721u, usercentricsSettings.f6721u) && Intrinsics.m6216a(this.f6722v, usercentricsSettings.f6722v) && Intrinsics.m6216a(this.f6723w, usercentricsSettings.f6723w) && this.f6724x == usercentricsSettings.f6724x && this.f6725y == usercentricsSettings.f6725y && this.f6726z == usercentricsSettings.f6726z && Intrinsics.m6216a(this.f6693A, usercentricsSettings.f6693A) && this.f6694B == usercentricsSettings.f6694B && this.f6695C == usercentricsSettings.f6695C && Intrinsics.m6216a(this.f6696D, usercentricsSettings.f6696D) && Intrinsics.m6216a(this.f6697E, usercentricsSettings.f6697E) && this.f6698F == usercentricsSettings.f6698F && Intrinsics.m6216a(this.f6699G, usercentricsSettings.f6699G) && Intrinsics.m6216a(this.f6700H, usercentricsSettings.f6700H);
                }

                public final int hashCode() {
/* 26 */            int iM7485h = pm2.m7485h(pm2.m7485h((this.f6702b.hashCode() + (this.f6701a.hashCode() * 31)) * 31, 31, this.f6703c), 31, this.f6704d);
/* 31 */            String str = this.f6705e;
/* 42 */            int iHashCode = (iM7485h + (str == null ? 0 : str.hashCode())) * 31;
/* 43 */            String str2 = this.f6706f;
/* 54 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 55 */            String str3 = this.f6707g;
/* 66 */            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 67 */            String str4 = this.f6708h;
/* 78 */            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
/* 79 */            String str5 = this.f6709i;
/* 117 */           int iM3504h = AbstractC0886en.m3504h(AbstractC0886en.m3504h(AbstractC0886en.m3504h(AbstractC0886en.m3504h(pm2.m7485h((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f6710j), 31, this.f6711k), 31, this.f6712l), 31, this.f6713m), 31, this.f6714n);
/* 121 */           Integer num = this.f6715o;
/* 147 */           int iM1861b = AbstractC0298j.m1861b(AbstractC0298j.m1861b(AbstractC0298j.m1861b((iM3504h + (num == null ? 0 : num.hashCode())) * 31, 31, this.f6716p), 31, this.f6717q), 31, this.f6718r);
/* 151 */           CCPASettings cCPASettings = this.f6719s;
/* 162 */           int iHashCode5 = (iM1861b + (cCPASettings == null ? 0 : cCPASettings.hashCode())) * 31;
/* 163 */           TCF2Settings tCF2Settings = this.f6720t;
/* 174 */           int iHashCode6 = (iHashCode5 + (tCF2Settings == null ? 0 : tCF2Settings.hashCode())) * 31;
/* 175 */           UsercentricsCustomization usercentricsCustomization = this.f6721u;
/* 186 */           int iHashCode7 = (iHashCode6 + (usercentricsCustomization == null ? 0 : usercentricsCustomization.hashCode())) * 31;
/* 187 */           FirstLayer firstLayer = this.f6722v;
/* 198 */           int iHashCode8 = (iHashCode7 + (firstLayer == null ? 0 : firstLayer.hashCode())) * 31;
/* 199 */           UsercentricsStyles usercentricsStyles = this.f6723w;
/* 225 */           int iM3504h2 = AbstractC0886en.m3504h(AbstractC0886en.m3504h(AbstractC0886en.m3504h((iHashCode8 + (usercentricsStyles == null ? 0 : usercentricsStyles.hashCode())) * 31, 31, this.f6724x), 31, this.f6725y), 31, this.f6726z);
/* 229 */           VariantsSettings variantsSettings = this.f6693A;
/* 240 */           int iHashCode9 = (iM3504h2 + (variantsSettings == null ? 0 : variantsSettings.hashCode())) * 31;
/* 241 */           q90 q90Var = this.f6694B;
/* 252 */           int iHashCode10 = (iHashCode9 + (q90Var == null ? 0 : q90Var.hashCode())) * 31;
/* 253 */           yw2 yw2Var = this.f6695C;
/* 264 */           int iHashCode11 = (iHashCode10 + (yw2Var == null ? 0 : yw2Var.hashCode())) * 31;
/* 265 */           List list = this.f6696D;
/* 276 */           int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
/* 277 */           Long l = this.f6697E;
/* 297 */           int iM1861b2 = AbstractC0298j.m1861b(AbstractC0886en.m3504h((iHashCode12 + (l == null ? 0 : l.hashCode())) * 31, 31, this.f6698F), 31, this.f6699G);
/* 301 */           List list2 = this.f6700H;
/* 310 */           return iM1861b2 + (list2 != null ? list2.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UsercentricsSettings(labels=");
/* 10 */            sb.append(this.f6701a);
/* 15 */            sb.append(", secondLayer=");
/* 20 */            sb.append(this.f6702b);
/* 25 */            sb.append(", version=");
/* 36 */            fm0.m3796v(sb, this.f6703c, ", language=", this.f6704d, ", imprintUrl=");
/* 47 */            fm0.m3796v(sb, this.f6705e, ", privacyPolicyUrl=", this.f6706f, ", cookiePolicyUrl=");
/* 58 */            fm0.m3796v(sb, this.f6707g, ", firstLayerDescriptionHtml=", this.f6708h, ", firstLayerMobileDescriptionHtml=");
/* 69 */            fm0.m3796v(sb, this.f6709i, ", settingsId=", this.f6710j, ", bannerMobileDescriptionIsActive=");
/* 74 */            sb.append(this.f6711k);
/* 79 */            sb.append(", enablePoweredBy=");
/* 84 */            sb.append(this.f6712l);
/* 89 */            sb.append(", displayOnlyForEU=");
/* 94 */            sb.append(this.f6713m);
/* 99 */            sb.append(", tcf2Enabled=");
/* 104 */           sb.append(this.f6714n);
/* 109 */           sb.append(", reshowBanner=");
/* 114 */           sb.append(this.f6715o);
/* 119 */           sb.append(", editableLanguages=");
/* 124 */           sb.append(this.f6716p);
/* 129 */           sb.append(", languagesAvailable=");
/* 134 */           sb.append(this.f6717q);
/* 139 */           sb.append(", showInitialViewForVersionChange=");
/* 144 */           sb.append(this.f6718r);
/* 149 */           sb.append(", ccpa=");
/* 154 */           sb.append(this.f6719s);
/* 159 */           sb.append(", tcf2=");
/* 164 */           sb.append(this.f6720t);
/* 169 */           sb.append(", customization=");
/* 174 */           sb.append(this.f6721u);
/* 179 */           sb.append(", firstLayer=");
/* 184 */           sb.append(this.f6722v);
/* 189 */           sb.append(", styles=");
/* 194 */           sb.append(this.f6723w);
/* 199 */           sb.append(", interactionAnalytics=");
/* 204 */           sb.append(this.f6724x);
/* 209 */           sb.append(", consentAnalytics=");
/* 214 */           sb.append(this.f6725y);
/* 219 */           sb.append(", consentXDevice=");
/* 224 */           sb.append(this.f6726z);
/* 229 */           sb.append(", variants=");
/* 234 */           sb.append(this.f6693A);
/* 239 */           sb.append(", dpsDisplayFormat=");
/* 244 */           sb.append(this.f6694B);
/* 249 */           sb.append(", framework=");
/* 254 */           sb.append(this.f6695C);
/* 259 */           sb.append(", publishedApps=");
/* 264 */           sb.append(this.f6696D);
/* 269 */           sb.append(", renewConsentsTimestamp=");
/* 274 */           sb.append(this.f6697E);
/* 279 */           sb.append(", consentWebhook=");
/* 284 */           sb.append(this.f6698F);
/* 289 */           sb.append(", consentTemplates=");
/* 294 */           sb.append(this.f6699G);
/* 299 */           sb.append(", categories=");
/* 304 */           sb.append(this.f6700H);
/* 309 */           sb.append(")");
/* 312 */           return sb.toString();
                }

/* 15 */        public UsercentricsSettings(UsercentricsLabels usercentricsLabels, SecondLayer secondLayer, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, Integer num, List list, List list2, List list3, CCPASettings cCPASettings, TCF2Settings tCF2Settings, UsercentricsCustomization usercentricsCustomization, FirstLayer firstLayer, UsercentricsStyles usercentricsStyles, boolean z5, boolean z6, boolean z7, VariantsSettings variantsSettings, q90 q90Var, yw2 yw2Var, List list4, Long l, boolean z8, List list5, List list6) {
                    usercentricsLabels.getClass();
                    secondLayer.getClass();
                    str.getClass();
                    str2.getClass();
                    str8.getClass();
                    list.getClass();
                    list2.getClass();
                    list3.getClass();
/* 17 */            this.f6701a = usercentricsLabels;
/* 18 */            this.f6702b = secondLayer;
/* 19 */            this.f6703c = str;
/* 20 */            this.f6704d = str2;
/* 21 */            this.f6705e = str3;
/* 22 */            this.f6706f = str4;
/* 23 */            this.f6707g = str5;
/* 24 */            this.f6708h = str6;
/* 25 */            this.f6709i = str7;
/* 26 */            this.f6710j = str8;
/* 27 */            this.f6711k = z;
/* 28 */            this.f6712l = z2;
/* 29 */            this.f6713m = z3;
/* 30 */            this.f6714n = z4;
/* 31 */            this.f6715o = num;
/* 32 */            this.f6716p = list;
/* 33 */            this.f6717q = list2;
/* 34 */            this.f6718r = list3;
/* 35 */            this.f6719s = cCPASettings;
/* 36 */            this.f6720t = tCF2Settings;
/* 37 */            this.f6721u = usercentricsCustomization;
/* 38 */            this.f6722v = firstLayer;
/* 39 */            this.f6723w = usercentricsStyles;
/* 40 */            this.f6724x = z5;
/* 41 */            this.f6725y = z6;
/* 42 */            this.f6726z = z7;
/* 43 */            this.f6693A = variantsSettings;
/* 44 */            this.f6694B = q90Var;
/* 45 */            this.f6695C = yw2Var;
/* 46 */            this.f6696D = list4;
/* 47 */            this.f6697E = l;
/* 48 */            this.f6698F = z8;
/* 49 */            this.f6699G = list5;
/* 50 */            this.f6700H = list6;
                }
            }
