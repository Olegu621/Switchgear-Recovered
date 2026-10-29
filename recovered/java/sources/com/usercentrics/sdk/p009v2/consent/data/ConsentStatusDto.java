            package com.usercentrics.sdk.p009v2.consent.data;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 34 */    public final class ConsentStatusDto {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final boolean f6298a;

                /* JADX INFO: renamed from: b */
                public final String f6299b;

                /* JADX INFO: renamed from: c */
                public final String f6300c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/consent/data/ConsentStatusDto$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/ConsentStatusDto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return ConsentStatusDto$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ ConsentStatusDto(int i, String str, String str2, boolean z) {
/* 4 */             if (3 != (i & 3)) {
/* 31 */                b40.m1214E(i, 3, ConsentStatusDto$$serializer.INSTANCE.getDescriptor());
/* 35 */                throw null;
                    }
/* 9 */             this.f6298a = z;
/* 11 */            this.f6299b = str;
/* 15 */            if ((i & 4) == 0) {
/* 19 */                this.f6300c = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 22 */                this.f6300c = str2;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ConsentStatusDto)) {
/* 7 */                 return false;
                    }
/* 11 */            ConsentStatusDto consentStatusDto = (ConsentStatusDto) obj;
                    return this.f6298a == consentStatusDto.f6298a && Intrinsics.m6216a(this.f6299b, consentStatusDto.f6299b) && Intrinsics.m6216a(this.f6300c, consentStatusDto.f6300c);
                }

                public final int hashCode() {
/* 22 */            return this.f6300c.hashCode() + pm2.m7485h(Boolean.hashCode(this.f6298a) * 31, 31, this.f6299b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ConsentStatusDto(consentStatus=");
/* 10 */            sb.append(this.f6298a);
/* 15 */            sb.append(", consentTemplateId=");
/* 20 */            sb.append(this.f6299b);
/* 25 */            sb.append(", consentTemplateVersion=");
/* 32 */            return fm0.m3789o(sb, this.f6300c, ")");
                }

/* 35 */        public ConsentStatusDto(String str, String str2, boolean z) {
                    str.getClass();
                    str2.getClass();
/* 37 */            this.f6298a = z;
/* 38 */            this.f6299b = str;
/* 39 */            this.f6300c = str2;
                }
            }
