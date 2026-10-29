            package com.usercentrics.sdk.p009v2.settings.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class UsercentricsCustomization {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6538a;

                /* JADX INFO: renamed from: b */
                public final Integer f6539b;

                /* JADX INFO: renamed from: c */
                public final Integer f6540c;

                /* JADX INFO: renamed from: d */
                public final Float f6541d;

                /* JADX INFO: renamed from: e */
                public final CustomizationFont f6542e;

                /* JADX INFO: renamed from: f */
                public final CustomizationColor f6543f;

                /* JADX INFO: renamed from: g */
                public final String f6544g;

                /* JADX INFO: renamed from: h */
                public final String f6545h;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCustomization;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsCustomization$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UsercentricsCustomization(int i, String str, Integer num, Integer num2, Float f, CustomizationFont customizationFont, CustomizationColor customizationColor, String str2, String str3) {
/* 7 */             if ((i & 1) == 0) {
/* 9 */                 this.f6538a = null;
                    } else {
/* 12 */                this.f6538a = str;
                    }
/* 16 */            if ((i & 2) == 0) {
/* 18 */                this.f6539b = null;
                    } else {
/* 21 */                this.f6539b = num;
                    }
/* 25 */            if ((i & 4) == 0) {
/* 27 */                this.f6540c = null;
                    } else {
/* 30 */                this.f6540c = num2;
                    }
/* 34 */            if ((i & 8) == 0) {
/* 36 */                this.f6541d = null;
                    } else {
/* 39 */                this.f6541d = f;
                    }
/* 43 */            if ((i & 16) == 0) {
/* 45 */                this.f6542e = null;
                    } else {
/* 48 */                this.f6542e = customizationFont;
                    }
/* 52 */            if ((i & 32) == 0) {
/* 54 */                this.f6543f = null;
                    } else {
/* 57 */                this.f6543f = customizationColor;
                    }
/* 61 */            if ((i & 64) == 0) {
/* 65 */                this.f6544g = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 68 */                this.f6544g = str2;
                    }
/* 72 */            if ((i & 128) == 0) {
/* 74 */                this.f6545h = null;
                    } else {
/* 77 */                this.f6545h = str3;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UsercentricsCustomization)) {
/* 7 */                 return false;
                    }
/* 11 */            UsercentricsCustomization usercentricsCustomization = (UsercentricsCustomization) obj;
                    return Intrinsics.m6216a(this.f6538a, usercentricsCustomization.f6538a) && Intrinsics.m6216a(this.f6539b, usercentricsCustomization.f6539b) && Intrinsics.m6216a(this.f6540c, usercentricsCustomization.f6540c) && Intrinsics.m6216a(this.f6541d, usercentricsCustomization.f6541d) && Intrinsics.m6216a(this.f6542e, usercentricsCustomization.f6542e) && Intrinsics.m6216a(this.f6543f, usercentricsCustomization.f6543f) && Intrinsics.m6216a(this.f6544g, usercentricsCustomization.f6544g) && Intrinsics.m6216a(this.f6545h, usercentricsCustomization.f6545h);
                }

                public final int hashCode() {
/* 2 */             String str = this.f6538a;
/* 14 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 15 */            Integer num = this.f6539b;
/* 26 */            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
/* 27 */            Integer num2 = this.f6540c;
/* 38 */            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
/* 39 */            Float f = this.f6541d;
/* 50 */            int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
/* 51 */            CustomizationFont customizationFont = this.f6542e;
/* 62 */            int iHashCode5 = (iHashCode4 + (customizationFont == null ? 0 : customizationFont.hashCode())) * 31;
/* 63 */            CustomizationColor customizationColor = this.f6543f;
/* 77 */            int iM7485h = pm2.m7485h((iHashCode5 + (customizationColor == null ? 0 : customizationColor.hashCode())) * 31, 31, this.f6544g);
/* 81 */            String str2 = this.f6545h;
/* 90 */            return iM7485h + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UsercentricsCustomization(logoUrl=");
/* 10 */            sb.append(this.f6538a);
/* 15 */            sb.append(", borderRadiusLayer=");
/* 20 */            sb.append(this.f6539b);
/* 25 */            sb.append(", borderRadiusButton=");
/* 30 */            sb.append(this.f6540c);
/* 35 */            sb.append(", overlayOpacity=");
/* 40 */            sb.append(this.f6541d);
/* 45 */            sb.append(", font=");
/* 50 */            sb.append(this.f6542e);
/* 55 */            sb.append(", color=");
/* 60 */            sb.append(this.f6543f);
/* 65 */            sb.append(", logoAltTag=");
/* 76 */            return fm0.m3791q(sb, this.f6544g, ", buttonAlignment=", this.f6545h, ")");
                }
            }
