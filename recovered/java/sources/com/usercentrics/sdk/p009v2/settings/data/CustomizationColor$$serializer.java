            package com.usercentrics.sdk.p009v2.settings.data;

            import androidx.core.app.NotificationCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.Build;
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
            import p000.C1951n4;
            import p000.InterfaceC1870ky;
            import p000.InterfaceC1907ly;
            import p000.de3;
            import p000.j13;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/CustomizationColor.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/CustomizationColor;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class CustomizationColor$$serializer implements uq0 {
                public static final CustomizationColor$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             CustomizationColor$$serializer customizationColor$$serializer = new CustomizationColor$$serializer();
/* 6 */             INSTANCE = customizationColor$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.CustomizationColor", customizationColor$$serializer, 22);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("primary", true);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("acceptBtnText", true);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("acceptBtnBackground", true);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("denyBtnText", true);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("denyBtnBackground", true);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("saveBtnText", true);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("saveBtnBackground", true);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("linkIcon", true);
/* 60 */            pluginGeneratedSerialDescriptor.m6270j("linkFont", true);
/* 65 */            pluginGeneratedSerialDescriptor.m6270j("text", true);
/* 70 */            pluginGeneratedSerialDescriptor.m6270j("layerBackground", true);
/* 75 */            pluginGeneratedSerialDescriptor.m6270j("overlay", true);
/* 80 */            pluginGeneratedSerialDescriptor.m6270j("toggleInactiveBackground", true);
/* 85 */            pluginGeneratedSerialDescriptor.m6270j("toggleInactiveIcon", true);
/* 90 */            pluginGeneratedSerialDescriptor.m6270j("toggleActiveBackground", true);
/* 95 */            pluginGeneratedSerialDescriptor.m6270j("toggleActiveIcon", true);
/* 100 */           pluginGeneratedSerialDescriptor.m6270j("toggleDisabledBackground", true);
/* 105 */           pluginGeneratedSerialDescriptor.m6270j("toggleDisabledIcon", true);
/* 110 */           pluginGeneratedSerialDescriptor.m6270j("secondLayerTab", true);
/* 115 */           pluginGeneratedSerialDescriptor.m6270j("tabsBorderColor", true);
/* 120 */           pluginGeneratedSerialDescriptor.m6270j("ccpaButtonColor", true);
/* 125 */           pluginGeneratedSerialDescriptor.m6270j("ccpaButtonTextColor", true);
/* 128 */           descriptor = pluginGeneratedSerialDescriptor;
                }

                private CustomizationColor$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             vh2 vh2Var = vh2.f18183a;
/* 95 */            return new KSerializer[]{j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var)};
                }

                @Override // kotlinx.serialization.KSerializer
                public CustomizationColor deserialize(Decoder decoder) {
                    int i;
                    String str;
                    String str2;
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 16 */            String str3 = null;
/* 17 */            String str4 = null;
/* 18 */            String str5 = null;
/* 19 */            String str6 = null;
/* 20 */            String str7 = null;
/* 21 */            int i2 = 0;
/* 22 */            String str8 = null;
/* 23 */            String str9 = null;
/* 24 */            String str10 = null;
/* 25 */            String str11 = null;
/* 26 */            String str12 = null;
/* 27 */            String str13 = null;
/* 28 */            String str14 = null;
/* 29 */            String str15 = null;
/* 30 */            boolean z = true;
/* 32 */            String str16 = null;
/* 34 */            String str17 = null;
/* 36 */            String str18 = null;
/* 38 */            String str19 = null;
/* 40 */            String str20 = null;
/* 42 */            String str21 = null;
/* 44 */            String str22 = null;
/* 46 */            String str23 = null;
/* 48 */            String str24 = null;
/* 50 */            while (z) {
/* 52 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 564 */                       str = str16;
/* 571 */                       z = false;
/* 573 */                       str5 = str5;
/* 554 */                       str16 = str;
/* 293 */                       str3 = str3;
                                break;
                            case 0:
/* 544 */                       str = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 0, vh2.f18183a, str16);
/* 546 */                       i2 |= 1;
/* 548 */                       str17 = str17;
/* 550 */                       str5 = str5;
/* 552 */                       str4 = str4;
/* 554 */                       str16 = str;
/* 293 */                       str3 = str3;
                                break;
                            case 1:
/* 497 */                       str2 = str5;
/* 514 */                       str17 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 1, vh2.f18183a, str17);
/* 516 */                       i2 |= 2;
/* 518 */                       str18 = str18;
/* 345 */                       str5 = str2;
/* 319 */                       str4 = str4;
/* 293 */                       str3 = str3;
                                break;
                            case 2:
/* 472 */                       str2 = str5;
/* 487 */                       str18 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 2, vh2.f18183a, str18);
/* 489 */                       i2 |= 4;
/* 345 */                       str5 = str2;
/* 319 */                       str4 = str4;
/* 293 */                       str3 = str3;
                                break;
                            case 3:
/* 448 */                       str2 = str5;
/* 463 */                       str19 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 3, vh2.f18183a, str19);
/* 465 */                       i2 |= 8;
/* 345 */                       str5 = str2;
/* 319 */                       str4 = str4;
/* 293 */                       str3 = str3;
                                break;
                            case 4:
/* 424 */                       str2 = str5;
/* 439 */                       str20 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, vh2.f18183a, str20);
/* 441 */                       i2 |= 16;
/* 345 */                       str5 = str2;
/* 319 */                       str4 = str4;
/* 293 */                       str3 = str3;
                                break;
                            case 5:
/* 400 */                       str2 = str5;
/* 415 */                       str21 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 5, vh2.f18183a, str21);
/* 417 */                       i2 |= 32;
/* 345 */                       str5 = str2;
/* 319 */                       str4 = str4;
/* 293 */                       str3 = str3;
                                break;
                            case 6:
/* 376 */                       str2 = str5;
/* 391 */                       str22 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 6, vh2.f18183a, str22);
/* 393 */                       i2 |= 64;
/* 345 */                       str5 = str2;
/* 319 */                       str4 = str4;
/* 293 */                       str3 = str3;
                                break;
                            case 7:
/* 352 */                       str2 = str5;
/* 367 */                       str23 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 7, vh2.f18183a, str23);
/* 369 */                       i2 |= 128;
/* 345 */                       str5 = str2;
/* 319 */                       str4 = str4;
/* 293 */                       str3 = str3;
                                break;
                            case 8:
/* 331 */                       str2 = str5;
/* 341 */                       str24 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 8, vh2.f18183a, str24);
/* 343 */                       i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
/* 345 */                       str5 = str2;
/* 319 */                       str4 = str4;
/* 293 */                       str3 = str3;
                                break;
                            case 9:
/* 297 */                       str3 = str3;
/* 306 */                       str4 = str4;
/* 315 */                       str5 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 9, vh2.f18183a, str5);
/* 317 */                       i2 |= NotificationCompat.FLAG_GROUP_SUMMARY;
/* 319 */                       str4 = str4;
/* 293 */                       str3 = str3;
                                break;
                            case 10:
/* 278 */                       str3 = str3;
/* 287 */                       str4 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 10, vh2.f18183a, str4);
/* 289 */                       i2 |= Segment.SHARE_MINIMUM;
/* 291 */                       str5 = str5;
/* 293 */                       str3 = str3;
                                break;
                            case 11:
/* 252 */                       str4 = str4;
/* 254 */                       str5 = str5;
/* 264 */                       str3 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 11, vh2.f18183a, str3);
/* 266 */                       i2 |= 2048;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            case 12:
/* 233 */                       str4 = str4;
/* 235 */                       str5 = str5;
/* 246 */                       str6 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 12, vh2.f18183a, str6);
/* 248 */                       i2 |= 4096;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 214 */                       str4 = str4;
/* 216 */                       str5 = str5;
/* 227 */                       str8 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 13, vh2.f18183a, str8);
/* 229 */                       i2 |= Segment.SIZE;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            case 14:
/* 195 */                       str4 = str4;
/* 197 */                       str5 = str5;
/* 208 */                       str9 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 14, vh2.f18183a, str9);
/* 210 */                       i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 189 */                       str10 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 15, vh2.f18183a, str10);
/* 191 */                       i = 32768;
/* 80 */                        i2 |= i;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            case 16:
/* 171 */                       str11 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 16, vh2.f18183a, str11);
/* 173 */                       i = 65536;
/* 80 */                        i2 |= i;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            case 17:
/* 153 */                       str12 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 17, vh2.f18183a, str12);
/* 155 */                       i = 131072;
/* 80 */                        i2 |= i;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            case 18:
/* 135 */                       str13 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 18, vh2.f18183a, str13);
/* 137 */                       i = 262144;
/* 80 */                        i2 |= i;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            case 19:
/* 117 */                       str14 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 19, vh2.f18183a, str14);
/* 119 */                       i = 524288;
/* 80 */                        i2 |= i;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            case 20:
/* 99 */                        str15 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 20, vh2.f18183a, str15);
/* 101 */                       i = 1048576;
/* 80 */                        i2 |= i;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 76 */                        str7 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 21, vh2.f18183a, str7);
/* 78 */                        i = 2097152;
/* 80 */                        i2 |= i;
/* 81 */                        str5 = str5;
/* 83 */                        str4 = str4;
                                break;
                            default:
