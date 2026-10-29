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
            import okhttp3.internal.http2.Http2Connection;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            import p000.C1951n4;
            import p000.InterfaceC1870ky;
            import p000.InterfaceC1907ly;
            import p000.az0;
            import p000.de3;
            import p000.j13;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/settings/data/UsercentricsStyles.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsStyles;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class UsercentricsStyles$$serializer implements uq0 {
                public static final UsercentricsStyles$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             UsercentricsStyles$$serializer usercentricsStyles$$serializer = new UsercentricsStyles$$serializer();
/* 6 */             INSTANCE = usercentricsStyles$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.settings.data.UsercentricsStyles", usercentricsStyles$$serializer, 25);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("btnPrivacyButtonInactiveSize", true);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("historyDateFormat", true);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("btnPrivacyButtonActiveSize", true);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("txtOptInMsgFontSize", true);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("btnPrivacyButtonTransparency", true);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("btnPrivacyButtonBgColor", true);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("btnAcceptTextColor", true);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("btnDenyTextColor", true);
/* 60 */            pluginGeneratedSerialDescriptor.m6270j("txtOptInMsgColor", true);
/* 65 */            pluginGeneratedSerialDescriptor.m6270j("btnMoreInfoBgColor", true);
/* 70 */            pluginGeneratedSerialDescriptor.m6270j("btnMoreInfoTextColor", true);
/* 75 */            pluginGeneratedSerialDescriptor.m6270j("btnAcceptBgColor", true);
/* 80 */            pluginGeneratedSerialDescriptor.m6270j("btnDenyBgColor", true);
/* 85 */            pluginGeneratedSerialDescriptor.m6270j("linkColor", true);
/* 90 */            pluginGeneratedSerialDescriptor.m6270j("cornerModalHeaderBgColor", true);
/* 95 */            pluginGeneratedSerialDescriptor.m6270j("cornerModalHeaderTextColor", true);
/* 100 */           pluginGeneratedSerialDescriptor.m6270j("privacyModalHeaderBgColor", true);
/* 105 */           pluginGeneratedSerialDescriptor.m6270j("privacyModalHeaderTextColor", true);
/* 110 */           pluginGeneratedSerialDescriptor.m6270j("bannerBgColor", true);
/* 115 */           pluginGeneratedSerialDescriptor.m6270j("bannerTextColor", true);
/* 120 */           pluginGeneratedSerialDescriptor.m6270j("btnPrivacyButtonTextColor", true);
/* 125 */           pluginGeneratedSerialDescriptor.m6270j("modalSaveTextColor", true);
/* 130 */           pluginGeneratedSerialDescriptor.m6270j("modalSaveBgColor", true);
/* 135 */           pluginGeneratedSerialDescriptor.m6270j("chipTextColor", true);
/* 140 */           pluginGeneratedSerialDescriptor.m6270j("chipBgColor", true);
/* 143 */           descriptor = pluginGeneratedSerialDescriptor;
                }

                private UsercentricsStyles$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             az0 az0Var = az0.f2143a;
