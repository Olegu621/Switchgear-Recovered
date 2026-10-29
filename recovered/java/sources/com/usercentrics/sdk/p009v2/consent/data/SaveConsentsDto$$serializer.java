            package com.usercentrics.sdk.p009v2.consent.data;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.List;
            import kotlin.Metadata;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import p000.C0920fk;
            import p000.C1951n4;
            import p000.InterfaceC1870ky;
            import p000.InterfaceC1907ly;
            import p000.de3;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/consent/data/SaveConsentsDto.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/consent/data/SaveConsentsDto;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class SaveConsentsDto$$serializer implements uq0 {
                public static final SaveConsentsDto$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             SaveConsentsDto$$serializer saveConsentsDto$$serializer = new SaveConsentsDto$$serializer();
/* 6 */             INSTANCE = saveConsentsDto$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.consent.data.SaveConsentsDto", saveConsentsDto$$serializer, 16);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("action", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("appVersion", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("controllerId", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("language", false);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("settingsId", false);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("settingsVersion", false);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("consentString", false);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("consentMeta", false);
/* 60 */            pluginGeneratedSerialDescriptor.m6270j("consents", false);
/* 65 */            pluginGeneratedSerialDescriptor.m6270j("bundleId", false);
/* 70 */            pluginGeneratedSerialDescriptor.m6270j("sdkVersion", false);
/* 75 */            pluginGeneratedSerialDescriptor.m6270j("userOS", false);
/* 80 */            pluginGeneratedSerialDescriptor.m6270j("xdevice", false);
/* 85 */            pluginGeneratedSerialDescriptor.m6270j("analytics", false);
/* 90 */            pluginGeneratedSerialDescriptor.m6270j("acString", false);
/* 96 */            pluginGeneratedSerialDescriptor.m6270j("webhook", true);
/* 99 */            descriptor = pluginGeneratedSerialDescriptor;
                }

                private SaveConsentsDto$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 5 */             KSerializer kSerializer = SaveConsentsDto.f6336q[8];
/* 11 */            vh2 vh2Var = vh2.f18183a;
/* 51 */            C0920fk c0920fk = C0920fk.f8246a;
/* 9 */             return new KSerializer[]{vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, kSerializer, vh2Var, vh2Var, vh2Var, c0920fk, c0920fk, vh2Var, c0920fk};
                }

                @Override // kotlinx.serialization.KSerializer
                public SaveConsentsDto deserialize(Decoder decoder) {
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr = SaveConsentsDto.f6336q;
/* 17 */            SaveConsentsDto saveConsentsDto = null;
/* 18 */            boolean z = true;
/* 19 */            List list = null;
/* 20 */            String strMo4376v = null;
/* 21 */            String strMo4376v2 = null;
/* 22 */            String strMo4376v3 = null;
/* 23 */            String strMo4376v4 = null;
/* 24 */            String strMo4376v5 = null;
/* 25 */            String strMo4376v6 = null;
/* 26 */            String strMo4376v7 = null;
/* 27 */            String strMo4376v8 = null;
/* 29 */            String strMo4376v9 = null;
/* 31 */            String strMo4376v10 = null;
/* 33 */            String strMo4376v11 = null;
/* 35 */            String strMo4376v12 = null;
/* 37 */            int i = 0;
/* 38 */            boolean zMo4374t = false;
/* 40 */            boolean zMo4374t2 = false;
/* 42 */            boolean zMo4374t3 = false;
/* 44 */            while (z) {
/* 46 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 202 */                       z = false;
                                continue;
                            case 0:
/* 193 */                       strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 0);
/* 197 */                       i |= 1;
                                break;
                            case 1:
/* 185 */                       strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 1);
/* 189 */                       i |= 2;
                                break;
                            case 2:
/* 178 */                       strMo4376v3 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 2);
/* 182 */                       i |= 4;
                                break;
                            case 3:
/* 170 */                       strMo4376v4 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 3);
/* 174 */                       i |= 8;
                                break;
                            case 4:
/* 162 */                       strMo4376v5 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 4);
/* 166 */                       i |= 16;
                                break;
                            case 5:
/* 154 */                       strMo4376v6 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 5);
/* 158 */                       i |= 32;
                                break;
                            case 6:
/* 146 */                       strMo4376v7 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 6);
/* 150 */                       i |= 64;
                                break;
                            case 7:
/* 138 */                       strMo4376v8 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 7);
/* 142 */                       i |= 128;
                                break;
                            case 8:
/* 132 */                       list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 8, kSerializerArr[8], list);
/* 134 */                       i |= NotificationCompat.FLAG_LOCAL_ONLY;
                                break;
                            case 9:
/* 116 */                       strMo4376v9 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 9);
/* 120 */                       i |= NotificationCompat.FLAG_GROUP_SUMMARY;
                                break;
                            case 10:
/* 107 */                       strMo4376v10 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 10);
/* 111 */                       i |= Segment.SHARE_MINIMUM;
                                break;
                            case 11:
/* 98 */                        strMo4376v11 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 11);
/* 102 */                       i |= 2048;
                                break;
                            case 12:
/* 89 */                        zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 12);
/* 93 */                        i |= 4096;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 80 */                        zMo4374t2 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 13);
/* 84 */                        i |= Segment.SIZE;
                                break;
                            case 14:
/* 71 */                        strMo4376v12 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 14);
/* 75 */                        i |= Http2.INITIAL_MAX_FRAME_SIZE;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 59 */                        zMo4374t3 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 15);
/* 66 */                        i |= 32768;
                                break;
                            default:
/* 53 */                        C1951n4.m6855e(iMo3299x);
/* 56 */                        return saveConsentsDto;
                        }
/* 67 */                saveConsentsDto = null;
                    }
/* 205 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 212 */           return new SaveConsentsDto(i, strMo4376v, strMo4376v2, strMo4376v3, strMo4376v4, strMo4376v5, strMo4376v6, strMo4376v7, strMo4376v8, list, strMo4376v9, strMo4376v10, strMo4376v11, zMo4374t, zMo4374t2, strMo4376v12, zMo4374t3);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, SaveConsentsDto value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = SaveConsentsDto.f6336q;
/* 20 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 0, value.f6337a);
/* 26 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 1, value.f6338b);
/* 32 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 2, value.f6339c);
/* 38 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 3, value.f6340d);
/* 44 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 4, value.f6341e);
/* 50 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 5, value.f6342f);
/* 56 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 6, value.f6343g);
/* 62 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 7, value.f6344h);
/* 71 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 8, kSerializerArr[8], value.f6345i);
/* 78 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 9, value.f6346j);
/* 85 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 10, value.f6347k);
/* 92 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 11, value.f6348l);
/* 99 */            interfaceC1907lyMo1499c.mo1513q(descriptor2, 12, value.f6349m);
/* 106 */           interfaceC1907lyMo1499c.mo1513q(descriptor2, 13, value.f6350n);
/* 113 */           interfaceC1907lyMo1499c.mo1514r(descriptor2, 14, value.f6351o);
/* 116 */           boolean z = value.f6352p;
/* 118 */           if (z) {
/* 122 */               interfaceC1907lyMo1499c.mo1513q(descriptor2, 15, z);
                    }
/* 125 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
