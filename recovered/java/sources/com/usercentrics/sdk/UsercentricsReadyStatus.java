            package com.usercentrics.sdk;

            import com.appsflyer.internal.AbstractC0298j;
            import com.usercentrics.sdk.p009v2.location.data.UsercentricsLocation;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.b40;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class UsercentricsReadyStatus {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: e */
                public static final KSerializer[] f6058e = {null, new C0950gd(UsercentricsServiceConsent$$serializer.INSTANCE, 0), null, null};

                /* JADX INFO: renamed from: a */
                public final boolean f6059a;

                /* JADX INFO: renamed from: b */
                public final List f6060b;

                /* JADX INFO: renamed from: c */
                public final GeolocationRuleset f6061c;

                /* JADX INFO: renamed from: d */
                public final UsercentricsLocation f6062d;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/UsercentricsReadyStatus$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/UsercentricsReadyStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsReadyStatus$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UsercentricsReadyStatus(int i, boolean z, List list, GeolocationRuleset geolocationRuleset, UsercentricsLocation usercentricsLocation) {
/* 5 */             if (15 != (i & 15)) {
/* 25 */                b40.m1214E(i, 15, UsercentricsReadyStatus$$serializer.INSTANCE.getDescriptor());
/* 29 */                throw null;
                    }
/* 10 */            this.f6059a = z;
/* 12 */            this.f6060b = list;
/* 14 */            this.f6061c = geolocationRuleset;
/* 16 */            this.f6062d = usercentricsLocation;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UsercentricsReadyStatus)) {
/* 7 */                 return false;
                    }
/* 11 */            UsercentricsReadyStatus usercentricsReadyStatus = (UsercentricsReadyStatus) obj;
                    return this.f6059a == usercentricsReadyStatus.f6059a && Intrinsics.m6216a(this.f6060b, usercentricsReadyStatus.f6060b) && Intrinsics.m6216a(this.f6061c, usercentricsReadyStatus.f6061c) && Intrinsics.m6216a(this.f6062d, usercentricsReadyStatus.f6062d);
                }

                public final int hashCode() {
/* 12 */            int iM1861b = AbstractC0298j.m1861b(Boolean.hashCode(this.f6059a) * 31, 31, this.f6060b);
/* 16 */            GeolocationRuleset geolocationRuleset = this.f6061c;
/* 34 */            return this.f6062d.hashCode() + ((iM1861b + (geolocationRuleset == null ? 0 : geolocationRuleset.hashCode())) * 31);
                }

                public final String toString() {
/* 48 */            return "UsercentricsReadyStatus(shouldCollectConsent=" + this.f6059a + ", consents=" + this.f6060b + ", geolocationRuleset=" + this.f6061c + ", location=" + this.f6062d + ")";
                }

/* 29 */        public UsercentricsReadyStatus(boolean z, ArrayList arrayList, GeolocationRuleset geolocationRuleset, UsercentricsLocation usercentricsLocation) {
                    usercentricsLocation.getClass();
/* 31 */            this.f6059a = z;
/* 32 */            this.f6060b = arrayList;
/* 33 */            this.f6061c = geolocationRuleset;
/* 34 */            this.f6062d = usercentricsLocation;
                }
            }
