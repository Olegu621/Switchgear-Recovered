            package com.usercentrics.sdk.services.deviceStorage.models;

            import com.usercentrics.sdk.p009v2.consent.data.SaveConsentsData;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b40;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class ConsentsBufferEntry {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final long f6110a;

                /* JADX INFO: renamed from: b */
                public final SaveConsentsData f6111b;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/ConsentsBufferEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return ConsentsBufferEntry$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ ConsentsBufferEntry(int i, long j, SaveConsentsData saveConsentsData) {
/* 4 */             if (3 != (i & 3)) {
/* 20 */                b40.m1214E(i, 3, ConsentsBufferEntry$$serializer.INSTANCE.getDescriptor());
/* 24 */                throw null;
                    }
/* 9 */             this.f6110a = j;
/* 11 */            this.f6111b = saveConsentsData;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ConsentsBufferEntry)) {
/* 7 */                 return false;
                    }
/* 11 */            ConsentsBufferEntry consentsBufferEntry = (ConsentsBufferEntry) obj;
                    return this.f6110a == consentsBufferEntry.f6110a && Intrinsics.m6216a(this.f6111b, consentsBufferEntry.f6111b);
                }

                public final int hashCode() {
/* 15 */            return this.f6111b.hashCode() + (Long.hashCode(this.f6110a) * 31);
                }

                public final String toString() {
/* 28 */            return "ConsentsBufferEntry(timestampInSeconds=" + this.f6110a + ", consents=" + this.f6111b + ")";
                }

/* 24 */        public ConsentsBufferEntry(long j, SaveConsentsData saveConsentsData) {
                    saveConsentsData.getClass();
/* 26 */            this.f6110a = j;
/* 27 */            this.f6111b = saveConsentsData;
                }
            }
