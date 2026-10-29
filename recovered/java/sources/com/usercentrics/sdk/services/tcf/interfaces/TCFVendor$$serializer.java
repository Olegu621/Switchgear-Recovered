            package com.usercentrics.sdk.services.tcf.interfaces;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.usercentrics.tcf.core.model.gvl.DataRetention;
            import com.usercentrics.tcf.core.model.gvl.DataRetention$$serializer;
            import io.flutter.Build;
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
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/services/tcf/interfaces/TCFVendor.$serializer", "Luq0;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class TCFVendor$$serializer implements uq0 {
                public static final TCFVendor$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             TCFVendor$$serializer tCFVendor$$serializer = new TCFVendor$$serializer();
/* 6 */             INSTANCE = tCFVendor$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.services.tcf.interfaces.TCFVendor", tCFVendor$$serializer, 23);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("consent", false);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("features", false);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("flexiblePurposes", false);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("id", false);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("legitimateInterestConsent", false);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("legitimateInterestPurposes", false);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("name", false);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("policyUrl", false);
/* 60 */            pluginGeneratedSerialDescriptor.m6270j("purposes", false);
/* 65 */            pluginGeneratedSerialDescriptor.m6270j("restrictions", false);
/* 70 */            pluginGeneratedSerialDescriptor.m6270j("specialFeatures", false);
/* 75 */            pluginGeneratedSerialDescriptor.m6270j("specialPurposes", false);
/* 80 */            pluginGeneratedSerialDescriptor.m6270j("showConsentToggle", false);
/* 85 */            pluginGeneratedSerialDescriptor.m6270j("showLegitimateInterestToggle", false);
/* 91 */            pluginGeneratedSerialDescriptor.m6270j("cookieMaxAgeSeconds", true);
/* 96 */            pluginGeneratedSerialDescriptor.m6270j("usesNonCookieAccess", false);
/* 101 */           pluginGeneratedSerialDescriptor.m6270j("deviceStorageDisclosureUrl", true);
/* 106 */           pluginGeneratedSerialDescriptor.m6270j("usesCookies", true);
/* 111 */           pluginGeneratedSerialDescriptor.m6270j("cookieRefresh", true);
/* 116 */           pluginGeneratedSerialDescriptor.m6270j("dataSharedOutsideEU", true);
/* 121 */           pluginGeneratedSerialDescriptor.m6270j("dataRetention", true);
/* 126 */           pluginGeneratedSerialDescriptor.m6270j("dataCategories", false);
/* 131 */           pluginGeneratedSerialDescriptor.m6270j("vendorUrls", false);
/* 134 */           descriptor = pluginGeneratedSerialDescriptor;
                }

                private TCFVendor$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             KSerializer[] kSerializerArr = TCFVendor.f6205x;
