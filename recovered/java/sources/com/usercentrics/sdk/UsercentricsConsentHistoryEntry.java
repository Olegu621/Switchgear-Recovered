            package com.usercentrics.sdk;

            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.b10;
            import p000.b40;
            import p000.fm0;
            import p000.j22;
            import p000.mz2;
            import p000.oe0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public final class UsercentricsConsentHistoryEntry {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: d */
                public static final KSerializer[] f6038d = {null, new b10(j22.m5667a(mz2.class), new oe0("com.usercentrics.sdk.models.settings.UsercentricsConsentType", mz2.values()), new KSerializer[0]), null};

                /* JADX INFO: renamed from: a */
                public final boolean f6039a;

                /* JADX INFO: renamed from: b */
                public final mz2 f6040b;

                /* JADX INFO: renamed from: c */
                public final long f6041c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/UsercentricsConsentHistoryEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return UsercentricsConsentHistoryEntry$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ UsercentricsConsentHistoryEntry(int i, boolean z, mz2 mz2Var, long j) {
/* 4 */             if (7 != (i & 7)) {
/* 22 */                b40.m1214E(i, 7, UsercentricsConsentHistoryEntry$$serializer.INSTANCE.getDescriptor());
/* 26 */                throw null;
                    }
/* 9 */             this.f6039a = z;
/* 11 */            this.f6040b = mz2Var;
/* 13 */            this.f6041c = j;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof UsercentricsConsentHistoryEntry)) {
/* 7 */                 return false;
                    }
/* 11 */            UsercentricsConsentHistoryEntry usercentricsConsentHistoryEntry = (UsercentricsConsentHistoryEntry) obj;
                    return this.f6039a == usercentricsConsentHistoryEntry.f6039a && this.f6040b == usercentricsConsentHistoryEntry.f6040b && this.f6041c == usercentricsConsentHistoryEntry.f6041c;
                }

                public final int hashCode() {
/* 24 */            return Long.hashCode(this.f6041c) + ((this.f6040b.hashCode() + (Boolean.hashCode(this.f6039a) * 31)) * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("UsercentricsConsentHistoryEntry(status=");
/* 10 */            sb.append(this.f6039a);
/* 15 */            sb.append(", type=");
/* 20 */            sb.append(this.f6040b);
/* 25 */            sb.append(", timestampInMillis=");
/* 32 */            return fm0.m3787m(sb, this.f6041c, ")");
                }

/* 26 */        public UsercentricsConsentHistoryEntry(boolean z, mz2 mz2Var, long j) {
                    mz2Var.getClass();
/* 28 */            this.f6039a = z;
/* 29 */            this.f6040b = mz2Var;
/* 30 */            this.f6041c = j;
                }
            }
