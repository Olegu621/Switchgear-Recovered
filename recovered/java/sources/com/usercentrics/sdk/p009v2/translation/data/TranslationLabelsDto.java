            package com.usercentrics.sdk.p009v2.translation.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class TranslationLabelsDto {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6787a;

                /* JADX INFO: renamed from: b */
                public final String f6788b;

                /* JADX INFO: renamed from: c */
                public final String f6789c;

                /* JADX INFO: renamed from: d */
                public final String f6790d;

                /* JADX INFO: renamed from: e */
                public final String f6791e;

                /* JADX INFO: renamed from: f */
                public final String f6792f;

                /* JADX INFO: renamed from: g */
                public final String f6793g;

                /* JADX INFO: renamed from: h */
                public final String f6794h;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return TranslationLabelsDto$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ TranslationLabelsDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
/* 5 */             if (255 != (i & 255)) {
/* 33 */                b40.m1214E(i, 255, TranslationLabelsDto$$serializer.INSTANCE.getDescriptor());
/* 37 */                throw null;
                    }
/* 10 */            this.f6787a = str;
/* 12 */            this.f6788b = str2;
/* 14 */            this.f6789c = str3;
/* 16 */            this.f6790d = str4;
/* 18 */            this.f6791e = str5;
/* 20 */            this.f6792f = str6;
/* 22 */            this.f6793g = str7;
/* 24 */            this.f6794h = str8;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof TranslationLabelsDto)) {
/* 7 */                 return false;
                    }
/* 11 */            TranslationLabelsDto translationLabelsDto = (TranslationLabelsDto) obj;
                    return Intrinsics.m6216a(this.f6787a, translationLabelsDto.f6787a) && Intrinsics.m6216a(this.f6788b, translationLabelsDto.f6788b) && Intrinsics.m6216a(this.f6789c, translationLabelsDto.f6789c) && Intrinsics.m6216a(this.f6790d, translationLabelsDto.f6790d) && Intrinsics.m6216a(this.f6791e, translationLabelsDto.f6791e) && Intrinsics.m6216a(this.f6792f, translationLabelsDto.f6792f) && Intrinsics.m6216a(this.f6793g, translationLabelsDto.f6793g) && Intrinsics.m6216a(this.f6794h, translationLabelsDto.f6794h);
                }

                public final int hashCode() {
/* 52 */            return this.f6794h.hashCode() + pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(pm2.m7485h(this.f6787a.hashCode() * 31, 31, this.f6788b), 31, this.f6789c), 31, this.f6790d), 31, this.f6791e), 31, this.f6792f), 31, this.f6793g);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("TranslationLabelsDto(cookieRefresh=", this.f6787a, ", cookieStorage=", this.f6788b, ", cnilDenyLinkText=");
/* 23 */            fm0.m3796v(sbM3514r, this.f6789c, ", vendorsOutsideEU=", this.f6790d, ", details=");
/* 34 */            fm0.m3796v(sbM3514r, this.f6791e, ", controllerIdTitle=", this.f6792f, ", tcfMaxDurationText=");
/* 45 */            return fm0.m3791q(sbM3514r, this.f6793g, ", tcfMaxDurationTitle=", this.f6794h, ")");
                }
            }
