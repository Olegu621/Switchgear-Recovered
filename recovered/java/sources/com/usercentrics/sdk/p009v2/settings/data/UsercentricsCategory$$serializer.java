            package com.usercentrics.sdk.p009v2.settings.data;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
            import okhttp3.HttpUrl;
            import p000.C0920fk;
            import p000.C1951n4;
            import p000.InterfaceC1870ky;
            import p000.InterfaceC1907ly;
            import p000.de3;
            import p000.j13;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/UsercentricsCategory.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class UsercentricsCategory$$serializer implements uq0 {
                public static final UsercentricsCategory$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             UsercentricsCategory$$serializer usercentricsCategory$$serializer = new UsercentricsCategory$$serializer();
/* 6 */             INSTANCE = usercentricsCategory$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.UsercentricsCategory", usercentricsCategory$$serializer, 5);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("categorySlug", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("label", true);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("description", true);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("isEssential", true);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("isHidden", true);
/* 43 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private UsercentricsCategory$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             vh2 vh2Var = vh2.f18183a;
/* 3 */             KSerializer kSerializerM5647i = j13.m5647i(vh2Var);
/* 19 */            C0920fk c0920fk = C0920fk.f8246a;
/* 8 */             return new KSerializer[]{vh2Var, vh2Var, kSerializerM5647i, c0920fk, c0920fk};
                }

                @Override // kotlinx.serialization.KSerializer
                public UsercentricsCategory deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 15 */            boolean z = true;
/* 16 */            int i = 0;
/* 17 */            boolean zMo4374t = false;
/* 18 */            boolean zMo4374t2 = false;
/* 19 */            String strMo4376v = null;
/* 20 */            String strMo4376v2 = null;
/* 21 */            String str = null;
/* 22 */            while (z) {
/* 24 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 29 */                if (iMo3299x == -1) {
/* 88 */                    z = false;
                        } else if (iMo3299x == 0) {
/* 81 */                    strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 0);
/* 85 */                    i |= 1;
                        } else if (iMo3299x == 1) {
/* 74 */                    strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 1);
/* 78 */                    i |= 2;
                        } else if (iMo3299x == 2) {
/* 69 */                    str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 2, vh2.f18183a, str);
/* 71 */                    i |= 4;
                        } else if (iMo3299x == 3) {
/* 55 */                    zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 3);
/* 59 */                    i |= 8;
                        } else {
/* 42 */                    if (iMo3299x != 4) {
/* 51 */                        C1951n4.m6855e(iMo3299x);
/* 14 */                        return null;
                            }
/* 44 */                    zMo4374t2 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 4);
/* 48 */                    i |= 16;
                        }
                    }
/* 90 */            interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 95 */            return new UsercentricsCategory(i, strMo4376v, strMo4376v2, str, zMo4374t, zMo4374t2);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, UsercentricsCategory value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            String str = value.f6533a;
/* 17 */            boolean z = value.f6537e;
/* 19 */            boolean z2 = value.f6536d;
/* 21 */            String str2 = value.f6535c;
/* 23 */            String str3 = value.f6534b;
/* 26 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 0, str);
/* 33 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || !Intrinsics.m6216a(str3, HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 45 */                interfaceC1907lyMo1499c.mo1514r(descriptor2, 1, str3);
                    }
/* 52 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str2 != null) {
/* 60 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 2, vh2.f18183a, str2);
                    }
/* 67 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z2) {
/* 73 */                interfaceC1907lyMo1499c.mo1513q(descriptor2, 3, z2);
                    }
/* 80 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z) {
/* 86 */                interfaceC1907lyMo1499c.mo1513q(descriptor2, 4, z);
                    }
/* 89 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