/* 59 */                        C1951n4.m6855e(iMo3299x);
/* 14 */                        return null;
                        }
                    }
/* 576 */           String str25 = str3;
/* 580 */           String str26 = str5;
/* 582 */           String str27 = str16;
/* 584 */           String str28 = str17;
/* 586 */           String str29 = str18;
/* 588 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 629 */           String str30 = str14;
/* 640 */           return new CustomizationColor(i2, str27, str28, str29, str19, str20, str21, str22, str23, str24, str26, str4, str25, str6, str8, str9, str10, str11, str12, str13, str30, str15, str7);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, CustomizationColor value) {
/* 3 */             encoder.getClass();
/* 6 */             value.getClass();
/* 9 */             String str = value.f6426v;
/* 11 */            String str2 = value.f6425u;
/* 13 */            String str3 = value.f6424t;
/* 15 */            String str4 = value.f6423s;
/* 17 */            String str5 = value.f6422r;
/* 19 */            String str6 = value.f6421q;
/* 21 */            String str7 = value.f6420p;
/* 23 */            String str8 = value.f6419o;
/* 25 */            String str9 = value.f6418n;
/* 27 */            String str10 = value.f6417m;
/* 29 */            String str11 = value.f6416l;
/* 31 */            String str12 = value.f6415k;
/* 33 */            String str13 = value.f6414j;
/* 35 */            String str14 = value.f6413i;
/* 37 */            String str15 = value.f6412h;
/* 41 */            String str16 = value.f6411g;
/* 45 */            String str17 = value.f6410f;
/* 49 */            String str18 = value.f6409e;
/* 53 */            String str19 = value.f6408d;
/* 57 */            String str20 = value.f6407c;
/* 61 */            String str21 = value.f6406b;
/* 63 */            String str22 = value.f6405a;
/* 67 */            SerialDescriptor descriptor2 = getDescriptor();
/* 75 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 83 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str22 != null) {
/* 96 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 0, vh2.f18183a, str22);
                    }
/* 108 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str21 != null) {
/* 116 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 1, vh2.f18183a, str21);
                    }
/* 123 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str20 != null) {
/* 131 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 2, vh2.f18183a, str20);
                    }
/* 138 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str19 != null) {
/* 146 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 3, vh2.f18183a, str19);
                    }
/* 153 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str18 != null) {
/* 161 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, vh2.f18183a, str18);
                    }
/* 168 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str17 != null) {
/* 176 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 5, vh2.f18183a, str17);
                    }
/* 183 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str16 != null) {
/* 191 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 6, vh2.f18183a, str16);
                    }
/* 198 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str15 != null) {
/* 206 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 7, vh2.f18183a, str15);
                    }
/* 213 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str14 != null) {
/* 222 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 8, vh2.f18183a, str14);
                    }
/* 229 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str13 != null) {
/* 238 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 9, vh2.f18183a, str13);
                    }
/* 245 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str12 != null) {
/* 254 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 10, vh2.f18183a, str12);
                    }
/* 261 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str11 != null) {
/* 270 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 11, vh2.f18183a, str11);
                    }
/* 277 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str10 != 0) {
/* 288 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 12, vh2.f18183a, str10);
                    }
/* 295 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str9 != 0) {
/* 306 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 13, vh2.f18183a, str9);
                    }
/* 313 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str8 != null) {
/* 324 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 14, vh2.f18183a, str8);
                    }
/* 331 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str7 != null) {
/* 342 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 15, vh2.f18183a, str7);
                    }
/* 349 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str6 != null) {
/* 360 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 16, vh2.f18183a, str6);
                    }
/* 367 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str5 != null) {
/* 378 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 17, vh2.f18183a, str5);
                    }
/* 385 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str4 != null) {
/* 396 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 18, vh2.f18183a, str4);
                    }
/* 403 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str3 != null) {
/* 414 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 19, vh2.f18183a, str3);
                    }
/* 421 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str2 != null) {
/* 432 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 20, vh2.f18183a, str2);
                    }
/* 439 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || str != null) {
/* 450 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 21, vh2.f18183a, str);
                    }
/* 453 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