/* 3 */             KSerializer kSerializerM5647i = j13.m5647i(az0Var);
/* 7 */             KSerializer kSerializerM5647i2 = j13.m5647i(az0Var);
/* 11 */            KSerializer kSerializerM5647i3 = j13.m5647i(az0Var);
/* 15 */            KSerializer kSerializerM5647i4 = j13.m5647i(az0Var);
/* 19 */            KSerializer kSerializerM5647i5 = j13.m5647i(az0Var);
/* 23 */            vh2 vh2Var = vh2.f18183a;
/* 109 */           return new KSerializer[]{kSerializerM5647i, kSerializerM5647i2, kSerializerM5647i3, kSerializerM5647i4, kSerializerM5647i5, j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var)};
                }

                @Override // kotlinx.serialization.KSerializer
                public UsercentricsStyles deserialize(Decoder decoder) {
                    int i;
                    Integer num;
                    String str;
/* 1 */             decoder.getClass();
/* 4 */             SerialDescriptor descriptor2 = getDescriptor();
/* 10 */            InterfaceC1870ky interfaceC1870kyMo3297c = decoder.mo3297c(descriptor2);
/* 16 */            String str2 = null;
/* 17 */            String str3 = null;
/* 18 */            String str4 = null;
/* 19 */            String str5 = null;
/* 20 */            String str6 = null;
/* 21 */            int i2 = 0;
/* 22 */            String str7 = null;
/* 23 */            String str8 = null;
/* 24 */            String str9 = null;
/* 25 */            String str10 = null;
/* 26 */            String str11 = null;
/* 27 */            String str12 = null;
/* 28 */            String str13 = null;
/* 29 */            String str14 = null;
/* 30 */            boolean z = true;
/* 32 */            Integer num2 = null;
/* 34 */            Integer num3 = null;
/* 36 */            Integer num4 = null;
/* 38 */            Integer num5 = null;
/* 40 */            Integer num6 = null;
/* 42 */            String str15 = null;
/* 44 */            String str16 = null;
/* 46 */            String str17 = null;
/* 48 */            String str18 = null;
/* 50 */            String str19 = null;
/* 52 */            String str20 = null;
/* 54 */            String str21 = null;
/* 56 */            while (z) {
/* 58 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 646 */                       num = num2;
/* 655 */                       z = false;
/* 657 */                       str3 = str3;
/* 634 */                       str7 = str7;
/* 636 */                       num2 = num;
/* 297 */                       str2 = str2;
                                break;
                            case 0:
/* 626 */                       num = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 0, az0.f2143a, num2);
/* 628 */                       i2 |= 1;
/* 630 */                       str3 = str3;
/* 632 */                       str5 = str5;
/* 634 */                       str7 = str7;
/* 636 */                       num2 = num;
/* 297 */                       str2 = str2;
                                break;
                            case 1:
/* 577 */                       str = str5;
/* 596 */                       num3 = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 1, az0.f2143a, num3);
/* 598 */                       i2 |= 2;
/* 600 */                       num4 = num4;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 2:
/* 552 */                       str = str5;
/* 569 */                       num4 = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 2, az0.f2143a, num4);
/* 571 */                       i2 |= 4;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 3:
/* 527 */                       str = str5;
/* 544 */                       num5 = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 3, az0.f2143a, num5);
/* 546 */                       i2 |= 8;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 4:
/* 502 */                       str = str5;
/* 519 */                       num6 = (Integer) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, az0.f2143a, num6);
/* 521 */                       i2 |= 16;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 5:
/* 477 */                       str = str5;
/* 494 */                       str15 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 5, vh2.f18183a, str15);
/* 496 */                       i2 |= 32;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 6:
/* 453 */                       str = str5;
/* 470 */                       str16 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 6, vh2.f18183a, str16);
/* 472 */                       i2 |= 64;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 7:
/* 429 */                       str = str5;
/* 446 */                       str17 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 7, vh2.f18183a, str17);
/* 448 */                       i2 |= 128;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 8:
/* 404 */                       str = str5;
/* 422 */                       str18 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 8, vh2.f18183a, str18);
/* 424 */                       i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 9:
/* 379 */                       str = str5;
/* 397 */                       str19 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 9, vh2.f18183a, str19);
/* 399 */                       i2 |= NotificationCompat.FLAG_GROUP_SUMMARY;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 10:
/* 354 */                       str = str5;
/* 372 */                       str20 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 10, vh2.f18183a, str20);
/* 374 */                       i2 |= Segment.SHARE_MINIMUM;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 11:
/* 335 */                       str = str5;
/* 345 */                       str21 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 11, vh2.f18183a, str21);
/* 347 */                       i2 |= 2048;
/* 349 */                       str5 = str;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case 12:
/* 301 */                       str2 = str2;
/* 310 */                       str7 = str7;
/* 319 */                       str5 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 12, vh2.f18183a, str5);
/* 321 */                       i2 |= 4096;
/* 323 */                       str7 = str7;
/* 297 */                       str2 = str2;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 282 */                       str2 = str2;
/* 291 */                       str7 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 13, vh2.f18183a, str7);
/* 293 */                       i2 |= Segment.SIZE;
/* 295 */                       str5 = str5;
/* 297 */                       str2 = str2;
                                break;
                            case 14:
/* 255 */                       str5 = str5;
/* 257 */                       str7 = str7;
/* 268 */                       str8 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 14, vh2.f18183a, str8);
/* 270 */                       i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 248 */                       str9 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 15, vh2.f18183a, str9);
/* 250 */                       i = 32768;
/* 85 */                        i2 |= i;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            case 16:
/* 229 */                       str10 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 16, vh2.f18183a, str10);
/* 231 */                       i = 65536;
/* 85 */                        i2 |= i;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            case 17:
/* 210 */                       str11 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 17, vh2.f18183a, str11);
/* 212 */                       i = 131072;
/* 85 */                        i2 |= i;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            case 18:
/* 192 */                       str12 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 18, vh2.f18183a, str12);
/* 194 */                       i = 262144;
/* 85 */                        i2 |= i;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            case 19:
/* 174 */                       str13 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 19, vh2.f18183a, str13);
/* 176 */                       i = 524288;
/* 85 */                        i2 |= i;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            case 20:
/* 156 */                       str14 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 20, vh2.f18183a, str14);
/* 158 */                       i = 1048576;
/* 85 */                        i2 |= i;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 138 */                       str6 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 21, vh2.f18183a, str6);
/* 140 */                       i = 2097152;
/* 85 */                        i2 |= i;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 120 */                       str4 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 22, vh2.f18183a, str4);
/* 122 */                       i = 4194304;
/* 85 */                        i2 |= i;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 103 */                       str3 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 23, vh2.f18183a, str3);
/* 105 */                       i = 8388608;
/* 85 */                        i2 |= i;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            case 24:
/* 81 */                        str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 24, vh2.f18183a, str2);
/* 83 */                        i = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
/* 85 */                        i2 |= i;
/* 86 */                        str5 = str5;
/* 88 */                        str7 = str7;
                                break;
                            default:
/* 65 */                        C1951n4.m6855e(iMo3299x);
/* 14 */                        return null;
                        }
                    }
/* 660 */           String str22 = str2;
/* 664 */           String str23 = str7;
/* 666 */           Integer num7 = num2;
/* 668 */           Integer num8 = num3;
/* 670 */           Integer num9 = num4;
/* 674 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 695 */           String str24 = str19;
/* 701 */           String str25 = str13;
/* 713 */           String str26 = str20;
/* 715 */           String str27 = str14;
/* 727 */           return new UsercentricsStyles(i2, num7, num8, num9, num5, num6, str15, str16, str17, str18, str24, str26, str21, str5, str23, str8, str9, str10, str11, str12, str25, str27, str6, str4, str3, str22);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                /* JADX WARN: Code duplicated, block: B:125:0x01e7  */
                /* JADX WARN: Code duplicated, block: B:131:0x01fb  */
                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, UsercentricsStyles value) {
                    UsercentricsStyles usercentricsStyles;
/* 3 */             encoder.getClass();
/* 6 */             value.getClass();
/* 9 */             String str = value.f6748v;
/* 11 */            String str2 = value.f6747u;
/* 13 */            String str3 = value.f6746t;
/* 15 */            String str4 = value.f6745s;
/* 17 */            String str5 = value.f6744r;
/* 19 */            String str6 = value.f6743q;
/* 21 */            String str7 = value.f6742p;
/* 23 */            String str8 = value.f6741o;
/* 25 */            String str9 = value.f6740n;
/* 27 */            String str10 = value.f6739m;
/* 29 */            String str11 = value.f6738l;
/* 31 */            String str12 = value.f6737k;
/* 33 */            String str13 = value.f6736j;
/* 35 */            String str14 = value.f6735i;
/* 37 */            String str15 = value.f6734h;
/* 41 */            String str16 = value.f6733g;
/* 45 */            String str17 = value.f6732f;
/* 49 */            Integer num = value.f6731e;
/* 53 */            Integer num2 = value.f6730d;
/* 57 */            Integer num3 = value.f6729c;
/* 61 */            Integer num4 = value.f6728b;
/* 65 */            Integer num5 = value.f6727a;
/* 67 */            SerialDescriptor descriptor2 = getDescriptor();
/* 75 */            InterfaceC1907ly interfaceC1907lyMo1499c = encoder.mo1499c(descriptor2);
/* 83 */            if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || num5 != null) {
/* 96 */                interfaceC1907lyMo1499c.mo1515s(descriptor2, 0, az0.f2143a, num5);
                    }
/* 108 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || num4 != null) {
/* 116 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 1, az0.f2143a, num4);
                    }
/* 123 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || num3 != null) {
/* 131 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 2, az0.f2143a, num3);
                    }
/* 138 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || num2 != null) {
/* 146 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 3, az0.f2143a, num2);
                    }
/* 153 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || num != null) {
/* 161 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 4, az0.f2143a, num);
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
/* 457 */           if (!interfaceC1907lyMo1499c.mo1488E(descriptor2)) {
/* 462 */               usercentricsStyles = value;
/* 466 */               if (usercentricsStyles.f6749w != null) {
                        }
/* 481 */               if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || usercentricsStyles.f6750x != null) {
/* 494 */                   interfaceC1907lyMo1499c.mo1515s(descriptor2, 23, vh2.f18183a, usercentricsStyles.f6750x);
                        }
/* 501 */               if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || usercentricsStyles.f6751y != null) {
/* 514 */                   interfaceC1907lyMo1499c.mo1515s(descriptor2, 24, vh2.f18183a, usercentricsStyles.f6751y);
                        }
/* 517 */               interfaceC1907lyMo1499c.mo1498b(descriptor2);
                    }
/* 459 */           usercentricsStyles = value;
/* 474 */           interfaceC1907lyMo1499c.mo1515s(descriptor2, 22, vh2.f18183a, usercentricsStyles.f6749w);
/* 481 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2)) {
/* 494 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 23, vh2.f18183a, usercentricsStyles.f6750x);
                    } else {
/* 494 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 23, vh2.f18183a, usercentricsStyles.f6750x);
                    }
/* 501 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2)) {
/* 514 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 24, vh2.f18183a, usercentricsStyles.f6751y);
                    } else {
/* 514 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 24, vh2.f18183a, usercentricsStyles.f6751y);
                    }
/* 517 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
