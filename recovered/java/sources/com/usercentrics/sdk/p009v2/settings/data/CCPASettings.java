            package com.usercentrics.sdk.p009v2.settings.data;

            import androidx.core.app.NotificationCompat;
            import com.appsflyer.internal.AbstractC0298j;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import okio.Segment;
            import p000.AbstractC0886en;
            import p000.EnumC0185bm;
            import p000.b40;
            import p000.fj0;
            import p000.fm0;
            import p000.oe0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class CCPASettings {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: r */
                public static final KSerializer[] f6373r = {null, null, null, null, null, null, new oe0("com.usercentrics.sdk.v2.settings.data.FirstLayerMobileVariant", fj0.values()), null, new oe0("com.usercentrics.sdk.v2.settings.data.CCPARegion", EnumC0185bm.values()), null, null, null, null, null, null, null, null};

                /* JADX INFO: renamed from: a */
                public final String f6374a;

                /* JADX INFO: renamed from: b */
                public final String f6375b;

                /* JADX INFO: renamed from: c */
                public final String f6376c;

                /* JADX INFO: renamed from: d */
                public final String f6377d;

                /* JADX INFO: renamed from: e */
                public final String f6378e;

                /* JADX INFO: renamed from: f */
                public final String f6379f;

                /* JADX INFO: renamed from: g */
                public final fj0 f6380g;

                /* JADX INFO: renamed from: h */
                public final boolean f6381h;

                /* JADX INFO: renamed from: i */
                public final EnumC0185bm f6382i;

                /* JADX INFO: renamed from: j */
                public final boolean f6383j;

                /* JADX INFO: renamed from: k */
                public final int f6384k;

                /* JADX INFO: renamed from: l */
                public final boolean f6385l;

                /* JADX INFO: renamed from: m */
                public final boolean f6386m;

                /* JADX INFO: renamed from: n */
                public final String f6387n;

                /* JADX INFO: renamed from: o */
                public final boolean f6388o;

                /* JADX INFO: renamed from: p */
                public final String f6389p;

                /* JADX INFO: renamed from: q */
                public final boolean f6390q;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/CCPASettings$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return CCPASettings$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ CCPASettings(int i, String str, String str2, String str3, String str4, String str5, String str6, fj0 fj0Var, boolean z, EnumC0185bm enumC0185bm, boolean z2, int i2, boolean z3, boolean z4, String str7, boolean z5, String str8, boolean z6) {
                    if (63 != (i & 63)) {
                        b40.m1214E(i, 63, CCPASettings$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.f6374a = str;
                    this.f6375b = str2;
                    this.f6376c = str3;
                    this.f6377d = str4;
                    this.f6378e = str5;
                    this.f6379f = str6;
                    if ((i & 64) == 0) {
                        this.f6380g = null;
                    } else {
                        this.f6380g = fj0Var;
                    }
                    if ((i & 128) == 0) {
                        this.f6381h = false;
                    } else {
                        this.f6381h = z;
                    }
                    if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
/* 3 */                 this.f6382i = EnumC0185bm.f2532a;
                    } else {
                        this.f6382i = enumC0185bm;
                    }
                    if ((i & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
                        this.f6383j = false;
                    } else {
                        this.f6383j = z2;
                    }
                    if ((i & Segment.SHARE_MINIMUM) == 0) {
                        this.f6384k = 365;
                    } else {
                        this.f6384k = i2;
                    }
                    if ((i & 2048) == 0) {
                        this.f6385l = false;
                    } else {
                        this.f6385l = z3;
                    }
                    if ((i & 4096) == 0) {
                        this.f6386m = false;
                    } else {
                        this.f6386m = z4;
                    }
                    if ((i & Segment.SIZE) == 0) {
                        this.f6387n = null;
                    } else {
                        this.f6387n = str7;
                    }
                    if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        this.f6388o = false;
                    } else {
                        this.f6388o = z5;
                    }
                    if ((32768 & i) == 0) {
                        this.f6389p = null;
                    } else {
                        this.f6389p = str8;
                    }
                    if ((i & 65536) == 0) {
                        this.f6390q = false;
                    } else {
                        this.f6390q = z6;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof CCPASettings)) {
/* 7 */                 return false;
                    }
/* 11 */            CCPASettings cCPASettings = (CCPASettings) obj;
                    return Intrinsics.m6216a(this.f6374a, cCPASettings.f6374a) && Intrinsics.m6216a(this.f6375b, cCPASettings.f6375b) && Intrinsics.m6216a(this.f6376c, cCPASettings.f6376c) && Intrinsics.m6216a(this.f6377d, cCPASettings.f6377d) && Intrinsics.m6216a(this.f6378e, cCPASettings.f6378e) && Intrinsics.m6216a(this.f6379f, cCPASettings.f6379f) && this.f6380g == cCPASettings.f6380g && this.f6381h == cCPASettings.f6381h && this.f6382i == cCPASettings.f6382i && this.f6383j == cCPASettings.f6383j && this.f6384k == cCPASettings.f6384k && this.f6385l == cCPASettings.f6385l && this.f6386m == cCPASettings.f6386m && Intrinsics.m6216a(this.f6387n, cCPASettings.f6387n) && this.f6388o == cCPASettings.f6388o && Intrinsics.m6216a(this.f6389p, cCPASettings.f6389p) && this.f6390q == cCPASettings.f6390q;
                }

                public final int hashCode() {
/* 36 */            int iM7485h = pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(this.f6374a.hashCode() * 31, 31, this.f6375b), 31, this.f6376c), 31, this.f6377d), 31, this.f6378e), 31, this.f6379f);
/* 41 */            fj0 fj0Var = this.f6380g;
/* 87 */            int iM3504h = AbstractC0886en.m3504h(AbstractC0886en.m3504h(AbstractC0298j.m1860a(this.f6384k, AbstractC0886en.m3504h((this.f6382i.hashCode() + AbstractC0886en.m3504h((iM7485h + (fj0Var == null ? 0 : fj0Var.hashCode())) * 31, 31, this.f6381h)) * 31, 31, this.f6383j), 31), 31, this.f6385l), 31, this.f6386m);
/* 91 */            String str = this.f6387n;
/* 105 */           int iM3504h2 = AbstractC0886en.m3504h((iM3504h + (str == null ? 0 : str.hashCode())) * 31, 31, this.f6388o);
/* 109 */           String str2 = this.f6389p;
/* 126 */           return Boolean.hashCode(this.f6390q) + ((iM3504h2 + (str2 != null ? str2.hashCode() : 0)) * 31);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("CCPASettings(optOutNoticeLabel=", this.f6374a, ", btnSave=", this.f6375b, ", firstLayerTitle=");
/* 23 */            fm0.m3796v(sbM3514r, this.f6376c, ", secondLayerTitle=", this.f6377d, ", secondLayerDescription=");
/* 34 */            fm0.m3796v(sbM3514r, this.f6378e, ", btnMoreInfo=", this.f6379f, ", firstLayerMobileVariant=");
/* 39 */            sbM3514r.append(this.f6380g);
/* 44 */            sbM3514r.append(", isActive=");
/* 49 */            sbM3514r.append(this.f6381h);
/* 54 */            sbM3514r.append(", region=");
/* 59 */            sbM3514r.append(this.f6382i);
/* 64 */            sbM3514r.append(", showOnPageLoad=");
/* 69 */            sbM3514r.append(this.f6383j);
/* 74 */            sbM3514r.append(", reshowAfterDays=");
/* 79 */            sbM3514r.append(this.f6384k);
/* 84 */            sbM3514r.append(", iabAgreementExists=");
/* 89 */            sbM3514r.append(this.f6385l);
/* 94 */            sbM3514r.append(", removeDoNotSellToggle=");
/* 99 */            sbM3514r.append(this.f6386m);
/* 104 */           sbM3514r.append(", appFirstLayerDescription=");
/* 109 */           sbM3514r.append(this.f6387n);
/* 114 */           sbM3514r.append(", firstLayerMobileDescriptionIsActive=");
/* 119 */           sbM3514r.append(this.f6388o);
/* 124 */           sbM3514r.append(", firstLayerMobileDescription=");
/* 129 */           sbM3514r.append(this.f6389p);
/* 134 */           sbM3514r.append(", secondLayerHideLanguageSwitch=");
/* 141 */           return AbstractC0886en.m3511o(sbM3514r, this.f6390q, ")");
                }
            }
