            package com.usercentrics.sdk.services.deviceStorage.models;

            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.C0950gd;
            import p000.b40;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 28 */    public final class StorageService {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: e */
                public static final KSerializer[] f6131e = {new C0950gd(StorageConsentHistory$$serializer.INSTANCE, 0), null, null, null};

                /* JADX INFO: renamed from: a */
                public final List f6132a;

                /* JADX INFO: renamed from: b */
                public final String f6133b;

                /* JADX INFO: renamed from: c */
                public final String f6134c;

                /* JADX INFO: renamed from: d */
                public final boolean f6135d;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageService;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return StorageService$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ StorageService(int i, List list, String str, String str2, boolean z) {
/* 5 */             if (15 != (i & 15)) {
/* 25 */                b40.m1214E(i, 15, StorageService$$serializer.INSTANCE.getDescriptor());
/* 29 */                throw null;
                    }
/* 10 */            this.f6132a = list;
/* 12 */            this.f6133b = str;
/* 14 */            this.f6134c = str2;
/* 16 */            this.f6135d = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof StorageService)) {
/* 7 */                 return false;
                    }
/* 11 */            StorageService storageService = (StorageService) obj;
                    return Intrinsics.m6216a(this.f6132a, storageService.f6132a) && Intrinsics.m6216a(this.f6133b, storageService.f6133b) && Intrinsics.m6216a(this.f6134c, storageService.f6134c) && this.f6135d == storageService.f6135d;
                }

                public final int hashCode() {
/* 28 */            return Boolean.hashCode(this.f6135d) + pm2.m7485h(pm2.m7485h(this.f6132a.hashCode() * 31, 31, this.f6133b), 31, this.f6134c);
                }

                public final String toString() {
/* 48 */            return "StorageService(history=" + this.f6132a + ", id=" + this.f6133b + ", processorId=" + this.f6134c + ", status=" + this.f6135d + ")";
                }

/* 29 */        public StorageService(List list, String str, String str2, boolean z) {
                    str.getClass();
                    str2.getClass();
/* 31 */            this.f6132a = list;
/* 32 */            this.f6133b = str;
/* 33 */            this.f6134c = str2;
/* 34 */            this.f6135d = z;
                }
            }
