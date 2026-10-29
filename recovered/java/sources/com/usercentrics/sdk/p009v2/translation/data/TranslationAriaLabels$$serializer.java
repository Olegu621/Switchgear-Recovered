            package com.usercentrics.sdk.p009v2.translation.data;

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
            import p000.de3;
            import p000.j13;
            import p000.uq0;
            import p000.vh2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m6176d2 = {"com/usercentrics/sdk/v2/translation/data/TranslationAriaLabels.$serializer", "Luq0;", "Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/v2/translation/data/TranslationAriaLabels;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class TranslationAriaLabels$$serializer implements uq0 {
                public static final TranslationAriaLabels$$serializer INSTANCE;
                private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

                static {
/* 3 */             TranslationAriaLabels$$serializer translationAriaLabels$$serializer = new TranslationAriaLabels$$serializer();
/* 6 */             INSTANCE = translationAriaLabels$$serializer;
/* 14 */            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.usercentrics.sdk.v2.translation.data.TranslationAriaLabels", translationAriaLabels$$serializer, 27);
/* 20 */            pluginGeneratedSerialDescriptor.m6270j("acceptAllButton", true);
/* 25 */            pluginGeneratedSerialDescriptor.m6270j("ccpaButton", true);
/* 30 */            pluginGeneratedSerialDescriptor.m6270j("ccpaMoreInformation", true);
/* 35 */            pluginGeneratedSerialDescriptor.m6270j("closeButton", true);
/* 40 */            pluginGeneratedSerialDescriptor.m6270j("collapse", true);
/* 45 */            pluginGeneratedSerialDescriptor.m6270j("cookiePolicyButton", true);
/* 50 */            pluginGeneratedSerialDescriptor.m6270j("copyControllerId", true);
/* 55 */            pluginGeneratedSerialDescriptor.m6270j("denyAllButton", true);
/* 60 */            pluginGeneratedSerialDescriptor.m6270j("expand", true);
/* 65 */            pluginGeneratedSerialDescriptor.m6270j("fullscreenButton", true);
/* 70 */            pluginGeneratedSerialDescriptor.m6270j("imprintButton", true);
/* 75 */            pluginGeneratedSerialDescriptor.m6270j("languageSelector", true);
/* 80 */            pluginGeneratedSerialDescriptor.m6270j("privacyButton", true);
/* 85 */            pluginGeneratedSerialDescriptor.m6270j("privacyPolicyButton", true);
/* 90 */            pluginGeneratedSerialDescriptor.m6270j("saveButton", true);
/* 95 */            pluginGeneratedSerialDescriptor.m6270j("serviceInCategoryDetails", true);
/* 100 */           pluginGeneratedSerialDescriptor.m6270j("servicesInCategory", true);
/* 105 */           pluginGeneratedSerialDescriptor.m6270j("tabButton", true);
/* 110 */           pluginGeneratedSerialDescriptor.m6270j("usercentricsCMPButtons", true);
/* 115 */           pluginGeneratedSerialDescriptor.m6270j("usercentricsCMPContent", true);
/* 120 */           pluginGeneratedSerialDescriptor.m6270j("usercentricsCMPHeader", true);
/* 125 */           pluginGeneratedSerialDescriptor.m6270j("usercentricsCMPUI", true);
/* 130 */           pluginGeneratedSerialDescriptor.m6270j("usercentricsCard", true);
/* 135 */           pluginGeneratedSerialDescriptor.m6270j("usercentricsList", true);
/* 140 */           pluginGeneratedSerialDescriptor.m6270j("vendorConsentToggle", true);
/* 145 */           pluginGeneratedSerialDescriptor.m6270j("vendorDetailedStorageInformation", true);
/* 150 */           pluginGeneratedSerialDescriptor.m6270j("vendorLegIntToggle", true);
/* 153 */           descriptor = pluginGeneratedSerialDescriptor;
                }

                private TranslationAriaLabels$$serializer() {
                }

                @Override // p000.uq0
                public KSerializer[] childSerializers() {
/* 1 */             vh2 vh2Var = vh2.f18183a;
/* 115 */           return new KSerializer[]{j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var), j13.m5647i(vh2Var)};
                }

                @Override // kotlinx.serialization.KSerializer
                public TranslationAriaLabels deserialize(Decoder decoder) {
                    int i;
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
/* 32 */            String str15 = null;
/* 34 */            String str16 = null;
/* 36 */            String str17 = null;
/* 38 */            String str18 = null;
/* 40 */            String str19 = null;
/* 42 */            String str20 = null;
/* 44 */            String str21 = null;
/* 46 */            String str22 = null;
/* 48 */            String str23 = null;
/* 50 */            String str24 = null;
/* 52 */            String str25 = null;
/* 54 */            String str26 = null;
/* 56 */            String str27 = null;
/* 58 */            String str28 = null;
/* 60 */            while (z) {
/* 62 */                int iMo3299x = interfaceC1870kyMo3297c.mo3299x(descriptor2);
                        switch (iMo3299x) {
                            case -1:
/* 704 */                       z = false;
/* 706 */                       str4 = str4;
/* 708 */                       str8 = str8;
/* 710 */                       str15 = str15;
/* 712 */                       str3 = str3;
                                break;
                            case 0:
/* 653 */                       str2 = str2;
/* 677 */                       i2 |= 1;
/* 679 */                       str4 = str4;
/* 681 */                       str3 = str3;
/* 683 */                       str8 = str8;
/* 675 */                       str15 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 0, vh2.f18183a, str15);
/* 316 */                       str2 = str2;
                                break;
                            case 1:
/* 628 */                       str = str8;
/* 645 */                       str16 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 1, vh2.f18183a, str16);
/* 647 */                       i2 |= 2;
/* 649 */                       str17 = str17;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 2:
/* 603 */                       str = str8;
/* 618 */                       str17 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 2, vh2.f18183a, str17);
/* 620 */                       i2 |= 4;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 3:
/* 578 */                       str = str8;
/* 593 */                       str18 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 3, vh2.f18183a, str18);
/* 595 */                       i2 |= 8;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 4:
/* 553 */                       str = str8;
/* 568 */                       str19 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 4, vh2.f18183a, str19);
/* 570 */                       i2 |= 16;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 5:
/* 528 */                       str = str8;
/* 543 */                       str20 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 5, vh2.f18183a, str20);
/* 545 */                       i2 |= 32;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 6:
/* 503 */                       str = str8;
/* 518 */                       str21 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 6, vh2.f18183a, str21);
/* 520 */                       i2 |= 64;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 7:
/* 478 */                       str = str8;
/* 493 */                       str22 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 7, vh2.f18183a, str22);
/* 495 */                       i2 |= 128;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 8:
/* 452 */                       str = str8;
/* 468 */                       str23 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 8, vh2.f18183a, str23);
/* 470 */                       i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 9:
/* 427 */                       str = str8;
/* 443 */                       str24 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 9, vh2.f18183a, str24);
/* 445 */                       i2 |= NotificationCompat.FLAG_GROUP_SUMMARY;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 10:
/* 402 */                       str = str8;
/* 418 */                       str25 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 10, vh2.f18183a, str25);
/* 420 */                       i2 |= Segment.SHARE_MINIMUM;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 11:
/* 377 */                       str = str8;
/* 393 */                       str26 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 11, vh2.f18183a, str26);
/* 395 */                       i2 |= 2048;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 12:
/* 352 */                       str = str8;
/* 368 */                       str27 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 12, vh2.f18183a, str27);
/* 370 */                       i2 |= 4096;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 325 */                       str = str8;
/* 339 */                       str28 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 13, vh2.f18183a, str28);
/* 341 */                       i2 |= Segment.SIZE;
/* 343 */                       str3 = str3;
/* 345 */                       str8 = str;
/* 316 */                       str2 = str2;
                                break;
                            case 14:
/* 301 */                       str2 = str2;
/* 310 */                       str8 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 14, vh2.f18183a, str8);
/* 314 */                       i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
/* 316 */                       str2 = str2;
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 286 */                       str9 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 15, vh2.f18183a, str9);
/* 288 */                       i = 32768;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case 16:
/* 267 */                       str10 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 16, vh2.f18183a, str10);
/* 269 */                       i = 65536;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case 17:
/* 248 */                       str11 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 17, vh2.f18183a, str11);
/* 250 */                       i = 131072;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case 18:
/* 229 */                       str12 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 18, vh2.f18183a, str12);
/* 231 */                       i = 262144;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case 19:
/* 211 */                       str13 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 19, vh2.f18183a, str13);
/* 213 */                       i = 524288;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case 20:
/* 193 */                       str14 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 20, vh2.f18183a, str14);
/* 195 */                       i = 1048576;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 175 */                       str6 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 21, vh2.f18183a, str6);
/* 177 */                       i = 2097152;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 158 */                       str4 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 22, vh2.f18183a, str4);
/* 160 */                       i = 4194304;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 141 */                       str3 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 23, vh2.f18183a, str3);
/* 143 */                       i = 8388608;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case 24:
/* 124 */                       str2 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 24, vh2.f18183a, str2);
/* 126 */                       i = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 107 */                       str5 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 25, vh2.f18183a, str5);
/* 109 */                       i = 33554432;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 86 */                        str7 = (String) interfaceC1870kyMo3297c.mo4377y(descriptor2, 26, vh2.f18183a, str7);
/* 88 */                        i = 67108864;
/* 90 */                        i2 |= i;
/* 92 */                        str8 = str8;
                                break;
                            default:
/* 69 */                        C1951n4.m6855e(iMo3299x);
/* 14 */                        return null;
                        }
                    }
