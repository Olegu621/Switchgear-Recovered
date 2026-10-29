            package com.usercentrics.sdk.p009v2.ruleset.data;

            import com.usercentrics.sdk.p009v2.location.data.UsercentricsLocation;
            import java.util.HashSet;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C0950gd;
            import p000.b40;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class SessionGeoRule {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: e */
                public static final KSerializer[] f6368e = {null, null, null, new C0950gd(vh2.f18183a, 1)};

                /* JADX INFO: renamed from: a */
                public final String f6369a;

                /* JADX INFO: renamed from: b */
                public final boolean f6370b;

                /* JADX INFO: renamed from: c */
                public final UsercentricsLocation f6371c;

                /* JADX INFO: renamed from: d */
                public final HashSet f6372d;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/ruleset/data/SessionGeoRule$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/ruleset/data/SessionGeoRule;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return SessionGeoRule$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ SessionGeoRule(int i, String str, boolean z, UsercentricsLocation usercentricsLocation, HashSet hashSet) {
/* 5 */             if (15 != (i & 15)) {
/* 25 */                b40.m1214E(i, 15, SessionGeoRule$$serializer.INSTANCE.getDescriptor());
/* 29 */                throw null;
                    }
/* 10 */            this.f6369a = str;
/* 12 */            this.f6370b = z;
/* 14 */            this.f6371c = usercentricsLocation;
/* 16 */            this.f6372d = hashSet;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof SessionGeoRule)) {
/* 7 */                 return false;
                    }
/* 11 */            SessionGeoRule sessionGeoRule = (SessionGeoRule) obj;
                    return Intrinsics.m6216a(this.f6369a, sessionGeoRule.f6369a) && this.f6370b == sessionGeoRule.f6370b && Intrinsics.m6216a(this.f6371c, sessionGeoRule.f6371c) && Intrinsics.m6216a(this.f6372d, sessionGeoRule.f6372d);
                }

                public final int hashCode() {
/* 30 */            return this.f6372d.hashCode() + ((this.f6371c.hashCode() + AbstractC0886en.m3504h(this.f6369a.hashCode() * 31, 31, this.f6370b)) * 31);
                }

                public final String toString() {
/* 48 */            return "SessionGeoRule(activeSettingsId=" + this.f6369a + ", noShow=" + this.f6370b + ", location=" + this.f6371c + ", allSettingsIds=" + this.f6372d + ")";
                }

/* 29 */        public SessionGeoRule(String str, boolean z, UsercentricsLocation usercentricsLocation, HashSet hashSet) {
                    str.getClass();
                    usercentricsLocation.getClass();
/* 31 */            this.f6369a = str;
/* 32 */            this.f6370b = z;
/* 33 */            this.f6371c = usercentricsLocation;
/* 34 */            this.f6372d = hashSet;
                }
            }
