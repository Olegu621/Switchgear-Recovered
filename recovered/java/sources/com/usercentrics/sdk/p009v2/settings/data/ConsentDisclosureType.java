            package com.usercentrics.sdk.p009v2.settings.data;

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
            public final class ConsentDisclosureType {
                public static final Companion Companion;

                /* JADX INFO: renamed from: a */
                public static final p51 f6402a;

                /* JADX INFO: renamed from: b */
                public static final ConsentDisclosureType f6403b;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ ConsentDisclosureType[] f6404c;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 7 */                 return (KSerializer) ConsentDisclosureType.f6402a.getValue();
                    }
                }

                static {
/* 6 */             ConsentDisclosureType consentDisclosureType = new ConsentDisclosureType("COOKIE", 0);
/* 9 */             f6403b = consentDisclosureType;
/* 31 */            f6404c = new ConsentDisclosureType[]{consentDisclosureType, new ConsentDisclosureType("WEB", 1), new ConsentDisclosureType("APP", 2)};
/* 40 */            Companion = new Companion();
/* 50 */            f6402a = r51.m8064a(v51.f17865a, C0814a.f6755a);
                }

                public static ConsentDisclosureType valueOf(String str) {
/* 7 */             return (ConsentDisclosureType) Enum.valueOf(ConsentDisclosureType.class, str);
                }

                public static ConsentDisclosureType[] values() {
/* 7 */             return (ConsentDisclosureType[]) f6404c.clone();
                }
            }
