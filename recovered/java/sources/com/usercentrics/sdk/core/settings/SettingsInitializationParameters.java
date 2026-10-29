            package com.usercentrics.sdk.core.settings;

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
/* 30 */    public final class SettingsInitializationParameters {
                public static final Companion Companion = new Companion();

                /* JADX INFO: renamed from: a */
                public final String f6076a;

                /* JADX INFO: renamed from: b */
                public final String f6077b;

                /* JADX INFO: renamed from: c */
                public final String f6078c;

                /* JADX INFO: renamed from: d */
                public final String f6079d;

                /* JADX INFO: renamed from: e */
                public final boolean f6080e;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m6176d2 = {"Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/core/settings/SettingsInitializationParameters;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
/* 1 */                 return SettingsInitializationParameters$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ SettingsInitializationParameters(int i, String str, String str2, String str3, String str4, boolean z) {
/* 5 */             if (31 != (i & 31)) {
/* 27 */                b40.m1214E(i, 31, SettingsInitializationParameters$$serializer.INSTANCE.getDescriptor());
/* 31 */                throw null;
                    }
/* 10 */            this.f6076a = str;
/* 12 */            this.f6077b = str2;
/* 14 */            this.f6078c = str3;
/* 16 */            this.f6079d = str4;
/* 18 */            this.f6080e = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof SettingsInitializationParameters)) {
/* 7 */                 return false;
                    }
/* 11 */            SettingsInitializationParameters settingsInitializationParameters = (SettingsInitializationParameters) obj;
                    return Intrinsics.m6216a(this.f6076a, settingsInitializationParameters.f6076a) && Intrinsics.m6216a(this.f6077b, settingsInitializationParameters.f6077b) && Intrinsics.m6216a(this.f6078c, settingsInitializationParameters.f6078c) && Intrinsics.m6216a(this.f6079d, settingsInitializationParameters.f6079d) && this.f6080e == settingsInitializationParameters.f6080e;
                }

                public final int hashCode() {
/* 18 */            int iM7485h = pm2.m7485h(pm2.m7485h(this.f6076a.hashCode() * 31, 31, this.f6077b), 31, this.f6078c);
/* 22 */            String str = this.f6079d;
/* 40 */            return Boolean.hashCode(this.f6080e) + ((iM7485h + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("SettingsInitializationParameters(settingsId=", this.f6076a, ", jsonFileVersion=", this.f6077b, ", jsonFileLanguage=");
/* 23 */            fm0.m3796v(sbM3514r, this.f6078c, ", controllerId=", this.f6079d, ", languageEtagChanged=");
/* 30 */            return AbstractC0886en.m3511o(sbM3514r, this.f6080e, ")");
                }

/* 31 */        public SettingsInitializationParameters(boolean z, String str, String str2, String str3, String str4) {
                    str.getClass();
                    str3.getClass();
/* 33 */            this.f6076a = str;
/* 34 */            this.f6077b = str2;
/* 35 */            this.f6078c = str3;
/* 36 */            this.f6079d = str4;
/* 37 */            this.f6080e = z;
                }
            }