/* 3 */             C0920fk c0920fk = C0920fk.f8246a;
/* 5 */             KSerializer kSerializerM5647i = j13.m5647i(c0920fk);
/* 10 */            KSerializer kSerializer = kSerializerArr[1];
/* 13 */            KSerializer kSerializer2 = kSerializerArr[2];
/* 15 */            KSerializer kSerializerM5647i2 = j13.m5647i(c0920fk);
/* 20 */            KSerializer kSerializer3 = kSerializerArr[5];
/* 22 */            vh2 vh2Var = vh2.f18183a;
/* 76 */            return new KSerializer[]{kSerializerM5647i, kSerializer, kSerializer2, az0.f2143a, kSerializerM5647i2, kSerializer3, vh2Var, vh2Var, kSerializerArr[8], kSerializerArr[9], kSerializerArr[10], kSerializerArr[11], c0920fk, c0920fk, j13.m5647i(o90.f14676a), c0920fk, j13.m5647i(vh2Var), c0920fk, j13.m5647i(c0920fk), j13.m5647i(c0920fk), j13.m5647i(DataRetention$$serializer.INSTANCE), kSerializerArr[21], kSerializerArr[22]};
                }

                @Override // kotlinx.serialization.KSerializer
                public TCFVendor deserialize(Decoder decoder) {
                    int i;
                    Boolean bool;
                    List list;
                    int i2;
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 14 */            KSerializer[] kSerializerArr = TCFVendor.f6205x;
/* 20 */            Double d = null;
/* 21 */            List list2 = null;
/* 22 */            List list3 = null;
/* 23 */            List list4 = null;
/* 24 */            String str = null;
/* 25 */            List list5 = null;
/* 26 */            int i3 = 0;
/* 27 */            DataRetention dataRetention = null;
/* 28 */            List list6 = null;
/* 29 */            List list7 = null;
/* 30 */            Boolean bool2 = null;
/* 31 */            Boolean bool3 = null;
/* 32 */            List list8 = null;
/* 33 */            Boolean bool4 = null;
/* 34 */            String strMo4376v = null;
/* 36 */            int i4 = 1;
/* 38 */            boolean z = true;
/* 40 */            int iMo4371q = 0;
/* 42 */            boolean zMo4374t = false;
/* 44 */            boolean zMo4374t2 = false;
/* 46 */            String strMo4376v2 = null;
/* 48 */            boolean zMo4374t3 = false;
/* 50 */            Boolean bool5 = null;
/* 52 */            boolean zMo4374t4 = false;
/* 54 */            List list9 = null;
/* 56 */            List list10 = null;
/* 58 */            while (z) {
/* 60 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 521 */                       bool = bool5;
/* 530 */                       z = false;
/* 532 */                       list2 = list2;
/* 507 */                       list8 = list8;
/* 509 */                       i4 = 1;
/* 511 */                       bool5 = bool;
/* 373 */                       d = d;
                                break;
                            case 0:
/* 499 */                       bool = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 0, C0920fk.f8246a, bool5);
/* 501 */                       i3 |= 1;
/* 503 */                       list2 = list2;
/* 505 */                       bool3 = bool3;
/* 507 */                       list8 = list8;
/* 509 */                       i4 = 1;
/* 511 */                       bool5 = bool;
/* 373 */                       d = d;
                                break;
                            case 1:
/* 440 */                       d = d;
/* 444 */                       List list11 = list8;
/* 450 */                       int i5 = i4;
/* 463 */                       list9 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, i5, kSerializerArr[i4], list9);
/* 465 */                       i3 |= 2;
/* 467 */                       list10 = list10;
/* 469 */                       bool3 = bool3;
/* 471 */                       list8 = list11;
/* 473 */                       i4 = i5;
/* 373 */                       d = d;
                                break;
                            case 2:
/* 418 */                       list = list8;
/* 433 */                       list10 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 2, kSerializerArr[2], list10);
/* 435 */                       i3 |= 4;
/* 437 */                       bool3 = bool3;
/* 398 */                       list8 = list;
/* 373 */                       d = d;
                                break;
                            case 3:
/* 401 */                       d = d;
/* 407 */                       iMo4371q = interfaceC1870kyMo3297c.mo4371q(descriptor2, 3);
/* 411 */                       i3 |= 8;
/* 413 */                       bool3 = bool3;
/* 373 */                       d = d;
                                break;
                            case 4:
/* 385 */                       list = list8;
/* 394 */                       bool3 = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, C0920fk.f8246a, bool3);
/* 396 */                       i3 |= 16;
/* 398 */                       list8 = list;
/* 373 */                       d = d;
                                break;
                            case 5:
/* 358 */                       d = d;
/* 367 */                       list8 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 5, kSerializerArr[5], list8);
/* 369 */                       i3 |= 32;
/* 371 */                       bool3 = bool3;
/* 373 */                       d = d;
                                break;
                            case 6:
/* 338 */                       bool3 = bool3;
/* 343 */                       strMo4376v2 = interfaceC1870kyMo3297c.mo4376v(descriptor2, 6);
/* 347 */                       i3 |= 64;
/* 175 */                       bool3 = bool3;
                                break;
                            case 7:
