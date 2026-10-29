            package com.usercentrics.sdk.services.tcf.interfaces;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
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
            import p000.az0;
            import p000.de3;
            import p000.j13;
            import p000.uq0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/services/tcf/interfaces/IdAndConsent.$serializer", "Luq0;", "Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class IdAndConsent$$serializer implements uq0 {
                public static final IdAndConsent$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             IdAndConsent$$serializer idAndConsent$$serializer = new IdAndConsent$$serializer();
/* 6 */             INSTANCE = idAndConsent$$serializer;
/* 13 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.tcf.interfaces.IdAndConsent", idAndConsent$$serializer, 3);
/* 19 */            pluginGeneratedSerialDescriptor.m6270j("id", false);
/* 24 */            pluginGeneratedSerialDescriptor.m6270j("consent", false);
/* 29 */            pluginGeneratedSerialDescriptor.m6270j("legitimateInterestConsent", false);
/* 32 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private IdAndConsent$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             C0920fk c0920fk = C0920fk.f8246a;
/* 12 */            return new KSerializer[]{az0.f2143a, j13.m5647i(c0920fk), j13.m5647i(c0920fk)};
                }

                @Override // kotlinx.serialization.KSerializer
                public IdAndConsent deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 8 */             InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 15 */            boolean z = true;
/* 16 */            int i = 0;
/* 17 */            int iMo4371q = 0;
/* 18 */            Boolean bool = null;
/* 19 */            Boolean bool2 = null;
/* 20 */            while (z) {
/* 22 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
/* 27 */                if (iMo3299x == -1) {
/* 69 */                    z = false;
                        } else if (iMo3299x == 0) {
/* 62 */                    iMo4371q = interfaceC1870kyMo3297c.mo4371q(descriptor2, 0);
/* 66 */                    i |= 1;
                        } else if (iMo3299x == 1) {
/* 57 */                    bool = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 1, C0920fk.f8246a, bool);
/* 59 */                    i |= 2;
                        } else {
/* 34 */                    if (iMo3299x != 2) {
/* 47 */                        C1951n4.m6855e(iMo3299x);
/* 14 */                        return null;
                            }
/* 42 */                    bool2 = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 2, C0920fk.f8246a, bool2);
/* 44 */                    i |= 4;
                        }
                    }
/* 71 */            interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 76 */            return new IdAndConsent(i, iMo4371q, bool, bool2);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, IdAndConsent value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 18 */            interfaceC1907lyMo1499c.mo1508l(0, value.f6154a, descriptor2);
/* 21 */            C0920fk c0920fk = C0920fk.f8246a;
/* 26 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 1, c0920fk, value.f6155b);
/* 32 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 2, c0920fk, value.f6156c);
/* 35 */            interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
