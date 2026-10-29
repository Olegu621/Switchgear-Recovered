            package com.usercentrics.sdk.p009v2.consent.data;

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
/* 30 */    public final class DataTransferObjectService {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6324a;

                /* JADX INFO: renamed from: b */
                public final String f6325b;

                /* JADX INFO: renamed from: c */
                public final boolean f6326c;

                /* JADX INFO: renamed from: d */
                public final String f6327d;

                /* JADX INFO: renamed from: e */
                public final String f6328e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/consent/data/DataTransferObjectService;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return DataTransferObjectService$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ DataTransferObjectService(int i, String str, String str2, String str3, String str4, boolean z) {
/* 5 */             if (31 != (i & 31)) {
/* 27 */                b40.m1214E(i, 31, DataTransferObjectService$$serializer.INSTANCE.getDescriptor());
/* 31 */                throw null;
                    }
/* 10 */            this.f6324a = str;
/* 12 */            this.f6325b = str2;
/* 14 */            this.f6326c = z;
/* 16 */            this.f6327d = str3;
/* 18 */            this.f6328e = str4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof DataTransferObjectService)) {
/* 7 */                 return false;
                    }
/* 11 */            DataTransferObjectService dataTransferObjectService = (DataTransferObjectService) obj;
                    return Intrinsics.m6216a(this.f6324a, dataTransferObjectService.f6324a) && Intrinsics.m6216a(this.f6325b, dataTransferObjectService.f6325b) && this.f6326c == dataTransferObjectService.f6326c && Intrinsics.m6216a(this.f6327d, dataTransferObjectService.f6327d) && Intrinsics.m6216a(this.f6328e, dataTransferObjectService.f6328e);
                }

                public final int hashCode() {
/* 34 */            return this.f6328e.hashCode() + pm2.m7485h(AbstractC0886en.m3504h(pm2.m7485h(this.f6324a.hashCode() * 31, 31, this.f6325b), 31, this.f6326c), 31, this.f6327d);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("DataTransferObjectService(id=", this.f6324a, ", name=", this.f6325b, ", status=");
/* 17 */            sbM3514r.append(this.f6326c);
/* 22 */            sbM3514r.append(", version=");
/* 27 */            sbM3514r.append(this.f6327d);
/* 32 */            sbM3514r.append(", processorId=");
/* 39 */            return fm0.m3789o(sbM3514r, this.f6328e, ")");
                }

/* 31 */        public DataTransferObjectService(boolean z, String str, String str2, String str3, String str4) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    str4.getClass();
/* 33 */            this.f6324a = str;
/* 34 */            this.f6325b = str2;
/* 35 */            this.f6326c = z;
/* 36 */            this.f6327d = str3;
/* 37 */            this.f6328e = str4;
                }
            }