/* 325 */                       bool3 = bool3;
/* 330 */                       strMo4376v = interfaceC1870kyMo3297c.mo4376v(descriptor2, 7);
/* 334 */                       i3 |= 128;
/* 175 */                       bool3 = bool3;
                                break;
                            case 8:
/* 307 */                       bool3 = bool3;
/* 309 */                       list8 = list8;
/* 319 */                       list5 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 8, kSerializerArr[8], list5);
/* 321 */                       i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            case 9:
/* 289 */                       bool3 = bool3;
/* 291 */                       list8 = list8;
/* 301 */                       list4 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 9, kSerializerArr[9], list4);
/* 303 */                       i3 |= NotificationCompat.FLAG_GROUP_SUMMARY;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            case 10:
/* 271 */                       bool3 = bool3;
/* 273 */                       list8 = list8;
/* 283 */                       list3 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 10, kSerializerArr[10], list3);
/* 285 */                       i3 |= Segment.SHARE_MINIMUM;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            case 11:
/* 253 */                       bool3 = bool3;
/* 255 */                       list8 = list8;
/* 265 */                       list2 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 11, kSerializerArr[11], list2);
/* 267 */                       i3 |= 2048;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            case 12:
/* 240 */                       bool3 = bool3;
/* 246 */                       zMo4374t = interfaceC1870kyMo3297c.mo4374t(descriptor2, 12);
/* 250 */                       i3 |= 4096;
/* 175 */                       bool3 = bool3;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 227 */                       bool3 = bool3;
/* 233 */                       zMo4374t2 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 13);
/* 237 */                       i3 |= Segment.SIZE;
/* 175 */                       bool3 = bool3;
                                break;
                            case 14:
/* 209 */                       bool3 = bool3;
/* 211 */                       list8 = list8;
/* 221 */                       d = (Double) interfaceC1870kyMo3297c.mo4377y(descriptor2, 14, o90.f14676a, d);
/* 223 */                       i3 |= Http2.INITIAL_MAX_FRAME_SIZE;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 201 */                       zMo4374t3 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 15);
/* 205 */                       i2 = 32768;
/* 174 */                       i3 |= i2;
/* 175 */                       bool3 = bool3;
                                break;
                            case 16:
/* 190 */                       str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 16, vh2.f18183a, str);
/* 192 */                       i = 65536;
/* 87 */                        i3 |= i;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            case 17:
/* 168 */                       zMo4374t4 = interfaceC1870kyMo3297c.mo4374t(descriptor2, 17);
/* 172 */                       i2 = 131072;
/* 174 */                       i3 |= i2;
/* 175 */                       bool3 = bool3;
                                break;
                            case 18:
/* 157 */                       bool2 = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 18, C0920fk.f8246a, bool2);
/* 159 */                       i = 262144;
/* 87 */                        i3 |= i;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            case 19:
/* 140 */                       bool4 = (Boolean) interfaceC1870kyMo3297c.mo4377y(descriptor2, 19, C0920fk.f8246a, bool4);
/* 142 */                       i = 524288;
/* 87 */                        i3 |= i;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            case 20:
/* 122 */                       dataRetention = (DataRetention) interfaceC1870kyMo3297c.mo4377y(descriptor2, 20, DataRetention$$serializer.INSTANCE, dataRetention);
/* 124 */                       i = 1048576;
/* 87 */                        i3 |= i;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 105 */                       list6 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 21, kSerializerArr[21], list6);
/* 107 */                       i = 2097152;
/* 87 */                        i3 |= i;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 83 */                        list7 = (List) interfaceC1870kyMo3297c.mo4350A(descriptor2, 22, kSerializerArr[22], list7);
/* 85 */                        i = 4194304;
/* 87 */                        i3 |= i;
/* 88 */                        bool3 = bool3;
/* 90 */                        list8 = list8;
                                break;
                            default:
/* 67 */                        C1951n4.m6855e(iMo3299x);
/* 18 */                        return null;
                        }
                    }
/* 535 */           Double d2 = d;
/* 539 */           List list12 = list8;
/* 541 */           Boolean bool6 = bool5;
/* 543 */           List list13 = list9;
/* 545 */           List list14 = list10;
/* 549 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 589 */           return new TCFVendor(i3, bool6, list13, list14, iMo4371q, bool3, list12, strMo4376v2, strMo4376v, list5, list4, list3, list2, zMo4374t, zMo4374t2, d2, zMo4374t3, str, zMo4374t4, bool2, bool4, dataRetention, list6, list7);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, TCFVendor value) {
/* 1 */             encoder.getClass();
/* 4 */             value.getClass();
/* 7 */             SerialDescriptor descriptor2 = getDescriptor();
/* 11 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 15 */            KSerializer[] kSerializerArr = TCFVendor.f6205x;
/* 17 */            C0920fk c0920fk = C0920fk.f8246a;
/* 19 */            Boolean bool = value.f6206a;
/* 21 */            DataRetention dataRetention = value.f6226u;
/* 23 */            Boolean bool2 = value.f6225t;
/* 25 */            Boolean bool3 = value.f6224s;
/* 27 */            boolean z = value.f6223r;
/* 29 */            String str = value.f6222q;
/* 31 */            Double d = value.f6220o;
/* 34 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 0, c0920fk, bool);
/* 42 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 1, kSerializerArr[1], value.f6207b);
/* 50 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 2, kSerializerArr[2], value.f6208c);
/* 56 */            interfaceC1907lyMo1499c.mo1508l(3, value.f6209d, descriptor2);
/* 62 */            interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, c0920fk, value.f6210e);
/* 70 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 5, kSerializerArr[5], value.f6211f);
/* 76 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 6, value.f6212g);
/* 82 */            interfaceC1907lyMo1499c.mo1514r(descriptor2, 7, value.f6213h);
/* 91 */            interfaceC1907lyMo1499c.mo1505i(descriptor2, 8, kSerializerArr[8], value.f6214i);
/* 100 */           interfaceC1907lyMo1499c.mo1505i(descriptor2, 9, kSerializerArr[9], value.f6215j);
/* 109 */           interfaceC1907lyMo1499c.mo1505i(descriptor2, 10, kSerializerArr[10], value.f6216k);
/* 118 */           interfaceC1907lyMo1499c.mo1505i(descriptor2, 11, kSerializerArr[11], value.f6217l);
/* 125 */           interfaceC1907lyMo1499c.mo1513q(descriptor2, 12, value.f6218m);
/* 132 */           interfaceC1907lyMo1499c.mo1513q(descriptor2, 13, value.f6219n);
/* 139 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || d != null) {
/* 148 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 14, o90.f14676a, d);
                    }
/* 155 */           interfaceC1907lyMo1499c.mo1513q(descriptor2, 15, value.f6221p);
/* 162 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str != null) {
/* 171 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 16, vh2.f18183a, str);
                    }
/* 178 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || z) {
/* 185 */               interfaceC1907lyMo1499c.mo1513q(descriptor2, 17, z);
                    }
/* 192 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || !Intrinsics.m6216a(bool3, Boolean.FALSE)) {
/* 205 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 18, c0920fk, bool3);
                    }
/* 212 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || !Intrinsics.m6216a(bool2, Boolean.FALSE)) {
/* 225 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 19, c0920fk, bool2);
                    }
/* 232 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || dataRetention != null) {
/* 241 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 20, DataRetention$$serializer.INSTANCE, dataRetention);
                    }
/* 250 */           interfaceC1907lyMo1499c.mo1505i(descriptor2, 21, kSerializerArr[21], value.f6227v);
/* 259 */           interfaceC1907lyMo1499c.mo1505i(descriptor2, 22, kSerializerArr[22], value.f6228w);
/* 262 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