/* 718 */           String str29 = str3;
/* 720 */           String str30 = str8;
/* 722 */           String str31 = str15;
/* 724 */           String str32 = str16;
/* 726 */           String str33 = str17;
/* 728 */           String str34 = str4;
/* 730 */           interfaceC1870kyMo3297c.mo3296b(descriptor2);
/* 751 */           String str35 = str24;
/* 755 */           String str36 = str13;
/* 761 */           String str37 = str25;
/* 765 */           String str38 = str14;
/* 788 */           return new TranslationAriaLabels(i2, str31, str32, str33, str18, str19, str20, str21, str22, str23, str35, str37, str26, str27, str28, str30, str9, str10, str11, str12, str36, str38, str6, str34, str29, str2, str5, str7);
                }

                @Override // kotlinx.serialization.KSerializer
                public SerialDescriptor getDescriptor() {
/* 1 */             return descriptor;
                }

                /* JADX WARN: Code duplicated, block: B:125:0x01e7  */
                /* JADX WARN: Code duplicated, block: B:131:0x01fb  */
                /* JADX WARN: Code duplicated, block: B:137:0x020f  */
                /* JADX WARN: Code duplicated, block: B:143:0x0223  */
                @Override // kotlinx.serialization.KSerializer
                public void serialize(Encoder encoder, TranslationAriaLabels value) {
                    TranslationAriaLabels translationAriaLabels;
/* 3 */             encoder.getClass();
/* 6 */             value.getClass();
/* 9 */             String str = value.f6782v;
/* 11 */            String str2 = value.f6781u;
/* 13 */            String str3 = value.f6780t;
/* 15 */            String str4 = value.f6779s;
/* 17 */            String str5 = value.f6778r;
/* 19 */            String str6 = value.f6777q;
/* 21 */            String str7 = value.f6776p;
/* 23 */            String str8 = value.f6775o;
/* 25 */            String str9 = value.f6774n;
/* 27 */            String str10 = value.f6773m;
/* 29 */            String str11 = value.f6772l;
/* 31 */            String str12 = value.f6771k;
/* 33 */            String str13 = value.f6770j;
/* 35 */            String str14 = value.f6769i;
/* 37 */            String str15 = value.f6768h;
/* 41 */            String str16 = value.f6767g;
/* 45 */            String str17 = value.f6766f;
/* 49 */            String str18 = value.f6765e;
/* 53 */            String str19 = value.f6764d;
/* 57 */            String str20 = value.f6763c;
/* 61 */            String str21 = value.f6762b;
/* 65 */            String str22 = value.f6761a;
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
/* 457 */           if (!interfaceC1907lyMo1499c.mo1488E(descriptor2)) {
/* 462 */               translationAriaLabels = value;
/* 466 */               if (translationAriaLabels.f6783w != null) {
                        }
/* 481 */               if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || translationAriaLabels.f6784x != null) {
/* 494 */                   interfaceC1907lyMo1499c.mo1515s(descriptor2, 23, vh2.f18183a, translationAriaLabels.f6784x);
                        }
/* 501 */               if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || translationAriaLabels.f6785y != null) {
/* 514 */                   interfaceC1907lyMo1499c.mo1515s(descriptor2, 24, vh2.f18183a, translationAriaLabels.f6785y);
                        }
/* 521 */               if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || translationAriaLabels.f6786z != null) {
/* 534 */                   interfaceC1907lyMo1499c.mo1515s(descriptor2, 25, vh2.f18183a, translationAriaLabels.f6786z);
                        }
/* 541 */               if (interfaceC1907lyMo1499c.mo1488E(descriptor2) || translationAriaLabels.f6760A != null) {
/* 554 */                   interfaceC1907lyMo1499c.mo1515s(descriptor2, 26, vh2.f18183a, translationAriaLabels.f6760A);
                        }
/* 557 */               interfaceC1907lyMo1499c.mo1498b(descriptor2);
                    }
/* 459 */           translationAriaLabels = value;
/* 474 */           interfaceC1907lyMo1499c.mo1515s(descriptor2, 22, vh2.f18183a, translationAriaLabels.f6783w);
/* 481 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2)) {
/* 494 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 23, vh2.f18183a, translationAriaLabels.f6784x);
                    } else {
/* 494 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 23, vh2.f18183a, translationAriaLabels.f6784x);
                    }
/* 501 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2)) {
/* 514 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 24, vh2.f18183a, translationAriaLabels.f6785y);
                    } else {
/* 514 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 24, vh2.f18183a, translationAriaLabels.f6785y);
                    }
/* 521 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2)) {
/* 534 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 25, vh2.f18183a, translationAriaLabels.f6786z);
                    } else {
/* 534 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 25, vh2.f18183a, translationAriaLabels.f6786z);
                    }
/* 541 */           if (interfaceC1907lyMo1499c.mo1488E(descriptor2)) {
/* 554 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 26, vh2.f18183a, translationAriaLabels.f6760A);
                    } else {
/* 554 */               interfaceC1907lyMo1499c.mo1515s(descriptor2, 26, vh2.f18183a, translationAriaLabels.f6760A);
                    }
/* 557 */           interfaceC1907lyMo1499c.mo1498b(descriptor2);
                }

                @Override // p000.uq0
                public KSerializer[] typeParametersSerializers() {
/* 1 */             return de3.f7144d;
                }
            }
