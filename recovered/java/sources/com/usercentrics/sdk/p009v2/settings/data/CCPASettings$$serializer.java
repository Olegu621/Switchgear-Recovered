            package com.usercentrics.sdk.p009v2.settings.data;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.editing.FlutterTextUtils;
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
            import p000.EnumC0185bm;
            import p000.InterfaceC1870ky;
            import p000.InterfaceC1907ly;
            import p000.az0;
            import p000.de3;
            import p000.fj0;
            import p000.j13;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/CCPASettings.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/CCPASettings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class CCPASettings$$serializer implements uq0 {
                public static final CCPASettings$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             CCPASettings$$serializer cCPASettings$$serializer = new CCPASettings$$serializer();
/* 6 */             INSTANCE = cCPASettings$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.CCPASettings", cCPASettings$$serializer, 17);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("optOutNoticeLabel", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("btnSave", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("firstLayerTitle", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("secondLayerTitle", false);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("secondLayerDescription", false);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("btnMoreInfo", false);
/* 51 */            pluginGeneratedSerialDescriptor.m6270j("firstLayerMobileVariant", true);
/* 56 */            pluginGeneratedSerialDescriptor.m6270j("isActive", true);
/* 61 */            pluginGeneratedSerialDescriptor.m6270j("region", true);
/* 66 */            pluginGeneratedSerialDescriptor.m6270j("showOnPageLoad", true);
/* 71 */            pluginGeneratedSerialDescriptor.m6270j("reshowAfterDays", true);
/* 76 */            pluginGeneratedSerialDescriptor.m6270j("iabAgreementExists", true);
/* 81 */            pluginGeneratedSerialDescriptor.m6270j("removeDoNotSellToggle", true);
/* 86 */            pluginGeneratedSerialDescriptor.m6270j("appFirstLayerDescription", true);
/* 91 */            pluginGeneratedSerialDescriptor.m6270j("firstLayerMobileDescriptionIsActive", true);
/* 96 */            pluginGeneratedSerialDescriptor.m6270j("firstLayerMobileDescription", true);
/* 101 */           pluginGeneratedSerialDescriptor.m6270j("secondLayerHideLanguageSwitch", true);
/* 104 */           descriptor = pluginGeneratedSerialDescriptor;
                }

                private CCPASettings$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = CCPASettings.f6373r;
/* 3 */             vh2 vh2Var = vh2.f18183a;
/* 8 */             KSerializer kSerializerM5647i = j13.m5647i(kSerializerArr[6]);
/* 14 */            KSerializer kSerializer = kSerializerArr[8];
/* 16 */            KSerializer kSerializerM5647i2 = j13.m5647i(vh2Var);
/* 20 */            KSerializer kSerializerM5647i3 = j13.m5647i(vh2Var);
/* 48 */            C0920fk c0920fk = C0920fk.f8246a;
/* 26 */            return new KSerializer[]{vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, vh2Var, kSerializerM5647i, c0920fk, kSerializer, c0920fk, az0.f2143a, c0920fk, c0920fk, kSerializerM5647i2, c0920fk, kSerializerM5647i3, c0920fk};
                }

                @Override // kotlinx.serialization.KSerializer
                public CCPASettings deserialize(Decoder decoder) {
                    KSerializer[] kSerializerArr;
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr2 = CCPASettings.f6373r;
/* 18 */            String str = null;
/* 19 */            String str2 = null;
/* 20 */            boolean z = true;
/* 21 */            EnumC0185bm enumC0185bm = null;
/* 22 */            int i = 0;
/* 23 */            String strMo4376v = null;
/* 24 */            String strMo4376v2 = null;
/* 25 */            String strMo4376v3 = null;
/* 26 */            String strMo4376v4 = null;
/* 27 */            String strMo4376v5 = null;
/* 28 */            String strMo4376v6 = null;
/* 29 */            fj0 fj0Var = null;
/* 30 */            boolean zMo4374t = false;
/* 32 */            boolean zMo4374t2 = false;
/* 34 */            int iMo4371q = 0;
/* 36 */            boolean zMo4374t3 = false;
/* 38 */            boolean zMo4374t4 = false;
/* 40 */            boolean zMo4374t5 = false;
/* 42 */            boolean zMo4374t6 = false;
/* 44 */            while (z) {
/* 46 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 265 */                       kSerializerArr = kSerializerArr2;
/* 269 */                       z = false;
                                break;
                            case 0:
/* 253 */                       kSerializerArr = kSerializerArr2;
/* 257 */                       strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 0);
/* 261 */                       i |= 1;
                                break;
                            case 1:
/* 242 */                       kSerializerArr = kSerializerArr2;
/* 245 */                       strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 1);
/* 249 */                       i |= 2;
                                break;
                            case 2:
/* 231 */                       kSerializerArr = kSerializerArr2;
/* 234 */                       strMo4376v3 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 2);
/* 238 */                       i |= 4;
                                break;
                            case 3:
/* 220 */                       kSerializerArr = kSerializerArr2;
/* 223 */                       strMo4376v4 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 3);
/* 227 */                       i |= 8;
                                break;
                            case 4:
/* 209 */                       kSerializerArr = kSerializerArr2;
/* 212 */                       strMo4376v5 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 4);
/* 216 */                       i |= 16;
                                break;
                            case 5:
/* 199 */                       kSerializerArr = kSerializerArr2;
/* 202 */                       strMo4376v6 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 5);
/* 206 */                       i |= 32;
                                break;
                            case 6:
