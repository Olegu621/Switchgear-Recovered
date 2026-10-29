            package com.usercentrics.sdk.p009v2.location.data;

            import java.util.Locale;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C2103qd;
            import p000.fm0;
            import p000.mn0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class UsercentricsLocation {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6358a;

                /* JADX INFO: renamed from: b */
                public final String f6359b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsLocation$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UsercentricsLocation(int i, String str, String str2) {
/* 8 */             if ((i & 1) == 0) {
/* 10 */                this.f6358a = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 13 */                this.f6358a = str;
                    }
/* 17 */            if ((i & 2) == 0) {
/* 19 */                this.f6359b = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 22 */                this.f6359b = str2;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final boolean m2818a() {
                    return Intrinsics.m6216a(this.f6358a, HttpUrl.FRAGMENT_ENCODE_SET) && Intrinsics.m6216a(this.f6359b, HttpUrl.FRAGMENT_ENCODE_SET);
                }

                /* JADX INFO: renamed from: b */
                public final boolean m2819b() {
/* 1 */             String[] strArr = mn0.f13869d;
/* 7 */             String upperCase = this.f6358a.toUpperCase(Locale.ROOT);
/* 11 */            upperCase.getClass();
/* 14 */            return C2103qd.m7772g(strArr, upperCase);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UsercentricsLocation)) {
/* 7 */                 return false;
                    }
/* 11 */            UsercentricsLocation usercentricsLocation = (UsercentricsLocation) obj;
                    return Intrinsics.m6216a(this.f6358a, usercentricsLocation.f6358a) && Intrinsics.m6216a(this.f6359b, usercentricsLocation.f6359b);
                }

                public final int hashCode() {
/* 15 */            return this.f6359b.hashCode() + (this.f6358a.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return fm0.m3785k("UsercentricsLocation(countryCode=", this.f6358a, ", regionCode=", this.f6359b, ")");
                }

/* 24 */        public UsercentricsLocation(String str, String str2) {
                    str.getClass();
                    str2.getClass();
/* 26 */            this.f6358a = str;
/* 27 */            this.f6359b = str2;
                }

/* 27 */        public /* synthetic */ UsercentricsLocation() {
/* 28 */            this(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
