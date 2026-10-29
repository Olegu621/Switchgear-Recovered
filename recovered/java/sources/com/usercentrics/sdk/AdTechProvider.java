            package com.usercentrics.sdk;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class AdTechProvider {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final int f6022a;

                /* JADX INFO: renamed from: b */
                public final String f6023b;

                /* JADX INFO: renamed from: c */
                public final String f6024c;

                /* JADX INFO: renamed from: d */
                public final boolean f6025d;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/AdTechProvider$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/AdTechProvider;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return AdTechProvider$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ AdTechProvider(int i, int i2, String str, String str2, boolean z) {
/* 5 */             if (15 != (i & 15)) {
/* 25 */                b40.m1214E(i, 15, AdTechProvider$$serializer.INSTANCE.getDescriptor());
/* 29 */                throw null;
                    }
/* 10 */            this.f6022a = i2;
/* 12 */            this.f6023b = str;
/* 14 */            this.f6024c = str2;
/* 16 */            this.f6025d = z;
                }

                /* JADX INFO: renamed from: a */
                public static AdTechProvider m2769a(AdTechProvider adTechProvider, boolean z) {
/* 1 */             int i = adTechProvider.f6022a;
/* 3 */             String str = adTechProvider.f6023b;
/* 5 */             String str2 = adTechProvider.f6024c;
/* 7 */             adTechProvider.getClass();
/* 10 */            str.getClass();
/* 13 */            str2.getClass();
/* 18 */            return new AdTechProvider(i, str, str2, z);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof AdTechProvider)) {
/* 7 */                 return false;
                    }
/* 11 */            AdTechProvider adTechProvider = (AdTechProvider) obj;
                    return this.f6022a == adTechProvider.f6022a && Intrinsics.m6216a(this.f6023b, adTechProvider.f6023b) && Intrinsics.m6216a(this.f6024c, adTechProvider.f6024c) && this.f6025d == adTechProvider.f6025d;
                }

                public final int hashCode() {
/* 28 */            return Boolean.hashCode(this.f6025d) + pm2.m7485h(pm2.m7485h(Integer.hashCode(this.f6022a) * 31, 31, this.f6023b), 31, this.f6024c);
                }

                public final String toString() {
/* 48 */            return "AdTechProvider(id=" + this.f6022a + ", name=" + this.f6023b + ", privacyPolicyUrl=" + this.f6024c + ", consent=" + this.f6025d + ")";
                }

/* 29 */        public AdTechProvider(int i, String str, String str2, boolean z) {
                    str.getClass();
                    str2.getClass();
/* 31 */            this.f6022a = i;
/* 32 */            this.f6023b = str;
/* 33 */            this.f6024c = str2;
/* 34 */            this.f6025d = z;
                }
            }
