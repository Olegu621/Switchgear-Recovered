            package com.usercentrics.sdk.domain.api.http;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class HttpErrorResponse {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6081a;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/domain/api/http/HttpErrorResponse$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/domain/api/http/HttpErrorResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return HttpErrorResponse$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ HttpErrorResponse(int i, String str) {
/* 6 */             if ((i & 1) == 0) {
/* 10 */                this.f6081a = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 13 */                this.f6081a = str;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof HttpErrorResponse) && Intrinsics.m6216a(this.f6081a, ((HttpErrorResponse) obj).f6081a);
                }

                public final int hashCode() {
/* 1 */             String str = this.f6081a;
/* 3 */             if (str == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return str.hashCode();
                }

                public final String toString() {
/* 7 */             return fm0.m3784j("HttpErrorResponse(message=", this.f6081a, ")");
                }
            }