/* 184 */                       kSerializerArr = kSerializerArr2;
/* 194 */                       fj0Var = (fj0) interfaceC1870kyMo3297c.mo4377y(descriptor2, 6, kSerializerArr[6], fj0Var);
/* 196 */                       i |= 64;
                                break;
                            case 7:
/* 174 */                       kSerializerArr = kSerializerArr2;
/* 177 */                       zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 7);
/* 181 */                       i |= 128;
                                break;
                            case 8:
/* 158 */                       kSerializerArr = kSerializerArr2;
/* 169 */                       enumC0185bm = (EnumC0185bm) interfaceC1870kyMo3297c.mo4350A(descriptor2, 8, kSerializerArr[8], enumC0185bm);
/* 171 */                       i |= NotificationCompat.FLAG_LOCAL_ONLY;
                                break;
                            case 9:
/* 147 */                       kSerializerArr = kSerializerArr2;
/* 151 */                       zMo4374t2 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 9);
/* 155 */                       i |= NotificationCompat.FLAG_GROUP_SUMMARY;
                                break;
                            case 10:
/* 136 */                       kSerializerArr = kSerializerArr2;
/* 140 */                       iMo4371q = interfaceC1870kyMo3297c.mo4371q(descriptor2, 10);
/* 144 */                       i |= Segment.SHARE_MINIMUM;
                                break;
                            case 11:
/* 125 */                       kSerializerArr = kSerializerArr2;
/* 129 */                       zMo4374t3 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 11);
/* 133 */                       i |= 2048;
                                break;
                            case 12:
/* 114 */                       kSerializerArr = kSerializerArr2;
/* 118 */                       zMo4374t4 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 12);
/* 122 */                       i |= 4096;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 98 */                        kSerializerArr = kSerializerArr2;
/* 109 */                       str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 13, vh2.f18183a, str2);
/* 111 */                       i |= Segment.SIZE;
                                break;
                            case 14:
/* 87 */                        kSerializerArr = kSerializerArr2;
/* 91 */                        zMo4374t5 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 14);
/* 95 */                        i |= Http2.INITIAL_MAX_FRAME_SIZE;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 69 */                        kSerializerArr = kSerializerArr2;
/* 78 */                        str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 15, vh2.f18183a, str);
/* 83 */                        i |= 32768;
                                break;
                            case 16:
/* 59 */                        zMo4374t6 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 16);
/* 65 */                        i |= 65536;
                                continue;
                            default:
/* 53 */                        C1951n4.m6855e(iMo3299x);
/* 16 */                        return null;
                        }
/* 84 */                kSerializerArr2 = kSerializerArr;
                    }
/* 272 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 283 */           return new CCPASettings(i, strMo4376v, strMo4376v2, strMo4376v3, strMo4376v4, strMo4376v5, strMo4376v6, fj0Var, zMo4374t, enumC0185bm, zMo4374t2, iMo4371q, zMo4374t3, zMo4374t4, str2, zMo4374t5, str, zMo4374t6);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, CCPASettings value) {
/* 3 */             encoder.getClass();
/* 6 */             value.getClass();
/* 9 */             SerialDescriptor descriptor2 = getDescriptor();
/* 15 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 19 */            KSerializer[] kSerializerArr = CCPASettings.f6373r;
/* 21 */            String str = value.f6374a;
/* 23 */            boolean z = value.f6390q;
/* 25 */            String str2 = value.f6389p;
/* 27 */            boolean z2 = value.f6388o;
/* 29 */            String str3 = value.f6387n;
/* 31 */            boolean z3 = value.f6386m;
/* 33 */            boolean z4 = value.f6385l;
/* 35 */            int i = value.f6384k;
/* 37 */            boolean z5 = value.f6383j;
/* 39 */            EnumC0185bm enumC0185bm = value.f6382i;
/* 41 */            boolean z6 = value.f6381h;
/* 43 */            fj0 fj0Var = value.f6380g;
/* 48 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 0, str);
/* 54 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 1, value.f6375b);
/* 60 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 2, value.f6376c);
/* 66 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 3, value.f6377d);
/* 72 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 4, value.f6378e);
/* 78 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 5, value.f6379f);
/* 85 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || fj0Var != null) {
/* 93 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 6, kSerializerArr[6], fj0Var);
                    }
/* 100 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z6) {
/* 106 */               interfaceC1907lyMo1499c.mo1513q(descriptor2, 7, z6);
                    }
/* 113 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || enumC0185bm != EnumC0185bm.f2532a) {
/* 124 */               interfaceC1907lyMo1499c.mo1505i(descriptor2, 8, kSerializerArr[8], enumC0185bm);
                    }
/* 131 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z5) {
/* 138 */               interfaceC1907lyMo1499c.mo1513q(descriptor2, 9, z5);
                    }
/* 145 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || i != 365) {
/* 154 */               interfaceC1907lyMo1499c.mo1508l(10, i, descriptor2);
                    }
/* 161 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z4) {
/* 168 */               interfaceC1907lyMo1499c.mo1513q(descriptor2, 11, z4);
                    }
/* 175 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z3) {
/* 182 */               interfaceC1907lyMo1499c.mo1513q(descriptor2, 12, z3);
                    }
/* 189 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str3 != null) {
/* 198 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 13, vh2.f18183a, str3);
                    }
/* 205 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z2) {
/* 212 */               interfaceC1907lyMo1499c.mo1513q(descriptor2, 14, z2);
                    }
/* 219 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str2 != null) {
/* 228 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 15, vh2.f18183a, str2);
                    }
/* 235 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z) {
/* 242 */               interfaceC1907lyMo1499c.mo1513q(descriptor2, 16, z);
                    }
/* 245 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
