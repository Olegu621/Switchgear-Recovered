            package com.usercentrics.sdk;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.b40;
            import p000.fm0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 50 */    public final class UpdatedConsentPayload {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: f */
                public static final KSerializer[] f6028f = {new C0950gd(UsercentricsServiceConsent$$serializer.INSTANCE, 0), null, null, null, null};

                /* JADX INFO: renamed from: a */
                public final List f6029a;

                /* JADX INFO: renamed from: b */
                public final String f6030b;

                /* JADX INFO: renamed from: c */
                public final String f6031c;

                /* JADX INFO: renamed from: d */
                public final String f6032d;

                /* JADX INFO: renamed from: e */
                public final String f6033e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/UpdatedConsentPayload$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/UpdatedConsentPayload;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UpdatedConsentPayload$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UpdatedConsentPayload(int i, String str, String str2, String str3, String str4, List list) {
/* 5 */             if (3 != (i & 3)) {
/* 48 */                b40.m1214E(i, 3, UpdatedConsentPayload$$serializer.INSTANCE.getDescriptor());
/* 51 */                throw null;
                    }
/* 10 */            this.f6029a = list;
/* 12 */            this.f6030b = str;
/* 16 */            if ((i & 4) == 0) {
/* 18 */                this.f6031c = null;
                    } else {
/* 21 */                this.f6031c = str2;
                    }
/* 25 */            if ((i & 8) == 0) {
/* 27 */                this.f6032d = null;
                    } else {
/* 30 */                this.f6032d = str3;
                    }
/* 34 */            if ((i & 16) == 0) {
/* 36 */                this.f6033e = null;
                    } else {
/* 39 */                this.f6033e = str4;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UpdatedConsentPayload)) {
/* 7 */                 return false;
                    }
/* 11 */            UpdatedConsentPayload updatedConsentPayload = (UpdatedConsentPayload) obj;
                    return Intrinsics.m6216a(this.f6029a, updatedConsentPayload.f6029a) && Intrinsics.m6216a(this.f6030b, updatedConsentPayload.f6030b) && Intrinsics.m6216a(this.f6031c, updatedConsentPayload.f6031c) && Intrinsics.m6216a(this.f6032d, updatedConsentPayload.f6032d) && Intrinsics.m6216a(this.f6033e, updatedConsentPayload.f6033e);
                }

                public final int hashCode() {
/* 12 */            int iM7485h = pm2.m7485h(this.f6029a.hashCode() * 31, 31, this.f6030b);
/* 17 */            String str = this.f6031c;
/* 28 */            int iHashCode = (iM7485h + (str == null ? 0 : str.hashCode())) * 31;
/* 29 */            String str2 = this.f6032d;
/* 40 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 41 */            String str3 = this.f6033e;
/* 50 */            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UpdatedConsentPayload(consents=");
/* 10 */            sb.append(this.f6029a);
/* 15 */            sb.append(", controllerId=");
/* 20 */            sb.append(this.f6030b);
/* 25 */            sb.append(", tcString=");
/* 36 */            fm0.m3796v(sb, this.f6031c, ", uspString=", this.f6032d, ", acString=");
/* 43 */            return fm0.m3789o(sb, this.f6033e, ")");
                }

/* 51 */        public UpdatedConsentPayload(ArrayList arrayList, String str, String str2, String str3, String str4) {
                    str.getClass();
/* 53 */            this.f6029a = arrayList;
/* 54 */            this.f6030b = str;
/* 55 */            this.f6031c = str2;
/* 56 */            this.f6032d = str3;
/* 57 */            this.f6033e = str4;
                }
            }
