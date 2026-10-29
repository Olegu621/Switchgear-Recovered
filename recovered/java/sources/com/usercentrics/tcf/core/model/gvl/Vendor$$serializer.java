            package com.usercentrics.tcf.core.model.gvl;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
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
            import p000.az0;
            import p000.de3;
            import p000.j13;
            import p000.o90;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/tcf/core/model/gvl/Vendor.$serializer", "Luq0;", "Lcom/usercentrics/tcf/core/model/gvl/Vendor;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/tcf/core/model/gvl/Vendor;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/tcf/core/model/gvl/Vendor;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class Vendor$$serializer implements uq0 {
                public static final Vendor$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             Vendor$$serializer vendor$$serializer = new Vendor$$serializer();
/* 6 */             INSTANCE = vendor$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.tcf.core.model.gvl.Vendor", vendor$$serializer, 19);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("purposes", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("legIntPurposes", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("flexiblePurposes", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("specialPurposes", false);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("features", false);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("specialFeatures", false);
/* 51 */            pluginGeneratedSerialDescriptor.m6270j("policyUrl", true);
/* 56 */            pluginGeneratedSerialDescriptor.m6270j("deletedDate", true);
/* 61 */            pluginGeneratedSerialDescriptor.m6270j("overflow", true);
/* 66 */            pluginGeneratedSerialDescriptor.m6270j("cookieMaxAgeSeconds", true);
/* 71 */            pluginGeneratedSerialDescriptor.m6270j("usesNonCookieAccess", false);
/* 76 */            pluginGeneratedSerialDescriptor.m6270j("deviceStorageDisclosureUrl", true);
/* 81 */            pluginGeneratedSerialDescriptor.m6270j("usesCookies", true);
/* 86 */            pluginGeneratedSerialDescriptor.m6270j("cookieRefresh", true);
/* 91 */            pluginGeneratedSerialDescriptor.m6270j("id", false);
/* 96 */            pluginGeneratedSerialDescriptor.m6270j("name", false);
/* 101 */           pluginGeneratedSerialDescriptor.m6270j("dataRetention", false);
/* 106 */           pluginGeneratedSerialDescriptor.m6270j("urls", false);
/* 111 */           pluginGeneratedSerialDescriptor.m6270j("dataDeclaration", true);
/* 114 */           descriptor = pluginGeneratedSerialDescriptor;
                }

                private Vendor$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = Vendor.f6831t;
/* 4 */             KSerializer kSerializer = kSerializerArr[0];
/* 7 */             KSerializer kSerializer2 = kSerializerArr[1];
/* 10 */            KSerializer kSerializer3 = kSerializerArr[2];
/* 13 */            KSerializer kSerializer4 = kSerializerArr[3];
/* 16 */            KSerializer kSerializer5 = kSerializerArr[4];
/* 19 */            KSerializer kSerializer6 = kSerializerArr[5];
/* 21 */            vh2 vh2Var = vh2.f18183a;
/* 23 */            KSerializer kSerializerM5647i = j13.m5647i(vh2Var);
/* 29 */            KSerializer kSerializerM5647i2 = j13.m5647i(Overflow$$serializer.INSTANCE);
/* 35 */            KSerializer kSerializerM5647i3 = j13.m5647i(o90.f14676a);
/* 39 */            C0920fk c0920fk = C0920fk.f8246a;
/* 75 */            return new KSerializer[]{kSerializer, kSerializer2, kSerializer3, kSerializer4, kSerializer5, kSerializer6, vh2Var, kSerializerM5647i, kSerializerM5647i2, kSerializerM5647i3, c0920fk, j13.m5647i(vh2Var), c0920fk, j13.m5647i(c0920fk), az0.f2143a, vh2Var, j13.m5647i(GvlDataRetention$$serializer.INSTANCE), j13.m5647i(kSerializerArr[17]), j13.m5647i(kSerializerArr[18])};
                }

                @Override // kotlinx.serialization.KSerializer
                public Vendor deserialize(Decoder decoder) {
                    int i;
                    List list;
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr = Vendor.f6831t;
/* 22 */            Boolean bool = null;
/* 23 */            String str = null;
/* 24 */            Double d = null;
/* 25 */            Overflow overflow = null;
/* 26 */            GvlDataRetention gvlDataRetention = null;
/* 27 */            String str2 = null;
/* 28 */            int i2 = 0;
/* 29 */            List list2 = null;
/* 30 */            List list3 = null;
/* 31 */            List list4 = null;
/* 32 */            List list5 = null;
/* 33 */            List list6 = null;
/* 34 */            List list7 = null;
/* 35 */            List list8 = null;
/* 36 */            int i3 = 1;
/* 38 */            boolean z = true;
/* 40 */            boolean zMo4374t = false;
/* 42 */            String strMo4376v = null;
/* 44 */            boolean zMo4374t2 = false;
/* 46 */            List list9 = null;
/* 48 */            int iMo4371q = 0;
/* 50 */            String strMo4376v2 = null;
/* 52 */            while (z) {
/* 54 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 419 */                       list = list9;
/* 426 */                       z = false;
/* 406 */                       str = str;
/* 408 */                       list4 = list4;
/* 410 */                       i3 = 1;
/* 412 */                       list9 = list;
/* 354 */                       bool = bool;
                                break;
                            case 0:
/* 401 */                       list = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 0, kSerializerArr[0], list9);
/* 403 */                       i2 |= 1;
/* 405 */                       list3 = list3;
/* 406 */                       str = str;
/* 408 */                       list4 = list4;
/* 410 */                       i3 = 1;
/* 412 */                       list9 = list;
/* 354 */                       bool = bool;
                                break;
                            case 1:
/* 358 */                       bool = bool;
/* 375 */                       list3 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, i3, kSerializerArr[i3], list3);
/* 377 */                       i2 |= 2;
/* 379 */                       list4 = list4;
/* 354 */                       bool = bool;
                                break;
                            case 2:
/* 339 */                       bool = bool;
/* 348 */                       list4 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 2, kSerializerArr[2], list4);
/* 350 */                       i2 |= 4;
/* 352 */                       list3 = list3;
/* 354 */                       bool = bool;
                                break;
                            case 3:
/* 314 */                       list3 = list3;
/* 316 */                       list4 = list4;
/* 326 */                       list5 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 3, kSerializerArr[3], list5);
/* 328 */                       i2 |= 8;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            case 4:
/* 296 */                       list3 = list3;
/* 298 */                       list4 = list4;
/* 308 */                       list6 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 4, kSerializerArr[4], list6);
/* 310 */                       i2 |= 16;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            case 5:
/* 278 */                       list3 = list3;
/* 280 */                       list4 = list4;
/* 290 */                       list7 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 5, kSerializerArr[5], list7);
/* 292 */                       i2 |= 32;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            case 6:
/* 270 */                       strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 6);
/* 274 */                       i2 |= 64;
/* 136 */                       list3 = list3;
                                break;
                            case 7:
/* 248 */                       list3 = list3;
/* 250 */                       list4 = list4;
/* 259 */                       str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 7, vh2.f18183a, str2);
/* 261 */                       i2 |= 128;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            case 8:
/* 230 */                       list3 = list3;
/* 232 */                       list4 = list4;
/* 242 */                       overflow = (Overflow) interfaceC1870kyMo3297c.mo4377y(descriptor2, 8, Overflow$$serializer.INSTANCE, overflow);
/* 244 */                       i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            case 9:
/* 212 */                       list3 = list3;
/* 214 */                       list4 = list4;
/* 224 */                       d = (Double) interfaceC1870kyMo3297c.mo4377y(descriptor2, 9, o90.f14676a, d);
/* 226 */                       i2 |= NotificationCompat.FLAG_GROUP_SUMMARY;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            case 10:
/* 205 */                       zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 10);
/* 209 */                       i2 |= Segment.SHARE_MINIMUM;
/* 136 */                       list3 = list3;
                                break;
                            case 11:
/* 182 */                       list3 = list3;
/* 184 */                       list4 = list4;
/* 194 */                       str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 11, vh2.f18183a, str);
/* 196 */                       i2 |= 2048;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            case 12:
/* 175 */                       zMo4374t2 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 12);
/* 179 */                       i2 |= 4096;
/* 136 */                       list3 = list3;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 152 */                       list3 = list3;
/* 154 */                       list4 = list4;
/* 164 */                       bool = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 13, C0920fk.f8246a, bool);
/* 166 */                       i2 |= Segment.SIZE;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            case 14:
/* 145 */                       iMo4371q = interfaceC1870kyMo3297c.mo4371q(descriptor2, 14);
/* 149 */                       i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
/* 136 */                       list3 = list3;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 128 */                       strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 15);
/* 135 */                       i2 |= 32768;
/* 136 */                       list3 = list3;
                                break;
                            case 16:
/* 117 */                       gvlDataRetention = (GvlDataRetention) interfaceC1870kyMo3297c.mo4377y(descriptor2, 16, GvlDataRetention$$serializer.INSTANCE, gvlDataRetention);
/* 119 */                       i = 65536;
/* 81 */                        i2 |= i;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            case 17:
/* 100 */                       list8 = (List) interfaceC1870kyMo3297c.mo4377y(descriptor2, 17, kSerializerArr[17], list8);
/* 102 */                       i = 131072;
/* 81 */                        i2 |= i;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            case 18:
/* 77 */                        list2 = (List) interfaceC1870kyMo3297c.mo4377y(descriptor2, 18, kSerializerArr[18], list2);
/* 79 */                        i = 262144;
/* 81 */                        i2 |= i;
/* 82 */                        list3 = list3;
/* 84 */                        list4 = list4;
                                break;
                            default:
/* 61 */                        C1951n4.m6855e(iMo3299x);
/* 18 */                        return null;
                        }
                    }
/* 429 */           Boolean bool2 = bool;
/* 433 */           List list10 = list9;
/* 438 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 464 */           return new Vendor(i2, list10, list3, list4, list5, list6, list7, strMo4376v, str2, overflow, d, zMo4374t, str, zMo4374t2, bool2, iMo4371q, strMo4376v2, gvlDataRetention, list8, list2);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, Vendor value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = Vendor.f6831t;
/* 18 */            KSerializer kSerializer = kSerializerArr[0];
/* 20 */            List list = value.f6832a;
/* 22 */            List list2 = value.f6850s;
/* 24 */            Boolean bool = value.f6845n;
/* 26 */            boolean z = value.f6844m;
/* 28 */            String str = value.f6843l;
/* 30 */            Double d = value.f6841j;
/* 32 */            Overflow overflow = value.f6840i;
/* 34 */            String str2 = value.f6839h;
/* 36 */            String str3 = value.f6838g;
/* 38 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 0, kSerializer, list);
/* 46 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 1, kSerializerArr[1], value.f6833b);
/* 54 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 2, kSerializerArr[2], value.f6834c);
/* 62 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 3, kSerializerArr[3], value.f6835d);
/* 70 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 4, kSerializerArr[4], value.f6836e);
/* 78 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 5, kSerializerArr[5], value.f6837f);
/* 85 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || !Intrinsics.m6216a(str3, HttpUrl.FRAGMENT_ENCODE_SET)) {
/* 97 */                interfaceC1907lyMo1499c.mo1514r(descriptor2, 6, str3);
                    }
/* 104 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str2 != null) {
/* 112 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 7, vh2.f18183a, str2);
                    }
/* 119 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || overflow != null) {
/* 128 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 8, Overflow$$serializer.INSTANCE, overflow);
                    }
/* 135 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || d != null) {
/* 144 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 9, o90.f14676a, d);
                    }
/* 151 */           interfaceC1907lyMo1499c.mo1513q(descriptor2, 10, value.f6842k);
/* 158 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str != null) {
/* 167 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 11, vh2.f18183a, str);
                    }
/* 174 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z) {
/* 181 */               interfaceC1907lyMo1499c.mo1513q(descriptor2, 12, z);
                    }
/* 188 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || !Intrinsics.m6216a(bool, Boolean.FALSE)) {
/* 203 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 13, C0920fk.f8246a, bool);
                    }
/* 210 */           interfaceC1907lyMo1499c.mo1508l(14, value.f6846o, descriptor2);
/* 217 */           interfaceC1907lyMo1499c.mo1514r(descriptor2, 15, value.f6847p);
/* 226 */           interfaceC1907lyMo1499c.mo1515s(descriptor2, 16, GvlDataRetention$$serializer.INSTANCE, value.f6848q);
/* 235 */           interfaceC1907lyMo1499c.mo1515s(descriptor2, 17, kSerializerArr[17], value.f6849r);
/* 242 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || list2 != null) {
/* 251 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 18, kSerializerArr[18], list2);
                    }
/* 254 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
