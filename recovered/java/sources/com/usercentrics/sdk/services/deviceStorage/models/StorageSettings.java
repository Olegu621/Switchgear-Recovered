            package com.usercentrics.sdk.services.deviceStorage.models;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C0950gd;
            import p000.fm0;
            import p000.nd0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 52 */    public final class StorageSettings {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: f */
                public static final KSerializer[] f6138f = {null, null, null, new C0950gd(StorageService$$serializer.INSTANCE, 0), null};

                /* JADX INFO: renamed from: a */
                public final String f6139a;

                /* JADX INFO: renamed from: b */
                public final String f6140b;

                /* JADX INFO: renamed from: c */
                public final String f6141c;

                /* JADX INFO: renamed from: d */
                public final List f6142d;

                /* JADX INFO: renamed from: e */
                public final String f6143e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return StorageSettings$$serializer.INSTANCE;
                    }
                }

                public StorageSettings(int i, String str, String str2, String str3, String str4, List list) {
/* 8 */             if ((i & 1) == 0) {
/* 10 */                this.f6139a = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 13 */                this.f6139a = str;
                    }
/* 17 */            if ((i & 2) == 0) {
/* 19 */                this.f6140b = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 22 */                this.f6140b = str2;
                    }
/* 26 */            if ((i & 4) == 0) {
/* 28 */                this.f6141c = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 31 */                this.f6141c = str3;
                    }
/* 35 */            if ((i & 8) == 0) {
/* 39 */                this.f6142d = nd0.f14189a;
                    } else {
/* 42 */                this.f6142d = list;
                    }
/* 46 */            if ((i & 16) == 0) {
/* 48 */                this.f6143e = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 51 */                this.f6143e = str4;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof StorageSettings)) {
/* 7 */                 return false;
                    }
/* 11 */            StorageSettings storageSettings = (StorageSettings) obj;
                    return Intrinsics.m6216a(this.f6139a, storageSettings.f6139a) && Intrinsics.m6216a(this.f6140b, storageSettings.f6140b) && Intrinsics.m6216a(this.f6141c, storageSettings.f6141c) && Intrinsics.m6216a(this.f6142d, storageSettings.f6142d) && Intrinsics.m6216a(this.f6143e, storageSettings.f6143e);
                }

                public final int hashCode() {
/* 34 */            return this.f6143e.hashCode() + AbstractC0298j.m1861b(pm2.m7485h(pm2.m7485h(this.f6139a.hashCode() * 31, 31, this.f6140b), 31, this.f6141c), 31, this.f6142d);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("StorageSettings(controllerId=", this.f6139a, ", id=", this.f6140b, ", language=");
/* 17 */            sbM3514r.append(this.f6141c);
/* 22 */            sbM3514r.append(", services=");
/* 27 */            sbM3514r.append(this.f6142d);
/* 32 */            sbM3514r.append(", version=");
/* 39 */            return fm0.m3789o(sbM3514r, this.f6143e, ")");
                }

/* 53 */        public StorageSettings(String str, String str2, String str3, List list, String str4) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    list.getClass();
                    str4.getClass();
/* 55 */            this.f6139a = str;
/* 56 */            this.f6140b = str2;
/* 57 */            this.f6141c = str3;
/* 58 */            this.f6142d = list;
/* 59 */            this.f6143e = str4;
                }

/* 59 */        public StorageSettings() {
/* 62 */            this(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, nd0.f14189a, HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
