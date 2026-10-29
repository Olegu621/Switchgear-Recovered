            package com.usercentrics.sdk.models.api;

            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import p000.p51;
            import p000.r51;
            import p000.v51;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ApiSettingsVersion {

                /* JADX INFO: Fake field, exist only in values array */
                ApiSettingsVersion EF5;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ ApiSettingsVersion[] f6089b = {new ApiSettingsVersion("MAJOR", 0), new ApiSettingsVersion("MINOR", 1), new ApiSettingsVersion("PATCH", 2)};
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public static final p51 f6088a = r51.m8064a(v51.f17865a, C0811a.f6090a);

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/models/api/ApiSettingsVersion$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/models/api/ApiSettingsVersion;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 7 */                 return (KSerializer) ApiSettingsVersion.f6088a.getValue();
                    }
                }

                public static ApiSettingsVersion valueOf(String str) {
/* 7 */             return (ApiSettingsVersion) Enum.valueOf(ApiSettingsVersion.class, str);
                }

                public static ApiSettingsVersion[] values() {
/* 7 */             return (ApiSettingsVersion[]) f6089b.clone();
                }
            }
